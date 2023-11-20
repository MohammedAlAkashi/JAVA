package Lessons;

import java.awt.EventQueue;
import javax.swing.JPanel;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class changeGUI {

	private JFrame frame;
	private JTextField txtChange;
	private JTextField txtAmount;
	private JTextField txtToonies;
	private JTextField txtLonnies;
	private JTextField txtQuarters;
	private static JTextField textFieldToonie;
	private static JTextField textFieldLoonie;
	private static JTextField textFieldQuarter;
	private static JTextField txtDimes;
	private static JTextField txtLoonies;
	private static JTextField txtPennies;
	private static JTextField textFieldDime;
	private static JTextField textFieldNickel;
	private static JTextField textFieldPennie;
	private static JTextField amount;
	private static JTextField amountLeft;
	private static JTextField status;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					changeGUI window = new changeGUI();
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
	public changeGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	
	private void initialize() {
		
		
		
		frame = new JFrame();
		frame.setBackground(new Color(240, 240, 240));
		frame.getContentPane().setBackground(new Color(0, 128, 192));
		frame.setBounds(100, 100, 582, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton calculate = new JButton("Calculate");
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// declaring variables
				int toonie = 0;
				int loonie = 0;
				int quarter = 0;
				int dime = 0;
				int nickel = 0;
				int pennie = 0;
				
				// resets the value, so that in any scenario, the values wont add up to the previous one.
				textFieldToonie.setText(null);
				textFieldLoonie.setText(null);
				textFieldQuarter.setText(null);
				textFieldDime.setText(null);
				textFieldNickel.setText(null);
				textFieldPennie.setText(null);
				amountLeft.setText(null);
				String unRefinedValue = txtAmount.getText();
				double change;
				change = Double.parseDouble(unRefinedValue);
				try {
						
					if (change < 0.01) {
						final JPanel panel = new JPanel();
						JOptionPane.showMessageDialog(panel, "Please input a value equal to or more than 1 cent", "Error", JOptionPane.ERROR_MESSAGE);
						
					}
					else {
						toonies(change, toonie, loonie, quarter, dime, nickel, pennie);
						System.out.println(change);
					}
						
						
				}catch(Exception f){
						
					System.out.println(f);
						
				}	

				
				// sending all the variables to the method.
			}
		});
		calculate.setFont(new Font("Tahoma", Font.BOLD, 20));
		calculate.setBounds(10, 209, 128, 44);
		frame.getContentPane().add(calculate);
		
		txtChange = new JTextField();
		txtChange.setEditable(false);
		txtChange.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtChange.setHorizontalAlignment(SwingConstants.CENTER);
		txtChange.setText("Change:");
		txtChange.setBounds(10, 10, 128, 29);
		frame.getContentPane().add(txtChange);
		txtChange.setColumns(10);
		
		txtAmount = new JTextField();
		txtAmount.setHorizontalAlignment(SwingConstants.CENTER);
		txtAmount.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtAmount.setColumns(10);
		txtAmount.setBounds(148, 10, 128, 29);
		frame.getContentPane().add(txtAmount);
		
		txtToonies = new JTextField();
		txtToonies.setText("Toonie(s):");
		txtToonies.setHorizontalAlignment(SwingConstants.CENTER);
		txtToonies.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtToonies.setEditable(false);
		txtToonies.setColumns(10);
		txtToonies.setBounds(10, 66, 128, 29);
		frame.getContentPane().add(txtToonies);
		
		txtLonnies = new JTextField();
		txtLonnies.setText("Lonnie(s):");
		txtLonnies.setHorizontalAlignment(SwingConstants.CENTER);
		txtLonnies.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtLonnies.setEditable(false);
		txtLonnies.setColumns(10);
		txtLonnies.setBounds(10, 105, 128, 29);
		frame.getContentPane().add(txtLonnies);
		
		txtQuarters = new JTextField();
		txtQuarters.setText("Quarter(s):");
		txtQuarters.setHorizontalAlignment(SwingConstants.CENTER);
		txtQuarters.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtQuarters.setEditable(false);
		txtQuarters.setColumns(10);
		txtQuarters.setBounds(10, 144, 128, 29);
		frame.getContentPane().add(txtQuarters);
		
		textFieldToonie = new JTextField();
		textFieldToonie.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldToonie.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFieldToonie.setEditable(false);
		textFieldToonie.setColumns(10);
		textFieldToonie.setBounds(148, 66, 80, 29);
		frame.getContentPane().add(textFieldToonie);
		
		textFieldLoonie = new JTextField();
		textFieldLoonie.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldLoonie.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFieldLoonie.setEditable(false);
		textFieldLoonie.setColumns(10);
		textFieldLoonie.setBounds(148, 105, 80, 29);
		frame.getContentPane().add(textFieldLoonie);
		
		textFieldQuarter = new JTextField();
		textFieldQuarter.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldQuarter.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFieldQuarter.setEditable(false);
		textFieldQuarter.setColumns(10);
		textFieldQuarter.setBounds(148, 144, 80, 29);
		frame.getContentPane().add(textFieldQuarter);
		
		txtDimes = new JTextField();
		txtDimes.setText("Dime(s):");
		txtDimes.setHorizontalAlignment(SwingConstants.CENTER);
		txtDimes.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtDimes.setEditable(false);
		txtDimes.setColumns(10);
		txtDimes.setBounds(264, 66, 128, 29);
		frame.getContentPane().add(txtDimes);
		
		txtLoonies = new JTextField();
		txtLoonies.setText("Nickel(s):");
		txtLoonies.setHorizontalAlignment(SwingConstants.CENTER);
		txtLoonies.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtLoonies.setEditable(false);
		txtLoonies.setColumns(10);
		txtLoonies.setBounds(264, 105, 128, 29);
		frame.getContentPane().add(txtLoonies);
		
		txtPennies = new JTextField();
		txtPennies.setText("Pennie(s):");
		txtPennies.setHorizontalAlignment(SwingConstants.CENTER);
		txtPennies.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtPennies.setEditable(false);
		txtPennies.setColumns(10);
		txtPennies.setBounds(264, 144, 128, 29);
		frame.getContentPane().add(txtPennies);
		
		textFieldDime = new JTextField();
		textFieldDime.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldDime.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFieldDime.setEditable(false);
		textFieldDime.setColumns(10);
		textFieldDime.setBounds(402, 66, 80, 29);
		frame.getContentPane().add(textFieldDime);
		
		textFieldNickel = new JTextField();
		textFieldNickel.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldNickel.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFieldNickel.setEditable(false);
		textFieldNickel.setColumns(10);
		textFieldNickel.setBounds(402, 105, 80, 29);
		frame.getContentPane().add(textFieldNickel);
		
		textFieldPennie = new JTextField();
		textFieldPennie.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPennie.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFieldPennie.setEditable(false);
		textFieldPennie.setColumns(10);
		textFieldPennie.setBounds(402, 144, 80, 29);
		frame.getContentPane().add(textFieldPennie);
		
		amount = new JTextField();
		amount.setText("Amount Left:");
		amount.setHorizontalAlignment(SwingConstants.CENTER);
		amount.setFont(new Font("Tahoma", Font.BOLD, 20));
		amount.setEditable(false);
		amount.setColumns(10);
		amount.setBounds(177, 209, 185, 44);
		frame.getContentPane().add(amount);
		
		amountLeft = new JTextField();
		amountLeft.setEditable(false);
		amountLeft.setHorizontalAlignment(SwingConstants.CENTER);
		amountLeft.setFont(new Font("Tahoma", Font.BOLD, 15));
		amountLeft.setColumns(10);
		amountLeft.setBounds(374, 209, 146, 44);
		frame.getContentPane().add(amountLeft);
		
		status = new JTextField();
		status.setEditable(false);
		status.setFont(new Font("Tahoma", Font.BOLD, 20));
		status.setHorizontalAlignment(SwingConstants.CENTER);
		status.setText("Waiting...");
		status.setBounds(332, 10, 188, 29);
		frame.getContentPane().add(status);
		status.setColumns(10);
	}
	private static void toonies(double change, int toonie, int loonie, int quarter, int dime, int nickel, int pennie) {
		// first part of the process, deals with the largest amount of money.
		status.setText("Processing...");
		if (change >= 2) {
			// if there is enough money to make a toonie, it just adds it to the collection. collection as in the variables like Toonies, Loonies, Quarters
			change = change - 2;
			toonie++;
			// outputs the data.
			amountLeft.setText(Double.toString(change));
			textFieldToonie.setText(Integer.toString(toonie));
			
			System.out.println("works");
			System.out.println(change);
			System.out.println("toonies: " + toonie);
			toonies(change, toonie, loonie, quarter, dime, nickel, pennie);
			
			
		}
		else {
			// if they have less than $2
			System.out.println("next currency");
			loonies(change, toonie, loonie, quarter, dime, nickel, pennie);
		}
	
	}

	private static void loonies(double change, int toonie, int loonie, int quarter, int dime, int nickel, int pennie) {
		// second part of the process, deals with the second largest amount of money.
		// if there is enough money to make a toonie, it just adds it to the collection. collection as in the variables like Toonies, Loonies, Quarters
		if (change >= 1) {
			change = change - 1;
			loonie++;
			amountLeft.setText(Double.toString(change));
			textFieldLoonie.setText(Integer.toString(loonie));
			
			System.out.println("works");
			System.out.println(change);
			System.out.println("toonies: " + toonie);
			System.out.println("loonies: " + loonie);
			loonies(change,  toonie, loonie, quarter, dime, nickel, pennie);
			
			
		}
		else {
			
			System.out.println("next currency");
			quarters(change, toonie, loonie, quarter, dime, nickel, pennie);

		}
		
	}

	private static void quarters(double change, int toonie, int loonie, int quarter, int dime, int nickel, int pennie) {
		if (change >= 0.25) {
			change = change - 0.25;
			quarter++;
			amountLeft.setText(Double.toString(change));
			textFieldQuarter.setText(Integer.toString(quarter));
			
			System.out.println("works");
			System.out.println(change);
			System.out.println("toonies: " + toonie);
			System.out.println("loonies: " + loonie);
			System.out.println("quarters: " + quarter);
			quarters(change,  toonie, loonie, quarter, dime, nickel, pennie);
			
			
		}
		else {
			
			System.out.println("next currency");
			dimes(change, toonie, loonie, quarter, dime, nickel, pennie);

		
		}
	}
	
	private static void dimes(double change, int toonie, int loonie, int quarter, int dime, int nickel, int pennie) {
		if (change >= 0.10) {
			change = change - 0.10;
			dime++;
			amountLeft.setText(Double.toString(change));
			textFieldDime.setText(Integer.toString(dime));
			
			System.out.println("works");
			System.out.println(change);
			System.out.println("toonies: " + toonie);
			System.out.println("loonies: " + loonie);
			System.out.println("quarters: " + quarter);
			System.out.println("dimes: " + dime);
			dimes(change,  toonie, loonie, quarter, dime, nickel, pennie);
			
			
		}
		else {
			
			System.out.println("next currency");
			nickels(change, toonie, loonie, quarter, dime, nickel, pennie);

		
		}
		
	}

	private static void nickels(double change, int toonie, int loonie, int quarter, int dime, int nickel, int pennie) {
		if (change >= 0.05) {
			change = change - 0.05;
			nickel++;
			amountLeft.setText(Double.toString(change));
			textFieldNickel.setText(Integer.toString(nickel));
			
			System.out.println("works");
			System.out.println(change);
			System.out.println("toonies: " + toonie);
			System.out.println("loonies: " + loonie);
			System.out.println("quarters: " + quarter);
			System.out.println("dimes: " + dime);
			System.out.println("nickels: " + nickel);
			nickels(change,  toonie, loonie, quarter, dime, nickel, pennie);
			
			
		}
		else {
			
			System.out.println("next currency");
			pennies(change, toonie, loonie, quarter, dime, nickel, pennie);
		
		}
		
	}

	private static void pennies(double change, int toonie, int loonie, int quarter, int dime, int nickel, int pennie) {
		double except = change;
		String error = "0.00";
		String myString = Double.toString(except);
		System.out.println(myString.substring(0, 4));
		System.out.println(myString);
		if (change < 0.01) {
			pennie++;
			amountLeft.setText("0");
			textFieldPennie.setText(Integer.toString(pennie));
			status.setText("Done...");
			System.out.println("DONE:");
			System.out.println("RESULTS:");
			System.out.println("toonies: " + toonie);
			System.out.println("loonies: " + loonie);
			System.out.println("quarters: " + quarter);
			System.out.println("dimes: " + dime);
			System.out.println("nickels: " + nickel);
			System.out.println("pennies: " + pennie);
			System.out.println("error route");
			
		}
		else if (change >= 0.01){
			change = change - 0.01;
			pennie++;
			amountLeft.setText(Double.toString(change));
			textFieldPennie.setText(Integer.toString(pennie));
			
			System.out.println("works");
			System.out.println(change);
			System.out.println("toonies: " + toonie);
			System.out.println("loonies: " + loonie);
			System.out.println("quarters: " + quarter);
			System.out.println("dimes: " + dime);
			System.out.println("nickels: " + nickel);
			System.out.println("pennies: " + pennie);
			pennies(change,  toonie, loonie, quarter, dime, nickel, pennie);
			
			
		}
		
		else {
			status.setText("Done...");
			System.out.println("DONE:");
			System.out.println("RESULTS:");
			System.out.println("toonies: " + toonie);
			System.out.println("loonies: " + loonie);
			System.out.println("quarters: " + quarter);
			System.out.println("dimes: " + dime);
			System.out.println("nickels: " + nickel);
			System.out.println("pennies: " + pennie);
			
		}
	}
}
