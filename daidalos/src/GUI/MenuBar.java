package GUI;


import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import commands.*;
import templates.*;



 @SuppressWarnings("serial")
public  class MenuBar extends JFrame implements ActionListener,KeyListener {
	 JMenuBar menubar;
	 JMenu  book, article ,report ,letter, file;
	 JMenu   be ,  ae,  re ,le ;
	 JMenuItem bd , ad, rd , ld;
	 JMenuItem bchapter, bsection, bsubsection, bsubsubsection;
	 JMenuItem  asection, asubsection, asubsubsection,aItem_list, aEnumerate_list, atable,afigure;
	 JMenuItem rchapter,rsection, rsubsection, rsubsubsection, rItem_list, rEnumerate_list ,rtable,rfigure ;
	 JMenuItem lItem_list, lEnumerate_list ;
	 JMenuItem save , load;
     JLabel lblCode = new JLabel("<html><hl align='center'></hl><html>");
     
     private JTextArea textarea = new JTextArea(80,80);
     private JFileChooser fl = new JFileChooser();
     
     //????
     //private JFrame frame;
  //   private JTable table;
 //	 private JTextField textField_1;
 	 
 	 
     
     
     public static void main(String[] args){
    	 MenuBar fr = new MenuBar();
		 centerFrame(fr);
    	 maximiseFrame(fr);
    	 fr.setVisible(true);
    	 
    	 
     }
     
     





