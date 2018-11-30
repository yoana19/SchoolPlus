package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class PocketTOEFL extends JFrame {

	private JPanel contentPane;
	private JLabel label_3;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn10;
	private JButton btn11;
	private JButton btn16;
	private JButton btn18;
	private JButton btn20;
	private JButton btn25;
	private JButton btn29;
	private JButton btn12;
	private JButton btn13;
	private JButton btn14;
	private JButton btn15;
	private JButton btn17;
	private JButton btn19;
	private JButton btn24;
	private JButton btn28;
	private JButton btn32;
	private JButton btn23;
	private JButton btn27;
	private JButton btn31;
	private JButton btn22;
	private JButton btn21;
	private JButton btn26;
	private JButton btn30;
	private JLabel result;
	private int n;
	private JLabel label;
	private JButton btnReset;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PocketTOEFL frame = new PocketTOEFL();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	

	public void reset() {

		if (n <= -5) {
			btn1.setVisible(true);
			btn2.setVisible(true);
			btn3.setVisible(true);
			btn4.setVisible(true);
			btn5.setVisible(true);
			btn6.setVisible(true);
			btn7.setVisible(true);
			btn8.setVisible(true);
			btn9.setVisible(true);
			btn10.setVisible(true);
			btn11.setVisible(true);
			btn12.setVisible(true);
			btn13.setVisible(true);
			btn14.setVisible(true);
			btn15.setVisible(true);
			btn16.setVisible(true);
			btn17.setVisible(true);
			btn18.setVisible(true);
			btn19.setVisible(true);
			btn20.setVisible(true);
			btn21.setVisible(true);
			btn22.setVisible(true);
			btn23.setVisible(true);
			btn24.setVisible(true);
			btn25.setVisible(true);
			btn26.setVisible(true);
			btn27.setVisible(true);
			btn28.setVisible(true);
			btn29.setVisible(true);
			btn30.setVisible(true);
			btn31.setVisible(true);
			btn32.setVisible(true);
			n = 0;
			result.setText(Integer.toString(n) + " point/s");
			label.setText("in an opposing manner");

		}
	}

	/**
	 * Create the frame.
	 */
	public PocketTOEFL() {
		setResizable(false);
		setTitle("Pocket TOEFL");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 722, 562);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JOptionPane.showMessageDialog(contentPane, "Welcome to Pocket TOEFL!\nPocket TOEFL is a word game to help you study for the TOEFL.\nRemove all the words in order to win.\nIf your score goes to -5, the game will restart.");
		

		label = new JLabel("in an opposing manner");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(255, 51, 51));
		label.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		label.setIcon(null);
		label.setBounds(132, 206, 456, 124);
		contentPane.add(label);

		btn11 = new JButton("catastrophic");
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("extremely harmful") && btn11.isEnabled()) {
					btn11.setVisible(false);
					label.setText("a severe shortage of food resulting in death");
					result.setText(Integer.toString(n += 1) + " point/s");

				} else if (!(label.getText().equals("extremely harmful"))) {
					result.setText(Integer.toString(n -= 1) + " point/s");
				}

				if (n <= -5) {
					reset();
				}

			}
		});
		btn11.setBounds(16, 141, 117, 53);
		contentPane.add(btn11);

		btn18 = new JButton("intensify");
		btn18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("increase in extent") && btn18.isEnabled()) {
					btn18.setVisible(false);
					label.setText("");
					result.setText(Integer.toString(n += 1) + " point/s");

				} else if (!(label.getText().equals("increase in extent"))) {
					result.setText(Integer.toString(n -= 1) + " point/s");
				}

				if (n <= -5) {
					reset();
				}

				if (label.getText().equals("")) {
					label.setVisible(false);
					result.setVisible(false);
					JOptionPane.showMessageDialog(contentPane, "Congratulations, you completed Pocket TOEFL!");
					System.exit(0);

				}
			}
		});
		btn18.setBounds(16, 275, 117, 53);
		contentPane.add(btn18);

		btn6 = new JButton("strain");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("exert much effort or energy") && btn6.isEnabled()) {
					btn6.setVisible(false);
					label.setText("the falling to earth of any form of water");
					result.setText(Integer.toString(n += 1) + " point/s");

				} else if (!(label.getText().equals("exert much effort or energy"))) {
					result.setText(Integer.toString(n -= 1) + " point/s");
				}

				if (n <= -5) {
					reset();
				}
			}
		});
		btn6.setBounds(16, 76, 117, 53);
		contentPane.add(btn6);

		btn20 = new JButton("famine");
		btn20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("a severe shortage of food resulting in death") && btn20.isEnabled()) {
					btn20.setVisible(false);
					label.setText("increase");
					result.setText(Integer.toString(n += 1) + " point/s");

				} else if (!(label.getText().equals("a severe shortage of food resulting in death"))) {
					result.setText(Integer.toString(n -= 1) + " point/s");
				}

				if (n <= -5) {
					reset();
				}
			}
		});
		btn20.setBounds(16, 340, 117, 53);
		contentPane.add(btn20);

		btn16 = new JButton("expectation");
		btn16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("belief about the future") && btn16.isEnabled()) {
					btn16.setVisible(false);
					label.setText("something gained");
					result.setText(Integer.toString(n += 1) + " point/s");

				} else if (!(label.getText().equals("belief about the future"))) {
					result.setText(Integer.toString(n -= 1) + " point/s");
				}

				if (n <= -5) {
					reset();
				}
			}
		});
		btn16.setBounds(16, 210, 117, 53);
		contentPane.add(btn16);

		btn1 = new JButton("bestow");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("give as a gift") && btn1.isEnabled()) {
					btn1.setVisible(false);
					label.setText("come into possession of");
					result.setText(Integer.toString(n += 1) + " point/s");

				} else if (!(label.getText().equals("give as a gift"))) {
					result.setText(Integer.toString(n -= 1) + " point/s");
				}

				if (n <= -5) {
					reset();
				}
			}
		});
		btn1.setBounds(16, 11, 117, 53);
		contentPane.add(btn1);

		btn25 = new JButton("acquisition");
		btn25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("something gained") && btn25.isEnabled()) {
					btn25.setVisible(false);
					label.setText("give as a gift");
					result.setText(Integer.toString(n += 1) + " point/s");

				} else if (!(label.getText().equals("something gained"))) {
					result.setText(Integer.toString(n -= 1) + " point/s");
				}

				if (n <= -5) {
					reset();
				}
			}
		});
		btn25.setBounds(16, 405, 117, 53);
		contentPane.add(btn25);

		btn29 = new JButton("gain");
		btn29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("obtain") && btn29.isEnabled()) {
					btn29.setVisible(false);
					label.setText("an involuntary vibration, as if from illness or fear");
					result.setText(Integer.toString(n += 1) + " point/s");

				} else if (!(label.getText().equals("obtain"))) {
					result.setText(Integer.toString(n -= 1) + " point/s");
				}

				if (n <= -5) {
					reset();
				}
			}
		});
		btn29.setBounds(16, 470, 117, 53);
		contentPane.add(btn29);

		btn2 = new JButton("fertilize");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("provide with fertilizers or add nutrients to") && btn2.isEnabled()) {
					btn2.setVisible(false);
					label.setText("extremely harmful");
					result.setText(Integer.toString(n += 1) + " point/s");

				} else if (!(label.getText().equals("provide with fertilizers or add nutrients to"))) {
					result.setText(Integer.toString(n -= 1) + " point/s");
				}

				if (n <= -5) {
					reset();
				}
			}
		});
		btn2.setBounds(157, 11, 117, 53);
		contentPane.add(btn2);

		btn7 = new JButton("boost");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("increase") && btn7.isEnabled()) {
					btn7.setVisible(false);
					label.setText("most frequent or common");
					result.setText(Integer.toString(n += 1) + " point/s");

				} else if (!(label.getText().equals("increase"))) {
					result.setText(Integer.toString(n -= 1) + " point/s");
				}

				if (n <= -5) {
					reset();
				}
			}
		});
		btn7.setBounds(157, 76, 117, 53);
		contentPane.add(btn7);

		btn13 = new JButton("degrade");
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("reduce in worth or character, usually verbally") && btn13.isEnabled()) {
					btn13.setVisible(false);
					label.setText("forsake; leave behind");
					result.setText(Integer.toString(n += 1) + " point/s");

				} else if (!(label.getText().equals("reduce in worth or character, usually verbally"))) {
					result.setText(Integer.toString(n -= 1) + " point/s");
				}

				if (n <= -5) {
					reset();
				}
			}
		});
		btn13.setBounds(296, 141, 117, 53);
		contentPane.add(btn13);

		btn12 = new JButton("phenomenon");
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("any state or process known through the senses") && btn12.isEnabled()) {
					btn12.setVisible(false);
					label.setText("having a tendency");
					result.setText(Integer.toString(n += 1) + " point/s");

				} else if (!(label.getText().equals("any state or process known through the senses"))) {
					result.setText(Integer.toString(n -= 1) + " point/s");
				}

				if (n <= -5) {
					reset();
				}
			}
		});
		btn12.setBounds(157, 141, 117, 53);
		contentPane.add(btn12);

		btn8 = new JButton("plunge");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("dash violently or with great speed") && btn8.isEnabled()) {
					btn8.setVisible(false);
					label.setText("obtain");
					result.setText(Integer.toString(n += 1) + " point/s");

				} else if (!(label.getText().equals("dash violently or with great speed"))) {
					result.setText(Integer.toString(n -= 1) + " point/s");
				}

				if (n <= -5) {
					reset();
				}

			}
		});
		btn8.setBounds(296, 76, 117, 53);
		contentPane.add(btn8);

		btn3 = new JButton("nourish");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("provide with sustenance") && btn3.isEnabled()) {
					btn3.setVisible(false);
					label.setText("regard something as probable or likely");
					result.setText(Integer.toString(n += 1) + " point/s");

				} else if (!(label.getText().equals("provide with sustenance"))) {
					result.setText(Integer.toString(n -= 1) + " point/s");
				}

				if (n <= -5) {
					reset();
				}
			}
		});
		btn3.setBounds(296, 11, 117, 53);
		contentPane.add(btn3);

		btn4 = new JButton("tremor");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("an involuntary vibration, as if from illness or fear")
						&& btn4.isEnabled()) {
					btn4.setVisible(false);
					label.setText("crash together with violent impact");
					result.setText(Integer.toString(n += 1) + " point/s");

				} else if (!(label.getText().equals("an involuntary vibration, as if from illness or fear"))) {
					result.setText(Integer.toString(n -= 1) + " point/s");
				}

				if (n <= -5) {
					reset();
				}
			}
		});
		btn4.setBounds(438, 11, 117, 53);
		contentPane.add(btn4);

		btn9 = new JButton("demand");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("request urgently and forcefully") && btn9.isEnabled()) {
					btn9.setVisible(false);
					label.setText("provide with sustenance");
					result.setText(Integer.toString(n += 1) + " point/s");

				} else if (!(label.getText().equals("request urgently and forcefully"))) {
					result.setText(Integer.toString(n -= 1) + " point/s");
				}

				if (n <= -5) {
					reset();
				}
			}
		});
		btn9.setBounds(441, 76, 117, 53);
		contentPane.add(btn9);

		btn14 = new JButton("prone");
		btn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("having a tendency") && btn14.isEnabled()) {
					btn14.setVisible(false);
					label.setText("exert much effort or energy");
					result.setText(Integer.toString(n += 1) + " point/s");

				} else if (!(label.getText().equals("having a tendency"))) {
					result.setText(Integer.toString(n -= 1) + " point/s");
				}

				if (n <= -5) {
					reset();
				}
			}
		});
		btn14.setBounds(441, 141, 117, 53);
		contentPane.add(btn14);

		btn5 = new JButton("obtain");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("come into possession of") && btn5.isEnabled()) {
					btn5.setVisible(false);
					label.setText("reduce in worth or character, usually verbally");
					result.setText(Integer.toString(n += 1) + " point/s");

				} else if (!(label.getText().equals("come into possession of"))) {
					result.setText(Integer.toString(n -= 1) + " point/s");
				}

				if (n <= -5) {
					reset();
				}
			}
		});
		btn5.setBounds(586, 11, 117, 53);
		contentPane.add(btn5);

		btn10 = new JButton("prevalent");
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("most frequent or common") && btn10.isEnabled()) {
					btn10.setVisible(false);
					label.setText("dash violently or with great speed");
					result.setText(Integer.toString(n += 1) + " point/s");

				} else if (!(label.getText().equals("most frequent or common"))) {
					result.setText(Integer.toString(n -= 1) + " point/s");
				}

				if (n <= -5) {
					reset();
				}

			}
		});
		btn10.setBounds(586, 76, 117, 53);
		contentPane.add(btn10);

		btn15 = new JButton("abandon");
		btn15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("forsake; leave behind") && btn15.isEnabled()) {
					btn15.setVisible(false);
					label.setText("use of physical or mental energy; hard work");
					result.setText(Integer.toString(n += 1) + " point/s");

				} else if (!(label.getText().equals("forsake; leave behind"))) {
					result.setText(Integer.toString(n -= 1) + " point/s");
				}

				if (n <= -5) {
					reset();
				}
			}
		});
		btn15.setBounds(586, 141, 117, 53);
		contentPane.add(btn15);

		btn17 = new JButton("collide");
		btn17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("crash together with violent impact") && btn17.isEnabled()) {
					btn17.setVisible(false);
					label.setText("an irrecoverable state of destruction");
					result.setText(Integer.toString(n += 1) + " point/s");

				} else if (!(label.getText().equals("crash together with violent impact"))) {
					result.setText(Integer.toString(n -= 1) + " point/s");
				}

				if (n <= -5) {
					reset();
				}
			}
		});
		btn17.setBounds(586, 210, 117, 53);
		contentPane.add(btn17);

		btn19 = new JButton("sustainable");
		btn19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("capable of being prolonged") && btn19.isEnabled()) {
					btn19.setVisible(false);
					label.setText("request urgently and forcefully");
					result.setText(Integer.toString(n += 1) + " point/s");

				} else if (!(label.getText().equals("capable of being prolonged"))) {
					result.setText(Integer.toString(n -= 1) + " point/s");
				}

				if (n <= -5) {
					reset();
				}
			}
		});
		btn19.setBounds(586, 275, 117, 53);
		contentPane.add(btn19);

		btn24 = new JButton("anticipate");
		btn24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("regard something as probable or likely") && btn24.isEnabled()) {
					btn24.setVisible(false);
					label.setText("belief about the future");
					result.setText(Integer.toString(n += 1) + " point/s");

				} else if (!(label.getText().equals("regard something as probable or likely"))) {
					result.setText(Integer.toString(n -= 1) + " point/s");
				}

				if (n <= -5) {
					reset();
				}

			}
		});
		btn24.setBounds(586, 340, 117, 53);
		contentPane.add(btn24);

		btn28 = new JButton("irrigation");
		btn28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//
				if (label.getText().equals("supplying dry land with water by artificial means") && btn28.isEnabled()) {
					btn28.setVisible(false);
					label.setText("provide with fertilizers or add nutrients to");
					result.setText(Integer.toString(n += 1) + " point/s");

				} else if (!(label.getText().equals("supplying dry land with water by artificial means"))) {
					result.setText(Integer.toString(n -= 1) + " point/s");
				}

				if (n <= -5) {
					reset();
				}
			}
		});
		btn28.setBounds(586, 405, 117, 53);
		contentPane.add(btn28);

		btn32 = new JButton("adversely");
		btn32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("in an opposing manner") && btn32.isEnabled()) {
					btn32.setVisible(false);
					label.setText("assemble or get together");
					result.setText(Integer.toString(n += 1) + " point/s");

				} else if (!(label.getText().equals("In an opposing manner"))) {
					result.setText(Integer.toString(n -= 1) + " point/s");
				}

				if (n <= -5) {
					reset();
				}
			}
		});
		btn32.setBounds(586, 470, 117, 53);
		contentPane.add(btn32);

		btn21 = new JButton("eruption");
		btn21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("the sudden occurrence of a violent discharge") && btn21.isEnabled()) {
					btn21.setVisible(false);
					label.setText("supplying dry land with water by artificial means");
					result.setText(Integer.toString(n += 1) + " point/s");

				} else if (!(label.getText().equals("the sudden occurrence of a violent discharge"))) {
					result.setText(Integer.toString(n -= 1) + " point/s");
				}

				if (n <= -5) {
					reset();
				}

			}
		});
		btn21.setBounds(157, 340, 117, 53);
		contentPane.add(btn21);

		btn22 = new JButton("precipitation");
		btn22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("the falling to earth of any form of water") && btn22.isEnabled()) {
					btn22.setVisible(false);
					label.setText("increase in extent");
					result.setText(Integer.toString(n += 1) + " point/s");

				} else if (!(label.getText().equals("the falling to earth of any form of water"))) {
					result.setText(Integer.toString(n -= 1) + " point/s");
				}

				if (n <= -5) {
					reset();
				}
			}
		});
		btn22.setBounds(296, 340, 117, 53);
		contentPane.add(btn22);

		btn23 = new JButton("gather");
		btn23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("assemble or get together") && btn23.isEnabled()) {
					btn23.setVisible(false);
					label.setText("a power to affect persons or events");
					result.setText(Integer.toString(n += 1) + " point/s");

				} else if (!(label.getText().equals("assemble or get together"))) {
					result.setText(Integer.toString(n -= 1) + " point/s");
				}

				if (n <= -5) {
					reset();
				}
			}
		});
		btn23.setBounds(441, 340, 117, 53);
		contentPane.add(btn23);

		btn26 = new JButton("ample");
		btn26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("more than enough in size or scope or capacity") && btn26.isEnabled()) {
					btn26.setVisible(false);
					label.setText("the sudden occurrence of a violent discharge");
					result.setText(Integer.toString(n += 1) + " point/s");

				} else if (!(label.getText().equals("more than enough in size or scope or capacity"))) {
					result.setText(Integer.toString(n -= 1) + " point/s");
				}

				if (n <= -5) {
					reset();
				}
			}
		});
		btn26.setBounds(157, 405, 117, 53);
		contentPane.add(btn26);

		btn27 = new JButton("ruin");
		btn27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("an irrecoverable state of destruction") && btn27.isEnabled()) {
					btn27.setVisible(false);
					label.setText("any state or process known through the senses");
					result.setText(Integer.toString(n += 1) + " point/s");

				} else if (!(label.getText().equals("an irrecoverable state of destruction"))) {
					result.setText(Integer.toString(n -= 1) + " point/s");
				}

				if (n <= -5) {
					reset();
				}
			}
		});
		btn27.setBounds(441, 405, 117, 53);
		contentPane.add(btn27);

		btn30 = new JButton("influence");
		btn30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("a power to affect persons or events") && btn30.isEnabled()) {
					btn30.setVisible(false);
					label.setText("capable of being prolonged");
					result.setText(Integer.toString(n += 1) + " point/s");

				} else if (!(label.getText().equals("a power to affect persons or events"))) {
					result.setText(Integer.toString(n -= 1) + " point/s");
				}

				if (n <= -5) {
					reset();
				}
			}
		});
		btn30.setBounds(157, 470, 117, 53);
		contentPane.add(btn30);

		btn31 = new JButton("effort");
		btn31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("use of physical or mental energy; hard work") && btn31.isEnabled()) {
					btn31.setVisible(false);
					label.setText("more than enough in size or scope or capacity");
					result.setText(Integer.toString(n += 1) + " point/s");

				} else if (!(label.getText().equals("use of physical or mental energy; hard work"))) {
					result.setText(Integer.toString(n -= 1) + " point/s");
				}

				if (n <= -5) {
					reset();
				}

			}
		});
		btn31.setBounds(441, 470, 117, 53);
		contentPane.add(btn31);

		result = new JLabel("");
		result.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		result.setForeground(Color.WHITE);
		result.setBackground(new Color(255, 102, 0));
		result.setHorizontalAlignment(SwingConstants.CENTER);
		result.setBounds(286, 405, 143, 88);
		contentPane.add(result);

		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getClass().getResource("/res/sea.jpg")));
		label_2.setBounds(0, 0, 722, 550);
		contentPane.add(label_2);

	}
}
