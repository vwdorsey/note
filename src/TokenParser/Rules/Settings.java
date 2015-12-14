package TokenParser.Rules;

public class Settings {
	public static String interpret(String setting){
		if(setting.equals("size")){
			return "\\usepackage[total={<0>in, <1>in}]{geometry}";
		}
		else if(setting.equals("fontsize")){
			return "\\documentclass[<0>pt]{article}";
		}
		else return "NO-OP";
	}
}
