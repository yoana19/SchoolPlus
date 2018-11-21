package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.BorderFactory;
import javax.swing.DropMode;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.SystemColor;

public class readingdiary extends JFrame {

	private JPanel contentPane;
	private JTextArea genre;
	private JTextArea title;
	private JLabel lblGenre;
	private JLabel lblAuthor;
	private JLabel lblPages;
	private JTextField pages;
	private JTextArea summary;
	private JLabel lblSummary;
	private JLabel lblOpinion;
	private JTextArea opinion;
	private JButton btnDown;
	private JLabel lblCharacters;
	private JTextArea characters;
	private JLabel lblDate1;
	private JLabel lblDate2;
	private JTextField date1;
	private JTextField date2;
	private JScrollPane scrollPane_1;
	private JTextArea author;
	private JScrollPane scrollPane_2;
	private JScrollPane scrollPane_3;
	private JScrollPane scrollPane_4;
	private JScrollPane scrollPane_5;
	private JLabel lblRating;
	private JTextField rating;
	private JLabel rating1;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_6;
	private JLabel lblQuotes;
	private JTextArea quotes;
	private JButton btnBg;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					readingdiary frame = new readingdiary();
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
	private static class RoundedBorder implements Border {

	    private int radius;


	    RoundedBorder(int radius) {
	        this.radius = radius;
	    }


	    public Insets getBorderInsets(Component c) {
	        return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
	    }


