package TokenParser.Rules;

public class LogicSyms{

	public static String noArg(String input) {
		if(input.equals("larrow")) return "$\\leftarrow$";
		else if(input.equals("rarrow")) return "$\\rightarrow$";
		else if(input.equals("barrow")) return "$\\leftrightarrow$";
		else if(input.equals("or")) return "$\\cup$";
		else if(input.equals("and")) return "$\\cap$";
		else if(input.equals("xor")) return "$\\oplus$";
		else if(input.equals("true")) return "$\\mathbf{T}$";
		else if(input.equals("false")) return "$\\mathbf{F}$";
		else if(input.equals("forall")) return "$\\forall$";
		else if(input.equals("exists")) return "$\\exists$";
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
