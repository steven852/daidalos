package headers;

public class Section {
	
	private static int total_sections;
	
	private Title section_title;
	private int section_number;
	
	public Section(Title section_title, int section_number) {
		this.section_title = section_title;
		this.section_number = section_number;
		total_sections = total_sections + 1;
	}

	public static int getTotal_sections() {
		return total_sections;
	}

	public static void setTotal_sections(int total_sections) {
		Section.total_sections = total_sections;
	}

	public Title getSection_title() {
		return section_title;
	}

	public void setSection_title(Title section_title) {
		this.section_title = section_title;
	}

	public int getSection_number() {
		return section_number;
	}

	public void setSection_number(int section_number) {
		this.section_number = section_number;
	}
	
	
	
	

}
