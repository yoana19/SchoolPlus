package main;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import java.awt.Toolkit;

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import javax.swing.border.TitledBorder;

import javax.swing.JButton;

import javax.swing.JLabel;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

import javax.swing.JRadioButton;

import javax.swing.ButtonGroup;

import javax.swing.ImageIcon;

import javax.swing.border.EtchedBorder;

import java.awt.Color;

import java.awt.Font;

public class ChemistryElements extends JFrame {

	String massage = "";

	private JPanel contentPane;

	private ButtonGroup c = new ButtonGroup();

	private ButtonGroup s = new ButtonGroup();

	private JButton btnBg;

	private JButton btnCheck;

	/**
	 * 
	 * Launch the application.
	 * 
	 */

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					ChemistryElements frame = new ChemistryElements();

					frame.setVisible(true);

				} catch (Exception e) {

					e.printStackTrace();

				}

			}

		});

	}

	/**
	 * 
	 * Create the frame.
	 * 
	 */

	public ChemistryElements() {

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		setBounds(100, 100, 463, 376);

		contentPane = new JPanel();

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		contentPane.setLayout(null);

		JLabel lblGreetings = new JLabel("");

		lblGreetings.setForeground(Color.WHITE);

		lblGreetings.setBounds(10, 260, 414, 14);

		contentPane.add(lblGreetings);

		JPanel pnl1 = new JPanel();

		pnl1.setBackground(new Color(255, 215, 0));

		pnl1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Symbols",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		pnl1.setBounds(10, 6, 211, 242);

		contentPane.add(pnl1);

		JRadioButton rbc1 = new JRadioButton("H");

		pnl1.add(rbc1);

		c.add(rbc1);

		rbc1.setBackground(new Color(255, 215, 0));

		JRadioButton rbc7 = new JRadioButton("N");

		pnl1.add(rbc7);

		c.add(rbc7);

		rbc7.setBackground(new Color(255, 215, 0));

		JRadioButton rbc3 = new JRadioButton("Li");

		pnl1.add(rbc3);

		c.add(rbc3);

		rbc3.setBackground(new Color(255, 215, 0));

		JRadioButton rbc11 = new JRadioButton("Na");

		pnl1.add(rbc11);

		c.add(rbc11);

		rbc11.setBackground(new Color(255, 215, 0));

		JRadioButton rbc2 = new JRadioButton("He");

		pnl1.add(rbc2);

		c.add(rbc2);

		rbc2.setBackground(new Color(255, 215, 0));

		JRadioButton rbc12 = new JRadioButton("Mg");

		pnl1.add(rbc12);

		c.add(rbc12);

		rbc12.setBackground(new Color(255, 215, 0));

		JRadioButton rbc5 = new JRadioButton("B");

		pnl1.add(rbc5);

		c.add(rbc5);

		rbc5.setBackground(new Color(255, 215, 0));

		JRadioButton rbc4 = new JRadioButton("Be");

		pnl1.add(rbc4);

		c.add(rbc4);

		rbc4.setBackground(new Color(255, 215, 0));

		JRadioButton rbc10 = new JRadioButton("Ne");

		pnl1.add(rbc10);

		c.add(rbc10);

		rbc10.setBackground(new Color(255, 215, 0));

		JRadioButton rbc6 = new JRadioButton("C");

		pnl1.add(rbc6);

		c.add(rbc6);

		rbc6.setBackground(new Color(255, 215, 0));

		JRadioButton rbc8 = new JRadioButton("O");

		pnl1.add(rbc8);

		c.add(rbc8);

		rbc8.setBackground(new Color(255, 215, 0));

		JRadioButton rbc14 = new JRadioButton("Si");

		pnl1.add(rbc14);

		c.add(rbc14);

		rbc14.setBackground(new Color(255, 215, 0));

		JRadioButton rbc9 = new JRadioButton("F");

		pnl1.add(rbc9);

		c.add(rbc9);

		rbc9.setBackground(new Color(255, 215, 0));

		JRadioButton rbc13 = new JRadioButton("Al");

		pnl1.add(rbc13);

		c.add(rbc13);

		rbc13.setBackground(new Color(255, 215, 0));

		JPanel pnl2 = new JPanel();

		pnl2.setBackground(new Color(255, 140, 0));

		pnl2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Capitals",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		pnl2.setBounds(233, 6, 211, 242);

		contentPane.add(pnl2);

		JRadioButton rbs3 = new JRadioButton("lithium");

		pnl2.add(rbs3);

		s.add(rbs3);

		rbs3.setBackground(new Color(255, 140, 0));

		JRadioButton rbs12 = new JRadioButton("magnesium");

		pnl2.add(rbs12);

		s.add(rbs12);

		rbs12.setBackground(new Color(255, 140, 0));

		JRadioButton rbs4 = new JRadioButton("beryllium");

		pnl2.add(rbs4);

		s.add(rbs4);

		rbs4.setBackground(new Color(255, 140, 0));

		JRadioButton rbs10 = new JRadioButton("neon");

		pnl2.add(rbs10);

		s.add(rbs10);

		rbs10.setBackground(new Color(255, 140, 0));

		JRadioButton rbs2 = new JRadioButton("helium");

		pnl2.add(rbs2);

		s.add(rbs2);

		rbs2.setBackground(new Color(255, 140, 0));

		JRadioButton rbs9 = new JRadioButton("fluorine");

		pnl2.add(rbs9);

		s.add(rbs9);

		rbs9.setBackground(new Color(255, 140, 0));

		JRadioButton rbs6 = new JRadioButton("carbon");

		pnl2.add(rbs6);

		s.add(rbs6);

		rbs6.setBackground(new Color(255, 140, 0));

		JRadioButton rbs11 = new JRadioButton("sodium");

		pnl2.add(rbs11);

		s.add(rbs11);

		rbs11.setBackground(new Color(255, 140, 0));

		JRadioButton rbs5 = new JRadioButton("boron");

		pnl2.add(rbs5);

		s.add(rbs5);

		rbs5.setBackground(new Color(255, 140, 0));

		JRadioButton rbs8 = new JRadioButton("oxygen");

		pnl2.add(rbs8);

		s.add(rbs8);

		rbs8.setBackground(new Color(255, 140, 0));

		JRadioButton rbs1 = new JRadioButton("hydrogen");

		pnl2.add(rbs1);

		s.add(rbs1);

		rbs1.setBackground(new Color(255, 140, 0));

		JRadioButton rbs13 = new JRadioButton("aluminium");

		pnl2.add(rbs13);

		s.add(rbs13);

		rbs13.setBackground(new Color(255, 140, 0));

		JRadioButton rbs7 = new JRadioButton("nitrogen");

		pnl2.add(rbs7);

		s.add(rbs7);

		rbs7.setBackground(new Color(255, 140, 0));

		JRadioButton rbs14 = new JRadioButton("silicon");

		pnl2.add(rbs14);

		s.add(rbs14);

		rbs14.setBackground(new Color(255, 140, 0));

		JButton btnClear = new JButton("Clear");

		btnClear.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				c.clearSelection();

				s.clearSelection();

				lblGreetings.setText("");

			}

		});

		btnCheck = new JButton("Check");

		btnCheck.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (btnBg.getText().equals("BG"))
					lblGreetings.setText("Mistake.");

				else
					lblGreetings.setText("Грешка.");

				if (rbs1.isSelected() && rbc1.isSelected()) {

					rbc1.setVisible(false);

					rbs1.setVisible(false);

					rbc1.setSelected(false);

					rbs1.setSelected(false);

					if (btnBg.getText().equals("BG"))
						lblGreetings.setText("Good job!");

					else
						lblGreetings.setText("Браво!");

				} else if (rbs2.isSelected() && rbc2.isSelected()) {

					rbc2.setVisible(false);

					rbs2.setVisible(false);

					rbc2.setSelected(false);

					rbs2.setSelected(false);

					if (btnBg.getText().equals("BG"))
						lblGreetings.setText("Good job!");

					else
						lblGreetings.setText("Браво!");

				} else if (rbs3.isSelected() && rbc3.isSelected()) {

					rbc3.setVisible(false);

					rbs3.setVisible(false);

					rbc3.setSelected(false);

					rbs3.setSelected(false);

					if (btnBg.getText().equals("BG"))
						lblGreetings.setText("Good job!");

					else
						lblGreetings.setText("Браво!");

				} else if (rbs4.isSelected() && rbc4.isSelected()) {

					rbc4.setVisible(false);

					rbs4.setVisible(false);

					rbc4.setSelected(false);

					rbs4.setSelected(false);

					if (btnBg.getText().equals("BG"))
						lblGreetings.setText("Good job!");

					else
						lblGreetings.setText("Браво!");

				} else if (rbs5.isSelected() && rbc5.isSelected()) {

					rbc5.setVisible(false);

					rbs5.setVisible(false);

					rbc5.setSelected(false);

					rbs5.setSelected(false);

					if (btnBg.getText().equals("BG"))
						lblGreetings.setText("Good job!");

					else
						lblGreetings.setText("Браво!");

				} else if (rbs6.isSelected() && rbc6.isSelected()) {

					rbc6.setVisible(false);

					rbs6.setVisible(false);

					rbc6.setSelected(false);

					rbs6.setSelected(false);

					if (btnBg.getText().equals("BG"))
						lblGreetings.setText("Good job!");

					else
						lblGreetings.setText("Браво!");

				} else if (rbs7.isSelected() && rbc7.isSelected()) {

					rbc7.setVisible(false);

					rbs7.setVisible(false);

					rbc7.setSelected(false);

					rbs7.setSelected(false);

					if (btnBg.getText().equals("BG"))
						lblGreetings.setText("Good job!");

					else
						lblGreetings.setText("Браво!");

				} else if (rbs8.isSelected() && rbc8.isSelected()) {

					rbc8.setVisible(false);

					rbs8.setVisible(false);

					rbc8.setSelected(false);

					rbs8.setSelected(false);

					if (btnBg.getText().equals("BG"))
						lblGreetings.setText("Good job!");

					else
						lblGreetings.setText("Браво!");

				} else if (rbs9.isSelected() && rbc9.isSelected()) {

					rbc9.setVisible(false);

					rbs9.setVisible(false);

					rbc9.setSelected(false);

					rbs9.setSelected(false);

					if (btnBg.getText().equals("BG"))
						lblGreetings.setText("Good job!");

					else
						lblGreetings.setText("Браво!");

				} else if (rbs10.isSelected() && rbc10.isSelected()) {

					rbc10.setVisible(false);

					rbs10.setVisible(false);

					rbc10.setSelected(false);

					rbs10.setSelected(false);

					if (btnBg.getText().equals("BG"))
						lblGreetings.setText("Good job!");

					else
						lblGreetings.setText("Браво!");

				} else if (rbs11.isSelected() && rbc11.isSelected()) {

					rbc11.setVisible(false);

					rbs11.setVisible(false);

					rbc11.setSelected(false);

					rbs11.setSelected(false);

					if (btnBg.getText().equals("BG"))
						lblGreetings.setText("Good job!");

					else
						lblGreetings.setText("Браво!");

				} else if (rbs12.isSelected() && rbc12.isSelected()) {

					rbc12.setVisible(false);

					rbs12.setVisible(false);

					rbc12.setSelected(false);

					rbs12.setSelected(false);

					if (btnBg.getText().equals("BG"))
						lblGreetings.setText("Good job!");

					else
						lblGreetings.setText("Браво!");

				} else if (rbs13.isSelected() && rbc13.isSelected()) {

					rbc13.setVisible(false);

					rbs13.setVisible(false);

					rbc13.setSelected(false);

					rbs13.setSelected(false);

					if (btnBg.getText().equals("BG"))
						lblGreetings.setText("Good job!");

					else
						lblGreetings.setText("Браво!");

				} else if (rbs14.isSelected() && rbc14.isSelected()) {

					rbc14.setVisible(false);

					rbs14.setVisible(false);

					rbc14.setSelected(false);

					rbs14.setSelected(false);

					if (btnBg.getText().equals("BG"))
						lblGreetings.setText("Good job!");

					else
						lblGreetings.setText("Браво!");

				}

			}

		});

		btnCheck.setBounds(10, 285, 95, 23);

		contentPane.add(btnCheck);

		btnClear.setBounds(126, 285, 95, 23);

		contentPane.add(btnClear);

		JButton btnExit = new JButton("Exit");

		btnExit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				System.exit(0);

			}

		});

		btnExit.setBounds(349, 285, 95, 23);

		contentPane.add(btnExit);

		JButton btnRestart = new JButton("Restart");

		btnRestart.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				c.clearSelection();

				s.clearSelection();

				rbc1.setVisible(true);

				rbs1.setVisible(true);

				rbc2.setVisible(true);

				rbs2.setVisible(true);

				rbc3.setVisible(true);

				rbs3.setVisible(true);

				rbc4.setVisible(true);

				rbs4.setVisible(true);

				rbc5.setVisible(true);

				rbs5.setVisible(true);

				rbc6.setVisible(true);

				rbs6.setVisible(true);

				rbc7.setVisible(true);

				rbs7.setVisible(true);

				rbc8.setVisible(true);

				rbs8.setVisible(true);

				rbc9.setVisible(true);

				rbs9.setVisible(true);

				rbc10.setVisible(true);

				rbs10.setVisible(true);

				rbc11.setVisible(true);

				rbs11.setVisible(true);

				rbc12.setVisible(true);

				rbs12.setVisible(true);

				rbc13.setVisible(true);

				rbs13.setVisible(true);

				rbc14.setVisible(true);

				rbs14.setVisible(true);

				lblGreetings.setText("");

			}

		});

		btnRestart.setBounds(233, 285, 95, 23);

		contentPane.add(btnRestart);

		btnBg = new JButton("BG");

		btnBg.setFont(new Font("Tahoma", Font.PLAIN, 10));

		btnBg.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (btnBg.getText().equals("EN")) {

					btnBg.setText("BG");

					rbs1.setText("hydrogen");

					rbs2.setText("helium");

					rbs3.setText("lithium");

					rbs4.setText("beryllium");

					rbs5.setText("boron");

					rbs6.setText("carbon");

					rbs7.setText("nitrogen");

					rbs8.setText("oxygen");

					rbs9.setText("fluorine");

					rbs10.setText("neon");

					rbs11.setText("sodium");

					rbs12.setText("magnesium");

					rbs13.setText("aluminium");

					rbs14.setText("silicon");

					pnl1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Symbols",
							TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

					pnl2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Name",
							TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

					if (lblGreetings.getText().equals("Грешка."))
						lblGreetings.setText("Mistake.");

					else if (lblGreetings.getText().equals("Браво!"))
						lblGreetings.setText("Good job!");

					btnCheck.setText("Check");

					btnClear.setText("Clear");

					btnExit.setText("Exit");

					btnRestart.setText("Restart");

				} else {

					btnBg.setText("EN");

					rbs1.setText("водород");

					rbs2.setText("хелий");

					rbs3.setText("литий");

					rbs4.setText("берилий");

					rbs5.setText("бор");

					rbs6.setText("въглерод");

					rbs7.setText("азот");

					rbs8.setText("кислород");

					rbs9.setText("флуор");

					rbs10.setText("неон");

					rbs11.setText("натрий");

					rbs12.setText("магнезий");

					rbs13.setText("алуминий");

					rbs14.setText("силиций");

					pnl1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Символ",
							TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

					pnl2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Име",
							TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

					if (lblGreetings.getText().equals("Mistake."))
						lblGreetings.setText("Грешка.");

					else if (lblGreetings.getText().equals("Good job!"))
						lblGreetings.setText("Браво!");

					btnCheck.setText("Провери");

					btnClear.setText("Изчисти");

					btnExit.setText("Изход");

					btnRestart.setText("Рестарт");

				}

			}

		});

		btnBg.setBounds(399, 317, 45, 20);

		contentPane.add(btnBg);

		JLabel label = new JLabel("");

		label.setBounds(0, 0, 480, 320);

		contentPane.add(label);

		// label.setIcon(new
		// ImageIcon(Toolkit.getDefaultToolkit().getClass().getResource("/res/geographyquiz.jpg")));

	}

}