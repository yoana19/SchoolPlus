package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Dictionary;
import java.awt.event.ActionEvent;

public class SpellCheck extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;
	private JButton btnCheck;
	
	private Dictionary dict;
    final static String filePath = "/res/words.txt";
    final static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SpellCheck frame = new SpellCheck();
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
	public SpellCheck() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 11, 414, 189);
		contentPane.add(textArea);
		
		btnCheck = new JButton("Check");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnCheck.setBounds(168, 227, 89, 23);
		contentPane.add(btnCheck);
	}
}
