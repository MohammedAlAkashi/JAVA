package assignments;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import assignments.imports.Books;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.awt.event.ActionEvent;

public class U3A4_SearchAlgorithm {

	private JFrame frame;
	private JTextField reference;
	private JTextField title;
	private JTextField author;
	private static BufferedReader br = null;
	private static ArrayList<String> contents2 = new ArrayList<String>();
	private static String[] data;
	private static int length = 0;
	private static int loop3 = 0;
	private static String rawNumber;
	private static int ID[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			
			br = new BufferedReader (new FileReader("BookList.txt"));
			
			while ((rawNumber = br.readLine()) != null) {
						
				contents2.add(rawNumber);
				
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U3A4_SearchAlgorithm window = new U3A4_SearchAlgorithm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
				
			}
		});
	}



	private static int size(BufferedReader br) {
		// open file, located under Java Project folder (not src folder)
		// right-click repository -> new -> file -> "filename.txt"
		try {
			
			br = new BufferedReader (new FileReader("BookList.txt"));
			
			while ((rawNumber = br.readLine()) != null) {
				try {
					int refinedNumber = Integer.parseInt(rawNumber);
					if (refinedNumber == (int)refinedNumber) {
						
						loop3++;
						
					}
				}
				catch(java.lang.NumberFormatException e){
	
				}
				
			}
			
			BufferedReader br2 = new BufferedReader (new FileReader("BookList.txt"));
			ID = new int[loop3];
			contents = new Books[loop3];
			loop3 = 0;
			int loop2 = 0;
			
			while ((rawNumber = br2.readLine()) != null) {	
				
				try {
					int refinedNumber = Integer.parseInt(rawNumber);
					if (refinedNumber == (int)refinedNumber) {
						
						ID[loop3] = refinedNumber;
						
					}
					
					
				} catch(Exception e) {
					if (loop2 == 0) {
						contents[loop3] = new Books(rawNumber, rawNumber);
						loop2++;
					}
					else if (loop2 == 1) {
						contents[loop3].setAuthor(rawNumber);
						loop3++;
						loop2 = 0;
					}
					
				}
				
			}
			
			System.out.println(contents.length);
			System.out.println(ID.length);
			System.out.println(ID[1]);
			System.out.println(contents[1].getAuthor());
			
			br.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return 0;
	}



	/**
	 * Create the application.
	 */
	public U3A4_SearchAlgorithm() {
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
		
		JLabel lblNewLabel = new JLabel("St.FX Learning Commons");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 414, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Book Reference #");
		lblNewLabel_1.setBounds(59, 89, 104, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		reference = new JTextField();
		reference.setBounds(157, 91, 194, 20);
		frame.getContentPane().add(reference);
		reference.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Search dialogue by reference # only");
		lblNewLabel_2.setBounds(157, 64, 194, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Book Title");
		lblNewLabel_3.setBounds(59, 123, 104, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Author");
		lblNewLabel_4.setBounds(59, 148, 104, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		title = new JTextField();
		title.setColumns(10);
		title.setBounds(157, 120, 194, 20);
		frame.getContentPane().add(title);
		
		author = new JTextField();
		author.setColumns(10);
		author.setBounds(157, 148, 194, 20);
		frame.getContentPane().add(author);
		
		JButton clear = new JButton("clear");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				reference.setText(null);
				title.setText(null);
				author.setText(null);
			}
		});
		clear.setBounds(197, 179, 89, 23);
		frame.getContentPane().add(clear);
		
		JButton search = new JButton("Search");
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(contents.length);
				System.out.println(ID.length);
				for(int i = 0; i < ID.length; i++) {
					
					System.out.println(ID[i]);
					System.out.println(contents[i].getAuthor());
					System.out.println(contents[i].getTitle());
				}
				
			}
		});
		search.setBounds(98, 179, 89, 23);
		frame.getContentPane().add(search);
		
		JButton exit = new JButton("exit");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		exit.setBounds(296, 179, 89, 23);
		frame.getContentPane().add(exit);
	}
}
