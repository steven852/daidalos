package tests;

import static org.junit.Assert.*;

import org.junit.*;

import commands.DivisionTypeCommands;
import commands.FigureTypeCommands;
import commands.ListTypeCommands;
import commands.TableTypeCommands;

public class AddCommandTest {

	@Test
	public void DivisionTest(){
		
		DivisionTypeCommands divcom = new DivisionTypeCommands();
		
		String chapter_expected = "\\chapter{title}\n";
		String section_expected = "\\section{title}\n";
		String subsection_expected = "\\subsection{title}\n";
		String subsubsection_expected = "\\subsubsection{title}\n";
		
		assertEquals(divcom.addCommandType("chapter"),chapter_expected);
		assertEquals(divcom.addCommandType("section"),section_expected);
		assertEquals(divcom.addCommandType("subsection"),subsection_expected);
		assertEquals(divcom.addCommandType("subsubsection"),subsubsection_expected);
		
	}
	
	@Test
	public void ListTest(){
		
		ListTypeCommands listcom = new ListTypeCommands();
		
		String itemList_expected = "\\begin{itemize}\n\\item ...\n\\item ...\n\\item ...\n" +
				"end\\{itemize}\n";
		
		String enumerateList_expected = "\\begin{enumerate}\n\\item ...\n\\item ...\n\\item ...\n" +
				"end\\{enumerate}\n";
		
		assertEquals(listcom.addCommandType("itemize"),itemList_expected);
		assertEquals(listcom.addCommandType("enumerate"),enumerateList_expected);
		
	}
	
	
	@Test
	public void TableTest(){
		TableTypeCommands tablecom = new TableTypeCommands();
		
		String table_expected = "\\begin{table}\n\\caption{...}\\label{...}\n" +
				"\\begin{tabular}{c|c|c}\n\\hline\n" + "...&...&... \\\\ \n" + "\\hline\n" +
				"end{tabular}\n" + "\\end{table}\n";
		
		assertEquals(tablecom.addCommandType("table"),table_expected);
		
	}
	
	
	@Test
	public void FigureTest(){
		FigureTypeCommands figcom = new FigureTypeCommands();
		
		String figure_expexted = "\\begin{figure}\n\\includegraphics[width=... ,height=...]\n" +
				"\\caption{..}\\label{...}\nend{figure}\n";
		
		
		assertEquals(figcom.addCommandType("figure"),figure_expexted);
	}

}
