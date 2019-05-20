package headers;

public class Chapter {
	
	private static int total_chapters;
	
	private Title chapter_title;
	private int chapter_number;
	
	
	public Chapter(Title chapter_title) {
		this.chapter_title = chapter_title;
		chapter_number = total_chapters + 1;
		total_chapters = total_chapters + 1;
	}


	public static int getTotal_chapters() {
		return total_chapters;
	}

	
	public static void setTotal_chapters(int total_chapters) {
		Chapter.total_chapters = total_chapters;
	}
	

	public Title getChapter_title() {
		return chapter_title;
	}


	public int getChapter_number() {
		return chapter_number;
	}


	public void setChapter_number(int chapter_number) {
		this.chapter_number = chapter_number;
	}
	
	
	
	
	
}
