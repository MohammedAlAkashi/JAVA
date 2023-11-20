package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JTextPane;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JButton;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class U1A6_BasePower {

	private JFrame frame;
	private static JTextArea powerOut;
	private JTextField power1;
	private JTextField base1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U1A6_BasePower window = new U1A6_BasePower();
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
	public U1A6_BasePower() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 607, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(241, 184, 161, -138);
		frame.getContentPane().add(textArea);
		
		JButton calculate = new JButton("calculate");
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// grabs the numbers in the text field "base" and "power" and pipes it into the "math" method
				
				Double base = Double.parseDouble(base1.getText());
				Double power = Double.parseDouble(power1.getText());
				
				math(base, power);
			}
		});
		calculate.setBounds(45, 184, 89, 23);
		frame.getContentPane().add(calculate);
		
		power1 = new JTextField();
		power1.setBounds(130, 112, 86, 20);
		frame.getContentPane().add(power1);
		power1.setColumns(10);
		
		base1 = new JTextField();
		base1.setBounds(130, 81, 86, 20);
		frame.getContentPane().add(base1);
		base1.setColumns(10);
		
		
		JButton exit = new JButton("exit");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// exits the program 
				System.exit(0);		
			}
		});
		exit.setBounds(144, 184, 89, 23);
		frame.getContentPane().add(exit);
		
		JLabel lblNewLabel = new JLabel("enter the power");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 115, 110, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblEnterTheBase = new JLabel("enter the base");
		lblEnterTheBase.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterTheBase.setBounds(10, 84, 110, 14);
		frame.getContentPane().add(lblEnterTheBase);
		
		JTextArea powerOut = new JTextArea();
		powerOut.setEditable(false);
		powerOut.setBackground(new Color(167, 168, 115));
		powerOut.setBounds(305, 11, 276, 239);
		frame.getContentPane().add(powerOut);
	}

	private void math(Double base, Double power) {
		// outputs the results of the amount when provided with a base and a power.
		
		JTextArea powerOut = new JTextArea();
		powerOut.setEditable(false);
		powerOut.setBackground(new Color(167, 168, 115));
		powerOut.setBounds(305, 11, 276, 239);
		frame.getContentPane().add(powerOut);
		powerOut.setText(null);
		
		for(int i = 0; i <= power; i++) {
			
			// loop for each exponent
			
			powerOut.append("" + base + " to the power of " + i + " = " + Math.pow(base, i) + "\n");
			
		}
		
	}
}
