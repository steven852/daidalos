package controler;

import java.util.ArrayList;

public class VolatileVersionTracker extends VersionTracker {
	private ArrayList<String> temporaryContents = new ArrayList<String>();
	
	public void currentVersion(String currentContent) {
		super.currentContent = currentContent;
	}
	
	public void previousVersion(String previousContent) {
		super.previousContent = previousContent;
		temporaryContents.add(previousContent);
	}

	public void rollBack() {
		try {
			super.currentContent = temporaryContents.get(temporaryContents.size()-1);
			temporaryContents.remove(temporaryContents.size()-1);
		} catch (IndexOutOfBoundsException a) {
			System.out.println("No items in memory.");
		}
	}

}
