package TokenParser;

import java.util.HashMap;

import structures.Command;
import structures.Token;
import TokenParser.Rules.*;

public class parser {
	public static void readTokens(HashMap<Integer, Token> DocTokens){
		for(int i = 0; i < DocTokens.size(); i++){	
			Token current = DocTokens.get(i);
			if(current.getType().equals("Command")){
				String temp = current.getContent();
				String action = "";
				String[] args = new String[0];
				if(temp.contains("(")){
					action += temp.substring(0, temp.indexOf('('));
					String temp2 = temp.substring(temp.indexOf('(')+1, temp.lastIndexOf(')'));
					args = temp2.split(",");
				}
				else action = temp;
				String match = "";
				try {
					match = findMatchingRule(action, args.length);
				} catch (Exception e) {
					System.out.println("There is a command error in your document.\n The command: " + action + " is not a valid Note command. \n Please check your syntax and try recompiling.");
					//System.exit(10);
				}
				
				if(args.length > 0){
					for(int j = 0; j < args.length; j++){
						String toMatch = "<"+j+">";
						match = match.replace(toMatch, args[j]);
					}
				}
				current.setAction(match);
			}
			else if(current.getType().equals("Setting")){
				String temp = current.getContent();
				String action = "";
				String[] args = new String[0];
				if(temp.contains("<")){
					action += temp.substring(0, temp.indexOf('<'));
					String temp2 = temp.substring(temp.indexOf('<')+1, temp.lastIndexOf('>'));
					args = temp2.split(",");
				}
				else action = temp;
				
				String match = "";
				try {
					match = findMatchingSetting(action);
				} catch (Exception e) {
					System.out.println("There is a settings error in your document.\n The setting: " + action + " is not a valid Note command. \n Please check your syntax and try recompiling.");
					//System.exit(10);
				}
				
				if(args.length > 0){
					for(int j = 0; j < args.length; j++){
						String toMatch = "<"+j+">";
						match = match.replace(toMatch, args[j]);
					}
				}
				current.setAction(match);
			}
			else if(current.getType().equals("Comment")){
				String match = current.getContent();
				current.setAction('%' + match);
			}
			else {
				System.out.println("Invalid Syntax");
				
			}
		}
	}
	
	public static String findMatchingRule(String action, int args) throws Exception{
		String translation = "";
		
		translation = RuleControl.check(action, args);
		if(translation.equals("NO-OP")) throw new Exception();
		return translation;
		
	}
	
	public static String findMatchingSetting(String action) throws Exception{
		String translation = "";
		
		translation = Settings.interpret(action);
		if(translation.equals("NO-OP")) throw new Exception();
		return translation;
		
	}
}
