package templates;

public class TemplateFactory {
	
	public TemplateFactory() {
		
	}
	
	public Template getTemplateType(String template_type) {
		
		if(template_type.equalsIgnoreCase("Article")) {
			return new ArticleTemplate();
		}
		
		if(template_type.equalsIgnoreCase("Book")) {
			return new BookTemplate();
		}
		
		if(template_type.equalsIgnoreCase("Letter")) {
			return new LetterTemplate();
		}
		
		if(template_type.equalsIgnoreCase("Report")) {
			return new ReportTemplate();
		}
		
		if(template_type.equalsIgnoreCase("BlankDocument")) {
			return new BlankDocumentTemplate();
		}
		
		return null;
	}

}
