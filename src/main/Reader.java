package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Toolkit;
import java.util.Hashtable;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JScrollPane;

public class Reader extends JFrame {

	private JPanel contentPane;
	private JLabel label;
	private JTextArea textArea;
	private JButton btnBg;

	
	
	/**
	 * Launch the application.
	 */
	
	private static class RoundedBorder implements Border {

		private int radius;

		RoundedBorder(int radius) {
			this.radius = radius;
		}

		public Insets getBorderInsets(Component c) {
			return new Insets(this.radius + 1, this.radius + 1, this.radius + 2, this.radius);
		}

		public boolean isBorderOpaque() {
			return true;
		}

		public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
			g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
		}
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reader frame = new Reader();
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
	public Reader() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 466, 645);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JButton btnOpen = new JButton("Open");
		btnOpen.setBackground(new Color(184, 134, 11));
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JFileChooser fc = new JFileChooser();
				int returnValue = fc.showOpenDialog(contentPane);
				try {
					if (returnValue == JFileChooser.APPROVE_OPTION) {
						String fileContent = "";
						
						BufferedReader in = new BufferedReader(
								new InputStreamReader(
										new FileInputStream (
										fc.getSelectedFile()),
									"UTF-8"	));
						String nextLine = in.readLine();
						
						while (nextLine != null) {
							fileContent += nextLine + "\n";
							nextLine = in.readLine();
						} 
						textArea.setText(fileContent);
						
					}
				} catch (IOException e1) {
					
					
					e1.printStackTrace();	
				}
				
			}
		});
		btnOpen.setBounds(182, 549, 89, 23);
		contentPane.add(btnOpen);
		btnOpen.setBorder(new RoundedBorder(15));
		
		
		
		btnBg = new JButton("BG");
		btnBg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnBg.getText().equals("BG")) {
					btnBg.setText("EN");
					btnOpen.setText("Отвори");
				} else if (btnBg.getText().equals("EN")) {
					btnBg.setText("BG");
					btnOpen.setText("Open");
				}
			}
		});
		btnBg.setBounds(400, 583, 50, 23);
		contentPane.add(btnBg);
		btnBg.setBackground(new Color(184, 134, 11));
		btnBg.setBorder(new RoundedBorder(15));
		
		label = new JLabel("");
		label.setBounds(0, 0, 454, 606);
		contentPane.add(label);
		label.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getClass().getResource("/res/reader.jpg")));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 21, 429, 494);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setBackground(new Color(255, 204, 153));
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		
		
	}
}
