package TokenParser.Rules;

public class TextControl{

	public static String noArg(String input) {
		if(input.equals("center")) return "\\begin{center}";
		else if(input.equals("end_center")) return "\\end{center}";
		else if(input.equals("i")) return "\\hspace{4em}";
		else if(input.equals("fi")) return "\\begin{adjustwidth}{4em}{0em}";
		else if(input.equals("end_fi")) return "\\end{adjustwidth}";
		else return "NO-OP";
	}

	public static String oneArg(String input) {
		return "NO-OP";
	}

	public static String twoArg(String input) {
		if(input.equals("sub")) return "<0>$_{<1>}$";
		else if(input.equals("super")) return "<0>$^{<1>}$";
		else return "NO-OP";
	}

	public static String multiArg(String input) {
		return "NO-OP";
	}

}
