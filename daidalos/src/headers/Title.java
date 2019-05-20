package headers;

public class Title {
	private String title_name;

	public Title() {
		title_name = "No title selected";
	}
	
	
	public Title(String title_name) {
		super();
		this.title_name = title_name;
	}
	
	
	public String getTitle_name() {
		return title_name;
	}

	public void setTitle_name(String title_name) {
		this.title_name = title_name;
	};
	
	
	
}
