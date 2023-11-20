package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class U3A3b_FibonacciRecurisive {

	private JFrame frame;
	private JTextField txtFibonacciNumbers;
	private JTextField input;
	private JTextField output;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U3A3b_FibonacciRecurisive window = new U3A3b_FibonacciRecurisive();
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
	public U3A3b_FibonacciRecurisive() {
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
		
		txtFibonacciNumbers = new JTextField();
		txtFibonacciNumbers.setEditable(false);
		txtFibonacciNumbers.setFont(new Font("Tahoma", Font.PLAIN, 28));
		txtFibonacciNumbers.setText("Fibonacci Numbers");
		txtFibonacciNumbers.setHorizontalAlignment(SwingConstants.CENTER);
		txtFibonacciNumbers.setBounds(10, 11, 414, 38);
		frame.getContentPane().add(txtFibonacciNumbers);
		txtFibonacciNumbers.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Fibonacci term");
		lblNewLabel.setBounds(136, 111, 90, 14);
		frame.getContentPane().add(lblNewLabel);
		
		input = new JTextField();
		input.setBounds(249, 108, 86, 20);
		frame.getContentPane().add(input);
		input.setColumns(10);
		
		JButton calc = new JButton("calculate");
		calc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int number = Integer.parseInt(input.getText());
				
				int order = 0;
				int loop = 0;
				int i = 1;
				int first = 1;
				int second = 1;
				int recursion = 0;
				int total = 0;
				
				
				output.setText("" + fibonacci(number));
			}

			private int fibonacci(int number) {
	
				if (number == 0) {
					
					return -1;
					
				}
				
				else if (number == 1) {
					
					return 0;
					
				}
				
				else if (number == 2) {
					
					return 1;
					
				}
				return (fibonacci(number - 2) + (fibonacci(number - 1)));
			}
		});
		calc.setBounds(175, 146, 89, 23);
		frame.getContentPane().add(calc);
		
		output = new JTextField();
		output.setEditable(false);
		output.setHorizontalAlignment(SwingConstants.CENTER);
		output.setBounds(10, 180, 414, 70);
		frame.getContentPane().add(output);
		output.setColumns(10);
	}
}
