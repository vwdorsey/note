package structures;

public class Rule {
	private String name;
	private String type;
	private String matching;
	private int numArgs;
	private String replacement;
	
	public Rule(String n, String t, String m, int a, String r){
		name = n;
		type = t;
		matching = m;
		numArgs = a;
		replacement = r;
	}

	public String getName() {
		return name;
	}

	public String getMatching() {
		return matching;
	}

	public String getReplacement() {
		return replacement;
	}
	
	public String checkIfMatch(String match, String[] args){
		if(matching.equals(match)){
			if(args.length == numArgs){
				if(numArgs == 0) return replacement;
				else if(type.equals("Command")){
					String r = "";
					r += replacement;
					r += '(';
					
				}
			}
			else return null;
		}
		else return null;
	}
}
