package Generator;

import java.util.ArrayList;
import java.util.HashMap;

import structures.Token;

public class tex {
	public static ArrayList<String> assemble(ArrayList<String> toAssemble, HashMap<Integer,Token> tags){
		ArrayList<String> assembled = new ArrayList<String>();
		
		for(Integer i:tags.keySet()){
			Token t = tags.get(i);
			String k = t.getAction();
			if(k.contains("documentclass")){
				assembled.add(k+"\n");
				t.setAction("");
				tags.put(i,t);
			}
		}
		
		assembled.add("\\usepackage{changepage}");
		for(String s:toAssemble){
			while(s.contains("\\")){
				s = s.replace("\\", "");
			}
			
			while(s.contains("<")){
				int keyNum = Integer.parseInt(s.substring(s.indexOf('<')+1, s.indexOf('>')));
				s = s.replace("<" + keyNum + ">", tags.get(keyNum).getAction());
			}
			System.out.println(s);
			assembled.add(s);
			
		}
		
		return assembled;
		
	}
}
