package ioFunctions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class writer {
	public static boolean write(String filename, ArrayList<String> parsedContent){
		File outFile = new File(filename + ".tex");
		PrintWriter out;
		try {
			out = new PrintWriter(outFile);
		} catch (FileNotFoundException e) {
			System.out.println("There was an error opening the new file for writing.");
			return false;
		}
		
		for(String s:parsedContent){
			out.write(s);
			out.write('\n');
		}
		
		out.close();
		return true;
	}
}
