package headers;

import java.util.ArrayList;

public class Authors {
	private ArrayList<String> author_names;

	
	public Authors() {
		author_names = new ArrayList<String>(); 
	}
	
	
	public void addAuthors(String author_name){
		author_names.add(author_name);
	}

	public void changeAuthor(String new_author_name,int number_of_author){
		author_names.set(number_of_author, new_author_name);
	}

	public void removeAuthor(int number_of_author){
		author_names.remove(number_of_author);
	}
	

	public String toString() {
		String all_names = "";
		
		for(int i = 0; i < author_names.size(); i++){
			if(i == author_names.size() - 1){
				all_names = all_names + author_names.get(i);
			}
			else all_names = all_names + author_names.get(i) + ", ";

		}
		
		
		return all_names;
				
	}
	
	
	
	
}
