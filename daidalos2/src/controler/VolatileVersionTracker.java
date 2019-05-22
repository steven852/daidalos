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
		super.currentContent = temporaryContents.get(0);
		temporaryContents.remove(0);
	}

}
