package TokenParser.Rules;

public class RuleControl {
	
	public static String check(String input, int args){
		String r = "";
		
		if(args == 0){
			r = DocumentControl.noArg(input);
			if(r != "NO-OP") return r;
			r = Fonts.noArg(input);
			if(r != "NO-OP") return r;
			r = LogicSyms.noArg(input);
			if(r != "NO-OP") return r;
			r = MathSyms.noArg(input);
			if(r != "NO-OP") return r;
			r = Modes.noArg(input);
			if(r != "NO-OP") return r;
			r = TextControl.noArg(input);
			if(r != "NO-OP") return r;
		}
		else if(args == 1){
			r = DocumentControl.oneArg(input);
			if(r != "NO-OP") return r;
			r = Fonts.oneArg(input);
			if(r != "NO-OP") return r;
			r = LogicSyms.oneArg(input);
			if(r != "NO-OP") return r;
			r = MathSyms.oneArg(input);
			if(r != "NO-OP") return r;
			r = Modes.oneArg(input);
			if(r != "NO-OP") return r;
			r = TextControl.oneArg(input);
			if(r != "NO-OP") return r;
		}
		else if(args == 2){
			r = DocumentControl.twoArg(input);
			if(r != "NO-OP") return r;
			r = Fonts.twoArg(input);
			if(r != "NO-OP") return r;
			r = LogicSyms.twoArg(input);
			if(r != "NO-OP") return r;
			r = MathSyms.twoArg(input);
			if(r != "NO-OP") return r;
			r = Modes.twoArg(input);
			if(r != "NO-OP") return r;
			r = TextControl.twoArg(input);
			if(r != "NO-OP") return r;
		}
		else if(args > 2){
			r = DocumentControl.multiArg(input);
			if(r != "NO-OP") return r;
			r = Fonts.multiArg(input);
			if(r != "NO-OP") return r;
			r = LogicSyms.multiArg(input);
			if(r != "NO-OP") return r;
			r = MathSyms.multiArg(input);
			if(r != "NO-OP") return r;
			r = Modes.multiArg(input);
			if(r != "NO-OP") return r;
			r = TextControl.multiArg(input);
			if(r != "NO-OP") return r;
		}
		else {
			return "NO-OP";
		}
		return "NO-OP";
	}
	
}
