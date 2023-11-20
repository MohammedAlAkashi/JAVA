package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTable;

public class sleepGUI {

	private JFrame frame;
	private static JTextField txtEnterAgeIn;
	private static JTextField ageAmount;
	private static JTextField txtYearsSlept;
	private static JTextField txtMonthsSlept;
	private static JTextField txtDaysSlept;
	private static JTextField txtHoursSlept;
	private static JTextField yearSlept;
	private static JTextField monthSlept;
	private static JTextField daySlept;
	private static JTextField hourSlept;
	private static JTextField status;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sleepGUI window = new sleepGUI();
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
	public sleepGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBounds(100, 100, 449, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtEnterAgeIn = new JTextField();
		txtEnterAgeIn.setEditable(false);
		txtEnterAgeIn.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtEnterAgeIn.setText("Enter age in years:");
		txtEnterAgeIn.setBounds(10, 11, 249, 36);
		frame.getContentPane().add(txtEnterAgeIn);
		txtEnterAgeIn.setColumns(10);
		
		ageAmount = new JTextField();
		ageAmount.setFont(new Font("Tahoma", Font.BOLD, 20));
		ageAmount.setBounds(276, 11, 148, 36);
		frame.getContentPane().add(ageAmount);
		ageAmount.setColumns(10);
		
		txtYearsSlept = new JTextField();
		txtYearsSlept.setEditable(false);
		txtYearsSlept.setHorizontalAlignment(SwingConstants.CENTER);
		txtYearsSlept.setText("Years Slept:");
		txtYearsSlept.setFont(new Font("Tahoma", Font.BOLD, 19));
		txtYearsSlept.setBounds(10, 58, 148, 29);
		frame.getContentPane().add(txtYearsSlept);
		txtYearsSlept.setColumns(10);
		
		txtMonthsSlept = new JTextField();
		txtMonthsSlept.setText("Months Slept:");
		txtMonthsSlept.setHorizontalAlignment(SwingConstants.CENTER);
		txtMonthsSlept.setFont(new Font("Tahoma", Font.BOLD, 19));
		txtMonthsSlept.setEditable(false);
		txtMonthsSlept.setColumns(10);
		txtMonthsSlept.setBounds(10, 98, 148, 29);
		frame.getContentPane().add(txtMonthsSlept);
		
		txtDaysSlept = new JTextField();
		txtDaysSlept.setText("Days Slept:");
		txtDaysSlept.setHorizontalAlignment(SwingConstants.CENTER);
		txtDaysSlept.setFont(new Font("Tahoma", Font.BOLD, 19));
		txtDaysSlept.setEditable(false);
		txtDaysSlept.setColumns(10);
		txtDaysSlept.setBounds(10, 138, 148, 29);
		frame.getContentPane().add(txtDaysSlept);
		
		txtHoursSlept = new JTextField();
		txtHoursSlept.setText("Hours Slept:");
		txtHoursSlept.setHorizontalAlignment(SwingConstants.CENTER);
		txtHoursSlept.setFont(new Font("Tahoma", Font.BOLD, 19));
		txtHoursSlept.setEditable(false);
		txtHoursSlept.setColumns(10);
		txtHoursSlept.setBounds(10, 176, 148, 29);
		frame.getContentPane().add(txtHoursSlept);
		
		yearSlept = new JTextField();
		yearSlept.setFont(new Font("Tahoma", Font.BOLD, 20));
		yearSlept.setEditable(false);
		yearSlept.setBounds(168, 58, 131, 29);
		frame.getContentPane().add(yearSlept);
		yearSlept.setColumns(10);
		
		monthSlept = new JTextField();
		monthSlept.setBackground(new Color(255, 255, 255));
		monthSlept.setFont(new Font("Tahoma", Font.BOLD, 20));
		monthSlept.setEditable(false);
		monthSlept.setColumns(10);
		monthSlept.setBounds(168, 98, 131, 29);
		frame.getContentPane().add(monthSlept);
		
		daySlept = new JTextField();
		daySlept.setFont(new Font("Tahoma", Font.BOLD, 20));
		daySlept.setEditable(false);
		daySlept.setColumns(10);
		daySlept.setBounds(168, 138, 131, 29);
		frame.getContentPane().add(daySlept);
		
		hourSlept = new JTextField();
		hourSlept.setFont(new Font("Tahoma", Font.BOLD, 20));
		hourSlept.setEditable(false);
		hourSlept.setColumns(10);
		hourSlept.setBounds(168, 176, 131, 29);
		frame.getContentPane().add(hourSlept);
		
		JButton calculate = new JButton("Calculate");
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				status.setText("Waiting...");
				yearSlept.setText(null);
				monthSlept.setText(null);
				daySlept.setText(null);
				hourSlept.setText(null);
				
				double age;
				double dayInAYear = 365;
				double hoursInADay = 24;
				Scanner sc = new Scanner(System.in);
				System.out.println("enter your age in years:");
				age = Double.parseDouble(ageAmount.getText());
				double ageInDays = (dayInAYear * age);
				double hoursInTotal = (hoursInADay* ageInDays);
				double hoursSlept = (hoursInTotal * 0.3);
				double daysSlept = (hoursSlept / 24);
				double yearsSlept = (daysSlept / 365);
				double monthsSlept = (yearsSlept * 12);
				
				status.setText("Processing...");
				yearSlept.setText(Double.toString(Math.round(yearsSlept)));
				monthSlept.setText(Double.toString(Math.round(monthsSlept)));
				daySlept.setText(Double.toString(Math.round(daysSlept)));
				hourSlept.setText(Double.toString(Math.round(hoursSlept)));
				
				System.out.println(ageInDays);
				System.out.println(hoursInTotal);
				System.out.println("amount of hours you slept: " + hoursSlept + " hours");
				System.out.println("amount of days you slept: " + daysSlept + " days");
				System.out.println("amount of months you slept: " + monthsSlept + " months");
				System.out.println("amount of years slept: " + yearsSlept + " years");
				status.setText("Done...");
				
			}
		});
		calculate.setFont(new Font("Tahoma", Font.BOLD, 20));
		calculate.setBounds(10, 216, 131, 34);
		frame.getContentPane().add(calculate);
		
		JButton exit = new JButton("Exit");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		exit.setFont(new Font("Tahoma", Font.BOLD, 20));
		exit.setBounds(293, 216, 131, 34);
		frame.getContentPane().add(exit);
		
		status = new JTextField();
		status.setFont(new Font("Tahoma", Font.BOLD, 20));
		status.setHorizontalAlignment(SwingConstants.CENTER);
		status.setText("Waiting...");
		status.setEditable(false);
		status.setBounds(151, 216, 132, 34);
		frame.getContentPane().add(status);
		status.setColumns(10);
		
	}
}
