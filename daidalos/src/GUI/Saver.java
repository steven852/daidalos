package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import fileManager.FileSaver;

public class Saver {

	private JFrame frame;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Saver window = new Saver();
					window.frame.setTitle("SaveLatex");
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
	public Saver() {
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
		
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(210, 101, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnEnterFileName = new JButton("Enter file name");
		btnEnterFileName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String str;
				str = textField_1.getText();
				FileSaver saver;
				
				try {
					saver = new FileSaver(str);
					saver.saveFile(LatexEdit.getTextArea());
					frame.dispose();
						 
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				}
				
		
				
				
				
				
				
				
		});
		btnEnterFileName.setBounds(34, 100, 143, 25);
		frame.getContentPane().add(btnEnterFileName);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
