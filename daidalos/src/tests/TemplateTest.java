package tests;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import templates.*;

public class TemplateTest {

	@Test
	void ArticleTest() {
		ArticleTemplate testArticle = new ArticleTemplate();
		
		String articleContent = "\\documentclass[11pt,twocolumn,a4paper]{article}\r\n" + 
				"\r\n" + 
				"\\begin{document}\r\n" + 
				"\\title{Article: How to Structure a LaTeX Document}\r\n" + 
				"\\author{Author1 \\and Author2 \\and ...}\r\n" + 
				"\\date{\\today}\r\n" + 
				"\r\n" + 
				"\\maketitle\r\n" + 
				"\r\n" + 
				"\\section{Section Title 1}\r\n" + 
				"\r\n" + 
				"\\section{Section Title 2}\r\n" + 
				"\r\n" + 
				"\\section{Section Title.....}\r\n" + 
				"\r\n" + 
				"\\section{Conclusion}\r\n" + 
				"\r\n" + 
				"\\section*{References}\r\n" + 
				"\r\n" + 
				"\\end{document}";
		
		assertEquals(articleContent, testArticle.getContentOfDocument());
		
	}
	
	@Test
	void BookTest() {
		BookTemplate testBook = new BookTemplate();
		
		String bookContent = "\\documentclass[11pt,a4paper]{book}\r\n" + 
				"\r\n" + 
				"\\begin{document}\r\n" + 
				"\\title{Book: How to Structure a LaTeX Document}\r\n" + 
				"\\author{Author1 \\and Author2 \\and ...}\r\n" + 
				"\\date{\\today}\r\n" + 
				"\r\n" + 
				"\\maketitle\r\n" + 
				"\r\n" + 
				"\\frontmatter\r\n" + 
				"\r\n" + 
				"\\chapter{Preface}\r\n" + 
				"% ...\r\n" + 
				"\r\n" + 
				"\\mainmatter\r\n" + 
				"\\chapter{First chapter}\r\n" + 
				"\\section{Section Title 1}\r\n" + 
				"\\section{Section Title 2}\r\n" + 
				"\\section{Section Title.....}\r\n" + 
				"\r\n" + 
				"\\chapter{....}\r\n" + 
				"\r\n" + 
				"\\chapter{Conclusion}\r\n" + 
				"\r\n" + 
				"\\chapter*{References}\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\\backmatter\r\n" + 
				"\\chapter{Last note}\r\n" + 
				"\r\n" + 
				"\\end{document}";
		
		assertEquals(bookContent, testBook.getContentOfDocument());
	}
	
	@Test
	void LetterTest() {
		LetterTemplate testLetter = new LetterTemplate();
		
		String letterContent = "\\documentclass{letter}\r\n" + 
				"\\usepackage{hyperref}\r\n" + 
				"\\signature{Sender's Name}\r\n" + 
				"\\address{Sender's address...}\r\n" + 
				"\\begin{document}\r\n" + 
				"\r\n" + 
				"\\begin{letter}{Destination address....}\r\n" + 
				"\\opening{Dear Sir or Madam:}\r\n" + 
				"\r\n" + 
				"I am writing to you .......\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\\closing{Yours Faithfully,}\r\n" + 
				"\r\n" + 
				"\\ps\r\n" + 
				"\r\n" + 
				"P.S. text .....\r\n" + 
				"\r\n" + 
				"\\encl{Copyright permission form}\r\n" + 
				"\r\n" + 
				"\\end{letter}\r\n" + 
				"\\end{document}";
		
		assertEquals(letterContent, testLetter.getContentOfDocument());
	}
	
	@Test
	void ReportTest() {
		ReportTemplate testReport = new ReportTemplate();
		
		String reportContent = "\\documentclass[11pt,a4paper]{report}\r\n" + 
				"\r\n" + 
				"\\begin{document}\r\n" + 
				"\\title{Report Template: How to Structure a LaTeX Document}\r\n" + 
				"\\author{Author1 \\and Author2 \\and ...}\r\n" + 
				"\\date{\\today}\r\n" + 
				"\\maketitle\r\n" + 
				"\r\n" + 
				"\\begin{abstract}\r\n" + 
				"Your abstract goes here...\r\n" + 
				"...\r\n" + 
				"\\end{abstract}\r\n" + 
				"\r\n" + 
				"\\chapter{Introduction}\r\n" + 
				"\\section{Section Title 1}\r\n" + 
				"\\section{Section Title 2}\r\n" + 
				"\\section{Section Title.....}\r\n" + 
				"\r\n" + 
				"\\chapter{....}\r\n" + 
				"\r\n" + 
				"\\chapter{Conclusion}\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\\chapter*{References}\r\n" + 
				"\r\n" + 
				"\\end{document}";
		
		assertEquals(reportContent, testReport.getContentOfDocument());
	}
	
	@Test
	void BlankContentTest() {
		BlankDocumentTemplate testBlankDocument = new BlankDocumentTemplate();
		
		String blankContent = "";
		
		assertEquals(blankContent, testBlankDocument.getContentOfDocument());
	}

}
