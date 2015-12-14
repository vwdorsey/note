package TokenParser.Rules;

public class Modes{

	public static String noArg(String input) {
		if(input.equals("math")) return "$";
		else if(input.equals("end_math")) return "$";
		else if(input.equals("exact")) return "\\begin{verbatim}";
		else if(input.equals("end_exact")) return "\\end{verbatim}";
		return "NO-OP";
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
