package TokenParser.Rules;

public class DocumentControl{

	public static String noArg(String input) {
		if(input.equals("begin")) return "\\begin{document}";
		else if(input.equals("end")) return "\\end{document}";
		else if(input.equals("break")) return "\\\\";
		else if(input.equals("Break")) return "\\clearpage";
		else return "NO-OP";
	}

	public static String oneArg(String input) {
		return "NO-OP";
	}

	public static String twoArg(String input) {
		return "NO-OP";
	}
	
	public static String multiArg(String input) {
		return "NO-OP";
	}

	
}
