package Lessons;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MethodGUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtFirstNumber;
	private JTextField txtSecondNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MethodGUI window = new MethodGUI();
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
	public MethodGUI() {
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
		
		textField = new JTextField();
		textField.setBounds(301, 36, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(301, 67, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(301, 138, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double firstnum = 0;
				double secondnum = 0;
				double answer = 0;
				try {
					
					firstnum = Double.parseDouble(textField.getText());
					secondnum = Double.parseDouble(textField_1.getText());
					
				}
				catch(Exception e) {
					
					JOptionPane.showMessageDialog(null, "invalid input try again");
					
				}
				answer = firstnum / secondnum;
				textField_2.setText(Double.toString(answer));
			}
		});
		btnNewButton.setBounds(42, 35, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SUBTRACT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double firstnum = 0;
				double secondnum = 0;
				double answer = 0;
				try {
					
					firstnum = Double.parseDouble(textField.getText());
					secondnum = Double.parseDouble(textField_1.getText());
					
				}
				catch(Exception e) {
					
					JOptionPane.showMessageDialog(null, "invalid input try again");
					
				}
				answer = firstnum / secondnum;
				textField_2.setText(Double.toString(answer));
			}
		});
		btnNewButton_1.setBounds(42, 69, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("MULTIPLY");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double firstnum = 0;
				double secondnum = 0;
				double answer = 0;
				try {
					
					firstnum = Double.parseDouble(textField.getText());
					secondnum = Double.parseDouble(textField_1.getText());
					
				}
				catch(Exception e) {
					
					JOptionPane.showMessageDialog(null, "invalid input try again");
					
				}
				answer = firstnum / secondnum;
				textField_2.setText(Double.toString(answer));
			}
		});
		btnNewButton_2.setBounds(42, 103, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("DIVIDE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double firstnum = 0;
				double secondnum = 0;
				double answer = 0;
				try {
					
					firstnum = Double.parseDouble(textField.getText());
					secondnum = Double.parseDouble(textField_1.getText());
					
				}
				catch(Exception e) {
					
					JOptionPane.showMessageDialog(null, "invalid input try again");
					
				}
				answer = firstnum / secondnum;
				textField_2.setText(Double.toString(answer));
			}
		});
		btnNewButton_3.setBounds(42, 137, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("EXIT");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton_4.setBounds(174, 227, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		txtFirstNumber = new JTextField();
		txtFirstNumber.setEditable(false);
		txtFirstNumber.setText("First number");
		txtFirstNumber.setBounds(205, 36, 86, 20);
		frame.getContentPane().add(txtFirstNumber);
		txtFirstNumber.setColumns(10);
		
		txtSecondNumber = new JTextField();
		txtSecondNumber.setEditable(false);
		txtSecondNumber.setText("Second number");
		txtSecondNumber.setBounds(205, 67, 107, 20);
		frame.getContentPane().add(txtSecondNumber);
		txtSecondNumber.setColumns(10);
		
		JButton btnNewButton_5 = new JButton("CLEAR");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText("");
				textField_1.setText(null);
				textField_2.setText(null);
				
			}
		});
		btnNewButton_5.setBounds(42, 171, 89, 23);
		frame.getContentPane().add(btnNewButton_5);
	}
}
