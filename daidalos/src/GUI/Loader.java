package GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

import controler.FileLoader;

public class Loader {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public void loadFile() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loader window = new Loader();
					window.frame.setTitle("LoadLatex");
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Loader() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnEnterFileName = new JButton("Enter file name");
		btnEnterFileName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String str;
				str = textField.getText();
				
	              
				FileLoader loader;
				try {
					loader = new FileLoader(str);
					LatexEditor.setTextArea(loader.loadFile());
					frame.dispose();
						 
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


					 
				}
				
		
				
				
				
				
				
				
		});
		
		btnEnterFileName.setBounds(87, 102, 119, 25);
		frame.getContentPane().add(btnEnterFileName);
		
		textField = new JTextField();
		textField.setBounds(244, 103, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
