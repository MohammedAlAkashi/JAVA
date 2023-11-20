package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReviewFactorial {

	private JFrame frame;
	private JTextField input;
	private JTextField output;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReviewFactorial window = new ReviewFactorial();
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
	public ReviewFactorial() {
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
		
		input = new JTextField();
		input.setBounds(74, 108, 86, 20);
		frame.getContentPane().add(input);
		input.setColumns(10);
		
		JButton calculate = new JButton("calculate");
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num = Integer.parseInt(input.getText());
				int process = 1;
				if (!(num < 0)) {
					if ((num == 1) || (num == 0)) {
						output.setText("1");
					}
					for (int i = 1; i < num; i++) {
						
						process = (process * (i + 1));
						output.setText("" + process);
					}
				}
				else {
					
					JOptionPane.showMessageDialog(null, "Enter value greater than 0");
					
				}
			}
		});
		calculate.setBounds(170, 107, 89, 23);
		frame.getContentPane().add(calculate);
		
		output = new JTextField();
		output.setBounds(269, 108, 86, 20);
		frame.getContentPane().add(output);
		output.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Factorial");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(170, 11, 89, 14);
		frame.getContentPane().add(lblNewLabel);
	}
}
