package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Set;
import java.awt.event.ActionEvent;

import javax.imageio.ImageIO;
import javax.security.auth.callback.LanguageCallback;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Window;

import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Component;
import java.awt.Window.Type;
import javax.swing.JToggleButton;

public class MultiCalc extends JFrame {

	private JPanel contentPane;
	private JPanel mainpanel;
	private JLabel lblW;
	private JLabel lblN;
	private JLabel lblTitle;
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;
	private JTextField txt3;
	private JTextField txt1;
	private JTextField txt2;
	private JLabel lblR;
	private JButton btnCalculate;
	private JTextArea txtAreaResult;
	private JLabel lblAlc;
	private JToggleButton tglbtnBg;
	private JLabel label;
	private JButton btnBg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MultiCalc frame = new MultiCalc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private void cleanTextFields() {
		txt3.setText("");
		txt1.setText("");
		txt2.setText("");
		txtAreaResult.setText("");

	}

	private void setFPanelElementsVisible(boolean isVisible) {

		lblTitle.setVisible(isVisible);
		lbl1.setVisible(isVisible);
		lbl2.setVisible(isVisible);
		lbl3.setVisible(isVisible);
		txt3.setVisible(isVisible);
		txt1.setVisible(isVisible);
		txt2.setVisible(isVisible);
		lblR.setVisible(isVisible);
		btnCalculate.setVisible(isVisible);
		txtAreaResult.setVisible(isVisible);

	}

	/**
	 * Create the frame.
	 */
	public MultiCalc() {
		setTitle("MultiCalc 2.0");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 498, 362);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JComboBox formulas = new JComboBox();
		formulas.setBackground(new Color(102, 153, 204));
		formulas.setModel(new DefaultComboBoxModel(new String[] { "Choose a Formula...", "Acceleration",
				"Amount of a Tip", "Angular Velocity", "Area of Circle", "Area of Parallelogram", "Area of Rectangle",
				"Area of Triangle", "Body Mass Index", "Celsius to Fahrenheit", "Celsius To Kelvin",
				"Centripetal Force", "Circumference of Circle", "Cylinder Volume", "Deceleration", "Density",
				"Determine the Right Size TV", "Displacement", "Fahrenheit To Celsius", "Fahrenheit to Kelvin",
				"Frequency", "Friction", "Gallons in an Aquarium", "Gauss Law", "Heat Transfer",
				"How Long a Storm Will Last", "Impulse", "Kelvin to Celsius", "Kelvin To Fahrenheit", "Mass Flow Rate",
				"Momentum", "Potential Energy: Earth's Gravity", "Potential Energy: Elastic",
				"Potential Energy: Electric Potential", "Power", "Pressure", "Relativity", "Surface Tension", "Tangent",
				"Tangential Acceleration", "Pythagorean Theorem", "Torque", "Total Area of Skin", "Velocity",
				"Volleyball", "Volume Flow Rate", "Wavelength", }));

		formulas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cleanTextFields();
				String formula = (String) formulas.getSelectedItem();
				if (formula == "Choose a Formula...") {
					setFPanelElementsVisible(false);
					lblW.setVisible(true);
					lblN.setVisible(true);

				} else {
					lblW.setVisible(false);
					lblN.setVisible(false);
					setFPanelElementsVisible(true);

				}

