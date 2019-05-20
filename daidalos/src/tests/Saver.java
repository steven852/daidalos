package tests;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JLayeredPane;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JTextField;

public class Saver {

	private JFrame frame;
	private JTable table;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Saver window = new Saver();
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
				
					//edo mesa kaleis thn methodo
					System.out.println(str);
					 
				}
				
		
				
				
				
				
				
				
		});
		btnEnterFileName.setBounds(34, 100, 143, 25);
		frame.getContentPane().add(btnEnterFileName);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
