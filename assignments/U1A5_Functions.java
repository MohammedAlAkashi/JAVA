package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class U1A5_Functions {

	private JFrame frame;
	private JTextField sqrIn;
	private JTextField sqrOut;
	private JTextField expIn;
	private JTextField expOut;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U1A5_Functions window = new U1A5_Functions();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public U1A5_Functions() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 702, 354);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(10, 11, 205, 150);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Square Root");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 168, 14);
		panel.add(lblNewLabel);
		
		sqrIn = new JTextField();
		sqrIn.setBounds(20, 36, 158, 20);
		panel.add(sqrIn);
		sqrIn.setColumns(10);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Double input = Double.parseDouble(sqrIn.getText());
				sqrRoot(input);
				
			}

			private void sqrRoot(Double input) {
				// outputs the square root of a number given by the user.
				sqrOut.setText("" + Math.sqrt(input));
				
			}
		});
		btnNewButton.setBounds(10, 67, 89, 23);
		panel.add(btnNewButton);
		
		sqrOut = new JTextField();
		sqrOut.setEditable(false);
		sqrOut.setBounds(20, 104, 158, 20);
		panel.add(sqrOut);
		sqrOut.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(225, 11, 205, 150);
		frame.getContentPane().add(panel_1);
		
		JLabel lblExponentConverter = new JLabel("Exponent converter");
		lblExponentConverter.setHorizontalAlignment(SwingConstants.CENTER);
		lblExponentConverter.setBounds(10, 11, 168, 14);
		panel_1.add(lblExponentConverter);
		
		expIn = new JTextField();
		expIn.setColumns(10);
		expIn.setBounds(20, 36, 158, 20);
		panel_1.add(expIn);
		
		JButton expCalc = new JButton("Calculate");
		expCalc.setBounds(10, 67, 89, 23);
		panel_1.add(expCalc);
		
		expOut = new JTextField();
		expOut.setEditable(false);
		expOut.setColumns(10);
		expOut.setBounds(20, 104, 158, 20);
		panel_1.add(expOut);
	}
}
