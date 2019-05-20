package headers;

import java.util.ArrayList;

public class Chapters {
	
	private ArrayList<Chapter> chapters_list;

	public Chapters() {
		chapters_list = new ArrayList<Chapter>();
	}
	
	public void addChapter(Chapter chapter_name){
		chapters_list.add(chapter_name);
	}
	
	public void changeChapter(Chapter new_chapter,int number_of_chapter) {
		chapters_list.set(number_of_chapter,new_chapter);
	}
	
	public void RemoveChapter(Chapter chapter_to_remove) {
		chapters_list.remove(chapter_to_remove.getChapter_number() - 1);
		Chapter.setTotal_chapters(Chapter.getTotal_chapters() - 1);
		updateChapter_numbers();
	}
	
	private void updateChapter_numbers() {
		for(int i = 0; i < chapters_list.size(); i++) {
			chapters_list.get(i).setChapter_number(chapters_list.get(i).getChapter_number() - 1);
		}
		
	}

	public ArrayList<Chapter> getChapters_list() {
		return chapters_list;
	}

	public void setChapters_list(ArrayList<Chapter> chapters_list) {
		this.chapters_list = chapters_list;
	}
	
	
	

}
