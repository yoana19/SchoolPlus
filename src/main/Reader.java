package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Hashtable;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Reader extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox_1;
	private JButton Dracula;

	
	
	/**
	 * Launch the application.
	 */
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setBounds(10, 106, 429, 494);
		contentPane.add(textArea);
		textArea.setVisible(false);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"English", "\u0411\u044A\u043B\u0433\u0430\u0440\u0441\u043A\u0438"}));
		comboBox.setBounds(10, 47, 107, 20);
		contentPane.add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(155, 47, 204, 20);
		contentPane.add(comboBox_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 90, 349, 510);
		contentPane.add(panel);
		panel.setLayout(null);
		
		Dracula = new JButton("");
		Dracula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				textArea.setVisible(true);
				panel.setVisible(false);
			
				/*File file = new File("res/heh.txt");
				BufferedReader reader = null;
				try {
					reader = new BufferedReader(new FileReader(file));
					String text = null;
					String savetext=null;
						            		
					while ((text = reader.readLine()) != null) {
						savetext += text;
					} 
					textArea.setText(savetext);
				}catch  (Exception e1) {
					e1.printStackTrace();
				}*/
				
				
				StringBuilder result = new StringBuilder("");
				ClassLoader cL = this.getClass().getClassLoader();
				cL.getParent();
				File file = new File(cL.getResource("gf.txt").getFile());

				try {
					Scanner scanner = new Scanner(file);
					while (scanner.hasNextLine()) {
						String line = scanner.nextLine();
						result.append(line).append("\n");
					}

					scanner.close();

				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				textArea.append(result.toString());
				
				}
		});
		Dracula.setBounds(10, 11, 67, 87);
		panel.add(Dracula);
	}
}
