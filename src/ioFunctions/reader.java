package ioFunctions;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class reader {
	
	public static ArrayList<String> readFile(File input) throws FileNotFoundException{
		Scanner read = new Scanner(input);
		ArrayList<String> contents = new ArrayList<String>();
		
		while(read.hasNextLine()){
			contents.add(read.nextLine());
		}
		
		return contents;
	}
}
