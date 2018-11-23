package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.CardLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Settings extends JFrame {

	private JPanel contentPane;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Settings frame = new Settings();
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
	public Settings() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1212, 625);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getIcon().toString().equals("/res/bg.jpg")) {
				
				}
			}
		});
		button.setBounds(1089, 109, 117, 29);
		contentPane.add(button);
		
		label = new JLabel("");
		label.setBounds(0, 0, 1065, 600);
		contentPane.add(label);
		label.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getClass().getResource("/res/bg.jpg")));

		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] names = { "/res/bg.jpg", "/res/bg1.jpg"};
				String name = names[(int) (Math.random() * names.length)];
				label.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getClass().getResource(name)));
			}
		});
		button_1.setBounds(1154, 28, 41, 29);
		contentPane.add(button_1);
	}
}
