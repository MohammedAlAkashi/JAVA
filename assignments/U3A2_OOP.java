package assignments;

import java.awt.EventQueue;
import assignments.imports.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class U3A2_OOP {

	private JFrame frame;
	private JTextField employeeID;
	private JLabel lblFirstName;
	private JTextField firstName;
	private JLabel lblLastName;
	private JTextField lastName;
	private JLabel lblAnnualSalary;
	private JTextField annualSalary;
	private JLabel lblStartDate;
	private JTextField startDate;
	ArrayList<Employee> list = new ArrayList<Employee>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U3A2_OOP window = new U3A2_OOP();
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
	public U3A2_OOP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 626, 493);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee ID #:");
		lblNewLabel.setBounds(27, 59, 91, 14);
		frame.getContentPane().add(lblNewLabel);
		
		employeeID = new JTextField();
		employeeID.setBounds(128, 56, 179, 20);
		frame.getContentPane().add(employeeID);
		employeeID.setColumns(10);
		
		lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(27, 87, 91, 14);
		frame.getContentPane().add(lblFirstName);
		
		firstName = new JTextField();
		firstName.setColumns(10);
		firstName.setBounds(128, 84, 179, 20);
		frame.getContentPane().add(firstName);
		
		lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(27, 115, 91, 14);
		frame.getContentPane().add(lblLastName);
		
		lastName = new JTextField();
		lastName.setColumns(10);
		lastName.setBounds(128, 112, 179, 20);
		frame.getContentPane().add(lastName);
		
		lblAnnualSalary = new JLabel("Annual Salary");
		lblAnnualSalary.setBounds(27, 143, 91, 14);
		frame.getContentPane().add(lblAnnualSalary);
		
		annualSalary = new JTextField();
		annualSalary.setColumns(10);
		annualSalary.setBounds(128, 140, 179, 20);
		frame.getContentPane().add(annualSalary);
		
		lblStartDate = new JLabel("Start Date");
		lblStartDate.setBounds(27, 171, 91, 14);
		frame.getContentPane().add(lblStartDate);
		
		startDate = new JTextField();
		startDate.setColumns(10);
		startDate.setBounds(128, 168, 179, 20);
		frame.getContentPane().add(startDate);
		
		JButton add = new JButton("Add");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String ID = employeeID.getText();
				String first = firstName.getText();
				String last = lastName.getText();
				String salary = annualSalary.getText();
				String start = startDate.getText();
				
				list.add(new Employee(first, last, ID, salary, start));
				System.out.println(ID + " " + first + " " + last + " " + salary + " " + start);
//				Employee Employee = new Employee(first, last, ID, salary, start);
				
			}
		});
		add.setBounds(336, 83, 89, 23);
		frame.getContentPane().add(add);
		
		JButton remove = new JButton("Remove");
		remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String ID = employeeID.getText();
				for (int i = 0; i < list.size(); i++) {
					
					if (list.get(i).getEmployeeID().contains(ID)) {
						
						System.out.println("YES");
						list.remove(i);
						
					}
					else {
					}
				}
			}
		});
		remove.setBounds(336, 115, 89, 23);
		frame.getContentPane().add(remove);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 199, 590, 244);
		frame.getContentPane().add(scrollPane);
		
		JTextArea output = new JTextArea();
		scrollPane.setViewportView(output);
		
		JButton btnList = new JButton("List");
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				output.setText(null);
				output.append("Employee ID\tFirst Name\tLast Name\tSalary\tStart\n");
				for (int i = 0; i < list.size(); i++) {
					
					output.append(list.get(i).getEmployeeID() + "\t" + list.get(i).getFirstName() + "\t" + list.get(i).getLastName() + "\t" + list.get(i).getAnnualSalary() + "\t" + list.get(i).getStartDate() + "\n");
					
				}
			}
		});
		btnList.setBounds(336, 149, 89, 23);
		frame.getContentPane().add(btnList);
		
		JLabel lblNewLabel_1 = new JLabel("Complete all Fields (required)");
		lblNewLabel_1.setBounds(435, 87, 165, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ID# Required (only)");
		lblNewLabel_1_1.setBounds(435, 119, 165, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Display all employees");
		lblNewLabel_1_1_1.setBounds(435, 153, 165, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Employee Records");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(27, 11, 561, 39);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
