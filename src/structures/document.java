package structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;

import Tokenizer.tokenizer;

public class Document {
	private ArrayList<String> source;
	private HashMap<Integer, Token> DocTokens;
	private int nextTokenID;
	private ArrayList<String> structure;
	
	public Document(ArrayList<String> s){
		source = s;
		DocTokens = new HashMap<Integer, Token>();
		nextTokenID = 0;
		structure = new ArrayList<String>();
	}

	public ArrayList<String> getSource() {
		return source;
	}

	public HashMap<Integer, Token> getDocTokens() {
		return DocTokens;
	}

	public int getNextTokenID() {
		return nextTokenID;
	}

	public ArrayList<String> getStructure() {
		return structure;
	}
	
	public void tokenize(){
		for(String s: source){
			structure.add(tokenizer.process(s, DocTokens, nextTokenID));
			System.out.println(structure.get(structure.size()-1));
		}
		
	}
}
