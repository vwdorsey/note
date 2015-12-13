package Tokenizer;

import java.util.HashMap;
import java.util.Scanner;

import structures.Token;

public class tokenizer {
	public static String process(String source, HashMap<Integer,Token> tokens, int nextToken){
		String modified = "";
		Scanner readLine = new Scanner(source);
		
		for(int i = 0; i < source.length(); i++){
			char c = source.charAt(i);
			if(c == '\t'){
				modified += "    ";
			}
			else if(c == '%'){
				i++;
				c = source.charAt(i);
				String contents = "";
				while(c != '%'){
					contents += c;
					i++;
					c = source.charAt(i);
				}
				int next = tokens.size();
				tokens.put(next, new Token(next, "Setting", contents));
				modified += "<"+next+">";
				nextToken++;
			}
			else if(c == '#'){
				i++;
				c = source.charAt(i);
				String contents = "";
				while(c != '#'){
					contents += c;
					i++;
					c = source.charAt(i);
					if(c == '\\'){
						contents += c;
						contents += source.charAt(i+1);
						i += 2;
						c = source.charAt(i);
					}
				}
				int next = tokens.size();
				tokens.put(next, new Token(next, "Command", contents));
				modified += "<"+next+">";
				nextToken++;
			}
			else if(c == '!'){
				i++;
				c = source.charAt(i);
				String contents = "";
				while(c != '!'){
					contents += c;
					i++;
					c = source.charAt(i);
					if(c == '\\'){
						contents += c;
						contents += source.charAt(i+1);
						i += 2;
						c = source.charAt(i);
					}
				}
				int next = tokens.size();
				tokens.put(next, new Token(next, "Comment", contents));
				modified += "<"+next+">";
				nextToken++;
			}
			else if(c == '\\'){
				modified += c;
				modified += source.charAt(i+1);
				i += 2;
				c = source.charAt(i);
			}
			else modified += c;
		}
		return modified;
	}
}
