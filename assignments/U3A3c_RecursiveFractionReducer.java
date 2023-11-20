package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class U3A3c_RecursiveFractionReducer {

	private JFrame frame;
	private JTextField input1;
	private JTextField input2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U3A3c_RecursiveFractionReducer window = new U3A3c_RecursiveFractionReducer();
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
	public U3A3c_RecursiveFractionReducer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("numerator");
		lblNewLabel.setBounds(10, 11, 68, 14);
		frame.getContentPane().add(lblNewLabel);
		
		input1 = new JTextField();
		input1.setBounds(101, 8, 86, 20);
		frame.getContentPane().add(input1);
		input1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("denominator");
		lblNewLabel_1.setBounds(10, 49, 86, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		input2 = new JTextField();
		input2.setBounds(101, 46, 86, 20);
		frame.getContentPane().add(input2);
		input2.setColumns(10);
	}
}
