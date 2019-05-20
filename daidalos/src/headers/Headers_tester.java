package headers;

public class Headers_tester {

	public static void main(String[] args){
		
		Chapter c1 = new Chapter(new Title("chapter1"));
		Chapter c2 = new Chapter(new Title("chapter2"));
		Chapter c3 = new Chapter(new Title("chapter3"));
		
		Chapters c = new Chapters();
		c.addChapter(c1);
		c.addChapter(c2);
		c.addChapter(c3);
		

		
		System.out.println(c2.getChapter_number());
		System.out.println(c.getChapters_list().get(0).getChapter_title().getTitle_name());
		
	}
}
