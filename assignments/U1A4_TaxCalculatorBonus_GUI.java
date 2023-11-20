package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class U1A4_TaxCalculatorBonus_GUI {

	private JFrame frame;
	private JTextField txtEnterYourIncome;
	private JTextField textIntIncome;
	private JTextField txtFedTax;
	private JTextField txtTaxableIncome;
	private JTextField textTax;
	private JTextField federalTax;
	private JTextField txtProvincialAndTeri;
	private JTextField provincialTax;
	private JTextField textProvTax;
	private JTextField provTax;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U1A4_TaxCalculatorBonus_GUI window = new U1A4_TaxCalculatorBonus_GUI();
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
	public U1A4_TaxCalculatorBonus_GUI() {
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
		
		JButton calculate = new JButton("Calculate");
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Enter your income:");
				Double income = Double.parseDouble(textIntIncome.getText());
				
				if(income < 53359) {
					if(income <= 49231) {
						
						System.out.println("15% TAX");
						System.out.println("taxable income: " + (income * 0.15));
						textTax.setText("15%");
						provincialTax.setText("8.7%");
						federalTax.setText("" + (income * 0.15));
						provTax.setText("" + (income * 0.15) * 0.0505);
						
					}
					
					else {
						
						System.out.println("15% TAX");
						System.out.println("taxable income: " + (income * 0.15));
						textTax.setText("15%");
						provincialTax.setText("9.15%");
						federalTax.setText("" + (income * 0.15));
						provTax.setText("" + (income * 0.15) * 0.915);
						
					}
					
				}
				
				else if ((income > 53359) && (income <= 106717)) {
					if((income > 49231)||(income <= 98463)) {
						
						System.out.println("20.5% TAX");
						System.out.println("taxable income: " + (income * 0.205));
						textTax.setText("20.5%");
						provincialTax.setText("9.15%");
						federalTax.setText("" + (income * 0.205));
						provTax.setText("" + (income * 0.205) * 0.0915);
						
					}
					
					else {
						
						System.out.println("20.5% TAX");
						System.out.println("taxable income: " + (income * 0.205));
						textTax.setText("20.5%");
						provincialTax.setText("11.16%");
						federalTax.setText("" + (income * 0.205));
						provTax.setText("" + (income * 0.205) * 0.1116);
						
					}	
				}
				
				
				else if ((income > 106717) && (income <= 165430)) {
					if((income > 98463)||(income <= 150000)) {
						
						System.out.println("26% TAX");
						System.out.println("taxable income: " + (income * 0.26));
						textTax.setText("26%");
						provincialTax.setText("11.16%");
						federalTax.setText("" + (income * 0.26));
						provTax.setText("" + (income * 0.26) * 0.1116);
						
					}
					
					else {
						
						System.out.println("26% TAX");
						System.out.println("taxable income: " + (income * 0.26));
						textTax.setText("26%");
						provincialTax.setText("12.16%");
						federalTax.setText("" + (income * 0.26));
						provTax.setText("" + (income * 0.26) * 0.1216);
						
					}	
					
				}
				
				else if ((income > 165430) && (income <= 235675)) {
					if((income > 150000)||(income <= 220000)) {
						
						System.out.println("29% TAX");
						System.out.println("taxable income: " + (income * 0.29));
						textTax.setText("29%");
						provincialTax.setText("12.16%");
						federalTax.setText("" + (income * 0.29));
						provTax.setText("" + (income * 0.29) * 0.1216);
						
					}
					
					else {
						
						System.out.println("29% TAX");
						System.out.println("taxable income: " + (income * 0.29));
						textTax.setText("29%");
						provincialTax.setText("13.16%");
						federalTax.setText("" + (income * 0.29));
						provTax.setText("" + (income * 0.29) * 0.1316);
						
					}	
					
				}
				
				else if (income > 235675) {
					System.out.println("33% TAX");
					System.out.println("taxable income: " + (income * 0.33));
					textTax.setText("33%");
					provincialTax.setText("13.16%");
					federalTax.setText("" + (income * 0.33));
					provTax.setText("" + (income * 0.33) * 0.1316);
					
				}
			}
		});
		calculate.setBounds(10, 227, 89, 23);
		frame.getContentPane().add(calculate);
		
		JButton exit = new JButton("exit");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		exit.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(exit);
		
		txtEnterYourIncome = new JTextField();
		txtEnterYourIncome.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterYourIncome.setText("Enter your income:");
		txtEnterYourIncome.setEditable(false);
		txtEnterYourIncome.setBounds(10, 11, 146, 23);
		frame.getContentPane().add(txtEnterYourIncome);
		txtEnterYourIncome.setColumns(10);
		
		textIntIncome = new JTextField();
		textIntIncome.setBounds(173, 12, 251, 22);
		frame.getContentPane().add(textIntIncome);
		textIntIncome.setColumns(10);
		
		txtFedTax = new JTextField();
		txtFedTax.setHorizontalAlignment(SwingConstants.CENTER);
		txtFedTax.setText("FEDERAL TAX:");
		txtFedTax.setEditable(false);
		txtFedTax.setBounds(10, 57, 143, 20);
		frame.getContentPane().add(txtFedTax);
		txtFedTax.setColumns(10);
		
		txtTaxableIncome = new JTextField();
		txtTaxableIncome.setHorizontalAlignment(SwingConstants.CENTER);
		txtTaxableIncome.setText("federal tax:");
		txtTaxableIncome.setEditable(false);
		txtTaxableIncome.setColumns(10);
		txtTaxableIncome.setBounds(10, 119, 143, 20);
		frame.getContentPane().add(txtTaxableIncome);
		
		textTax = new JTextField();
		textTax.setHorizontalAlignment(SwingConstants.CENTER);
		textTax.setEditable(false);
		textTax.setColumns(10);
		textTax.setBounds(173, 57, 157, 20);
		frame.getContentPane().add(textTax);
		
		federalTax = new JTextField();
		federalTax.setHorizontalAlignment(SwingConstants.CENTER);
		federalTax.setEditable(false);
		federalTax.setColumns(10);
		federalTax.setBounds(173, 119, 157, 20);
		frame.getContentPane().add(federalTax);
		
		txtProvincialAndTeri = new JTextField();
		txtProvincialAndTeri.setText("provincial tax:");
		txtProvincialAndTeri.setHorizontalAlignment(SwingConstants.CENTER);
		txtProvincialAndTeri.setEditable(false);
		txtProvincialAndTeri.setColumns(10);
		txtProvincialAndTeri.setBounds(10, 150, 143, 20);
		frame.getContentPane().add(txtProvincialAndTeri);
		
		provincialTax = new JTextField();
		provincialTax.setHorizontalAlignment(SwingConstants.CENTER);
		provincialTax.setEditable(false);
		provincialTax.setColumns(10);
		provincialTax.setBounds(173, 88, 157, 20);
		frame.getContentPane().add(provincialTax);
		
		textProvTax = new JTextField();
		textProvTax.setText("PROVINCIAL TAX:");
		textProvTax.setHorizontalAlignment(SwingConstants.CENTER);
		textProvTax.setEditable(false);
		textProvTax.setColumns(10);
		textProvTax.setBounds(10, 88, 143, 20);
		frame.getContentPane().add(textProvTax);
		
		provTax = new JTextField();
		provTax.setHorizontalAlignment(SwingConstants.CENTER);
		provTax.setEditable(false);
		provTax.setColumns(10);
		provTax.setBounds(173, 150, 157, 20);
		frame.getContentPane().add(provTax);
	}
}
