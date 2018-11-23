package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Flashcards extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Flashcards frame = new Flashcards();
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
	public Flashcards() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 200, 20);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 42, 200, 20);
		contentPane.add(scrollPane_1);
		
		JTextArea textArea_7 = new JTextArea();
		scrollPane_1.setViewportView(textArea_7);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 73, 200, 20);
		contentPane.add(scrollPane_2);
		
		JTextArea textArea_6 = new JTextArea();
		scrollPane_2.setViewportView(textArea_6);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 104, 200, 20);
		contentPane.add(scrollPane_3);
		
		JTextArea textArea_5 = new JTextArea();
		scrollPane_3.setViewportView(textArea_5);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(10, 135, 200, 20);
		contentPane.add(scrollPane_4);
		
		JTextArea textArea_4 = new JTextArea();
		scrollPane_4.setViewportView(textArea_4);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(10, 166, 200, 20);
		contentPane.add(scrollPane_5);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setLineWrap(true);
		scrollPane_5.setViewportView(textArea_3);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(10, 197, 200, 20);
		contentPane.add(scrollPane_6);
		
		JTextArea textArea_2 = new JTextArea();
		scrollPane_6.setViewportView(textArea_2);
		
		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(224, 11, 200, 20);
		contentPane.add(scrollPane_7);
		
		JScrollPane scrollPane_8 = new JScrollPane();
		scrollPane_8.setBounds(224, 104, 200, 20);
		contentPane.add(scrollPane_8);
		
		JScrollPane scrollPane_9 = new JScrollPane();
		scrollPane_9.setBounds(224, 73, 200, 20);
		contentPane.add(scrollPane_9);
		
		JScrollPane scrollPane_10 = new JScrollPane();
		scrollPane_10.setBounds(224, 42, 200, 20);
		contentPane.add(scrollPane_10);
		
		JScrollPane scrollPane_11 = new JScrollPane();
		scrollPane_11.setBounds(224, 135, 200, 20);
		contentPane.add(scrollPane_11);
		
		JScrollPane scrollPane_12 = new JScrollPane();
		scrollPane_12.setBounds(224, 166, 200, 20);
		contentPane.add(scrollPane_12);
		
		JScrollPane scrollPane_13 = new JScrollPane();
		scrollPane_13.setBounds(224, 197, 200, 20);
		contentPane.add(scrollPane_13);
		
		JScrollPane scrollPane_14 = new JScrollPane();
		scrollPane_14.setBounds(224, 228, 200, 20);
		contentPane.add(scrollPane_14);
		
		JScrollPane scrollPane_15 = new JScrollPane();
		scrollPane_15.setBounds(10, 228, 200, 20);
		contentPane.add(scrollPane_15);
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane_15.setViewportView(textArea_1);
	}
}
