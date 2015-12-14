package TokenParser.Rules;

public class Fonts{

	public static String noArg(String input) {
		return "NO-OP";
	}

	public static String oneArg(String input) {
		if(input.equals("ul")) return "\\underline{<0>}";
		else if(input.equals("it")) return "\\textit{<0>}";
		else if(input.equals("bf")) return "\\textbf{<0>}";
		else return "NO-OP";
	}

	public static String twoArg(String input) {
		return "NO-OP";
	}

	public static String multiArg(String input) {
		return "NO-OP";
	}
}
