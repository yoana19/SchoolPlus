package main;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class SchoolPlus extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JLabel label;
	private JTextArea txt1;
	private JTextArea txt2;
	private JTextArea txt3;
	private JTextArea txt4;
	private JTextArea txt5;
	private JTextArea txt6;
	private JTextArea txt7;
	private JPanel pnlLiterature;
	private JPanel pnlHistGeo;
	private JPanel pnlScience;
	private JPanel pnlMaths;
	private JLabel label_1;
	private JButton btnBg;
	private JButton btnReset;
	private JLabel lblReadingDiary;
	private JButton btnQuadEq;
	private JLabel lblQuadraticEquation;
	private JLabel lblNotes;
	private JButton btnSave;
	private JTextArea txtNotes;

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
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1050, 625);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Font font = new Font("Lucida Grande", Font.ITALIC, 16);
		Map attributes = font.getAttributes();
		attributes.put(TextAttribute.STRIKETHROUGH, TextAttribute.STRIKETHROUGH_ON);
		Font newFont = new Font(attributes);

		JRadioButton btn1 = new JRadioButton("");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					txt1.setFont(newFont);
			}
		});
		btn1.setBackground(Color.WHITE);
		btn1.setBounds(356, 70, 28, 23);
		contentPane.add(btn1);

		JRadioButton btn2 = new JRadioButton("");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt2.setFont(newFont);
			}
		});
		btn2.setBackground(Color.WHITE);
		btn2.setBounds(356, 100, 28, 23);
		contentPane.add(btn2);

		JRadioButton btn3 = new JRadioButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt3.setFont(newFont);
			}
		});
		btn3.setBackground(Color.WHITE);
		btn3.setBounds(356, 130, 28, 23);
		contentPane.add(btn3);

		JRadioButton btn4 = new JRadioButton("");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt4.setFont(newFont);
			}
		});
		btn4.setBackground(Color.WHITE);
		btn4.setBounds(356, 160, 28, 23);
		contentPane.add(btn4);

		JRadioButton btn5 = new JRadioButton("");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt5.setFont(newFont);
			}
		});
		btn5.setBackground(Color.WHITE);
		btn5.setBounds(356, 190, 28, 23);
		contentPane.add(btn5);

		JRadioButton btn6 = new JRadioButton("");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt6.setFont(newFont);
			}
		});
		btn6.setBackground(Color.WHITE);
		btn6.setBounds(356, 220, 28, 23);
		contentPane.add(btn6);

		JRadioButton btn7 = new JRadioButton("");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt7.setFont(newFont);
			}
		});
		btn7.setBackground(Color.WHITE);
		btn7.setBounds(356, 250, 28, 23);
		contentPane.add(btn7);

		

		btnReset = new JButton("");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txt1.setVisible(true);
				txt2.setVisible(true);
				txt3.setVisible(true);
				txt4.setVisible(true);
				txt5.setVisible(true);
				txt6.setVisible(true);
				txt7.setVisible(true);

				txt1.setEditable(true);
				txt2.setEditable(true);
				txt3.setEditable(true);
				txt4.setEditable(true);
				txt5.setEditable(true);
				txt6.setEditable(true);
				txt7.setEditable(true);

				txt1.setText("");
				txt2.setText("");
				txt3.setText("");
				txt4.setText("");
				txt5.setText("");
				txt6.setText("");
				txt7.setText("");

				btn1.setVisible(true);
				btn2.setVisible(true);
				btn3.setVisible(true);
				btn4.setVisible(true);
				btn5.setVisible(true);
				btn6.setVisible(true);
				btn7.setVisible(true);

				if (btn1.isSelected() == true)
					btn1.setSelected(false);
				if (btn2.isSelected() == true)
					btn2.setSelected(false);
				if (btn3.isSelected() == true)
					btn3.setSelected(false);
				if (btn4.isSelected() == true)
					btn4.setSelected(false);
				if (btn5.isSelected() == true)
					btn5.setSelected(false);
				if (btn6.isSelected() == true)
					btn6.setSelected(false);
				if (btn7.isSelected() == true)
					btn7.setSelected(false);

			}
		});
		btnReset.setBounds(453, 285, 140, 30);
		contentPane.add(btnReset);
		btnReset.setOpaque(false);
		btnReset.setFocusPainted(false);
		btnReset.setBorderPainted(false);
		btnReset.setContentAreaFilled(false);
		btnReset.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		btnReset.setIcon((new ImageIcon(Toolkit.getDefaultToolkit().getClass().getResource("/res/reset.png"))));

		txt1 = new JTextArea();
		txt1.setLineWrap(true);
		txt1.setBackground(SystemColor.menu);
		txt1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		txt1.setBounds(391, 70, 296, 23);
		contentPane.add(txt1);

		txt2 = new JTextArea();
		txt2.setBackground(SystemColor.menu);
		txt2.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		txt2.setBounds(391, 100, 296, 23);
		contentPane.add(txt2);

		txt3 = new JTextArea();
		txt3.setBackground(SystemColor.menu);
		txt3.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		txt3.setBounds(391, 130, 296, 23);
		contentPane.add(txt3);

		txt4 = new JTextArea();
		txt4.setBackground(SystemColor.menu);
		txt4.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		txt4.setBounds(391, 160, 296, 23);
		contentPane.add(txt4);

		txt5 = new JTextArea();
		txt5.setBackground(SystemColor.menu);
		txt5.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		txt5.setBounds(390, 190, 296, 23);
		contentPane.add(txt5);

		txt6 = new JTextArea();
		txt6.setBackground(SystemColor.menu);
		txt6.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		txt6.setBounds(391, 220, 296, 23);
		contentPane.add(txt6);

		txt7 = new JTextArea();
		txt7.setBackground(SystemColor.menu);
		txt7.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		txt7.setBounds(391, 250, 296, 23);
		contentPane.add(txt7);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(356, 325, 331, 239);
		contentPane.add(scrollPane);

		txtNotes = new JTextArea();
		scrollPane.setViewportView(txtNotes);
		txtNotes.setLineWrap(true);
		txtNotes.setWrapStyleWord(true);
		txtNotes.setBackground(new Color(240, 255, 255));
		
		lblNotes = new JLabel("Notes");
		lblNotes.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPane.setColumnHeaderView(lblNotes);

		pnlLiterature = new JPanel();
		pnlLiterature.setBackground(new Color(255, 250, 250));
		pnlLiterature.setBounds(32, 80, 296, 239);
		contentPane.add(pnlLiterature);
		pnlLiterature.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Language",
				TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlLiterature.setLayout(null);

		pnlMaths = new JPanel();
		pnlMaths.setBackground(new Color(255, 250, 250));
		pnlMaths.setLayout(null);
		pnlMaths.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Maths", TitledBorder.CENTER,
				TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlMaths.setBounds(715, 78, 296, 239);
		contentPane.add(pnlMaths);
		
		btnQuadEq = new JButton("");
		btnQuadEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					QuadraticEquation frame = new QuadraticEquation();
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnQuadEq.setOpaque(false);
		btnQuadEq.setFocusPainted(false);
		btnQuadEq.setContentAreaFilled(false);
		btnQuadEq.setBorderPainted(false);
		btnQuadEq.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		btnQuadEq.setBounds(49, 23, 65, 67);
		pnlMaths.add(btnQuadEq);
		btnQuadEq.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getClass().getResource("/res/quadeqicn.png")));
		
		
		lblQuadraticEquation = new JLabel("Quadratic Equation");
		lblQuadraticEquation.setBounds(22, 92, 120, 16);
		pnlMaths.add(lblQuadraticEquation);

		pnlScience = new JPanel();
		pnlScience.setBackground(new Color(255, 250, 250));
		pnlScience.setLayout(null);
		pnlScience.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Science",
				TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlScience.setBounds(715, 331, 296, 239);
		contentPane.add(pnlScience);

		pnlHistGeo = new JPanel();
		pnlHistGeo.setBackground(new Color(255, 250, 250));
		pnlHistGeo.setLayout(null);
		pnlHistGeo.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "History/Geography",
				TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlHistGeo.setBounds(32, 331, 296, 239);
		contentPane.add(pnlHistGeo);

		JLabel lblSchoolplus = new JLabel("SchoolPlus");
		lblSchoolplus.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 50));
		lblSchoolplus.setHorizontalAlignment(SwingConstants.CENTER);
		lblSchoolplus.setBounds(257, 11, 552, 52);
		contentPane.add(lblSchoolplus);

		

		btnBg = new JButton("BG");
		btnBg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnBg.getText().equals("BG")) {
					btnBg.setText("EN");
					pnlLiterature.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Хуманитарни науки",
							TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
					pnlHistGeo.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
							"Социални науки", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
					pnlMaths.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Математика",
							TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
					pnlScience.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Науки",
							TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
					lblNotes.setText("Бележки");
					// btnSave.setText("������");
					// btnReset.setText("��������");
				} else if (btnBg.getText().equals("EN")) {
					btnBg.setText("BG");
					pnlLiterature.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Language",
							TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
					pnlHistGeo.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
							"History/Geography", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
					pnlMaths.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Maths",
							TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
					pnlScience.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Science",
							TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
					lblNotes.setText("Notes");
					// btnSave.setText("Save");
					// btnReset.setText("Reset");
				}
			}
		});
		btnBg.setBounds(977, 573, 67, 23);
		contentPane.add(btnBg);

		JButton btnReadingDiary = new JButton("");
		btnReadingDiary.setBounds(31, 24, 65, 67);
		pnlLiterature.add(btnReadingDiary);
		btnReadingDiary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					readingdiary frame = new readingdiary();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
		btnReadingDiary.setIcon(new ImageIcon((Toolkit.getDefaultToolkit().getClass().getResource("/res/readingdiary.png"))));
		btnReadingDiary.setOpaque(false);
		btnReadingDiary.setFocusPainted(false);
		btnReadingDiary.setBorderPainted(false);
		btnReadingDiary.setContentAreaFilled(false);
		btnReadingDiary.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		
		lblReadingDiary = new JLabel("Reading Diary");
		lblReadingDiary.setBounds(22, 103, 87, 16);
		pnlLiterature.add(lblReadingDiary);
		
		btnSave = new JButton("");
		btnSave.addActionListener(new ActionListener() {
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
					out.write(txtNotes.getText());
					out.close();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				
				

			}
		});
		btnSave.setOpaque(false);
		btnSave.setFocusPainted(false);
		btnSave.setContentAreaFilled(false);
		btnSave.setBorderPainted(false);
		btnSave.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		btnSave.setBounds(453, 567, 140, 30);
		contentPane.add(btnSave);
		btnSave.setIcon(new ImageIcon((Toolkit.getDefaultToolkit().getClass().getResource("/res/save.png"))));
		
		label_1 = new JLabel("");
		label_1.setBounds(0, 0, 1064, 600);
		contentPane.add(label_1);
		label_1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getClass().getResource("/res/bg.jpg")));
	}
} 
