package control;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

import ioFunctions.reader;
import ioFunctions.writer;
import structures.Document;
import structures.Token;

public class Main {

	public static void main(String[] args) {
		System.out.println("Note Interpreter v0.1.0 - Copyright 2015");

		if(args.length == 0 || args.length > 1){
			System.out.println("Invalid Parameters - Either too many given or not enough given");
			System.out.println("Usage: note <filename>");
			return;
		}
		
		File input = new File(args[0]);
		String filename = input.getName().substring(0,input.getName().lastIndexOf('.'));
		ArrayList<String> readfile;

		try {
			readfile = reader.readFile(input);
			System.out.println("THe source file was read correctly.");
		} catch (FileNotFoundException e) {
			System.out.println("There was an error reading the file. Please make sure it exists and has proper syntax.");
			return;
		}
		
		Document doc = new Document(readfile);
		doc.tokenize();
		doc.parseTokens();
		doc.assembleDoc();
		
		writer.write(filename, doc.getStructure());
		
		return;
	}

}
