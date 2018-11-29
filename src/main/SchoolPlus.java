package main;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.io.BufferedWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import java.util.Map;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JRadioButton;

import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.border.EtchedBorder;

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
	private JPanel pnlLinguistics;
	private JPanel pnlSocial;
	private JPanel pnlScience;
	private JPanel pnlMathematics;
	private JLabel label_1;
	private JButton btnBg;
	private JButton btnQuadEq;
	private JLabel lblNotes;
	private JTextArea txtNotes;
	private JButton btnReset;
	private JButton btnSave;
	private JButton btnReadingDiary;
	private JButton btnSettings;
	private JButton btnGeoQuiz;
	private JButton btnMultiCalc;
	private JButton btnCalc;
	private JButton btnFunc;
	private JButton btnReader;
	private JButton btnInterLiter;
	private JButton btnRandomizer;

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

	public SchoolPlus() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1050, 635);
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

		pnlLinguistics = new JPanel();
		pnlLinguistics.setBackground(new Color(255, 250, 250));
		pnlLinguistics.setBounds(32, 80, 296, 239);
		contentPane.add(pnlLinguistics);
		pnlLinguistics.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Linguistics",
				TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlLinguistics.setLayout(null);

		pnlMathematics = new JPanel();
		pnlMathematics.setBackground(new Color(255, 250, 250));
		pnlMathematics.setLayout(null);
		pnlMathematics.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null),
				"Mathematics & Informatics", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlMathematics.setBounds(715, 78, 296, 239);
		contentPane.add(pnlMathematics);

		btnQuadEq = new JButton("");
		btnQuadEq.setToolTipText("Quadratic Equation");
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
		btnQuadEq.setBounds(10, 15, 65, 67);
		pnlMathematics.add(btnQuadEq);
		btnQuadEq.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getClass().getResource("/res/quadeqicn.png")));
		
		btnMultiCalc = new JButton("");
		btnMultiCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					MultiCalc frame = new MultiCalc();
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnMultiCalc.setToolTipText("Scientific Calculator");
		btnMultiCalc.setOpaque(false);
		btnMultiCalc.setFocusPainted(false);
		btnMultiCalc.setContentAreaFilled(false);
		btnMultiCalc.setBorderPainted(false);
		btnMultiCalc.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		btnMultiCalc.setBounds(76, 15, 65, 67);
		pnlMathematics.add(btnMultiCalc);
		btnMultiCalc.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getClass().getResource("/res/multicalcicn.png")));
		
		btnCalc = new JButton("");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					calculator frame = new calculator();
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnCalc.setToolTipText("Scientific Calculator");
		btnCalc.setOpaque(false);
		btnCalc.setFocusPainted(false);
		btnCalc.setContentAreaFilled(false);
		btnCalc.setBorderPainted(false);
		btnCalc.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		btnCalc.setBounds(140, 20, 65, 67);
		pnlMathematics.add(btnCalc);
		btnCalc.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getClass().getResource("/res/calcicn.png")));
		
		btnFunc = new JButton("");
		btnFunc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Function frame = new Function();
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnFunc.setToolTipText("Functions");
		btnFunc.setOpaque(false);
		btnFunc.setFocusPainted(false);
		btnFunc.setContentAreaFilled(false);
		btnFunc.setBorderPainted(false);
		btnFunc.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		btnFunc.setBounds(210, 18, 65, 67);
		pnlMathematics.add(btnFunc);
		btnFunc.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getClass().getResource("/res/functionsicn.png")));
		
		pnlScience = new JPanel();
		pnlScience.setBackground(new Color(255, 250, 250));
		pnlScience.setLayout(null);
		pnlScience.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Natural Sciences",
				TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlScience.setBounds(715, 331, 296, 239);
		contentPane.add(pnlScience);

		pnlSocial = new JPanel();
		pnlSocial.setBackground(new Color(255, 250, 250));
		pnlSocial.setLayout(null);
		pnlSocial.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Social Sciences",
				TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlSocial.setBounds(32, 331, 296, 239);
		contentPane.add(pnlSocial);

		btnGeoQuiz = new JButton("");
		btnGeoQuiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					GeographyQuiz frame = new GeographyQuiz();
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnGeoQuiz.setToolTipText("Geography Quiz");
		btnGeoQuiz.setOpaque(false);
		btnGeoQuiz.setFocusPainted(false);
		btnGeoQuiz.setContentAreaFilled(false);
		btnGeoQuiz.setBorderPainted(false);
		btnGeoQuiz.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		btnGeoQuiz.setBounds(6, 20, 65, 67);
		pnlSocial.add(btnGeoQuiz);
		btnGeoQuiz.setIcon(new ImageIcon((Toolkit.getDefaultToolkit().getClass().getResource("/res/geographyquizicn.png"))));

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
					pnlLinguistics.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Ð›Ð¸Ð½Ð³Ð²Ð¸Ñ�Ñ‚Ð¸ÐºÐ°",
							TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
					pnlSocial.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
							"Ð¥ÑƒÐ¼Ð°Ð½Ð¸Ñ‚Ð°Ñ€Ð½Ð¸ Ð½Ð°ÑƒÐºÐ¸", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
					pnlMathematics.setBorder(
							new TitledBorder(UIManager.getBorder("TitledBorder.border"), "ÐœÐ°Ñ‚ÐµÐ¼Ð°Ñ‚Ð¸ÐºÐ° & Ð¸Ð½Ñ„Ð¾Ñ€Ð¼Ð°Ñ‚Ð¸ÐºÐ°",
									TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
					pnlScience.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "ÐŸÑ€Ð¸Ñ€Ð¾Ð´Ð½Ð¸ Ð½Ð°ÑƒÐºÐ¸",
							TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
					lblNotes.setText("Ð‘ÐµÐ»ÐµÐ¶ÐºÐ¸");
					btnReset.setText("Ð�ÑƒÐ»Ð¸Ñ€Ð°Ð½Ðµ");
					btnSave.setText("Ð—Ð°Ð¿Ð°Ð·Ð¸");
					btnSettings.setToolTipText("Ð¡Ð¼ÐµÐ½Ð¸ Ð¸Ð·Ð¾Ð±Ñ€Ð°Ð¶ÐµÐ½Ð¸ÐµÑ‚Ð¾");
					btnGeoQuiz.setToolTipText("Ð¢ÐµÑ�Ñ‚ Ð¿Ð¾ Ð³ÐµÐ¾Ð³Ñ€Ð°Ñ„Ð¸Ñ�");
					btnReadingDiary.setToolTipText("Ð§Ð¸Ñ‚Ð°Ñ‚ÐµÐ»Ñ�ÐºÐ¸ Ð´Ð½ÐµÐ²Ð½Ð¸Ðº");
					btnQuadEq.setToolTipText("ÐšÐ²Ð°Ð´Ñ€Ð°Ñ‚Ð½Ð¾ ÑƒÑ€Ð°Ð²Ð½ÐµÐ½Ð¸Ðµ");
					btnMultiCalc.setToolTipText("Ð�Ð°ÑƒÑ‡ÐµÐ½ ÐºÐ°Ð»ÐºÑƒÐ»Ð°Ñ‚Ð¾Ñ€");
					// btnSave.setText("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½");
					// btnReset.setText("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½");
				} else if (btnBg.getText().equals("EN")) {
					btnBg.setText("BG");
					pnlLinguistics.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Linguistics",
							TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
					pnlSocial.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Social Sciences",
							TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
					pnlMathematics.setBorder(
							new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Mathematics & Informatics",
									TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
					pnlScience.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
							"Natural Sciences", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
					lblNotes.setText("Notes");
					btnReset.setText("Reset");
					btnSave.setText("Save");
					btnSettings.setToolTipText("Change Background");
					btnGeoQuiz.setToolTipText("Geography Quiz");
					btnReadingDiary.setToolTipText("Reading Diary");
					btnQuadEq.setToolTipText("Quadratic Equation");
					btnMultiCalc.setToolTipText("Scientific Calculator");
					// btnSave.setText("Save");
					// btnReset.setText("Reset");
				}
			}
		});
		btnBg.setBounds(977, 573, 67, 23);
		contentPane.add(btnBg);

		btnReadingDiary = new JButton("");
		btnReadingDiary.setToolTipText("Reading Diary");
		btnReadingDiary.setBounds(10, 13, 65, 67);
		pnlLinguistics.add(btnReadingDiary);
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
		
		btnReader = new JButton("");
		btnReader.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Reader frame = new Reader();
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnReader.setToolTipText("Reading Diary");
		btnReader.setOpaque(false);
		btnReader.setFocusPainted(false);
		btnReader.setContentAreaFilled(false);
		btnReader.setBorderPainted(false);
		btnReader.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		btnReader.setBounds(80, 15, 65, 67);
		pnlLinguistics.add(btnReader);
		btnReader.setIcon(new ImageIcon((Toolkit.getDefaultToolkit().getClass().getResource("/res/readericn.png"))));
		
		btnInterLiter = new JButton("");
		btnInterLiter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Literature frame = new Literature();
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnInterLiter.setToolTipText("Reading Diary");
		btnInterLiter.setOpaque(false);
		btnInterLiter.setFocusPainted(false);
		btnInterLiter.setContentAreaFilled(false);
		btnInterLiter.setBorderPainted(false);
		btnInterLiter.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		btnInterLiter.setBounds(155, 15, 65, 67);
		pnlLinguistics.add(btnInterLiter);
		btnInterLiter.setIcon(new ImageIcon((Toolkit.getDefaultToolkit().getClass().getResource("/res/literatureicn.png"))));
		
		btnRandomizer = new JButton("");
		btnRandomizer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					Randomizer frame = new Randomizer();
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnRandomizer.setToolTipText("Reading Diary");
		btnRandomizer.setOpaque(false);
		btnRandomizer.setFocusPainted(false);
		btnRandomizer.setContentAreaFilled(false);
		btnRandomizer.setBorderPainted(false);
		btnRandomizer.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		btnRandomizer.setBounds(221, 13, 65, 67);
		pnlLinguistics.add(btnRandomizer);

		btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt1.setText("");
				txt2.setText("");
				txt3.setText("");
				txt4.setText("");
				txt5.setText("");
				txt6.setText("");
				txt7.setText("");

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
		btnReset.setForeground(Color.BLACK);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBorder(new RoundedBorder(15));
		btnReset.setBackground(new Color(245, 245, 245));
		btnReset.setBounds(438, 285, 165, 30);
		contentPane.add(btnReset);

		btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				int returnValue = fc.showSaveDialog(contentPane);
				try {
					BufferedWriter out = new BufferedWriter(
							new OutputStreamWriter(new FileOutputStream(fc.getSelectedFile().getPath()), "UTF-8"));
					out.write(txtNotes.getText());
					out.close();
				} catch (IOException e1) {

					e1.printStackTrace();
				}
			}
		});
		btnSave.setForeground(Color.BLACK);
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSave.setBorder(new RoundedBorder(15));
		btnSave.setBackground(new Color(245, 245, 245));
		btnSave.setBounds(438, 567, 165, 30);
		contentPane.add(btnSave);

		btnSettings = new JButton("âœ�");
		btnSettings.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btnSettings.setToolTipText("Change Background");
		btnSettings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String[] names = { "/res/bg.jpg", "/res/bg1.jpg", "/res/bg2.jpg", "/res/bg3.jpg", "/res/bg4.jpg",
						"/res/bg5.jpg", };
				String name = names[(int) (Math.random() * names.length)];
				label_1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getClass().getResource(name)));

			}
		});
		btnSettings.setBounds(977, 6, 67, 29);
		contentPane.add(btnSettings);

		JButton btnSdgsdg = new JButton("sdgsdg");
		btnSdgsdg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				/*
				 * String bip = "/res/hippetyhop.mp3"; Media hit = new Media(new
				 * File(bip).toURI().toString()); MediaPlayer mediaPlayer = new
				 * MediaPlayer(hit); mediaPlayer.play();
				 */
			}
		});
		btnSdgsdg.setBounds(10, 0, 89, 23);
		contentPane.add(btnSdgsdg);

		label_1 = new JLabel("");
		label_1.setBounds(0, 0, 1065, 613);
		contentPane.add(label_1);
		label_1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getClass().getResource("/res/bg.jpg")));

	}
}
