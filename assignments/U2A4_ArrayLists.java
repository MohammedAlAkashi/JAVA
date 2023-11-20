package assignments;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Comparator;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class U2A4_ArrayLists {

	private JFrame frame;
	private JTextField input;
	private static ArrayList<String> students = new ArrayList();
	private JTextField error;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U2A4_ArrayLists window = new U2A4_ArrayLists();
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
	public U2A4_ArrayLists() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 306, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name: ");
		lblNewLabel.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		input = new JTextField();
		input.setBounds(61, 8, 189, 20);
		frame.getContentPane().add(input);
		input.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(20, 36, 161, 214);
		textArea.setBorder(new LineBorder(new Color(0, 0, 0)));
		frame.getContentPane().add(textArea);
		
		JButton add = new JButton("Add");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				error.setText(null);
				textArea.setText(null);
				
				String name = input.getText();
				students.add(name);
				for (int i = 0; i < students.size(); i++) {
					
					textArea.append(students.get(i) + "\n");
					
				}
			}
		});
		add.setBounds(191, 39, 89, 23);
		frame.getContentPane().add(add);
		
		JButton remove = new JButton("Remove");
		remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				error.setText(null);
				textArea.setText(null);
				
				String name = input.getText();
				System.out.println(students.contains(name));
				
				if (students.contains(name) == false) {
					
					error.setText("NOT FOUND");	
					
				}
				else {
					
					students.remove(name);
					for (int i = 0; i < students.size(); i++) {
	
						textArea.append(students.get(i) + "\n");
						
					}	
				}
			}
		});
		remove.setBounds(191, 73, 89, 23);
		frame.getContentPane().add(remove);
		
		JButton sort = new JButton("Sort");
		sort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				error.setText(null);
				textArea.setText(null);
				students.sort(Comparator.naturalOrder());
				for (int i = 0; i < students.size(); i++) {
					
					textArea.append(students.get(i) + "\n");
					
				}
			}
		});
		sort.setBounds(191, 107, 89, 23);
		frame.getContentPane().add(sort);
		
		JButton list = new JButton("List");
		list.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				error.setText(null);
				textArea.setText(null);
				for (int i = 0; i < students.size(); i++) {
					
					textArea.append(students.get(i) + "\n");
					
				}
			}
		});
		list.setBounds(191, 141, 89, 23);
		frame.getContentPane().add(list);
		
		JButton exit = new JButton("Exit");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		exit.setBounds(191, 175, 89, 23);
		frame.getContentPane().add(exit);
		
		error = new JTextField();
		error.setFont(new Font("Tahoma", Font.BOLD, 11));
		error.setHorizontalAlignment(SwingConstants.CENTER);
		error.setBackground(new Color(192, 192, 192));
		error.setEditable(false);
		error.setBounds(194, 209, 86, 41);
		frame.getContentPane().add(error);
		error.setColumns(10);
	}
}
