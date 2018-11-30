package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Randomizer extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;
	private JButton btnSaveFile;
	private JButton btnScramble;
	private JTextArea textArea1;
	private JButton btnClear;
	private JButton btnBg;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Randomizer frame = new Randomizer();
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
	public Randomizer() {
		setResizable(false);
		setTitle("Randomizer");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 928, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setBounds(10, 57, 287, 225);
		contentPane.add(textArea);

		JButton btnOpenFile = new JButton("Open File");
		btnOpenFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fc = new JFileChooser();
				int returnValue = fc.showOpenDialog(contentPane);
				try {
					if (returnValue == JFileChooser.APPROVE_OPTION) {
						String fileContent = "";

						BufferedReader in = new BufferedReader(
								new InputStreamReader(new FileInputStream(fc.getSelectedFile()), "UTF-8"));
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
		btnOpenFile.setBounds(333, 212, 89, 23);
		contentPane.add(btnOpenFile);

		btnSaveFile = new JButton("Save File");
		btnSaveFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				int returnValue = fc.showSaveDialog(contentPane);
				try {
					BufferedWriter out = new BufferedWriter(
							new OutputStreamWriter(new FileOutputStream(fc.getSelectedFile().getPath()), "UTF-8"));
					out.write(textArea.getText());
					out.close();
				} catch (IOException e1) {

					e1.printStackTrace();
				}
			}
		});
		btnSaveFile.setBounds(489, 212, 89, 23);
		contentPane.add(btnSaveFile);

		btnScramble = new JButton("Scramble");
		btnScramble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String s = textArea.getText();
				boolean hasPoint = false;
			
				if(s.charAt(s.length()-1) == '.') {
					s = s.replace('.', ' ');
					hasPoint = true;
				}
				ArrayList<String> arr = new ArrayList<String>(Arrays.asList(s.split(" ")));

				String randomisedString = "";
				Random r = new Random();
				while (!arr.isEmpty()) {
					int n = r.nextInt(arr.size());
					
					randomisedString += arr.get(n) + " ";
					arr.remove(n);
				}
				
				

				textArea1.setText(randomisedString);

			}
		});
		btnScramble.setBounds(333, 156, 106, 23);
		contentPane.add(btnScramble);

		textArea1 = new JTextArea();
		textArea1.setWrapStyleWord(true);
		textArea1.setLineWrap(true);
		textArea1.setBounds(615, 57, 287, 225);
		contentPane.add(textArea1);

		btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				textArea1.setText("");
			}
		});
		btnClear.setBounds(472, 156, 106, 23);
		contentPane.add(btnClear);

		btnBg = new JButton("BG");
		btnBg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (btnBg.getText().equals("BG")) {
					btnBg.setText("EN");
					btnOpenFile.setText("Отвори");
					btnClear.setText("Изчисти");
					btnSaveFile.setText("Запази");
					btnScramble.setText("Разбъркай");
				} else if (btnBg.getText().equals("EN")) {
					btnBg.setText("BG");
					btnOpenFile.setText("Open File");
					btnClear.setText("Clear");
					btnSaveFile.setText("Save File");
					btnScramble.setText("Scramble");
				}
				
			}
		});
		btnBg.setBounds(864, 303, 58, 29);
		contentPane.add(btnBg);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(Randomizer.class.getResource("/res/book.jpg")));
		label.setBounds(-35, 0, 996, 404);
		contentPane.add(label);
		
		
	}
}
