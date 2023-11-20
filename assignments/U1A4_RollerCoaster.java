package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class U1A4_RollerCoaster {

	private JFrame frame;
	private JTextField textBack;
	private JTextField textHeart;
	private JTextField textHeight;
	private JTextField txtHeartProblemsY;
	private JTextField txtHeightInCm;
	private JTextField txtBackproblems;
	private JTextField output;
	private JTextField txtRollercoasterRide;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U1A4_RollerCoaster window = new U1A4_RollerCoaster();
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
	public U1A4_RollerCoaster() {
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
		
		textBack = new JTextField();
		textBack.setBounds(296, 49, 86, 20);
		frame.getContentPane().add(textBack);
		textBack.setColumns(10);
		
		textHeart = new JTextField();
		textHeart.setColumns(10);
		textHeart.setBounds(296, 80, 86, 20);
		frame.getContentPane().add(textHeart);
		
		textHeight = new JTextField();
		textHeight.setColumns(10);
		textHeight.setBounds(296, 111, 86, 20);
		frame.getContentPane().add(textHeight);
		
		JButton calculate = new JButton("calculate");
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Do you have back problems? Y / N");
				String backproblems = textBack.getText();
				
				if((backproblems.equals("Y")) || (backproblems.equals("y"))) {
					
					System.out.println("Cant enter the ride");
					output.setText("cannot go on ride.");
					
				}
				else {
					System.out.println("Do you have heart problems? Y / N");
					String heartproblems = textHeart.getText();
					
					if((heartproblems.equals("Y")) | (heartproblems.contentEquals("y"))) {
						
						System.out.println("cant go on ride");
						output.setText("cant go on ride.");
						
					}
					
					else {
						
						System.out.println("Enter your height");
						double height = Double.parseDouble(textHeight.getText());
						
						if((height < 188) && (height > 122)) {
							
							System.out.println("can go on ride, enjoy");
							output.setText("can go on ride, enjoy");
						}
						
						else {
							
							System.out.println("cant go on ride");
							output.setText("cant go on ride");
							
						}
					}	
					
				}
			}
		});
		calculate.setBounds(80, 208, 89, 23);
		frame.getContentPane().add(calculate);
		
		JButton exit = new JButton("exit");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		exit.setBounds(260, 208, 89, 23);
		frame.getContentPane().add(exit);
		
		txtHeartProblemsY = new JTextField();
		txtHeartProblemsY.setHorizontalAlignment(SwingConstants.CENTER);
		txtHeartProblemsY.setText("heart problems? Y / N");
		txtHeartProblemsY.setEditable(false);
		txtHeartProblemsY.setColumns(10);
		txtHeartProblemsY.setBounds(80, 80, 140, 20);
		frame.getContentPane().add(txtHeartProblemsY);
		
		txtHeightInCm = new JTextField();
		txtHeightInCm.setHorizontalAlignment(SwingConstants.CENTER);
		txtHeightInCm.setText("height in cm?");
		txtHeightInCm.setEditable(false);
		txtHeightInCm.setColumns(10);
		txtHeightInCm.setBounds(80, 111, 140, 20);
		frame.getContentPane().add(txtHeightInCm);
		
		txtBackproblems = new JTextField();
		txtBackproblems.setHorizontalAlignment(SwingConstants.CENTER);
		txtBackproblems.setText("back problems? Y / N");
		txtBackproblems.setEditable(false);
		txtBackproblems.setColumns(10);
		txtBackproblems.setBounds(80, 49, 140, 20);
		frame.getContentPane().add(txtBackproblems);
		
		output = new JTextField();
		output.setEditable(false);
		output.setBounds(80, 167, 266, 20);
		frame.getContentPane().add(output);
		output.setColumns(10);
		
		txtRollercoasterRide = new JTextField();
		txtRollercoasterRide.setEditable(false);
		txtRollercoasterRide.setHorizontalAlignment(SwingConstants.CENTER);
		txtRollercoasterRide.setText("RollerCoaster Ride");
		txtRollercoasterRide.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtRollercoasterRide.setBounds(44, 11, 364, 27);
		frame.getContentPane().add(txtRollercoasterRide);
		txtRollercoasterRide.setColumns(10);
	}
}
