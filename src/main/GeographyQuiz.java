package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
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

public class GeographyQuiz extends JFrame {
	double p = 0;
	int max = 0;
	private JPanel contentPane;
	private ButtonGroup c = new ButtonGroup();
	private ButtonGroup s = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GeographyQuiz frame = new GeographyQuiz();
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
	public GeographyQuiz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblGreetings = new JLabel("");
		lblGreetings.setBounds(10, 241, 414, 14);
		contentPane.add(lblGreetings);

		JLabel lblr = new JLabel("");
		lblr.setBounds(10, 273, 203, 14);
		contentPane.add(lblr);

		JLabel lblg = new JLabel("");
		lblg.setBounds(223, 273, 201, 14);
		contentPane.add(lblg);

		JPanel pnl1 = new JPanel();
		pnl1.setBorder(new TitledBorder(null, "\u0414\u044A\u0440\u0436\u0430\u0432\u0438", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		pnl1.setBounds(0, 0, 211, 224);
		contentPane.add(pnl1);

		JRadioButton rbc1 = new JRadioButton("Russia");
		pnl1.add(rbc1);
		c.add(rbc1);

		JRadioButton rbc7 = new JRadioButton("Austria");
		pnl1.add(rbc7);
		c.add(rbc7);

		JRadioButton rbc3 = new JRadioButton("Macedonia");
		pnl1.add(rbc3);
		c.add(rbc3);

		JRadioButton rbc11 = new JRadioButton("UK");
		pnl1.add(rbc11);
		c.add(rbc11);

		JRadioButton rbc2 = new JRadioButton("Bulgaria");
		pnl1.add(rbc2);
		c.add(rbc2);

		JRadioButton rbc12 = new JRadioButton("Spain");
		pnl1.add(rbc12);
		c.add(rbc12);

		JRadioButton rbc5 = new JRadioButton("Greece");
		pnl1.add(rbc5);
		c.add(rbc5);

		JRadioButton rbc4 = new JRadioButton("Turkey");
		pnl1.add(rbc4);
		c.add(rbc4);

		JRadioButton rbc10 = new JRadioButton("Italy");
		pnl1.add(rbc10);
		c.add(rbc10);

		JRadioButton rbc6 = new JRadioButton("Albania");
		pnl1.add(rbc6);
		c.add(rbc6);

		JRadioButton rbc8 = new JRadioButton("France");
		pnl1.add(rbc8);
		c.add(rbc8);

		JRadioButton rbc14 = new JRadioButton("Romania");
		pnl1.add(rbc14);
		c.add(rbc14);

		JRadioButton rbc9 = new JRadioButton("Germany");
		pnl1.add(rbc9);
		c.add(rbc9);

		JRadioButton rbc13 = new JRadioButton("Serbia");
		pnl1.add(rbc13);
		c.add(rbc13);

		JPanel pnl2 = new JPanel();
		pnl2.setBorder(new TitledBorder(null, "\u0421\u0442\u043E\u043B\u0438\u0446\u0438", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		pnl2.setBounds(233, 0, 211, 224);
		contentPane.add(pnl2);

		JRadioButton rbs3 = new JRadioButton("Scopje");
		pnl2.add(rbs3);
		s.add(rbs3);

		JRadioButton rbs12 = new JRadioButton("Madrid");
		pnl2.add(rbs12);
		s.add(rbs12);

		JRadioButton rbs4 = new JRadioButton("Ankara");
		pnl2.add(rbs4);
		s.add(rbs4);

		JRadioButton rbs10 = new JRadioButton("Rome");
		pnl2.add(rbs10);
		s.add(rbs10);

		JRadioButton rbs2 = new JRadioButton("Sofia");
		pnl2.add(rbs2);
		s.add(rbs2);

		JRadioButton rbs9 = new JRadioButton("Berlin");
		pnl2.add(rbs9);
		s.add(rbs9);

		JRadioButton rbs6 = new JRadioButton("Tirana");
		pnl2.add(rbs6);
		s.add(rbs6);

		JRadioButton rbs11 = new JRadioButton("London");
		pnl2.add(rbs11);
		s.add(rbs11);

		JRadioButton rbs5 = new JRadioButton("Athens");
		pnl2.add(rbs5);
		s.add(rbs5);

		JRadioButton rbs8 = new JRadioButton("Paris");
		pnl2.add(rbs8);
		s.add(rbs8);

		JRadioButton rbs1 = new JRadioButton("Moscow");
		pnl2.add(rbs1);
		s.add(rbs1);

		JRadioButton rbs13 = new JRadioButton("Belgrade");
		pnl2.add(rbs13);
		s.add(rbs13);

		JRadioButton rbs7 = new JRadioButton("Vienna");
		pnl2.add(rbs7);
		s.add(rbs7);

		JRadioButton rbs14 = new JRadioButton("Bucharest");
		pnl2.add(rbs14);
		s.add(rbs14);

		JButton button = new JButton("\u041F\u0440\u043E\u0432\u0435\u0440\u0438");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int b = -1;
				int i = 0;
				lblGreetings.setText("Грешка.");
				if (rbs1.isSelected() && rbc1.isSelected()) {
					rbc1.setVisible(false);
					rbs1.setVisible(false);
					rbc1.setSelected(false);
					rbs1.setSelected(false);
					b = 2;
					i = 2;
					lblGreetings.setText("Браво!");
				} else if (rbs2.isSelected() && rbc2.isSelected()) {
					rbc2.setVisible(false);
					rbs2.setVisible(false);
					rbc2.setSelected(false);
					rbs2.setSelected(false);
					b = 2;
					i = 2;
					lblGreetings.setText("Браво!");
				} else if (rbs3.isSelected() && rbc3.isSelected()) {
					rbc3.setVisible(false);
					rbs3.setVisible(false);
					rbc3.setSelected(false);
					rbs3.setSelected(false);
					b = 2;
					i = 2;
					lblGreetings.setText("Браво!");
				} else if (rbs4.isSelected() && rbc4.isSelected()) {
					rbc4.setVisible(false);
					rbs4.setVisible(false);
					rbc4.setSelected(false);
					rbs4.setSelected(false);
					b = 2;
					i = 2;
					lblGreetings.setText("Браво!");
				} else if (rbs5.isSelected() && rbc5.isSelected()) {
					rbc5.setVisible(false);
					rbs5.setVisible(false);
					rbc5.setSelected(false);
					rbs5.setSelected(false);
					b = 2;
					i = 2;
					lblGreetings.setText("Браво!");
				} else if (rbs6.isSelected() && rbc6.isSelected()) {
					rbc6.setVisible(false);
					rbs6.setVisible(false);
					rbc6.setSelected(false);
					rbs6.setSelected(false);
					b = 2;
					i = 2;
					lblGreetings.setText("Браво!");
				} else if (rbs7.isSelected() && rbc7.isSelected()) {
					rbc7.setVisible(false);
					rbs7.setVisible(false);
					rbc7.setSelected(false);
					rbs7.setSelected(false);
					b = 2;
					i = 2;
					lblGreetings.setText("Браво!");
				} else if (rbs8.isSelected() && rbc8.isSelected()) {
					rbc8.setVisible(false);
					rbs8.setVisible(false);
					rbc8.setSelected(false);
					rbs8.setSelected(false);
					b = 2;
					i = 2;
					lblGreetings.setText("Браво!");
				} else if (rbs9.isSelected() && rbc9.isSelected()) {
					rbc9.setVisible(false);
					rbs9.setVisible(false);
					rbc9.setSelected(false);
					rbs9.setSelected(false);
					b = 2;
					i = 2;
					lblGreetings.setText("Браво!");
				} else if (rbs10.isSelected() && rbc10.isSelected()) {
					rbc10.setVisible(false);
					rbs10.setVisible(false);
					rbc10.setSelected(false);
					rbs10.setSelected(false);
					b = 2;
					i = 2;
					lblGreetings.setText("Браво!");
				} else if (rbs11.isSelected() && rbc11.isSelected()) {
					rbc11.setVisible(false);
					rbs11.setVisible(false);
					rbc11.setSelected(false);
					rbs11.setSelected(false);
					b = 2;
					i = 2;
					lblGreetings.setText("Браво!");
				} else if (rbs12.isSelected() && rbc12.isSelected()) {
					rbc12.setVisible(false);
					rbs12.setVisible(false);
					rbc12.setSelected(false);
					rbs12.setSelected(false);
					b = 2;
					i = 2;
					lblGreetings.setText("Браво!");
				} else if (rbs13.isSelected() && rbc13.isSelected()) {
					rbc13.setVisible(false);
					rbs13.setVisible(false);
					rbc13.setSelected(false);
					rbs13.setSelected(false);
					b = 2;
					i = 2;
					lblGreetings.setText("Браво!");
				} else if (rbs14.isSelected() && rbc14.isSelected()) {
					rbc14.setVisible(false);
					rbs14.setVisible(false);
					rbc14.setSelected(false);
					rbs14.setSelected(false);
					b = 2;
					i = 2;
					lblGreetings.setText("Браво!");
				}
				p += b;
				max += i;
				lblr.setText(String.format("Резултат: %.0f точки", p));
				double g = 100 * p / max;
				if (g < 60)
					lblg.setText(String.format("%.2f", g) + "% - Слаб 2");
				else if (g < 70)
					lblg.setText(String.format("%.2f", g) + "% - Среден 3");
				else if (g < 80)
					lblg.setText(String.format("%.2f", g) + "% - Добър 4");
				else if (g < 90)
					lblg.setText(String.format("%.2f", g) + "% - Много добър 5");
				else
					lblg.setText(String.format("%.2f", g) + "% - Отличен 6");
			}
		});
		button.setBounds(10, 299, 95, 23);
		contentPane.add(button);

		JButton button_1 = new JButton("\u0418\u0437\u0447\u0438\u0441\u0442\u0438");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rbc1.setSelected(false);
				rbs1.setSelected(false);
				rbc2.setSelected(false);
				rbs2.setSelected(false);
				rbc3.setSelected(false);
				rbs3.setSelected(false);
				rbc4.setSelected(false);
				rbs4.setSelected(false);
				rbc5.setSelected(false);
				rbs5.setSelected(false);
				rbc6.setSelected(false);
				rbs6.setSelected(false);
				rbc7.setSelected(false);
				rbs7.setSelected(false);
				rbc8.setSelected(false);
				rbs8.setSelected(false);
				rbc9.setSelected(false);
				rbs9.setSelected(false);
				rbc10.setSelected(false);
				rbs10.setSelected(false);
				rbc11.setSelected(false);
				rbs11.setSelected(false);
				rbc12.setSelected(false);
				rbs12.setSelected(false);
				rbc13.setSelected(false);
				rbs13.setSelected(false);
				rbc14.setSelected(false);
				rbs14.setSelected(false);
			}
		});
		button_1.setBounds(117, 299, 95, 23);
		contentPane.add(button_1);

		JButton button_2 = new JButton("\u0418\u0437\u0445\u043E\u0434");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		button_2.setBounds(329, 299, 95, 23);
		contentPane.add(button_2);

		JButton button_3 = new JButton("\u0420\u0435\u0441\u0442\u0430\u0440\u0442");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rbc1.setVisible(true);
				rbc1.setSelected(false);
				rbs1.setVisible(true);
				rbs1.setSelected(false);
				rbc2.setVisible(true);
				rbc2.setSelected(false);
				rbs2.setVisible(true);
				rbs2.setSelected(false);
				rbc3.setVisible(true);
				rbc3.setSelected(false);
				rbs3.setVisible(true);
				rbs3.setSelected(false);
				rbc4.setVisible(true);
				rbc4.setSelected(false);
				rbs4.setVisible(true);
				rbs4.setSelected(false);
				rbc5.setVisible(true);
				rbc5.setSelected(false);
				rbs5.setVisible(true);
				rbs5.setSelected(false);
				rbc6.setVisible(true);
				rbc6.setSelected(false);
				rbs6.setVisible(true);
				rbs6.setSelected(false);
				rbc7.setVisible(true);
				rbc7.setSelected(false);
				rbs7.setVisible(true);
				rbs7.setSelected(false);
				rbc8.setVisible(true);
				rbc8.setSelected(false);
				rbs8.setVisible(true);
				rbs8.setSelected(false);
				rbc9.setVisible(true);
				rbc9.setSelected(false);
				rbs9.setVisible(true);
				rbs9.setSelected(false);
				rbc10.setVisible(true);
				rbc10.setSelected(false);
				rbs10.setVisible(true);
				rbs10.setSelected(false);
				rbc11.setVisible(true);
				rbc11.setSelected(false);
				rbs11.setVisible(true);
				rbs11.setSelected(false);
				rbc12.setVisible(true);
				rbc12.setSelected(false);
				rbs12.setVisible(true);
				rbs12.setSelected(false);
				rbc13.setVisible(true);
				rbc13.setSelected(false);
				rbs13.setVisible(true);
				rbs13.setSelected(false);
				rbc14.setVisible(true);
				rbc14.setSelected(false);
				rbs14.setVisible(true);
				rbs14.setSelected(false);
				p = 0;
				max = 0;
				lblr.setText("");
				lblg.setText("");
				lblGreetings.setText("");
			}
		});
		button_3.setBounds(223, 299, 95, 23);
		contentPane.add(button_3);
	}
}