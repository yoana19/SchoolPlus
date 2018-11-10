package edu_school;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.util.Map;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

public class todo extends JFrame {

	private JPanel contentPane;
	private JTextArea txt7;
	private JTextArea txt1;
	private JTextArea txt2;
	private JTextArea txt3;
	private JTextArea txt4;
	private JTextArea txt5;
	private JTextArea txt6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					todo frame = new todo();
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
	public todo() {
		setTitle("To Do");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 337);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 255, 102));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Font font = new Font("Lucida Grande", Font.ITALIC, 16);
		Map attributes = font.getAttributes();
		attributes.put(TextAttribute.STRIKETHROUGH, TextAttribute.STRIKETHROUGH_ON);
		Font newFont = new Font(attributes);

		JRadioButton btn1 = new JRadioButton("");
		btn1.setBounds(6, 24, 28, 23);
		contentPane.add(btn1);

		JRadioButton btn2 = new JRadioButton("");
		btn2.setBounds(6, 59, 28, 23);
		contentPane.add(btn2);

		JRadioButton btn3 = new JRadioButton("");
		btn3.setBounds(6, 92, 28, 23);
		contentPane.add(btn3);

		JRadioButton btn4 = new JRadioButton("");
		btn4.setBounds(6, 127, 28, 23);
		contentPane.add(btn4);

		JRadioButton btn5 = new JRadioButton("");
		btn5.setBounds(6, 162, 28, 23);
		contentPane.add(btn5);

		JRadioButton btn6 = new JRadioButton("");
		btn6.setBounds(6, 197, 28, 23);
		contentPane.add(btn6);

		JRadioButton btn7 = new JRadioButton("");
		btn7.setBounds(6, 232, 28, 23);
		contentPane.add(btn7);

	
		

		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (txt1.getText() != null)
					txt1.setEditable(false);
				if (txt2.getText() != null)
					txt2.setEditable(false);
				if (txt3.getText() != null)
					txt3.setEditable(false);
				if (txt4.getText() != null)
					txt4.setEditable(false);
				if (txt5.getText() != null)
					txt5.setEditable(false);
				if (txt6.getText() != null)
					txt6.setEditable(false);
				if (txt7.getText() != null)
					txt7.setEditable(false);

				if (btn2.isSelected() == true)
					txt2.setFont(newFont);
				if (btn3.isSelected() == true)
					txt3.setFont(newFont);
				if (btn4.isSelected() == true)
					txt4.setFont(newFont);
				if (btn5.isSelected() == true)
					txt5.setFont(newFont);
				if (btn6.isSelected() == true)
					txt6.setFont(newFont);
				if (btn7.isSelected() == true)
					txt7.setFont(newFont);

									// if (btn1.isSelected() == true) txt1.setVisible(false);
									// if (btn1.isSelected() == true) btn1.setVisible(false);
									// if (btn2.isSelected() == true) txt2.setVisible(false);
									// if (btn2.isSelected() == true) btn2.setVisible(false);
									// if (btn3.isSelected() == true) txt3.setVisible(false);
									// if (btn3.isSelected() == true) btn3.setVisible(false);
									// if (btn4.isSelected() == true) txt4.setVisible(false);
									// if (btn4.isSelected() == true) btn4.setVisible(false);
									// if (btn5.isSelected() == true) txt5.setVisible(false);
									// if (btn5.isSelected() == true) btn5.setVisible(false);
									// if (btn6.isSelected() == true) txt6.setVisible(false);
									// if (btn6.isSelected() == true) btn6.setVisible(false);
									// if (btn7.isSelected() == true) txt7.setVisible(false);
									// if (btn7.isSelected() == true) btn7.setVisible(false);

				if (txt1.getText().equals("")) {
					txt1.setEditable(true);
				} else {
				 txt1.setEditable(false);
				}

				if (txt2.getText().equals("")) {
					txt2.setEditable(true);
				} else {
					txt2.setEditable(false);
				}

				if (txt3.getText().equals("")) {
					txt3.setEditable(true);
				} else {
					txt3.setEditable(false);
				}

				if (txt4.getText().equals("")) {
					txt4.setEditable(true);
				} else {
					txt4.setEditable(false);
				}

				if (txt5.getText().equals("")) {
					txt5.setEditable(true);
				} else {
					txt5.setEditable(false);
				}

				if (txt6.getText().equals("")) {
					txt6.setEditable(true);
				} else {
					txt6.setEditable(false);
				}

				if (txt7.getText().equals("")) {
					txt7.setEditable(true);
				} else {
					txt7.setEditable(false);
				}
			}
		});
		btnSave.setBounds(78, 267, 117, 29);
		contentPane.add(btnSave);

		JButton btnReset = new JButton("Reset");
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
		btnReset.setBounds(251, 267, 117, 29);
		contentPane.add(btnReset);
		
		txt1 = new JTextArea();
		txt1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		txt1.setBounds(46, 24, 398, 23);
		contentPane.add(txt1);
		txt1.setOpaque(false);
		
		txt2 = new JTextArea();
		txt2.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		txt2.setBounds(46, 59, 398, 23);
		contentPane.add(txt2);
		txt2.setOpaque(false);
		
		txt3 = new JTextArea();
		txt3.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		txt3.setBounds(46, 92, 398, 23);
		contentPane.add(txt3);
		txt3.setOpaque(false);
		
		txt4 = new JTextArea();
		txt4.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		txt4.setBounds(46, 127, 398, 23);
		contentPane.add(txt4);
		txt4.setOpaque(false);
		
		txt5 = new JTextArea();
		txt5.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		txt5.setBounds(46, 162, 398, 23);
		contentPane.add(txt5);
		txt5.setOpaque(false);
		
		txt6 = new JTextArea();
		txt6.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		txt6.setBounds(46, 197, 398, 23);
		contentPane.add(txt6);
		txt6.setOpaque(false);
		
		txt7 = new JTextArea();
		txt7.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		txt7.setBounds(46, 232, 398, 23);
		contentPane.add(txt7);
		txt7.setOpaque(false);
	}
}
