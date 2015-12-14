package TokenParser.Rules;

public class MathSyms{

	public static String noArg(String input) {
		return "NO-OP";
	}

	public static String oneArg(String input) {
		return "NO-OP";
	}

	public static String twoArg(String input) {
		if(input.equals("fraction")) return "$\\frac{<0>}{<1>}$";
		else return "NO-OP";
	}

	public static String multiArg(String input) {
		return "NO-OP";
	}


}