				if (formula == "Acceleration") {
					lbl1.setText("Final Velocity:");
					lbl2.setText("Initial Velocity:");
					lbl3.setText("Time:");
					lblTitle.setText("Acceleration");

				} else if (formula == "Frequency") {
					lbl1.setText("Number of Cycles:");
					lbl2.setText("Time:");
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Frequency");

				} else if (formula == "Velocity") {
					lbl1.setText("Final Position:");
					lbl2.setText("Initial Position:");
					lbl3.setText("Time:");
					lblTitle.setText("Velocity");

				} else if (formula == "Wavelength") {
					lbl1.setText("Wave Velocity:");
					lbl2.setText("Frequency:");
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Wavelength");

				} else if (formula == "Angular Velocity") {
					lbl1.setText("Final Angle:");
					lbl2.setText("Initial Angle:");
					lbl3.setText("Time:");
					lblTitle.setText("Angular Velocity");

				} else if (formula == "Displacement") {
					lbl1.setText("Final Position:");
					lbl2.setText("Initial Position:");
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Diplacement");

				} else if (formula == "Friction") {
					lbl1.setText("Coefficient of Friction:");
					lbl2.setText("Normal Force:");
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Friction");

				} else if (formula == "Tangential Acceleration") {
					lbl1.setText("Radius of the Rotation:");
					lbl2.setText("Angular Acceleration:");
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Tangential Acceleration");

				} else if (formula == "Potential Energy: Electric Potential") {
					lbl1.setText("Charge of Particle:");
					lbl2.setText("Electric Potential:");
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Potential Energy: Electric Potential");

				} else if (formula == "Heat Transfer") {
					lbl1.setText("Mass:");
					lbl2.setText("Specific Heat:");
					lbl3.setText("Temperature Change:");
					lblTitle.setText("Heat Transfer");

				} else if (formula == "Centripetal Force") {
					lbl1.setText("Mass of the Object:");
					lbl2.setText("Velocity of the Object:");
					lbl3.setText("Radius:");
					lblTitle.setText("Centripetal Force");

				} else if (formula == "Deceleration") {
					lbl1.setText("Final Velocity:");
					lbl2.setText("Initial Velocity:");
					lbl3.setText("Time:");
					lblTitle.setText("Deceleration");

				} else if (formula == "Potential Energy: Earth's Gravity") {
					lbl1.setText("Mass of the Object:");
					lbl2.setText("Acceleration Due to Gravity:");
					lbl3.setText("Height:");
					lblTitle.setText("Potential Energy: Earth's Gravity");

				} else if (formula == "Potential Energy: Elastic") {
					lbl1.setText("Spring Constant:");
					lbl2.setText("Distance from Equilibrium:");
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Potential Energy: Elastic");

				} else if (formula == "Momentum") {
					lbl1.setText("Mass:");
					lbl2.setText("Velocity:");
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Momentum");

				} else if (formula == "Power") {
					lbl1.setText("Energy Used:");
					lbl2.setText("Time Interval:");
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Power");

				} else if (formula == "Impulse") {
					lbl1.setText("Force:");
					lbl2.setText("Time:");
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Impulse");

				} else if (formula == "Pressure") {
					lbl1.setText("Density of a Gas/Fluid:");
					lbl2.setText("Acceleration Due to Gravity:");
					lbl3.setText("Height of Gas/Fluid Column:");
					lblTitle.setText("Pressure");

				} else if (formula == "Mass Flow Rate") {
					lbl1.setText("Density:");
					lbl2.setText("Velocity:");
					lbl3.setText("Area of the Cross Section:");
					lblTitle.setText("Mass Flow Rate");

				} else if (formula == "Gauss Law") {
					lbl1.setText("Enclosed Charge:");
					lbl2.setText("Permittivity:");
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Gauss Law");

				} else if (formula == "Volume Flow Rate") {
					lbl1.setText("Variation of Volume:");
					lbl2.setText("Variation of Time:");
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Volume Flow Rate");

				} else if (formula == "Surface Tension") {
					lbl1.setText("Surface Force:");
					lbl2.setText("Length Force Acts:");
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Surface Tension");

				} else if (formula == "Area of Triangle") {
					lbl1.setText("Base:");
					lbl2.setText("Height:");
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Area of Triangle");

				} else if (formula == "Area of Rectangle") {
					lbl1.setText("Width:");
					lbl2.setText("Height:");
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Area of Rectangle");

				} else if (formula == "Area of Parallelogram") {
					lbl1.setText("Base:");
					lbl2.setText("Height:");
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Area of Parallelogram");

				} else if (formula == "Area of Circle") {
					lbl1.setText("Radius:");
					lbl2.setVisible(false);
					txt2.setVisible(false);
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Area of Circle");

				} else if (formula == "Circumference of Circle") {
					lbl1.setText("Radius:");
					lbl2.setVisible(false);
					txt2.setVisible(false);
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Circumference of Circle");

				} else if (formula == "Tangent") {
					lbl1.setText("Opposite:");
					lbl2.setText("Adjacent:");
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Tangent");

				} else if (formula == "Density") {
					lbl1.setText("Mass:");
					lbl2.setText("Volume:");
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Density");

				} else if (formula == "Torque") {
					lbl1.setText("Radius Vector:");
					lbl2.setText("Linear Force:");
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Torque");

				} else if (formula == "Pythagorean Theorem") {
					lbl1.setText("a:");
					lbl2.setText("b:");
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Pythagorean Theorem");

				} else if (formula == "Relativity") {
					lbl1.setText("Velocity:");
					lbl2.setVisible(false);
					txt2.setVisible(false);
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Relativity");

				} else if (formula == "Cylinder Volume") {
					lbl1.setText("Radius:");
					lbl2.setText("Height:");
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Cylinder Volume");

				} else if (formula == "Celsius to Fahrenheit") {
					lbl1.setText("Temperature:");
					lbl2.setVisible(false);
					txt2.setVisible(false);
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Celsius to Fahrenheit");

				} else if (formula == "Fahrenheit To Celsius") {
					lbl1.setText("Temperature:");
					lbl2.setVisible(false);
					txt2.setVisible(false);
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Fahrenheit To Celsius");

				} else if (formula == "Celsius To Kelvin") {
					lbl1.setText("Temperature:");
					lbl2.setVisible(false);
					txt2.setVisible(false);
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Celsius To Kelvin");

				} else if (formula == "Kelvin to Celsius") {
					lbl1.setText("Temperature:");
					lbl2.setVisible(false);
					txt2.setVisible(false);
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Kelvin to Celsius");

				} else if (formula == "Kelvin To Fahrenheit") {
					lbl1.setText("Temperature:");
					lbl2.setVisible(false);
					txt2.setVisible(false);
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Kelvin To Fahrenheit");

				} else if (formula == "Fahrenheit to Kelvin") {
					lbl1.setText("Temperature:");
					lbl2.setVisible(false);
					txt2.setVisible(false);
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Fahrenheit to Kelvin");

				} else if (formula == "Volleyball") {
					lbl1.setText("Kills:");
					lbl2.setText("Attack Errors:");
					lbl3.setText("Total Attack Attempts:");
					lblTitle.setText("Volleyball");

				} else if (formula == "Body Mass Index") {
					lbl1.setText("Weight(kg):");
					lbl2.setText("Height(m):");
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Body Mass Index");

				} else if (formula == "Total Area of Skin") {
					lbl1.setText("Weight(kg):");
					lbl2.setText("Height(cm):");
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Total Area of Skin");

				} else if (formula == "How Long a Storm Will Last") {
					lbl1.setText("Diameter of the Storm in Miles:");
					lbl2.setVisible(false);
					txt2.setVisible(false);
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("How Long a Storm Will Last");

				} else if (formula == "Amount of a Tip") {
					lbl1.setText("Cost of the Meals:");
					lbl2.setText("The Tip Rate:");
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Amount of a Tip");

				} else if (formula == "Gallons in an Aquarium") {
					lbl1.setText("Dimension 1(inches):");
					lbl2.setText("Dimension 2(inches):");
					lbl3.setText("Dimension 3(inches):");
					lblTitle.setText("Gallons in an Aquarium");

				} else if (formula == "Determine the Right Size TV") {
					lbl1.setText("Space from Coach to TV(inches):");
					lbl2.setVisible(false);
					txt2.setVisible(false);
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Determine the Right Size TV");

				} else if (formula == "Body Mass Index") {
					lbl1.setText("Weight(kg):");
					lbl2.setText("Height(m):");
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Body Mass Index");

				} else if (formula == "Body Mass Index") {
					lbl1.setText("Weight(kg):");
					lbl2.setText("Height(m):");
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Body Mass Index");

				} else if (formula == "Body Mass Index") {
					lbl1.setText("Weight(kg):");
					lbl2.setText("Height(m):");
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Body Mass Index");

				} else if (formula == "Body Mass Index") {
					lbl1.setText("Weight(kg):");
					lbl2.setText("Height(m):");
					lbl3.setVisible(false);
					txt3.setVisible(false);
					lblTitle.setText("Body Mass Index");

				}

			}

		});

		Border border = BorderFactory.createLineBorder(getBackground(), 5);

		mainpanel = new JPanel();
		contentPane.add(mainpanel, BorderLayout.CENTER);
		mainpanel.setLayout(null);

		lblW = new JLabel("Welcome to MultiCalc 2.0");
		lblW.setBackground(Color.WHITE);
		lblW.setForeground(Color.WHITE);
		lblW.setHorizontalAlignment(SwingConstants.CENTER);
		lblW.setFont(new Font("Lucida Grande", Font.ITALIC, 28));
		lblW.setBounds(40, 84, 408, 86);
		mainpanel.add(lblW);

		lblN = new JLabel("Note: MultiCalc 2.0 works only with base units.");
		lblN.setForeground(Color.WHITE);
		lblN.setBounds(92, 272, 305, 25);
		mainpanel.add(lblN);

		lblTitle = new JLabel("");
		lblTitle.setIcon(null);
		lblTitle.setForeground(Color.WHITE);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 22));
		lblTitle.setBounds(6, 6, 476, 66);
		mainpanel.add(lblTitle);
		lblTitle.setBorder(border);
		lblTitle.setBackground(getBackground());

		lbl1 = new JLabel("");
		lbl1.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		lbl1.setForeground(Color.WHITE);
		lbl1.setBounds(16, 84, 220, 25);
		mainpanel.add(lbl1);

		lbl2 = new JLabel("");
		lbl2.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		lbl2.setForeground(Color.WHITE);
		lbl2.setBounds(16, 127, 220, 25);
		mainpanel.add(lbl2);

		lbl3 = new JLabel("");
		lbl3.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		lbl3.setForeground(Color.WHITE);
		lbl3.setBounds(16, 170, 220, 25);
		mainpanel.add(lbl3);

		txt1 = new JTextField();
		txt1.setBounds(245, 83, 130, 26);
		mainpanel.add(txt1);
		txt1.setColumns(10);

		txt2 = new JTextField();
		txt2.setBounds(245, 127, 130, 26);
		mainpanel.add(txt2);
		txt2.setColumns(10);

		txt3 = new JTextField();
		txt3.setBounds(245, 169, 130, 26);
		mainpanel.add(txt3);
		txt3.setColumns(10);

		lblR = new JLabel("Result:");
		lblR.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		lblR.setForeground(Color.WHITE);
		lblR.setBounds(385, 84, 97, 16);
		mainpanel.add(lblR);

		btnCalculate = new JButton("Calculate");
		btnCalculate.setForeground(Color.WHITE);
		btnCalculate.setVerticalAlignment(SwingConstants.TOP);
		btnCalculate.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getClass().getResource("/res/button.png"))); // btnCalculate.setIcon(new
																													// ImageIcon("resources/button.png"));
		btnCalculate.setFont(new Font("Lucida Grande", Font.ITALIC, 14));
		btnCalculate.setHorizontalTextPosition(JButton.CENTER);
		btnCalculate.setVerticalTextPosition(JButton.CENTER);

		btnCalculate.setOpaque(false);
		btnCalculate.setFocusPainted(false);
		btnCalculate.setBorderPainted(false);
		btnCalculate.setContentAreaFilled(false);
		btnCalculate.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double t1 = 0;
				double t2 = 0;
				double t3 = 0;

				if (!(txt2.isVisible() && txt3.isVisible()) && txt1.isVisible()) {
					try {
						t1 = Double.parseDouble(txt1.getText());
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(contentPane, "Incorrect Data");
						return;
					}
				}

				if (!(txt3.isVisible()) && (txt1.isVisible() && txt2.isVisible())) {
					try {
						t1 = Double.parseDouble(txt1.getText());
						t2 = Double.parseDouble(txt2.getText());
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(contentPane, "Incorrect Data");
						return;
					}
				}

				if (txt1.isVisible() && txt2.isVisible() && txt3.isVisible()) {
					try {
						t1 = Double.parseDouble(txt1.getText());
						t2 = Double.parseDouble(txt2.getText());
						t3 = Double.parseDouble(txt3.getText());
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(contentPane, "Incorrect Data");
						return;
					}
				}
				
				double result = 0; // if (Double.toString(result).endsWith(".0")) {
									// result = Math.round(result);}

				String formula = (String) formulas.getSelectedItem();

				DecimalFormat format = new DecimalFormat("0.#");
				
				if (formula == "Acceleration") {

					result = (t1 - t2) / t3;	

				} else if (formula == "Frequency") {

					result = t1 / t2;

				} else if (formula == "Velocity") {

					result = (t1 - t2) / t3;

				} else if (formula == "Wavelength") {

					result = t1 / t2;

				} else if (formula == "Angular Velocity") {

					result = (t1 - t2) / t3;

				} else if (formula == "Displacement") {

					result = t1 - t2;

				} else if (formula == "Friction") {

					result = t1 * t2;

				} else if (formula == "Tangential Acceleration") {

					result = t1 * t2;

				} else if (formula == "Potential Energy: Electric Potential") {

					result = t1 * t2;

				} else if (formula == "Heat Transfer") {

					result = t1 * t2 * t3;

				} else if (formula == "Centripetal Force") {

					result = t1 * Math.pow(t2, 2) / t3;

				} else if (formula == "Deceleration") {

					result = (t1 - t2) / t3;

				} else if (formula == "Potential Energy: Earth's Gravity") {

					result = t1 * t2 * t3;

				} else if (formula == "Potential Energy: Elastic") {

					result = 0.5 * t1 * Math.pow(t2, 2);

				} else if (formula == "Momentum") {

					result = t1 * t2;

				} else if (formula == "Power") {

					result = t1 / t2;

				} else if (formula == "Impulse") {

					result = t1 * t2;

				} else if (formula == "Pressure") {

					result = t1 * t2 * t3;

				} else if (formula == "Mass Flow Rate") {

					result = t1 * t2 * t3;

				} else if (formula == "Gauss Law") {

					result = t1 * t2;

				} else if (formula == "Volume Flow Rate") {

					result = t1 / t2;

				} else if (formula == "Surface Tension") {

					result = t1 / t2;

				} else if (formula == "Area of Triangle") {

					result = 0.5 * t1 * t2;

				} else if (formula == "Area of Rectangle") {

					result = t1 * t2;

				} else if (formula == "Area of Parallelogram") {

					result = 0.5 * t1 * t2;

				} else if (formula == "Area of Circle") {

					result = Math.PI * Math.pow(t1, 2);

				} else if (formula == "Circumference of Circle") {

					result = 2 * Math.PI * t1;

				} else if (formula == "Tangent") {

					result = t1 / t2;

				} else if (formula == "Density") {

					result = t1 / t2;

				} else if (formula == "Torque") {

					result = t1 * t2;

				} else if (formula == "Pythagorean Theorem") {

					result = Math.sqrt(Math.pow(t1, 2) + Math.pow(t2, 2));

				} else if (formula == "Relativity") {

					result = 1 / (Math.sqrt(1 - Math.pow(t1 / 3.0 * Math.pow(10, 8), 2)));

				} else if (formula == "Cylinder Volume") {

					result = Math.PI * Math.pow(t1, 2) * t2;

				} else if (formula == "Celsius to Fahrenheit") {

					result = 1.8 * t1 + 32;

				} else if (formula == "Fahrenheit To Celsius") {

					result = 1.8 * (t1 - 32);

				} else if (formula == "Celsius To Kelvin") {

					result = t1 + 273.15;

				} else if (formula == "Kelvin to Celsius") {

					result = t1 - 273.15;

				} else if (formula == "Fahrenheit to Kelvin") {

					result = (t1 + 459.67) * 1.8;

				} else if (formula == "Volleyball") {

					result = (t1 - t2) / t3;

				} else if (formula == "Body Mass Index") {

					result = t1 / Math.pow(t2, 2);

				} else if (formula == "Total Area of Skin") {

					result = Math.sqrt(t1 * t2) / 60;

				} else if (formula == "How Long a Storm Will Last") {

					result = Math.sqrt(Math.pow(t1, 3) / 216);

				} else if (formula == "Amount of a Tip") {

					result = t1 * t2;

				} else if (formula == "Gallons in an Aquarium") {

					result = (t1 * t2 * t3) / 231;

				} else if (formula == "Determine the Right Size TV") {

					result = t1 / 2.5;

				} else if (formula == "Amount of a Tip") {

					result = t1 * t2;

				} else if (formula == "Amount of a Tip") {

					result = t1 * t2;

				} else if (formula == "Amount of a Tip") {

					result = t1 * t2;

				} else if (formula == "Amount of a Tip") {

					result = t1 * t2;

				}

				if ((Double.toString(result)).endsWith(".0")) {
					
					txtAreaResult.setText((format.format(result)));
				}
				else {
				txtAreaResult.setText((Double.toString(result))); } //txtAreaResult.setText((format.format(result)));
			}
		});
		btnCalculate.setBounds(245, 207, 130, 45);
		mainpanel.add(btnCalculate);

		txtAreaResult = new JTextArea();
		txtAreaResult.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		txtAreaResult.setForeground(Color.WHITE);
		txtAreaResult.setWrapStyleWord(true);
		txtAreaResult.setLineWrap(true);
		txtAreaResult.setBounds(385, 102, 97, 143);
		mainpanel.add(txtAreaResult);
		contentPane.add(formulas, BorderLayout.NORTH);
		txtAreaResult.setOpaque(false);
		txtAreaResult.setEditable(false);

		label = new JLabel("");
		label.setBackground(new Color(0, 51, 102));
		label.setForeground(Color.WHITE);
		label.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getClass().getResource("/res/multicalc.jpg"))); // ImageIcon
																											// iid = new
																											// ImageIcon(this.getClass().getClassLoader().getResource("ball.png"));

		label.setBounds(0, 0, 488, 303);
		mainpanel.add(label);
		
		btnBg = new JButton("BG");
		btnBg.setBounds(440, 271, 48, 29);
		mainpanel.add(btnBg);
		
		tglbtnBg = new JToggleButton("BG");
		tglbtnBg.setBounds(321, 241, 161, 29);
		mainpanel.add(tglbtnBg);

		setFPanelElementsVisible(false);
	}
}
