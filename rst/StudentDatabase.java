package rst;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.io.*;
import rst.Person;
import rst.Student;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
public class StudentDatabase {
	
	private JFrame frame;
	private static JTextArea textArea;
	private JTextField searchInput;
	private JTextField textFirstName;
	private JTextField textEmail;
	private JTextField textLastName;
	private JTextField textStudentNumber;
	private static int loop = 0;
	private static Student[] refinedDataBase;
	private static ArrayList<String> generalDataBase = new ArrayList<String>();
	
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		BufferedReader br = null;
		String text;
		try {
			
			// open file, located under Java Project folder (not src folder)
			// right-click repository -> new -> file -> "filename.txt"
			
			br = new BufferedReader (new FileReader("StudentRecords.txt"));
			
			while ((text = br.readLine()) != null) {
				
				generalDataBase.add(text);
				
			}
			
			br.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < generalDataBase.size(); i++) {
			loop++;
			i = i + 3;
		}
		
		refinedDataBase = new Student[loop];
		
		loop = 0;
		
		for (int i = 0; i < generalDataBase.size(); i++) {
			
			String firstName = generalDataBase.get(i);
			String lastName = generalDataBase.get(i+1);
			String studentNumber = generalDataBase.get(i+2);
			String email = generalDataBase.get(i+3);
			
			refinedDataBase[loop] = new Student(firstName, lastName, studentNumber, email);
			
			i = i+3;
			loop++;
			
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentDatabase window = new StudentDatabase();
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
	public StudentDatabase() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 850, 576);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("St. FX Student Database");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 816, 51);
		frame.getContentPane().add(lblNewLabel);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(143, 115, 683, 294);
		frame.getContentPane().add(scrollPane);
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setTabSize(7);
		textArea_1.setEditable(false);
		scrollPane.setViewportView(textArea_1);
		
		JRadioButton buttonFirstName = new JRadioButton("First Name");
		buttonFirstName.setSelected(true);
		buttonFirstName.setBounds(10, 204, 127, 23);
		frame.getContentPane().add(buttonFirstName);
		
		JRadioButton buttonLastName = new JRadioButton("Last Name");
		buttonLastName.setBounds(10, 230, 127, 23);
		frame.getContentPane().add(buttonLastName);
		
		JRadioButton buttonStudentNumber = new JRadioButton("Student Number");
		buttonStudentNumber.setBounds(10, 256, 127, 23);
		frame.getContentPane().add(buttonStudentNumber);
		
		JRadioButton buttonEmail = new JRadioButton("Email");
		buttonEmail.setBounds(10, 282, 109, 23);
		frame.getContentPane().add(buttonEmail);
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(buttonFirstName);
		bgroup.add(buttonLastName);
		bgroup.add(buttonStudentNumber);
		bgroup.add(buttonEmail);
		JRadioButton ascending = new JRadioButton("Ascending");
		ascending.setSelected(true);
		ascending.setBounds(10, 360, 109, 23);
		frame.getContentPane().add(ascending);
		JRadioButton descending = new JRadioButton("Descending");
		descending.setBounds(10, 386, 109, 23);
		frame.getContentPane().add(descending);
		ButtonGroup bgroup2 = new ButtonGroup();
		bgroup2.add(ascending);
		bgroup2.add(descending);
		
		JLabel lblNewLabel_1 = new JLabel("Search Criteria:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 93, 127, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		searchInput = new JTextField();
		searchInput.setBounds(10, 118, 127, 20);
		frame.getContentPane().add(searchInput);
		searchInput.setColumns(10);
		
		JButton search = new JButton("Search");
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String input = searchInput.getText();
				
				recursiveInsertionSort(refinedDataBase, refinedDataBase.length - 1);
				
				
				if (buttonFirstName.isSelected()) {
					loop = 0;
					
					Student[] studentF = refinedDataBase.clone();
					
			        Arrays.sort(studentF, new Comparator<Student>() {
			            public int compare(Student student1, Student student2) {
			                return student1.getFirstName().compareTo(student2.getFirstName());
			            }
			        });
					
					searchName(input, studentF, 0, studentF.length - 1, 1, textArea_1);
				}
				
				else if (buttonLastName.isSelected()) {
					loop = 0;
					
					Student[] studentL = refinedDataBase.clone();
					
			        Arrays.sort(studentL, new Comparator<Student>() {
			            public int compare(Student student1, Student student2) {
			                return student1.getLastName().compareTo(student2.getLastName());
			            }
			        });
					
					searchName(input, studentL, 0, studentL.length - 1, 2, textArea_1);
				}
				
				else if (buttonStudentNumber.isSelected()) {
					loop = 0;
					
					Student[] studentN = refinedDataBase.clone();
					
//					Arrays.sort(studentN, new Comparator<Student>() {
//			            public int compare(Student student1, Student student2) {
//			                return student1.getStudentNumber().compareTo(student2.getStudentNumber());
//			            }
//			        });
					
					boolean elementSwapped = true;
					
					while (elementSwapped == true) {
						
						elementSwapped = false;
						
						for (int i = 0; i < studentN.length - 1; i++) {
							
							if (Integer.parseInt(studentN[i].getStudentNumber()) > Integer.parseInt(studentN[i+1].getStudentNumber())) {
								
								swap(studentN, i, i+1);
								
								elementSwapped = true;
								
							}	
						}
					}
					
					searchName(input, studentN, 0, studentN.length - 1, 3, textArea_1);
				}
				
				else {
					loop = 0;
					
					Student[] studentE = refinedDataBase.clone();
					
			        Arrays.sort(studentE, new Comparator<Student>() {
			            public int compare(Student student1, Student student2) {
			                return student1.getEmail().compareTo(student2.getEmail());
			            }
			        });
					
					searchName(input, studentE, 0, studentE.length - 1, 4, textArea_1);
				}
			}

		});
		search.setBounds(10, 149, 127, 23);
		frame.getContentPane().add(search);
		
		JLabel lblNewLabel_2 = new JLabel("Search Filters:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 183, 127, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton displayAll = new JButton("Display All");
		displayAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					
				Student[] copiedDataBase = refinedDataBase.clone();
				
				displayAll(copiedDataBase);
				
				if (ascending.isSelected()) {
					
					textArea_1.setText(null);
					textArea_1.append(" Last Name\t\tFirst Name\t\tStudent #\t\tEmail\n");
				
					for (int i = 0; i < copiedDataBase.length; i++) {
						
						textArea_1.append(" " + copiedDataBase[i].getLastName() + "\t\t" + copiedDataBase[i].getFirstName() + "\t\t" + copiedDataBase[i].getStudentNumber() + "\t\t" + copiedDataBase[i].getEmail() + "\n");
					
					}
				}
				
				else {
					
					textArea_1.setText(null);
					textArea_1.append(" Last Name\t\tFirst Name\t\tStudent #\t\tEmail\n");
					
					for (int i = copiedDataBase.length; i > 0; i--) {
						
						int j = i - 1;
						
						textArea_1.append(" " + copiedDataBase[j].getLastName() + "\t\t" + copiedDataBase[j].getFirstName() + "\t\t" + copiedDataBase[j].getStudentNumber() + "\t\t" + copiedDataBase[j].getEmail() + "\n");
						
					}
					
				}
			}

		});
		displayAll.setBounds(10, 330, 127, 23);
		frame.getContentPane().add(displayAll);
		
		JButton addStudent = new JButton("Add Student");
		addStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textArea_1.setText(null);
				
				if ((textEmail.getText().isEmpty()) || (textFirstName.getText().isEmpty()) || (textLastName.getText().isEmpty()) || (textStudentNumber.getText().isEmpty())) {
					textArea_1.append(" INVALID INFORMATION - STUDENT NOT ADDED\n");
				}
				
				else {
					
					String email = textEmail.getText();
					String firstName = textFirstName.getText();
					String lastName = textLastName.getText();
					String studentNumber = textStudentNumber.getText();
					
					try {
						FileOutputStream fout = new FileOutputStream("StudentRecords.txt");
						BufferedOutputStream bout = new BufferedOutputStream(fout);
						
						// Specifying ISO standard for file output
						OutputStreamWriter out = new OutputStreamWriter(bout, "8859_1");
						
						// Write contents from array
						
						for (int i = 0; i < refinedDataBase.length; i++) {
							
							out.write(refinedDataBase[i].getFirstName() + "\n");
							out.write(refinedDataBase[i].getLastName() + "\n");
							out.write(refinedDataBase[i].getStudentNumber() + "\n");
							out.write(refinedDataBase[i].getEmail() + "\n");
							
						}
						
						out.write(firstName + "\n");
						out.write(lastName + "\n");
						out.write(studentNumber + "\n");
						out.write(email + "\n");
						
						// forces data to be written
						out.flush();
						
						out.close();
						
						BufferedReader br = null;
						String text;
						try {
							
							// open file, located under Java Project folder (not src folder)
							// right-click repository -> new -> file -> "filename.txt"
							
							br = new BufferedReader (new FileReader("StudentRecords.txt"));
							
							generalDataBase.clear();
							
							while ((text = br.readLine()) != null) {
								
								generalDataBase.add(text);
								
							}
							
							br.close();
							
						}catch(Exception error) {
							error.printStackTrace();
						}
						
						loop = 0;
						
						for (int i = 0; i < generalDataBase.size(); i++) {
							loop++;
							i = i + 3;
						}
						
						refinedDataBase = new Student[loop];
						loop = 0;
						
						for (int i = 0; i < generalDataBase.size(); i++) {
							
							String firstName2 = generalDataBase.get(i);
							String lastName2 = generalDataBase.get(i+1);
							String studentNumber2 = generalDataBase.get(i+2);
							String email2 = generalDataBase.get(i+3);
							
							refinedDataBase[loop] = new Student(firstName2, lastName2, studentNumber2, email2);
							
							i = i+3;
							loop++;
							
						}
						
						recursiveInsertionSort(refinedDataBase, refinedDataBase.length - 1);
						
						textArea_1.setText(null);
						textArea_1.append(" STUDENT ADDED: " + firstName + " " + lastName + ", " + studentNumber + ", " + email);
						
						textFirstName.setText(null);
						textLastName.setText(null);
						textStudentNumber.setText(null);
						textEmail.setText(null);
							
					}
					catch(Exception error) {
						
						error.printStackTrace();
						
					}
					
				}
			}
		});
		addStudent.setBounds(10, 426, 127, 23);
		frame.getContentPane().add(addStudent);
		JButton exit = new JButton("Exit");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		exit.setBounds(10, 506, 127, 20);
		frame.getContentPane().add(exit);
		JButton btnNewButton = new JButton("Clear All");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textFirstName.setText(null);
				textLastName.setText(null);
				textEmail.setText(null);
				textStudentNumber.setText(null);
				textArea_1.setText(null);
				searchInput.setText(null);
			}
		});
		btnNewButton.setBounds(10, 472, 127, 23);
		frame.getContentPane().add(btnNewButton);
		JLabel lblNewLabel_3 = new JLabel("First Name");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(187, 429, 89, 14);
		frame.getContentPane().add(lblNewLabel_3);
		JLabel lblNewLabel_3_1 = new JLabel("Email");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_1.setBounds(187, 475, 78, 14);
		frame.getContentPane().add(lblNewLabel_3_1);
		JLabel lblNewLabel_3_2 = new JLabel("Last Name");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_2.setBounds(496, 429, 119, 14);
		frame.getContentPane().add(lblNewLabel_3_2);
		JLabel lblNewLabel_3_3 = new JLabel("Student Number");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_3.setBounds(496, 475, 119, 14);
		frame.getContentPane().add(lblNewLabel_3_3);
		textFirstName = new JTextField();
		textFirstName.setBounds(286, 427, 170, 20);
		frame.getContentPane().add(textFirstName);
		textFirstName.setColumns(10);
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(286, 473, 170, 20);
		frame.getContentPane().add(textEmail);
		textLastName = new JTextField();
		textLastName.setColumns(10);
		textLastName.setBounds(625, 427, 170, 20);
		frame.getContentPane().add(textLastName);
		textStudentNumber = new JTextField();
		textStudentNumber.setColumns(10);
		textStudentNumber.setBounds(625, 473, 170, 20);
		frame.getContentPane().add(textStudentNumber);
	}
	
	
	private static boolean searchName(String input, Student[] refinedDataBase, int left, int right, int i, JTextArea output) {
				
		String compare;
		
		if (left > right) {
			output.setText(null);
			output.append("USER NOT FOUND");
			return false;
		}
		
		int middle = (left + right) / 2;
		
		if (i == 1) {
			compare = refinedDataBase[middle].getFirstName();
			
			if (input.compareTo(compare) == 0) {
				output.setText(null);
				output.append(" Last Name\t\tFirst Name\t\tStudent #\t\tEmail\n");
				output.append(" " + refinedDataBase[middle].getLastName() + "\t\t" + refinedDataBase[middle].getFirstName() + "\t\t" + refinedDataBase[middle].getStudentNumber() + "\t\t" + refinedDataBase[middle].getEmail() + "\n");
				
				return true;
				
			}
			
			else if (input.compareTo(compare) < 0) {
				return searchName(input, refinedDataBase, left, middle - 1, i, output);
			}
			
			else if (input.compareTo(compare) > 0){
				return searchName(input, refinedDataBase, middle + 1, right, i, output);
			}
			else {
				return false;
			}
			
		}
		else if (i == 2){
			
			int middle1 = (left + right) / 2;
			
			compare = refinedDataBase[middle1].getLastName();
			
			if (input.compareTo(compare) == 0) {
				output.setText(null);
				output.append(" Last Name\t\tFirst Name\t\tStudent #\t\tEmail\n");
				output.append(" " + refinedDataBase[middle1].getLastName() + "\t\t" + refinedDataBase[middle1].getFirstName() + "\t\t" + refinedDataBase[middle1].getStudentNumber() + "\t\t" + refinedDataBase[middle1].getEmail() + "\n");
				
				return true;
				
			}
			
			else if (input.compareTo(compare) < 0) {
				return searchName(input, refinedDataBase, left, middle - 1, i, output);
			}
			
			else if (input.compareTo(compare) > 0){
				return searchName(input, refinedDataBase, middle + 1, right, i, output);
			}
			else {
				return false;
			}
		}
		else if (i == 3) {
			int number = Integer.parseInt(refinedDataBase[middle].getStudentNumber());
			int input1 = Integer.parseInt(input);
			
			if (Integer.parseInt(input) == number) {
				output.setText(null);
				output.append(" Last Name\t\tFirst Name\t\tStudent #\t\tEmail\n");
				output.append(" " + refinedDataBase[middle].getLastName() + "\t\t" + refinedDataBase[middle].getFirstName() + "\t\t" + refinedDataBase[middle].getStudentNumber() + "\t\t" + refinedDataBase[middle].getEmail() + "\n");
				
				return true;
				
			}
			
			else if (input1 < number) {
				return searchName(input, refinedDataBase, left, middle - 1, i, output);
			}
			
			else if (input1 > number){
				return searchName(input, refinedDataBase, middle + 1, right, i, output);
			}
			else {
				return false;
			}
		}
		else {
			compare = refinedDataBase[middle].getEmail();
			
			if (input.compareTo(compare) == 0) {
				output.setText(null);
				output.append(" Last Name\t\tFirst Name\t\tStudent #\t\tEmail\n");
				output.append(" " + refinedDataBase[middle].getLastName() + "\t\t" + refinedDataBase[middle].getFirstName() + "\t\t" + refinedDataBase[middle].getStudentNumber() + "\t\t" + refinedDataBase[middle].getEmail() + "\n");
				
				return true;
				
			}
			
			else if (input.compareTo(compare) < 0) {
				return searchName(input, refinedDataBase, left, middle - 1, i, output);
			}
			
			else if (input.compareTo(compare) > 0){
				return searchName(input, refinedDataBase, middle + 1, right, i, output);
			}
			else {
				return false;
			}
		}
	}
	
	private static void displayAll(Student[] copiedDataBase) {
		
		recursiveInsertionSort(copiedDataBase, copiedDataBase.length - 1);
		
	}


	private static void recursiveInsertionSort(Student[] copiedDataBase, int i) {
	    if (i <= 0) {
	        return;
	    }

	    recursiveInsertionSort(copiedDataBase, i - 1);

	    int j = i;
	    while (j > 0 && (char) copiedDataBase[j - 1].getLastName().charAt(0) > (char) copiedDataBase[j].getLastName().charAt(0)) {
	        swap(copiedDataBase, j, j - 1);
	        j--;
	    }
	}

	private static void swap(Student[] copiedDataBase, int x, int y) {
	    Student temp = copiedDataBase[x];
	    copiedDataBase[x] = copiedDataBase[y];
	    copiedDataBase[y] = temp;
	}
}