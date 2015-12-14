package structures;

public class Command {
	private String action;
	private String[] args;
	
	public Command(String n, String a, String[] r){
		name = n;
		action = a;
		args = r;
	}
	
	public String getName() {return name;}
	public String getAction() {return action;}
	public String[] getArgs() {return args;}
}
