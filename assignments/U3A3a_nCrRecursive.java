package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.DropMode;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class U3A3a_nCrRecursive {

	private JFrame frame;
	private JTextField first;
	private JTextField second;
	private JTextField output;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U3A3a_nCrRecursive window = new U3A3a_nCrRecursive();
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
	public U3A3a_nCrRecursive() {
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
		
		JLabel lblNewLabel = new JLabel("N choose R");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 414, 14);
		frame.getContentPane().add(lblNewLabel);
		
		first = new JTextField();
		first.setBounds(338, 90, 86, 20);
		frame.getContentPane().add(first);
		first.setColumns(10);
		
		second = new JTextField();
		second.setBounds(338, 121, 86, 20);
		frame.getContentPane().add(second);
		second.setColumns(10);
		
		JButton Calc = new JButton("Calculate");
		Calc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			       int text1 = Integer.parseInt(first.getText());
			       int text2 = Integer.parseInt(second.getText());
			       int r = factorial(text1);
			       int n = factorial(text2);
			       
			       
					int maths = (n - r);
					int multiply = (r * maths);
			        int calculation = (n / multiply);
			        
			        System.out.println("n: " + n);
			        System.out.println("r: " + r);
			        System.out.println("maths: " + maths);
			        System.out.println("multiply: " + multiply);
			        System.out.println("calculation: " + calculation);
			       
			        
				    output.setText("" + calculation);
				
			}

			private int factorial(int n) {
				
				int num;
				num = n;
				
				int process2 = 1;
				if (!(num < 0)) {
					if ((n == 1) || (n == 0)) {
						output.setText("1");
					}
					for (int i = 1; i < num; i++) {
						
						process2 = (process2 * (i + 1));
						output.setText("" + process2);
					}
				}
				
				return process2;
				
			}
		});
		Calc.setBounds(10, 152, 414, 23);
		frame.getContentPane().add(Calc);
		
		JTextArea txtrTheProgramCalculates = new JTextArea();
		txtrTheProgramCalculates.setLineWrap(true);
		txtrTheProgramCalculates.setText("The program calculates the number of ways R different objects can be chosen from a set of N objects");
		txtrTheProgramCalculates.setEditable(false);
		txtrTheProgramCalculates.setBounds(10, 36, 414, 74);
		frame.getContentPane().add(txtrTheProgramCalculates);
		
		output = new JTextField();
		output.setEditable(false);
		output.setBounds(10, 174, 414, 46);
		frame.getContentPane().add(output);
		output.setColumns(10);
	}
}
