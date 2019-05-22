package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.*;
import java.util.Scanner;
import org.junit.jupiter.api.Test;

import controler.FileSaver;
import templates.BookTemplate;
import templates.Template;

class FileSaverTest {

	@Test
	void test() throws IOException{

		Template book = new BookTemplate();
		FileSaver saver = new FileSaver("test");
		saver.saveFile( book.getContentOfDocument());
		
		File expected = new File("book-template.tex");
		File output = new File("test.tex");
		
		Scanner scannerExpected = new Scanner(expected);
		Scanner scannerOutput = new Scanner(output);
		String exp = "";
		String out = "";
		while(scannerExpected.hasNextLine()) {
			exp += scannerExpected.nextLine();
		}
		
		while(scannerOutput.hasNextLine()) {
			out += scannerOutput.nextLine();
		}
		scannerExpected.close();
		scannerOutput.close();
		
		System.out.println(exp);
		assertEquals(exp, out);
	}

}
