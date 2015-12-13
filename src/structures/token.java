package structures;

public class Token {
	private int id;
	private String type;
	private String content;
	private Command interpretedCommand;
	
	public Token(int i, String t, String c){
		id = i;
		type = t;
		content = c;
	}

	public int getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public String getContent() {
		return content;
	}

	public Command getAction() {
		return interpretedCommand;
	}
	
	public void setAction(Command action) {
		this.interpretedCommand = action;
	}
}
