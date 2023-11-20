package assignments;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class U2A2_2DArrays {

	private JFrame frame;
	private JTextField firstName;
	private JTextField lastName;
	private JTextField test1;
	private JTextField test2;
	private JTextField test3;
	private JTextField test4;
	private static int count = 0;
	private static String[][] names = new String[15][2];
	private static double[][] grades = new double[15][4];
	

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U2A2_2DArrays window = new U2A2_2DArrays();
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
	
	public U2A2_2DArrays() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 593, 467);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First name");
		lblNewLabel.setBounds(10, 42, 62, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last name");
		lblLastName.setBounds(198, 42, 115, 14);
		frame.getContentPane().add(lblLastName);
		
		firstName = new JTextField();
		firstName.setBounds(92, 39, 96, 20);
		frame.getContentPane().add(firstName);
		firstName.setColumns(10);
		
		lastName = new JTextField();
		lastName.setColumns(10);
		lastName.setBounds(280, 39, 96, 20);
		frame.getContentPane().add(lastName);
		
		JLabel lblTest = new JLabel("Test 1");
		lblTest.setBounds(28, 104, 50, 14);
		frame.getContentPane().add(lblTest);
		
		JLabel lblTest_1 = new JLabel("Test 2");
		lblTest_1.setBounds(28, 129, 50, 14);
		frame.getContentPane().add(lblTest_1);
		
		JLabel lblTest_2 = new JLabel("Test 3");
		lblTest_2.setBounds(28, 154, 50, 14);
		frame.getContentPane().add(lblTest_2);
		
		JLabel lblTest_3 = new JLabel("Test 4");
		lblTest_3.setBounds(28, 179, 50, 14);
		frame.getContentPane().add(lblTest_3);
		
		test1 = new JTextField();
		test1.setColumns(10);
		test1.setBounds(92, 101, 50, 20);
		frame.getContentPane().add(test1);
		
		test2 = new JTextField();
		test2.setColumns(10);
		test2.setBounds(92, 126, 50, 20);
		frame.getContentPane().add(test2);
		
		test3 = new JTextField();
		test3.setColumns(10);
		test3.setBounds(92, 151, 50, 20);
		frame.getContentPane().add(test3);
		
		test4 = new JTextField();
		test4.setColumns(10);
		test4.setBounds(92, 176, 50, 20);
		frame.getContentPane().add(test4);
		
		JTextArea output = new JTextArea();
		output.setBorder(new LineBorder(new Color(0, 0, 0)));
		output.setBounds(20, 204, 542, 213);
		frame.getContentPane().add(output);
		
		JButton Add = new JButton("Add");
		Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// adds the names and grades of the person into an array
				// "count" to know which index to use to put new data in.
				
				try {
					
					double myInt1 = Double.parseDouble(test1.getText());
					double myInt2 = Double.parseDouble(test2.getText());
					double myInt3 = Double.parseDouble(test3.getText());
					double myInt4 = Double.parseDouble(test4.getText());
					System.out.println("nope");
					String fName = firstName.getText();
					String lName = lastName.getText();
					names[count][0] = fName;
					names[count][1] = lName;
					grades[count][0] = myInt1;
					grades[count][1] = myInt2;
					grades[count][2] = myInt3;
					grades[count][3] = myInt4;	
					System.out.println(count);
					count++;

				} catch(java.lang.NumberFormatException e) {
					JOptionPane.showMessageDialog(Add, "empty box, fill in the text box's");
					System.out.println("empty");
					
				}
			}
		});
		Add.setBounds(181, 100, 56, 23);
		frame.getContentPane().add(Add);
		
		JButton List = new JButton("List");
		List.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// spits out the grades of the Tests
				
				output.setText(null);
				
				// indents the data for looks.
				
				output.append(" First Name\tLast Name\tTest 1\tTest 2\tTest 3\tTest 4\n");
				
				for (int i = 0; i < names.length; i++) {
					
					if (names[i][0] == null) {
						// checks to see if the first name element is empty.
						break;
						
					}
					output.append(" " + names[i][0] + "\t" + names[i][1] + "\t" + grades[i][0] + "\t" + grades[i][1] + "\t" + grades[i][2] + "\t" + grades[i][3] + "\n");	
				}
			}
		});
		
		
		List.setBounds(181, 129, 56, 23);
		frame.getContentPane().add(List);
		
		JButton exit = new JButton("Exit");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		exit.setBounds(220, 175, 56, 23);
		frame.getContentPane().add(exit);
		
		JButton btnStudentAverage = new JButton("Student Average");
		btnStudentAverage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				output.setText(null);
				
				// for loop to find a person in a array
				
				String fName = firstName.getText();
				String lName = lastName.getText();
				
				int found = 0;
				for (int i = 0; i < names.length; i++) {
					if (names[i][0].contains(firstName.getText())) {
						// if it finds the first name it will try to find the last name.
						if (names[i][1].contains(lastName.getText())) {
							found++;
							if (found == 1) {
								
								String average = Double.toString(((grades[i][0] + grades[i][1] + grades[i][2] + grades[i][3])/4));
									
								System.out.println(names[i][0] + " " + names[i][1] + " was found in array " + i);		
								
								output.append(" Student: " + names[i][0] + " " + names[i][1] + " Average: " + average + "%\n");
									
							}
							i = names.length;	
						}
					}
				}
			}
		});
		btnStudentAverage.setBounds(280, 100, 144, 23);
		frame.getContentPane().add(btnStudentAverage);
		
		JButton btnTestAverage = new JButton("Test Average");
		btnTestAverage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// a large portion of text to find the average of all the tests.
				
				output.setText(null);
				double value = 0;
				int loop = 0;
				for (int i = 0; i < grades.length; i++) {
					double average = (grades[i][0]);
						
					value = (value + average);
					if (grades[i][0] == 0) {	
					}
					else {		
						loop++;	
					}
				}
				output.append("Test 1 Average: " + Math.round(value/loop) + "%\n");
				double value2 = 0;
				int loop2 = 0;
				for (int i = 0; i < grades.length; i++) {
					double average = (grades[i][1]);
						
					value2 = (value2 + average);
					if (grades[i][1] == 0) {	
					}
					else {		
						loop2++;	
					}
				}
				output.append("Test 2 Average: " + Math.round(value2/loop) + "%\n");
				double value3 = 0;
				int loop3 = 0;
				for (int i = 0; i < grades.length; i++) {
					double average = (grades[i][2]);
						
					value3 = (value3 + average);
					if (grades[i][2] == 0) {	
					}
					else {		
						loop3++;	
					}
				}
				output.append("Test 3 Average: " + Math.round(value3/loop) + "%\n");
				double value4 = 0;
				int loop4 = 0;
				for (int i = 0; i < grades.length; i++) {
					double average = (grades[i][3]);
						
					value4 = (value4 + average);
					if (grades[i][3] == 0) {	
					}
					else {		
						loop4++;	
					}
				}
				output.append("Test 4 Average: " + Math.round(value4/loop) + "%\n");
			}
		});
		btnTestAverage.setBounds(280, 129, 144, 23);
		frame.getContentPane().add(btnTestAverage);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 395, 385, -176);
		frame.getContentPane().add(textArea);
	}
}
