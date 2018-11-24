package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class calculator extends JFrame {

	private JPanel contentPane;
	private JButton btnErase;
	private JButton btnNegative;
	private JButton btnPercent;
	private JButton btnDivision;
	private JButton btnMultiplication;
	private JButton btnPlus;
	private JButton btnEquals;
	private JButton btnDecimal;
	private JButton btnZero;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn8;
	private JButton btn9;
	private JLabel label;

	double num1;
	double num2;
	double result;
	String opr;
	String anw;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator frame = new calculator();
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
	public calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 252, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		label = c new JLabel("");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(10, 11, 210, 32);
		contentPane.add(label);
		
		btnErase = new JButton("C");
		btnErase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				label.setText("");
			}
		});
		btnErase.setBounds(10, 54, 50, 40);
		contentPane.add(btnErase);
		
		btnNegative = new JButton("+/-");
		btnNegative.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(label.getText()));
				ops = ops * (-1);
				label.setText(String.valueOf(ops));;
			}
		});
		btnNegative.setBounds(65, 54, 50, 40);
		contentPane.add(btnNegative);
		
		btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(label.getText()); 
				label.setText("");
				opr = "%";
			}
		});
		btnPercent.setBounds(120, 54, 50, 40);
		contentPane.add(btnPercent);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = label.getText() +  btn7.getText();
				label.setText(num);
			}
		});
		btn7.setBounds(10, 105, 50, 40);
		contentPane.add(btn7);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = label.getText() +  btn4.getText();
				label.setText(num);
			}
		});
		btn4.setBounds(10, 156, 50, 40);
		contentPane.add(btn4);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = label.getText() +  btn8.getText();
				label.setText(num);
			}
		});
		btn8.setBounds(65, 105, 50, 40);
		contentPane.add(btn8);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = label.getText() +  btn5.getText();
				label.setText(num);
			}
		});
		btn5.setBounds(65, 156, 50, 40);
		contentPane.add(btn5);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = label.getText() +  btn9.getText();
				label.setText(num);
			}
		});
		btn9.setBounds(120, 105, 50, 40);
		contentPane.add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = label.getText() +  btn6.getText();
				label.setText(num);
			}
		});
		btn6.setBounds(120, 156, 50, 40);
		contentPane.add(btn6);
		
		btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = label.getText() +  btnZero.getText();
				label.setText(num);
			}
		});
		btnZero.setBounds(10, 258, 105, 40);
		contentPane.add(btnZero);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = label.getText() +  btn3.getText();
				label.setText(num);
			}
		});
		btn3.setBounds(120, 207, 50, 40);
		contentPane.add(btn3);
		
		btnDivision = new JButton("\u00F7");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(label.getText());
				label.setText("");
				opr = "/";
			}
		});
		btnDivision.setBounds(175, 54, 50, 40);
		contentPane.add(btnDivision);
		
		btnMultiplication = new JButton("\u00D7");
		btnMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(label.getText());
				label.setText("");
				opr = "*";
			}
		});
		btnMultiplication.setBounds(175, 105, 50, 40);
		contentPane.add(btnMultiplication);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(label.getText());
				label.setText("");
				opr = "-";
			}
		});
		btnMinus.setBounds(175, 156, 50, 40);
		contentPane.add(btnMinus);
		
		btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(label.getText());
				label.setText("");
				opr = "+";
			}
		});
		btnPlus.setBounds(175, 207, 50, 40);
		contentPane.add(btnPlus);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = label.getText() +  btn1.getText();
				label.setText(num);
			}
		});
		btn1.setBounds(10, 207, 50, 40);
		contentPane.add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = label.getText() +  btn2.getText();
				label.setText(num);
			}
		});
		btn2.setBounds(65, 207, 50, 40);
		contentPane.add(btn2);
		
		btnDecimal = new JButton(".");
		btnDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!label.getText().contains("."))
		          {
		          label.setText(label.getText() + btnDecimal.getText());
		          }
			}
		});
		btnDecimal.setBounds(120, 258, 50, 40);
		contentPane.add(btnDecimal);
		
		btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String anw;
				num2 = Double.parseDouble(label.getText());
				if (opr == "+") {
					result = num1 + num2;
					anw = String.format("%.2f", result);
					label.setText(anw);
					
				} else if  (opr == "-") {
					result = num1 - num2;
					anw = String.format("%.2f", result);
					label.setText(anw);
				}  else if  (opr == "/") {
					result = num1 / num2;
					anw = String.format("%.2f", result);
					label.setText(anw);
				}  else if  (opr == "*") {
					result = num1 * num2;
					anw = String.format("%.2f", result);
					label.setText(anw);
				}  else if  (opr == "%") {
					result = num1 % num2;
					anw = String.format("%.2f", result);
					label.setText(anw);
				} 
				
			}
		});
		btnEquals.setBounds(175, 258, 50, 40);
		contentPane.add(btnEquals);
	}
}
