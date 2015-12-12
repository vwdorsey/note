package control;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		System.out.println("Note Interpreter v0.0.1 - Copyright 2015");

		if(args.length == 0 || args.length > 1){
			System.out.println("Invalid Parameters - Either too many given or not enough given");
			System.out.println("Usage: note <filename>");
			return;
		}
		
		File input = new File(args[0]);
		System.out.println(input.getName());
		return;
	}

}
