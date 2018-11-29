package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class QuadraticEquation extends JFrame {

	private JPanel contentPane;
	private JTextField txta;
	private JTextField txtb;
	private JTextField txtc;
	private JLabel lbls;
	private JButton btnCalc;
	private JButton btnClear;
	private JLabel label;
	private JLabel lblB;
	private JLabel lblVertex;
	private JLabel label_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuadraticEquation frame = new QuadraticEquation();
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
	public QuadraticEquation() {
		setResizable(false);
		setTitle("Quadratic Equation");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 335, 155);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAxBx = new JLabel("ax2 + bx + c = 0");
		lblAxBx.setBounds(10, 11, 124, 14);
		contentPane.add(lblAxBx);

		lbls = new JLabel("");
		lbls.setForeground(Color.WHITE);
		lbls.setHorizontalAlignment(SwingConstants.TRAILING);
		lbls.setBounds(97, 113, 232, 14);
		contentPane.add(lbls);

		JLabel lblA = new JLabel("a=");
		lblA.setBounds(10, 36, 28, 14);
		contentPane.add(lblA);

		txta = new JTextField();
		txta.setBounds(48, 33, 86, 20);
		contentPane.add(txta);
		txta.setColumns(10);

		lblB = new JLabel("b=");
		lblB.setForeground(Color.WHITE);
		lblB.setBounds(10, 61, 28, 14);
		contentPane.add(lblB);

		txtb = new JTextField();
		txtb.setBounds(48, 58, 86, 20);
		contentPane.add(txtb);
		txtb.setColumns(10);

		JLabel lblC = new JLabel("c=");
		lblC.setForeground(Color.WHITE);
		lblC.setBounds(10, 86, 28, 14);
		contentPane.add(lblC);

		txtc = new JTextField();
		txtc.setBounds(48, 83, 86, 20);
		contentPane.add(txtc);
		txtc.setColumns(10);

		JButton btnBg = new JButton("BG");
		btnBg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnBg.getText().equals("BG")) {
					btnBg.setText("EN");
					btnCalc.setText("Пресметни");
					btnClear.setText("Изчисти");
					lblVertex.setText("връх:");
					if(lbls.getText().equals("This is a linear equation.")) lbls.setText("Това е линейно уравнение.");
					if(lbls.getText().equals("No real roots.")) lbls.setText("Няма реални корени.");
				} else {
					btnBg.setText("BG");
					btnCalc.setText("Calculate");
					btnClear.setText("Clear");
					lblVertex.setText("vertex:");
					if(lbls.getText().equals("Това е линейно уравнение.")) lbls.setText("This is a linear equation.");
					if(lbls.getText().equals("Няма реални корени.")) lbls.setText("No real roots.");
				}
			}
		});
		
		lblVertex = new JLabel("vertex:");
		lblVertex.setForeground(Color.WHITE);
		lblVertex.setBounds(10, 113, 54, 14);
		contentPane.add(lblVertex);
		btnBg.setBounds(286, 0, 49, 29);
		contentPane.add(btnBg);
		
		btnCalc = new JButton("Calculate");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					double a = 0;
					double b = 0;
					double c = 0;
				
					try {
						a = Double.parseDouble(txta.getText());
						b = Double.parseDouble(txtb.getText());
						c = Double.parseDouble(txtc.getText());
					} catch (Exception e2) {
						if (btnBg.getText().equals("BG")) {
							JOptionPane.showMessageDialog(contentPane, "Incorrect Data");
						} else {
							JOptionPane.showMessageDialog(contentPane, "Невалидни данни");
						}
						
						return;
					}
					
				double d = b * b - 4 * a * c;
				if (a == 0)
					if (btnBg.getText().equals("BG")) {
						lbls.setText("This is a linear equation.");
					} else {
						lbls.setText("Това е линейно уравнение.");
					}
				else if (d < 0)
					if (btnBg.getText().equals("BG")) {
						lbls.setText("No real roots.");
					} else {
						lbls.setText("Няма реални корени.");
					}
				else {
					double x = -b/(2*a);
					double y = a*x*x + b*x + c;
					label_1.setText("V(" + Double.toString(x) + ";" + Double.toString(y) + ")");
					
					if (d == 0) {
					if (b == 0)
						lbls.setText("x1 = x2 = 0");
					else
						lbls.setText(String.format("x1 = x2 = %.0f", (-b / 2.0 / a)));
				} else {
					double x1 = (Math.sqrt(d) - b) / (2.0 * a);
					double x2 = (-Math.sqrt(d) - b) / (2.0 * a);
					if (x1 < x2)
						lbls.setText(String.format("x1 = %.0f, x2 = %.0f", x1, x2));
					else
						lbls.setText(String.format("x1 = %.0f, x2 = %.0f", x2, x1));
				}}
			}
		});
		btnCalc.setBounds(181, 33, 101, 23);
		contentPane.add(btnCalc);

		btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txta.setText("");
				txtb.setText("");
				txtc.setText("");
				lbls.setText("");
				label_1.setText("");
			}
		});
		btnClear.setBounds(181, 83, 101, 23);
		contentPane.add(btnClear);
		
		label_1 = new JLabel("");
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(58, 113, 76, 14);
		contentPane.add(label_1);
		
		label = new JLabel("");
		label.setBounds(0, 0, 335, 133);
		contentPane.add(label);
		label.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getClass().getResource("/res/quadeq.png")));
		
		

	
	}
}