package controler;
import java.io.IOException;
import java.util.ArrayList;

public class StableVersionTracker extends VersionTracker {

	ArrayList<String> titles = new ArrayList<String>();
	
	public void currentVersion(String currentContent) {
		super.currentContent = currentContent;
	}
	
	public void previousVersion(String previousContent) {
		super.previousContent = previousContent;
		try {
			String fileName = Integer.toString(titles.size());
			FileSaver saver = new FileSaver(fileName);
			saver.saveFile(previousContent);
			titles.add(fileName + ".tex");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void rollBack() {
		try {
			FileLoader loader = new FileLoader(titles.get(titles.size()-1));
			super.currentContent = loader.loadFile();
			titles.remove(titles.size()-1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IndexOutOfBoundsException a) {
			System.out.println("No items in memory.");
		}
	}
	
	public ArrayList<String> getTitles(){
		return titles;
	}
	
}
