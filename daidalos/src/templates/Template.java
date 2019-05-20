package templates;

public abstract class Template {
	protected String contentOfDocument;
	
	public Template(String contentOfDocument) {
		this.contentOfDocument = contentOfDocument;
	}
	
	public String getContentOfDocument() {
		return contentOfDocument;
	}
	
	public abstract String getTypeOfDocument();
}
