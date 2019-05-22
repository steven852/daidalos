package controler;

public abstract class VersionTracker {
	
	protected String previousContent;
	protected String currentContent;
	
	public abstract void currentVersion(String currentContent);
	
	public abstract void previousVersion(String previousContent);
	
	public abstract void rollBack();
	
	public String getCurrentContent() {
		return currentContent;
	}
	
	public String getPreviousContent() {
		return previousContent;
	}
}
