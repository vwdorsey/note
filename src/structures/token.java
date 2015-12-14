package structures;

public class Token {
	private int id;
	private String type;
	private String content;
	private String interpretedCommand;
	
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

	public String getAction() {
		return interpretedCommand;
	}
	
	public void setAction(String action) {
		this.interpretedCommand = action;
	}
	
	public String toString(){
		return id + " | " + type + " | " + content;
	}
}
