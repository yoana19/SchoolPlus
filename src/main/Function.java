package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Function extends JFrame {

	private JPanel contentPane;
	private JTextField txta;
	private JTextField txtb;
	private JTextField txtc;
	private JTextField txtx;
	private JTextField txta1;
	private JTextField txtb1;
	private JTextField txtc1;
	private JTextField txty;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Function frame = new Function();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private static void drawCoordinatesystem(Graphics a)
	{
		Color grey = new Color(85, 85, 85);
		Color white = new Color(255, 255, 255);
		for(int i = 19; i>0; i--) 
		{
			a.setColor(grey);
			a.drawLine(0, i*50, 1000, i*50);
			a.drawLine(i*50, 0, i*50, 1000);
		}
		a.setColor(white);
		a.drawLine(500, 0, 500, 1000);
		a.drawLine(0, 500, 1000, 500);
	}

	/**
	 * Create the frame.
	 */
	public Function() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 0, 1220, 1040);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setFont(new Font("Yu Mincho Demibold", Font.BOLD | Font.ITALIC, 14));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(200, 0, 1000, 1000);
		panel.setForeground(Color.BLACK);
		panel.setBackground(Color.BLACK);
		contentPane.add(panel);
		
		JLabel lblCircleFunctionxa = new JLabel("(x-a)^2 + (y-b)^2 = c");
		lblCircleFunctionxa.setBounds(10, 325, 180, 14);
		lblCircleFunctionxa.setForeground(new Color(255, 255, 255));
		lblCircleFunctionxa.setFont(new Font("Yu Mincho Demibold", Font.BOLD | Font.ITALIC, 14));
		contentPane.add(lblCircleFunctionxa);
		
		JLabel lblAybxc = new JLabel("ay=bx+c");
		lblAybxc.setBounds(10, 11, 180, 14);
		lblAybxc.setForeground(new Color(255, 255, 255));
		lblAybxc.setFont(new Font("Yu Mincho Demibold", Font.BOLD | Font.ITALIC, 14));
		contentPane.add(lblAybxc);
		
		JLabel lblA = new JLabel("a =");
		lblA.setBounds(10, 36, 46, 14);
		lblA.setForeground(new Color(255, 255, 255));
		lblA.setFont(new Font("Yu Mincho Demibold", Font.PLAIN, 13));
		contentPane.add(lblA);
		
		JLabel lblB = new JLabel("b =");
		lblB.setBounds(10, 61, 46, 14);
		lblB.setForeground(new Color(255, 255, 255));
		contentPane.add(lblB);
		
		JLabel lblC = new JLabel("c =");
		lblC.setBounds(10, 86, 46, 14);
		lblC.setForeground(new Color(255, 255, 255));
		contentPane.add(lblC);
		
		JLabel lblA_1 = new JLabel("a =");
		lblA_1.setBounds(10, 350, 46, 14);
		lblA_1.setForeground(new Color(255, 255, 255));
		contentPane.add(lblA_1);
		
		JLabel lblB_1 = new JLabel("b =");
		lblB_1.setBounds(10, 375, 46, 14);
		lblB_1.setForeground(new Color(255, 255, 255));
		contentPane.add(lblB_1);
		
		JLabel lblC_1 = new JLabel("c =");
		lblC_1.setBounds(10, 400, 46, 14);
		lblC_1.setForeground(new Color(255, 255, 255));
		contentPane.add(lblC_1);
		
		JLabel lblS = new JLabel("");
		lblS.setBounds(104, 148, 86, 14);
		lblS.setFont(new Font("Yu Mincho Demibold", Font.BOLD | Font.ITALIC, 14));
		lblS.setForeground(new Color(255, 255, 255));
		contentPane.add(lblS);
		
		JLabel lblp = new JLabel("");
		lblp.setBounds(10, 300, 180, 14);
		lblp.setFont(new Font("Yu Mincho Demibold", Font.BOLD | Font.ITALIC, 14));
		lblp.setForeground(new Color(255, 255, 255));
		contentPane.add(lblp);
		
		JLabel lblr = new JLabel("");
		lblr.setBounds(10, 621, 180, 14);
		lblr.setForeground(new Color(255, 255, 255));
		lblr.setFont(new Font("Yu Mincho Demibold", Font.BOLD | Font.ITALIC, 14));
		contentPane.add(lblr);
		
		JLabel lblSlope = new JLabel("наклон:");
		lblSlope.setBounds(10, 148, 82, 14);
		lblSlope.setForeground(new Color(255, 255, 255));
		lblSlope.setFont(new Font("Yu Mincho Demibold", Font.BOLD | Font.ITALIC, 14));
		contentPane.add(lblSlope);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 207, 180, 20);
		comboBox.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u0418\u0437\u0431\u0435\u0440\u0435\u0442\u0435 \u043F\u0440\u043E\u043C\u0435\u043D\u043B\u0438\u0432\u0430:", "x", "y"}));
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(8, 524, 180, 20);
		comboBox_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Изберете променлива:", "x", "y"}));
		contentPane.add(comboBox_1);
		
		txta = new JTextField();
		txta.setBounds(66, 33, 124, 20);
		txta.setSelectedTextColor(Color.GRAY);
		txta.setForeground(Color.WHITE);
		txta.setDisabledTextColor(Color.WHITE);
		txta.setCaretColor(Color.WHITE);
		txta.setBackground(Color.BLACK);
		txta.setFont(new Font("Yu Mincho Demibold", Font.BOLD | Font.ITALIC, 14));
		contentPane.add(txta);
		txta.setColumns(10);
		
		txtb = new JTextField();
		txtb.setBounds(66, 58, 124, 20);
		txtb.setSelectedTextColor(Color.GRAY);
		txtb.setForeground(Color.WHITE);
		txtb.setDisabledTextColor(Color.WHITE);
		txtb.setCaretColor(Color.WHITE);
		txtb.setBackground(Color.BLACK);
		txtb.setFont(new Font("Yu Mincho Demibold", Font.BOLD | Font.ITALIC, 14));
		contentPane.add(txtb);
		txtb.setColumns(10);
		
		txtc = new JTextField();
		txtc.setBounds(66, 83, 124, 20);
		txtc.setCaretColor(Color.WHITE);
		txtc.setForeground(Color.WHITE);
		txtc.setSelectedTextColor(Color.GRAY);
		txtc.setDisabledTextColor(Color.WHITE);
		txtc.setBackground(Color.BLACK);
		txtc.setFont(new Font("Yu Mincho Demibold", Font.BOLD | Font.ITALIC, 14));
		contentPane.add(txtc);
		txtc.setColumns(10);
		
		JButton btn1 = new JButton("\u041D\u0430\u0447\u0435\u0440\u0442\u0430\u0439");
		btn1.setBounds(10, 114, 180, 23);
		btn1.setFont(new Font("Yu Mincho Demibold", Font.BOLD | Font.ITALIC, 14));
		btn1.setBackground(new Color(255, 255, 255));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Graphics g = panel.getGraphics();
				drawCoordinatesystem(g);
				double a;
				double b;
				double c;
				try {
					a = Double.parseDouble(txta.getText());
					b = Double.parseDouble(txtb.getText());
					c = Double.parseDouble(txtc.getText());
				} catch (Exception e) {
					JOptionPane.showMessageDialog(contentPane, "Incorrect data");
				    return;
				}
				double x = 500 + 50*((10*a-c)/b);
				double y = 500 - 50*((-10*b+c)/a);
				 g.drawLine(0,(int) y,(int) x, 0);
			}
		});
		
		txtx = new JTextField();
		txtx.setBounds(10, 238, 180, 20);
		txtx.setSelectedTextColor(Color.GRAY);
		txtx.setForeground(Color.WHITE);
		txtx.setDisabledTextColor(Color.WHITE);
		txtx.setCaretColor(Color.WHITE);
		txtx.setBackground(Color.BLACK);
		txtx.setFont(new Font("Yu Mincho Demibold", Font.BOLD | Font.ITALIC, 14));
		contentPane.add(txtx);
		txtx.setColumns(10);
		
		txta1 = new JTextField();
		txta1.setBounds(66, 347, 124, 20);
		txta1.setSelectedTextColor(Color.GRAY);
		txta1.setForeground(Color.WHITE);
		txta1.setDisabledTextColor(Color.WHITE);
		txta1.setCaretColor(Color.WHITE);
		txta1.setBackground(Color.BLACK);
		txta1.setFont(new Font("Yu Mincho Demibold", Font.BOLD | Font.ITALIC, 14));
		contentPane.add(txta1);
		txta1.setColumns(10);
		
		txtb1 = new JTextField();
		txtb1.setBounds(66, 372, 124, 20);
		txtb1.setSelectedTextColor(Color.GRAY);
		txtb1.setForeground(Color.WHITE);
		txtb1.setDisabledTextColor(Color.WHITE);
		txtb1.setCaretColor(Color.WHITE);
		txtb1.setBackground(Color.BLACK);
		txtb1.setFont(new Font("Yu Mincho Demibold", Font.BOLD | Font.ITALIC, 14));
		contentPane.add(txtb1);
		txtb1.setColumns(10);
		
		txtc1 = new JTextField();
		txtc1.setBounds(66, 397, 124, 20);
		txtc1.setSelectedTextColor(Color.GRAY);
		txtc1.setForeground(Color.WHITE);
		txtc1.setDisabledTextColor(Color.WHITE);
		txtc1.setCaretColor(Color.WHITE);
		txtc1.setBackground(Color.BLACK);
		txtc1.setFont(new Font("Yu Mincho Demibold", Font.BOLD | Font.ITALIC, 14));
		contentPane.add(txtc1);
		txtc1.setColumns(10);
		
		txty = new JTextField();
		txty.setBounds(8, 554, 180, 20);
		txty.setSelectedTextColor(Color.GRAY);
		txty.setForeground(Color.WHITE);
		txty.setDisabledTextColor(Color.WHITE);
		txty.setCaretColor(Color.WHITE);
		txty.setBackground(Color.BLACK);
		txty.setFont(new Font("Yu Mincho Demibold", Font.BOLD | Font.ITALIC, 14));
		contentPane.add(txty);
		txty.setColumns(10);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("\u041F\u0440\u0435\u0441\u043C\u0435\u0442\u043D\u0438");
		btn2.setBounds(10, 173, 180, 23);
		btn2.setFont(new Font("Yu Mincho Demibold", Font.BOLD | Font.ITALIC, 14));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a;
				double b;
				double c;
				try {
					a = Double.parseDouble(txta.getText());
					b = Double.parseDouble(txtb.getText());
					c = Double.parseDouble(txtc.getText());
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(contentPane, "Incorrect data");
				    return;
				}
				double slope = b/a;
				lblS.setText(Double.toString(slope));
			}
		});
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("\u041F\u0440\u043E\u0432\u0435\u0440\u0438");
		btn3.setBounds(10, 266, 180, 23);
		btn3.setFont(new Font("Yu Mincho Demibold", Font.BOLD | Font.ITALIC, 14));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a;
				double b;
				double c;
				double q;
				try {
					a = Double.parseDouble(txta.getText());
					b = Double.parseDouble(txtb.getText());
					c = Double.parseDouble(txtc.getText());
					q = Double.parseDouble(txtx.getText());
				} catch (Exception e) {
					JOptionPane.showMessageDialog(contentPane, "Incorrect data");
				    return;
				}
				String p = (String) comboBox.getSelectedItem();
				double r=0;
				String s="";
				if(p=="x") {r=(b*q+c)/a; s="y = "; lblp.setText(s + Double.toString(r));}
				else if(p=="y") {r=(a*q-b)/c; s="x = "; lblp.setText(s + Double.toString(r));}
				else JOptionPane.showMessageDialog(contentPane, "Incorrect data");
			}
		});
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("\u041D\u0430\u0447\u0435\u0440\u0442\u0430\u0439");
		btn4.setBounds(10, 425, 180, 23);
		btn4.setFont(new Font("Yu Mincho Demibold", Font.BOLD | Font.ITALIC, 14));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Graphics g = panel.getGraphics();
				drawCoordinatesystem(g);
				double a;
				double b;
				double c;
				try {
					a = Double.parseDouble(txta1.getText());
					b = Double.parseDouble(txtb1.getText());
					c = Double.parseDouble(txtc1.getText());
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(contentPane, "Incorrect data");
				    return;
				}
				
				double d = Math.sqrt(c)*100;
				double x = 500 + a*50 - Math.sqrt(c)*50;
				double y = 500 - b*50 - Math.sqrt(c)*50;
				g.drawOval( (int) x,(int) y,(int) d,(int) d);
			}
		});
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("\u041F\u0440\u043E\u0432\u0435\u0440\u0438");
		btn5.setBounds(10, 586, 180, 23);
		btn5.setFont(new Font("Yu Mincho Demibold", Font.BOLD | Font.ITALIC, 14));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a;
				double b;
				double c;
				double q;
				try {
					a = Double.parseDouble(txta1.getText());
					b = Double.parseDouble(txtb1.getText());
					c = Double.parseDouble(txtc1.getText());
					q = Double.parseDouble(txty.getText());
				} catch (Exception e) {
					JOptionPane.showMessageDialog(contentPane, "Incorrect data");
				    return;
				}
				String p = (String) comboBox_1.getSelectedItem();
				double r1=0;
				double r2=0;
				String s="";
				String s1="";
				if(p=="x"){r1=Math.sqrt(c-(q-a)*(q-a))+b; r2=-Math.sqrt(c-(q-a)*(q-a))+b; s="y1 = "; s1=" y2 = "; lblr.setText(s + Double.toString(r1) + s1 + Double.toString(r2));}
				else if(p=="y") {r1=Math.sqrt(c-(q-b)*(q-b))+a; r2=-Math.sqrt(c-(q-b)*(q-b))+a; s="y1 = "; s1=" y2 = ";lblr.setText(s + Double.toString(r1) + s1 + Double.toString(r2));}
				else lblr.setText("Incorect data!");
			}
		});
		contentPane.add(btn5);
		
		JButton btn7 = new JButton("\u0418\u0437\u0447\u0438\u0441\u0442\u0438");
		btn7.setBounds(10, 647, 180, 23);
		btn7.setFont(new Font("Yu Mincho Demibold", Font.BOLD | Font.ITALIC, 14));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txta.setText("");
				txtb.setText("");
				txtc.setText("");
				panel.repaint();
				lblS.setText("");
				lblp.setText("");
				txtx.setText("");
				comboBox.setSelectedIndex(0);
				txta1.setText("");
				txtb1.setText("");
				txtc1.setText("");
				lblr.setText("");
				txty.setText("");
				comboBox_1.setSelectedIndex(0);
				label.setText("");
			}
		});
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("\u0418\u0437\u0445\u043E\u0434");
		btn8.setBounds(8, 682, 180, 23);
		btn8.setFont(new Font("Yu Mincho Demibold", Font.BOLD | Font.ITALIC, 14));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(btn8);
		
		JLabel lblCenter = new JLabel("център:");
		lblCenter.setForeground(Color.WHITE);
		lblCenter.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		lblCenter.setBounds(10, 463, 82, 14);
		contentPane.add(lblCenter);
		
		label = new JLabel("");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		label.setBounds(104, 463, 86, 14);
		contentPane.add(label);
		
		JButton button = new JButton("Пресметни");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a;
				double b;
				double c;
				try {
					a = Double.parseDouble(txta1.getText());
					b = Double.parseDouble(txtb1.getText());
					c = Double.parseDouble(txtc1.getText());
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(contentPane, "Incorrect data");
				    return;
				}
				label.setText("O(" + Double.toString(a) + "; " + Double.toString(b) + ")"); 
			}
		});
		button.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		button.setBounds(10, 489, 180, 23);
		contentPane.add(button);
		
		JButton btnBg = new JButton("EN");
		btnBg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnBg.getText().equals("BG")) {
					btnBg.setText("EN");
					lblSlope.setText("наклон:");
					btn1.setText("Начертай");
					btn2.setText("Пресметни");
					btn3.setText("Провери");
					btn4.setText("Начертай");
					btn5.setText("Провери");
					btn7.setText("Изчисти");
					btn8.setText("Изход");
					button.setText("Пресметни");
					lblCenter.setText("център:");
					comboBox.setModel(new DefaultComboBoxModel(new String[] {"Изберете променлива:", "x", "y"}));
					comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Изберете променлива:", "x", "y"}));
				} else {
					btnBg.setText("BG");
					lblSlope.setText("slope:");
					btn1.setText("Draw");
					btn2.setText("Calculate");
					btn3.setText("Check");
					btn4.setText("Draw");
					btn5.setText("Check");
					btn7.setText("Clear");
					btn8.setText("Exit");
					button.setText("Calculate");
					lblCenter.setText("center:");
					comboBox.setModel(new DefaultComboBoxModel(new String[] {"Choose variable:", "x", "y"}));
					comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Choose variable:", "x", "y"}));
				}
			}
		});
		btnBg.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		btnBg.setBounds(10, 755, 37, 23);
		contentPane.add(btnBg);
	}
}
