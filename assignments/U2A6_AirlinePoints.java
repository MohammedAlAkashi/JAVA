package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class U2A6_AirlinePoints {

	private JFrame frame;
	private JTextField firstName;
	private JTextField lastName;
	private JTextField week1;
	private JTextField week2;
	private JTextField week3;
	private JTextField week4;
	
	private static ArrayList<String> first = new ArrayList();
	private static ArrayList<String> last = new ArrayList();
	private static ArrayList<Integer> firstWeek = new ArrayList();
	private static ArrayList<Integer> secondWeek = new ArrayList();
	private static ArrayList<Integer> thirdWeek = new ArrayList();
	private static ArrayList<Integer> fourthWeek = new ArrayList();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U2A6_AirlinePoints window = new U2A6_AirlinePoints();
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
	public U2A6_AirlinePoints() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 706, 458);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name: ");
		lblNewLabel.setBounds(462, 11, 102, 14);
		frame.getContentPane().add(lblNewLabel);
		
		firstName = new JTextField();
		firstName.setBounds(543, 8, 137, 20);
		frame.getContentPane().add(firstName);
		firstName.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name: ");
		lblLastName.setBounds(462, 36, 102, 14);
		frame.getContentPane().add(lblLastName);
		
		JLabel lblWeek = new JLabel("Week 1:");
		lblWeek.setBounds(10, 71, 102, 14);
		frame.getContentPane().add(lblWeek);
		
		JLabel lblWeek_1 = new JLabel("Week 2:");
		lblWeek_1.setBounds(10, 96, 102, 14);
		frame.getContentPane().add(lblWeek_1);
		
		JLabel btnweek3 = new JLabel("Week 3:");
		btnweek3.setBounds(10, 121, 102, 14);
		frame.getContentPane().add(btnweek3);
		
		JLabel btnweek4 = new JLabel("Week 4:");
		btnweek4.setBounds(10, 146, 102, 14);
		frame.getContentPane().add(btnweek4);
		
		lastName = new JTextField();
		lastName.setColumns(10);
		lastName.setBounds(543, 36, 137, 20);
		frame.getContentPane().add(lastName);
		
		week1 = new JTextField();
		week1.setBounds(73, 68, 86, 20);
		frame.getContentPane().add(week1);
		week1.setColumns(10);
		
		week2 = new JTextField();
		week2.setColumns(10);
		week2.setBounds(73, 93, 86, 20);
		frame.getContentPane().add(week2);
		
		week3 = new JTextField();
		week3.setColumns(10);
		week3.setBounds(73, 118, 86, 20);
		frame.getContentPane().add(week3);
		
		week4 = new JTextField();
		week4.setColumns(10);
		week4.setBounds(73, 143, 86, 20);
		frame.getContentPane().add(week4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 171, 670, 237);
		frame.getContentPane().add(scrollPane);
		
		JTextArea output = new JTextArea();
		scrollPane.setViewportView(output);
		output.setBackground(new Color(210, 203, 172));
		
		JButton add = new JButton("Add");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first.add(firstName.getText());
				last.add(lastName.getText());
				firstWeek.add(Integer.parseInt(week1.getText()));
				secondWeek.add(Integer.parseInt(week2.getText()));
				thirdWeek.add(Integer.parseInt(week3.getText()));
				fourthWeek.add(Integer.parseInt(week4.getText()));
				
			}
		});
		add.setBounds(578, 67, 102, 23);
		frame.getContentPane().add(add);
		
		JButton list = new JButton("List");
		list.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				output.setText(null);
				output.append(" First Name\tLast Name\tWeek 1\tWeek 2\tWeek 3\tWeek 4\tBonus\n");
				for	(int i = 0; i < first.size(); i++) {
					if (firstWeek.get(i) + secondWeek.get(i) + thirdWeek.get(i) + fourthWeek.get(i) >= 5000) {
						
						output.append(" " + first.get(i) + "\t" + last.get(i) + "\t" + firstWeek.get(i) + "\t" + secondWeek.get(i) + "\t" + thirdWeek.get(i) + "\t" + fourthWeek.get(i) + "\t1000\n");
						
					}
					else {
					
						output.append(" " + first.get(i) + "\t" + last.get(i) + "\t" + firstWeek.get(i) + "\t" + secondWeek.get(i) + "\t" + thirdWeek.get(i) + "\t" + fourthWeek.get(i) + "\t0\n");
						
					}
				}
			}
		});
		list.setBounds(578, 92, 102, 23);
		frame.getContentPane().add(list);
		
		JButton totalPoints = new JButton("Total Points");
		totalPoints.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				output.setText(null);
				for (int i = 0; i < first.size(); i++) {
					double total = (firstWeek.get(i) + secondWeek.get(i) + thirdWeek.get(i) + fourthWeek.get(i));
					if (total >= 5000) {
						output.append(" " + first.get(i) + "'s\tTotal Points are: " + total + "\tBonus: 1000\n");
					}
					else {
						
						output.append(" " + first.get(i) + "'s\tTotal Points are: " + total + "\tBonus: 0\n");
						
					}
					
				}
			}
		});
		totalPoints.setBounds(578, 117, 102, 23);
		frame.getContentPane().add(totalPoints);
		
		JButton exit = new JButton("exit");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		exit.setBounds(578, 142, 102, 23);
		frame.getContentPane().add(exit);
	}
}
