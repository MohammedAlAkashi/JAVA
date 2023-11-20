package lessons;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class radioButtons {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					radioButtons window = new radioButtons();
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
	public radioButtons() {
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
		
		JRadioButton radioButton1 = new JRadioButton("New radio button");
		radioButton1.setBounds(6, 7, 109, 23);
		frame.getContentPane().add(radioButton1);
		
		JRadioButton radioButton2 = new JRadioButton("New radio button");
		radioButton2.setBounds(6, 33, 109, 23);
		frame.getContentPane().add(radioButton2);
		
		JRadioButton radioButton3 = new JRadioButton("New radio button");
		radioButton3.setBounds(6, 59, 109, 23);
		frame.getContentPane().add(radioButton3);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(164, 11, 260, 239);
		frame.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("click me");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (radioButton1.isSelected()) {
					textArea.setText("button 1 clicked");
				}
				else if (radioButton2.isSelected()) {
					textArea.setText("button 2 clicked");
				}
				else if (radioButton3.isSelected()) {
					textArea.setText("button 3 clicked");
				}
				else {
					textArea.setText("Radio button not selected.");
				}
			}
		});
		btnNewButton.setBounds(6, 89, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		radioButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (radioButton1.isSelected()) {
					radioButton2.setSelected(false);
					radioButton3.setSelected(false);
				}
				if (radioButton1.isSelected() == false) {
					
					radioButton1.setSelected(true);
					
				}
			}
		});
		
		radioButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (radioButton2.isSelected()) {
					radioButton1.setSelected(false);
					radioButton3.setSelected(false);
				}
				if (radioButton2.isSelected() == false) {
					
					radioButton2.setSelected(true);
					
				}
			}
		});
		
		radioButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (radioButton3.isSelected()) {
					radioButton2.setSelected(false);
					radioButton1.setSelected(false);
				}
				if (radioButton3.isSelected() == false) {
					
					radioButton3.setSelected(true);
					
				}
			}
		});
		
	}
}
