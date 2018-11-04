package main;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class SchoolPlus extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SchoolPlus frame = new SchoolPlus();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SchoolPlus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnReadingDiary = new JButton("Reading Diary");
		btnReadingDiary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 Runtime r=Runtime.getRuntime(); 
				    Process p=null; 
				    try 
				    { 
				      String s="src/readingdiary.exe"; 
				      p=r.exec(s); 
				    } 
				    catch(Exception e){ 
				      System.out.println("error==="+e.getMessage()); 
				      e.printStackTrace(); 
				    } 
				
			}
		});
		btnReadingDiary.setBounds(307, 227, 117, 23);
		contentPane.add(btnReadingDiary);
	}
}
