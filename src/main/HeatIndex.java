package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import main.Randomizer;

import java.awt.Color;

public class HeatIndex extends JFrame {
	private JPanel contentPane;
	private JTextField txtt;
	private JTextField txtw;
	private JButton btnBg;
	private JLabel lblt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HeatIndex frame = new HeatIndex();
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
	public HeatIndex() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 338, 192);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbld = new JLabel(
				"\u0422\u0435\u043C\u043F\u0435\u0440\u0430\u0442\u0443\u0440\u0430\u0442\u0430 \u043D\u0430 \u0432\u044A\u0437\u0434\u0443\u0445\u0430, \u0438\u0437\u043C\u0435\u0440\u0435\u043D\u0430 \u043D\u0430 \u0441\u044F\u043D\u043A\u0430");
		lbld.setBounds(10, 11, 296, 14);
		contentPane.add(lbld);

		JLabel lblc = new JLabel("\u00B0C");
		lblc.setBounds(240, 36, 33, 14);
		contentPane.add(lblc);

		JLabel lblw = new JLabel(
				"\u041E\u0442\u043D\u043E\u0441\u0438\u0442\u0435\u043B\u043D\u0430 \u0432\u043B\u0430\u0436\u043D\u043E\u0441\u0442, \u0438\u0437\u043C\u0435\u0440\u0435\u043D\u0430 \u0441 \u0445\u0438\u0434\u0440\u043E\u043C\u0435\u0442\u044A\u0440");
		lblw.setBounds(10, 67, 330, 14);
		contentPane.add(lblw);

		JLabel lblp = new JLabel("%");
		lblp.setBounds(249, 98, 21, 14);
		contentPane.add(lblp);

		txtt = new JTextField();
		txtt.setText("0");
		txtt.setBounds(10, 36, 222, 20);
		contentPane.add(txtt);
		txtt.setColumns(10);

		txtw = new JTextField();
		txtw.setText("0");
		txtw.setBounds(10, 92, 222, 20);
		contentPane.add(txtw);
		txtw.setColumns(10);

		lblt = new JLabel("");
		lblt.setForeground(new Color(255, 255, 255));
		lblt.setBounds(10, 120, 322, 14);
		contentPane.add(lblt);

		JButton btncal = new JButton("Calculate");
		btncal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a = 0;
				double b = 0;
			
				try {
					a = Double.parseDouble(txtt.getText());
					b = Double.parseDouble(txtw.getText());
				} catch (Exception e2) {
					if (btnBg.getText().equals("BG")) {
						JOptionPane.showMessageDialog(contentPane, "Incorrect Data");
					} else {
						JOptionPane.showMessageDialog(contentPane, "Невалидни данни");
					}
					
					return;
				}
				
				double T = Double.parseDouble(txtt.getText());
				double R = Double.parseDouble(txtw.getText());
				T = 9 * T / 5 + 32;
				double c1 = -42.379;
				double c2 = 2.04901523;
				double c3 = 10.14333127;
				double c4 = -0.22475541;
				double c5 = -6.83783 * Math.pow(10, -3);
				double c6 = -5.4481717 * Math.pow(10, -2);
				double c7 = 1.22874 * Math.pow(10, -3);
				double c8 = 8.5282 * Math.pow(10, -4);
				double c9 = -1.99 * Math.pow(10, -6);
				double r = c1 + c2 * T + c3 * R + c4 * T * R + c5 * T * T + c6 * R * R + c7 * T * T * R + c8 * T * R * R
						+ c9 * T * T * R * R;
				double t = 5 * (r - 32) / 9;
				
				if (btnBg.getText().equals("BG")) {
					lblt.setText(String.format("Feels like: %.0f or %.0f", t, r));
					
				} else {
				lblt.setText(String.format("Усеща се като: %.0f °C или %.0f °F", t, r));}
				
				
			}
		});
		btncal.setBounds(6, 140, 108, 23);
		contentPane.add(btncal);

		JButton btnclear = new JButton("Clear");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtt.setText("0");
				txtw.setText("0");
				lblt.setText("");
			}
		});
		btnclear.setBounds(126, 140, 108, 23);
		contentPane.add(btnclear);
		
		btnBg = new JButton("BG");
		btnBg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (btnBg.getText().equals("BG")) {
					btnBg.setText("EN");
					btncal.setText("Пресметни");
					btnclear.setText("Изчисти");
					
					if(lblt.getText().equals(String.format("Feels like: %.0f or %.0f", t, r))) lblt.setText("Това е линейно уравнение.");
				} else {
					btnBg.setText("BG");
					btncal.setText("Calculate");
					btnclear.setText("Clear");
					
				}
				
			}
		});
		btnBg.setBounds(282, 137, 58, 29);
		contentPane.add(btnBg);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 340, 176);
		contentPane.add(label);
		label.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getClass().getResource("/res/heatindex.jpg")));
	}

	
}
