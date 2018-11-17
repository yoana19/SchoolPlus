package main;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import main.readingdiary.RoundedBorder;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.awt.event.ActionEvent;

public class readingdiary1 extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnDown;

	/**
	 * Create the panel.
	 */
	public readingdiary1() {
		setLayout(null);

		JLabel label = new JLabel("Title:");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(10, 36, 61, 16);
		add(label);

		JLabel label_1 = new JLabel("Author:");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(10, 109, 61, 16);
		add(label_1);

		JLabel label_2 = new JLabel("Genre:");
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_2.setBounds(10, 182, 61, 16);
		add(label_2);

		JTextArea textArea_2 = new JTextArea();
		textArea_2.setWrapStyleWord(true);
		textArea_2.setLineWrap(true);
		textArea_2.setBounds(10, 209, 280, 25);
		add(textArea_2);

		JLabel label_3 = new JLabel("Number of Pages:");
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_3.setBounds(10, 254, 117, 16);
		add(label_3);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(137, 250, 61, 26);
		add(textField);

		JLabel label_4 = new JLabel("Date Finished:");
		label_4.setForeground(Color.BLACK);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_4.setBounds(10, 337, 102, 16);
		add(label_4);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(122, 290, 86, 26);
		add(textField_1);

		JLabel label_5 = new JLabel("Date Started:");
		label_5.setForeground(Color.BLACK);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_5.setBounds(10, 296, 92, 16);
		add(label_5);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(122, 336, 86, 26);
		add(textField_2);

		JLabel label_6 = new JLabel("Rating:");
		label_6.setForeground(Color.BLACK);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_6.setBounds(10, 383, 61, 16);
		add(label_6);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(65, 380, 26, 26);
		add(textField_3);

		JLabel label_7 = new JLabel("/5");
		label_7.setForeground(Color.BLACK);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_7.setBounds(97, 383, 26, 16);
		add(label_7);

		JLabel label_8 = new JLabel("Characters:");
		label_8.setForeground(Color.BLACK);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_8.setBounds(10, 431, 84, 16);
		add(label_8);

		JTextArea textArea_3 = new JTextArea();
		textArea_3.setWrapStyleWord(true);
		textArea_3.setLineWrap(true);
		textArea_3.setBounds(10, 458, 280, 114);
		add(textArea_3);

		JLabel label_9 = new JLabel("Summary:");
		label_9.setForeground(Color.BLACK);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_9.setBounds(355, 36, 84, 16);
		add(label_9);

		JTextArea textArea_4 = new JTextArea();
		textArea_4.setWrapStyleWord(true);
		textArea_4.setLineWrap(true);
		textArea_4.setBounds(355, 63, 280, 203);
		add(textArea_4);

		JLabel label_10 = new JLabel("Quotes:");
		label_10.setForeground(Color.BLACK);
		label_10.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_10.setBounds(355, 277, 84, 16);
		add(label_10);

		JTextArea textArea_5 = new JTextArea();
		textArea_5.setWrapStyleWord(true);
		textArea_5.setLineWrap(true);
		textArea_5.setBounds(355, 300, 280, 114);
		add(textArea_5);

		JLabel label_11 = new JLabel("Opinion:");
		label_11.setForeground(Color.BLACK);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_11.setBounds(355, 433, 138, 16);
		add(label_11);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 63, 280, 25);
		add(scrollPane);

		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 136, 280, 25);
		add(scrollPane_1);

		JTextArea textArea_1 = new JTextArea();
		scrollPane_1.setViewportView(textArea_1);
		textArea_1.setWrapStyleWord(true);
		textArea_1.setLineWrap(true);

		btnDown = new JButton("Download");
		btnDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fc = new JFileChooser();
				int returnValue = fc.showSaveDialog(contentPane);
				try {
					BufferedWriter out = new BufferedWriter(
							new OutputStreamWriter(new FileOutputStream(fc.getSelectedFile().getPath()), "UTF-8"));
					if (btnDown.getText().equals("Download")) {
						out.write("Title: " + "\n" + title.getText() + "\n\n");
						out.write("Author: " + "\n" + author.getText() + "\n\n");
						out.write("Genre: " + "\n" + genre.getText() + "\n\n");
						out.write("Number of Pages: " + "\n" + pages.getText() + "\n\n");
						out.write("Date Started: " + "\n" + date1.getText() + "\n\n");
						out.write("Date Finished: " + "\n" + date2.getText() + "\n\n");
						out.write("Rating: " + "\n" + rating.getText() + "/5" + "\n\n");
						out.write("Characters: " + "\n" + characters.getText() + "\n\n");
						out.write("Summary: " + "\n" + summary.getText() + "\n\n");
						out.write("Quotes: " + "\n" + quotes.getText() + "\n\n");
						out.write("Opinion: " + "\n" + opinion.getText() + "\n\n");
					} else {
						out.write("Заглавие: " + "\n" + title.getText() + "\n\n");
						out.write("Автор: " + "\n" + author.getText() + "\n\n");
						out.write("Жанр: " + "\n" + genre.getText() + "\n\n");
						out.write("Брой страници: " + "\n" + pages.getText() + "\n\n");
						out.write("Започната на: " + "\n" + date1.getText() + "\n\n");
						out.write("Завършена на: " + "\n" + date2.getText() + "\n\n");
						out.write("Оценка: " + "\n" + rating.getText() + "/5" + "\n\n");
						out.write("Герои: " + "\n" + characters.getText() + "\n\n");
						out.write("Резюме: " + "\n" + summary.getText() + "\n\n");
						out.write("Цитати: " + "\n" + quotes.getText() + "\n\n");
						out.write("Мнение: " + "\n" + opinion.getText() + "\n\n");
					}
					out.close();
				} catch (IOException e1) {

					e1.printStackTrace();
				}
			}
		});
		btnDown.setForeground(Color.WHITE);
		btnDown.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDown.setBorder(new RoundedBorder(20));
		btnDown.setBackground(new Color(233, 150, 122));
		btnDown.setBounds(253, 599, 165, 30);
		add(btnDown);

		JTextArea textArea_6 = new JTextArea();
		textArea_6.setWrapStyleWord(true);
		textArea_6.setLineWrap(true);
		textArea_6.setBounds(355, 458, 280, 114);
		add(textArea_6);

	}
}