	    public boolean isBorderOpaque() {
	        return true;
	    }


	    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
	        g.drawRoundRect(x, y, width-1, height-1, radius, radius);
	    }
	}
	
	public readingdiary() {
		setTitle("Reading Diary/\u0427\u0438\u0442\u0430\u0442\u0435\u043B\u0441\u043A\u0438 \u0434\u043D\u0435\u0432\u043D\u0438\u043A");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 643, 635);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setForeground(Color.BLACK);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTitle.setBounds(6, 32, 117, 16);
		contentPane.add(lblTitle);
		
		
		btnDown = new JButton("Download");
		btnDown.setForeground(Color.WHITE);
		btnDown.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDown.setBackground(new Color(233, 150, 122));
		btnDown.setBounds(236, 575, 165, 30);
		btnDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				int returnValue = fc.showSaveDialog(contentPane);
				try {
					BufferedWriter out = new BufferedWriter(
							new OutputStreamWriter(
									new FileOutputStream(
											fc.getSelectedFile().getPath()
											), 
									"UTF-8")
							);
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
					out.write("Opinion: " + "\n" +  opinion.getText() + "\n\n");
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
						out.write("Мнение: " + "\n" +  opinion.getText() + "\n\n");
					}
					out.close();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				
				
			}
		});
		contentPane.add(btnDown);
		btnDown.setBorder(new RoundedBorder(20));
		
		lblGenre = new JLabel("Genre:");
		lblGenre.setForeground(Color.BLACK);
		lblGenre.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGenre.setBounds(6, 174, 61, 16);
		contentPane.add(lblGenre);
		
		lblAuthor = new JLabel("Author:");
		lblAuthor.setForeground(Color.BLACK);
		lblAuthor.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAuthor.setBounds(6, 107, 61, 16);
		contentPane.add(lblAuthor);
		
		lblPages = new JLabel("Number of Pages:");
		lblPages.setForeground(Color.BLACK);
		lblPages.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPages.setBounds(6, 246, 117, 16);
		contentPane.add(lblPages);
		
		pages = new JTextField();
		pages.setBounds(135, 241, 61, 26);
		contentPane.add(pages);
		pages.setColumns(10);
		
		lblSummary = new JLabel("Summary:");
		lblSummary.setForeground(Color.BLACK);
		lblSummary.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSummary.setBounds(350, 32, 84, 16);
		contentPane.add(lblSummary);
		
		lblOpinion = new JLabel("Opinion:");
		lblOpinion.setForeground(Color.BLACK);
		lblOpinion.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblOpinion.setBounds(350, 425, 138, 16);
		contentPane.add(lblOpinion);
		
		lblCharacters = new JLabel("Characters:");
		lblCharacters.setForeground(Color.BLACK);
		lblCharacters.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCharacters.setBounds(6, 425, 84, 16);
		contentPane.add(lblCharacters);
		
		lblDate1 = new JLabel("Date Started:");
		lblDate1.setForeground(Color.BLACK);
		lblDate1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDate1.setBounds(6, 292, 92, 16);
		contentPane.add(lblDate1);
		
		lblDate2 = new JLabel("Date Finished:");
		lblDate2.setForeground(Color.BLACK);
		lblDate2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDate2.setBounds(6, 339, 102, 16);
		contentPane.add(lblDate2);
		
		date1 = new JTextField();
		date1.setBounds(110, 287, 86, 26);
		date1.setColumns(10);
		contentPane.add(date1);
		
		date2 = new JTextField();
		date2.setBounds(110, 334, 86, 26);
		date2.setColumns(10);
		contentPane.add(date2);
		
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 57, 282, 27);
		contentPane.add(scrollPane);
		scrollPane.setVisible(true);
		
		title = new JTextArea();
		scrollPane.setViewportView(title);
		title.setWrapStyleWord(true);
		title.setLineWrap(true);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(6, 135, 282, 27);
		contentPane.add(scrollPane_1);
		
		author = new JTextArea();
		author.setWrapStyleWord(true);
		author.setLineWrap(true);
		scrollPane_1.setViewportView(author);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(6, 202, 282, 27);
		contentPane.add(scrollPane_2);
		
		genre = new JTextArea();
		scrollPane_2.setViewportView(genre);
		genre.setWrapStyleWord(true);
		genre.setLineWrap(true);
		
		scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(6, 453, 282, 116);
		contentPane.add(scrollPane_3);
		
		characters = new JTextArea();
		scrollPane_3.setViewportView(characters);
		characters.setWrapStyleWord(true);
		characters.setLineWrap(true);
		
		scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(350, 57, 282, 205);
		contentPane.add(scrollPane_4);
		
		
		summary = new JTextArea();
		scrollPane_4.setViewportView(summary);
		summary.setWrapStyleWord(true);
		summary.setLineWrap(true);
		
		scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(350, 453, 282, 116);
		contentPane.add(scrollPane_5);
		
		opinion = new JTextArea();
		scrollPane_5.setViewportView(opinion);
		opinion.setWrapStyleWord(true);
		opinion.setLineWrap(true);
		
		lblRating = new JLabel("Rating:");
		lblRating.setForeground(Color.BLACK);
		lblRating.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRating.setBounds(6, 383, 61, 16);
		contentPane.add(lblRating);
		
		rating = new JTextField();
		rating.setColumns(10);
		rating.setBounds(64, 378, 26, 26);
		contentPane.add(rating);
		
		rating1 = new JLabel("/5");
		rating1.setForeground(Color.BLACK);
		rating1.setFont(new Font("Tahoma", Font.BOLD, 12));
		rating1.setBounds(89, 383, 26, 16);
		contentPane.add(rating1);
		
		scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(350, 297, 282, 116);
		contentPane.add(scrollPane_6);
		
		quotes = new JTextArea();
		quotes.setLineWrap(true);
		quotes.setWrapStyleWord(true);
		scrollPane_6.setViewportView(quotes);
		
		lblQuotes = new JLabel("Quotes:");
		lblQuotes.setForeground(Color.BLACK);
		lblQuotes.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblQuotes.setBounds(350, 269, 84, 16);
		contentPane.add(lblQuotes);
		
		btnBg = new JButton("BG");
		btnBg.setForeground(SystemColor.controlShadow);
		btnBg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (btnBg.getText().equals("BG")) {
					btnBg.setText("EN");
					lblTitle.setText("Заглавие:");
					lblAuthor.setText("Автор:");
					lblGenre.setText("Жанр:");
					lblPages.setText("Брой страници:");
					lblDate1.setText("Започната на:");
					lblDate2.setText("Завършена на:");
					lblRating.setText("Оценка:");
					lblCharacters.setText("Герои:");
					lblSummary.setText("Резюме:");
					lblQuotes.setText("Цитати:");
					lblOpinion.setText("Мнение:");
					btnDown.setText("Изтегли");
					btnBg.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getClass().getResource("/res/en.png")));
				} else if (btnBg.getText().equals("EN")) {
					btnBg.setText("BG");
					lblTitle.setText("Title:");
					lblAuthor.setText("Author:");
					lblGenre.setText("Genre:");
					lblPages.setText("Number of Pages:");
					lblDate1.setText("Date Started:");
					lblDate2.setText("Date Finished:");
					lblRating.setText("Rating:");
					lblCharacters.setText("Characters:");
					lblSummary.setText("Summary:");
					lblQuotes.setText("Quotes:");
					lblOpinion.setText("Opinion:");
					btnDown.setText("Download");
					btnBg.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getClass().getResource("/res/bg.png")));
				}
				
			}
		});
		btnBg.setBounds(573, 579, 77, 30);
		contentPane.add(btnBg);
		btnBg.setOpaque(false);
		btnBg.setFocusPainted(false);
		btnBg.setBorderPainted(false);
		btnBg.setContentAreaFilled(false);
		btnBg.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		btnBg.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getClass().getResource("/res/bg.png")));

		
		label = new JLabel("");
		label.setBounds(0, 0, 650, 623);
		contentPane.add(label);
		label.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getClass().getResource("/res/readingdiary.jpg")));
		
	}
}
