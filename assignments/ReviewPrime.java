package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReviewPrime {

	private JFrame frame;
	private JTextField input;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReviewPrime window = new ReviewPrime();
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
	public ReviewPrime() {
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 76, 414, 174);
		frame.getContentPane().add(scrollPane);
		
		JTextArea output = new JTextArea();
		output.setEditable(false);
		scrollPane.setViewportView(output);
		
		input = new JTextField();
		input.setBounds(10, 11, 414, 20);
		frame.getContentPane().add(input);
		input.setColumns(10);
		
		JButton calculate = new JButton("determine");
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				output.setText(null);
				
				int num = Integer.parseInt(input.getText());
				int process = (num / 2);
				for (int i = 1; i <= process; i++) {
					
					if (num % i == 0) {
						
						output.append(num + " is divisable by: " + i + "\n");
					}
				}
			}
		});
		calculate.setBounds(10, 42, 414, 23);
		frame.getContentPane().add(calculate);
	}
}
