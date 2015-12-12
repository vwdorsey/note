package document;

public class command {
	private String name;
	private String action;
	private String[] args;
	
	public command(String n, String a, String[] r){
		name = n;
		action = a;
		args = r;
	}
	
	public String getName() {return name;}
	public String getAction() {return action;}
	public String[] getArgs() {return args;}
}