	public MenuBar(){
		
	    JScrollPane scrollpane = new JScrollPane(textarea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		FileFilter textfilter = new FileNameExtensionFilter("Plain text","tex");
		fl.setFileFilter(textfilter);
		
		add(scrollpane);
		
		
    	setLayout(new FlowLayout());
    	setSize(900,900);
    	setTitle("Latex");
    	
    	
    	
    	
    	this.addKeyListener(this);
    	
    	menubar = new JMenuBar();
    	
    	
    	book = new JMenu("Book");
    	menubar.add(book);
    	
    	article = new JMenu("Article");
    	menubar.add(article);
    	
    	report = new JMenu("Report");
    	menubar.add(report);
    	
    	letter = new JMenu("Letter");
    	menubar.add(letter);
    	
    	
    	
    	
    	file = new JMenu("File");
     	menubar.add(file);
     	
     	
     	bd = new JMenuItem("New");
     	bd.addActionListener(this);
     	book.add(bd);
     	
     	be = new JMenu("Add");
     	book.add(be);
     	
     	ad = new JMenuItem("New");
     	ad.addActionListener(this);
     	article.add(ad);
     	
     	ae = new JMenu("Add");
     	article.add(ae);
     	
     	rd = new JMenuItem("New");
     	rd.addActionListener(this);
     	report.add(rd);
     	
     	
     	re = new JMenu("Add");
     	report.add(re);
     	
     	ld = new JMenuItem("New");
     	ld.addActionListener(this);
     	letter.add(ld);
     	
     	le = new JMenu("Add");
     	letter.add(le);
     	
     

     	
      	bchapter  = new JMenuItem("Chapter");
     	bchapter.addActionListener(this);
     	be.add(bchapter);
     	     	 
     	bsection  = new JMenuItem("Section");
     	bsection.addActionListener(this);
     	be.add(bsection);
     	
     

     	bsubsection  = new JMenuItem("SubSection");
     	bsubsection.addActionListener(this);
     	be.add(bsubsection);


     	bsubsubsection  = new JMenuItem("SubSubSection");
     	bsubsubsection.addActionListener(this);
     	be.add(bsubsubsection);


     	
     	
     	asection = new JMenuItem("Section");
     	asection.addActionListener(this);
     	ae.add(asection);


     	asubsection  = new JMenuItem("SubSection");
     	asubsection.addActionListener(this);
     	ae.add(asubsection);



     	asubsubsection = new JMenuItem("SubSubSection ");
     	asubsubsection.addActionListener(this);
     	ae.add(asubsubsection);



     	
     	
    	aItem_list  = new JMenuItem("Item List");
    	aItem_list.addActionListener(this);
     	ae.add(aItem_list);
     	
     	aEnumerate_list  = new JMenuItem("Enumerate List");
     	aEnumerate_list.addActionListener(this);
     	ae.add(aEnumerate_list);


     	atable  = new JMenuItem("Table");
     	atable.addActionListener(this);
     	ae.add(atable);


     	afigure  = new JMenuItem("Figure");
     	afigure.addActionListener(this);
     	ae.add(afigure);
     	
     	
     	
     	rchapter  = new JMenuItem("Chapter");
     	rchapter.addActionListener(this);
     	re.add(rchapter);

    	rsection  = new JMenuItem("Section");
    	rsection.addActionListener(this);
     	re.add(rsection);

     	
     	
     	
     	rsubsection  = new JMenuItem("SubSection");
     	rsubsection.addActionListener(this);
     	re.add(rsubsection);


     	rsubsubsection  = new JMenuItem("SubSubSection");
     	rsubsubsection.addActionListener(this);
     	re.add(rsubsubsection);


     	rItem_list  = new JMenuItem("Item List");
    	rItem_list.addActionListener(this);
     	re.add(rItem_list);
     	
     	rEnumerate_list  = new JMenuItem("Enumerate List");
     	rEnumerate_list.addActionListener(this);
     	re.add(rEnumerate_list);

     	rtable  = new JMenuItem("Table");
     	rtable.addActionListener(this);
     	re.add(rtable);


     	rfigure  = new JMenuItem("Figure");
     	rfigure.addActionListener(this);
     	re.add(rfigure);



     	lItem_list  = new JMenuItem("Item List");
    	lItem_list.addActionListener(this);
     	le.add(lItem_list);
     	
     	lEnumerate_list  = new JMenuItem("Enumerate List");
     	lEnumerate_list.addActionListener(this);
     	le.add(lEnumerate_list);




     	
     	save = new JMenuItem("Save");
     	save.addActionListener(this);
     	file.add(save);
     	
     	
     	load = new JMenuItem("Load");
     	load.addActionListener(this);
     	file.add(load);
     	
     	this.setJMenuBar(menubar);
     	add(lblCode);
     	
     	
     	
     }
     
     
	 public void actionPerformed(ActionEvent e){
		 
		 ArticleTemplate atemplate = new ArticleTemplate();
		 BookTemplate btemplate = new BookTemplate();
		 ReportTemplate rtemplate = new ReportTemplate();
		 LetterTemplate ltemplate = new LetterTemplate();
		 
		 
		 
		 DivisionTypeCommands divcom = new DivisionTypeCommands();
		 FigureTypeCommands figcom = new FigureTypeCommands();
		 ListTypeCommands listcom = new ListTypeCommands();
		 TableTypeCommands tablecom = new TableTypeCommands();
		 
		 
		 if(e.getSource().equals(bd)){
			 textarea.setText(btemplate.getContentOfDocument());
	    	 
	     }
		 
		 if(e.getSource().equals(ad)){
			 textarea.setText(atemplate.getContentOfDocument());
		 }
			 
	 	if(e.getSource().equals(rd)){
	 		textarea.setText(rtemplate.getContentOfDocument());
	 		
	 	 }
		 if(e.getSource().equals(ld)){
			 textarea.setText(ltemplate.getContentOfDocument());
			 
		 }
		 
		 if(e.getSource().equals(bchapter)){
			 textarea.insert(divcom.addDivisionTypeCommands("chapter"), textarea.getCaretPosition());
		 }
		 
		 if(e.getSource().equals(bsection)){
			 textarea.insert(divcom.addDivisionTypeCommands("section"), textarea.getCaretPosition());
		 }

	     if(e.getSource().equals(bsubsection)){
	    	 textarea.insert(divcom.addDivisionTypeCommands("subsection"), textarea.getCaretPosition());
		 }
	     
	     if(e.getSource().equals(bsubsubsection)){
	    	 textarea.insert(divcom.addDivisionTypeCommands("subsubsection"), textarea.getCaretPosition());
		 }
	     
	     if(e.getSource().equals(rchapter)){
	    	 textarea.insert(divcom.addDivisionTypeCommands("chapter"), textarea.getCaretPosition());
		 }
	     
	     if(e.getSource().equals(rsection)){
	    	 textarea.insert(divcom.addDivisionTypeCommands("section"), textarea.getCaretPosition());
		 }
	     
	     if(e.getSource().equals(rsubsection)){
	    	 textarea.insert(divcom.addDivisionTypeCommands("subsection"), textarea.getCaretPosition());
		 }
	     
	     if(e.getSource().equals(rsubsubsection)){
	    	 textarea.insert(divcom.addDivisionTypeCommands("subsubsection"), textarea.getCaretPosition());
		 }
	     
	     if(e.getSource().equals(rItem_list)){
	    	textarea.insert(listcom.addListTypeCommands("itemize"), textarea.getCaretPosition());
	     }
	     
	     if(e.getSource().equals(rEnumerate_list)){
	    	textarea.insert(listcom.addListTypeCommands("enumerate"), textarea.getCaretPosition());
	     }
	     
	     if(e.getSource().equals(rtable)){
	    	 textarea.insert(tablecom.addTableTypeCommands("table"), textarea.getCaretPosition());
	     }
		
	     if(e.getSource().equals(rfigure)){
	    	 textarea.insert(figcom.addFigureTypeCommands("figure"), textarea.getCaretPosition());
		 }
	     
	     if(e.getSource().equals(asection)){
	    	 textarea.insert(divcom.addDivisionTypeCommands("section"), textarea.getCaretPosition());
		 }
	     
	     if(e.getSource().equals(asubsection)){
			 textarea.insert(divcom.addDivisionTypeCommands("subsection"), textarea.getCaretPosition());
		 }
	     
	     if(e.getSource().equals(asubsubsection)){
	    	 textarea.insert(divcom.addDivisionTypeCommands("subsubsection"), textarea.getCaretPosition());
		 }
	     
	     if(e.getSource().equals(aItem_list)){
	    	textarea.insert(listcom.addListTypeCommands("itemize"), textarea.getCaretPosition());
	     }
	     
	     if(e.getSource().equals(aEnumerate_list)){
	    	textarea.insert(listcom.addListTypeCommands("enumerate"), textarea.getCaretPosition());
	     }
	     
	     if(e.getSource().equals(atable)){
	    	 textarea.insert(tablecom.addTableTypeCommands("table"), textarea.getCaretPosition());
		 }
	     
	     if(e.getSource().equals(afigure)){
	    	 textarea.insert(figcom.addFigureTypeCommands("figure"), textarea.getCaretPosition());
		 }
	     
	     if(e.getSource().equals(lItem_list)){
	    	textarea.insert(listcom.addListTypeCommands("itemize"), textarea.getCaretPosition());
	     }
	     
	     if(e.getSource().equals(lEnumerate_list)){
	    	textarea.insert(listcom.addListTypeCommands("enumerate"), textarea.getCaretPosition());
	     }
	     
	     if(e.getSource().equals(save)){
	    	 System.out.println("OK");
	    	 //edo kaleis ton saver
	     }
	     
	     if(e.getSource().equals(load)){
	    	 System.out.println("OK"); 
	    	 //edo kaleis ton loader
	    	 
	    	 
	     }
	     
	    	 
	 }

	     
	 
	
   

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	private static void maximiseFrame(MenuBar fr) {
		// TODO Auto-generated method stub
		
	}
	
	private static void centerFrame(MenuBar fr) {
		// TODO Auto-generated method stub
		
	}
	 
	
	
   
    	
    	
    	
   
    	  
      
        
      

	
		
	 
  }
  


    