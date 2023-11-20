package assignments;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.awt.event.ActionEvent;

public class U2A5_MatchingGame {
	private static int count = 0;
	
	ImageIcon[] colect = new ImageIcon[10];
	
	boolean[] completed = new boolean[16];
	JButton[] buttons = new JButton[16];
	
	private static ArrayList<Integer> history = new ArrayList();;
	private static ArrayList<Integer> counter2 = new ArrayList();
	private static ArrayList<Integer> counter1 = new ArrayList();
	private static Integer history1;
	private static Integer trys;
	private static boolean playing = false;
	
	
	private JFrame frame;
	private JTextField attempts;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U2A5_MatchingGame window = new U2A5_MatchingGame();
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
	public U2A5_MatchingGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		colect[0] = new ImageIcon(getClass().getResource("/resources/ram.jpg"));
		colect[1] = new ImageIcon(getClass().getResource("/resources/case.jpg"));
		colect[2] = new ImageIcon(getClass().getResource("/resources/dvd.jpg"));
		colect[3] = new ImageIcon(getClass().getResource("/resources/harddrive.jpg"));
		colect[4] = new ImageIcon(getClass().getResource("/resources/keyboard.jpg"));
		colect[5] = new ImageIcon(getClass().getResource("/resources/mice.jpg"));
		colect[6] = new ImageIcon(getClass().getResource("/resources/monitor.jpg"));
		colect[7] = new ImageIcon(getClass().getResource("/resources/printer.jpg"));
		colect[8] = new ImageIcon(getClass().getResource("/resources/cardback.jpg"));
		colect[9] = new ImageIcon(getClass().getResource("/resources/done.jpg"));
		
		frame = new JFrame();
		frame.setBounds(100, 100, 440, 582);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel mainTitle = new JLabel("Matching Game");
		mainTitle.setHorizontalAlignment(SwingConstants.CENTER);
		mainTitle.setBounds(10, 11, 404, 14);
		frame.getContentPane().add(mainTitle);
		
		JButton card1 = new JButton("");
		card1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (playing == true) {
					count++;
					
					if(count > 2) {
					}
					else if (count == 1)	{
						if (completed[0] == true) {
						}
						else {
							card1.setIcon(colect[counter1.get(0)]);
							
							Integer identity = counter1.get(0);
							history.add(identity);
							history1 = 0;
							
						}
					}
					
					else if (count == 2) {
						if (completed[0] == true) {
						}
						else {
							
							trys = (trys + 1);
							attempts.setText("" + trys);
							
							card1.setIcon(colect[counter1.get(0)]);
							int parse = history.get(0);
							
							if (counter1.get(0) == parse) {
								
								completed[0] = true;
								completed[history1] = true;
								
								
							}
							else {
								card1.setIcon(colect[counter1.get(0)]);
								
								System.out.println("wrong card.");
								
							}
						}
					}
					
					
					
				}
			}
		});
		card1.setBounds(20, 36, 90, 100);
		frame.getContentPane().add(card1);
		
		JButton card2 = new JButton("");
		card2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (playing == true) {
					count++;
					
					if(count > 2) {
					}
					else if (count == 1)	{
						if (completed[1] == true) {
						}
						else {
							
							card2.setIcon(colect[counter1.get(1)]);
							Integer identity = counter1.get(1);
							history.add(identity);
							history1 = 1;
							
						}
					}
					
					else if (count == 2) {
						if (completed[1] == true) {
						}
						else {
							
							trys = (trys + 1);
							attempts.setText("" + trys);
							
							card2.setIcon(colect[counter1.get(1)]);
							int parse = history.get(0);
							
							if (counter1.get(1) == parse) {
								
								completed[1] = true;
								completed[history1] = true;
								System.out.println("done");
								
							}
							else {
								
								card2.setIcon(colect[counter1.get(1)]);
								System.out.println("wrong card.");
								
							}
						}
					}
					
					
				}
			}
		});
		card2.setBounds(120, 36, 90, 100);
		frame.getContentPane().add(card2);
		
		JButton card3 = new JButton("");
		card3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (playing == true) {
					count++;
					
					if(count > 2) {
					}
					else if (count == 1)	{
						if (completed[2] == true) {
						}
						else {
							
							card3.setIcon(colect[counter1.get(2)]);
							Integer identity = counter1.get(2);
							history.add(identity);
							history1 = 2;
							
						}
					}
					
					else if (count == 2) {
						if (completed[2] == true) {
						}
						else {
							
							trys = (trys + 1);
							attempts.setText("" + trys);
							
							card3.setIcon(colect[counter1.get(2)]);
							int parse = history.get(0);
							
							if (counter1.get(2) == parse) {
								
								completed[2] = true;
								completed[history1] = true;
								System.out.println("done");
								
							}
							else {
								
								card3.setIcon(colect[counter1.get(2)]);
								System.out.println("wrong card.");
								
							}
						}
					}
					
					
				}
			}
		});
		card3.setBounds(220, 36, 90, 100);
		frame.getContentPane().add(card3);
		
		JButton card4 = new JButton("");
		card4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (playing == true) {
					count++;
					
					if(count > 2) {
					}
					else if (count == 1)	{
						if (completed[3] == true) {
						}
						else {
							
							card4.setIcon(colect[counter1.get(3)]);
							Integer identity = counter1.get(3);
							history.add(identity);
							history1 = 3;
							
						}
					}
					
					else if (count == 2) {
						if (completed[3] == true) {
						}
						else {
							
							trys = (trys + 1);
							attempts.setText("" + trys);
							
							card4.setIcon(colect[counter1.get(3)]);
							int parse = history.get(0);
							
							if (counter1.get(3) == parse) {
								
								completed[3] = true;
								completed[history1] = true;
								System.out.println("done");
								
							}
							else {
								
								card4.setIcon(colect[counter1.get(3)]);
								System.out.println("wrong card.");
								
							}
						}
					}
					
					
				}
			}
		});
		card4.setBounds(320, 36, 90, 100);
		frame.getContentPane().add(card4);
		
		JButton card5 = new JButton("");
		card5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (playing == true) {
					count++;
					
					if(count > 2) {
					}
					else if (count == 1)	{
						if (completed[4] == true) {
						}
						else {
							
							card5.setIcon(colect[counter1.get(4)]);
							Integer identity = counter1.get(4);
							history.add(identity);
							history1 = 4;
							
						}
					}
					
					else if (count == 2) {
						if (completed[4] == true) {
						}
						else {
							
							trys = (trys + 1);
							attempts.setText("" + trys);
							
							card5.setIcon(colect[counter1.get(4)]);
							int parse = history.get(0);
							
							if (counter1.get(4) == parse) {
								
								completed[4] = true;
								completed[history1] = true;
								System.out.println("done");
								
							}
							else {
								
								card5.setIcon(colect[counter1.get(4)]);
								System.out.println("wrong card.");
								
							}
						}
					}
					
					
				}
			}
		});
		card5.setBounds(20, 147, 90, 100);
		frame.getContentPane().add(card5);
		
		JButton card8 = new JButton("");
		card8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (playing == true) {
					count++;
					
					if(count > 2) {
					}
					else if (count == 1)	{
						if (completed[7] == true) {
						}
						else {
							
							card8.setIcon(colect[counter1.get(7)]);
							Integer identity = counter1.get(7);
							history.add(identity);
							history1 = 7;
							
						}
					}
					
					else if (count == 2) {
						if (completed[7] == true) {
						}
						else {
							
							trys = (trys + 1);
							attempts.setText("" + trys);
							
							card8.setIcon(colect[counter1.get(7)]);
							int parse = history.get(0);
							
							if (counter1.get(7) == parse) {
								
								completed[7] = true;
								completed[history1] = true;
								System.out.println("done");
								
							}
							else {
								
								card8.setIcon(colect[counter1.get(7)]);
								System.out.println("wrong card.");
								
							}
						}
					}
					
					
				}
				
			}
		});
		card8.setBounds(320, 147, 90, 100);
		frame.getContentPane().add(card8);
		
		JButton card7 = new JButton("");
		card7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (playing == true) {
					count++;
					
					if(count > 2) {
					}
					else if (count == 1)	{
						if (completed[6] == true) {
						}
						else {
							
							card7.setIcon(colect[counter1.get(6)]);
							Integer identity = counter1.get(6);
							history.add(identity);
							history1 = 6;
							
						}
					}
					
					else if (count == 2) {
						if (completed[6] == true) {
						}
						else {
							
							trys = (trys + 1);
							attempts.setText("" + trys);
							
							card7.setIcon(colect[counter1.get(6)]);
							int parse = history.get(0);
							
							if (counter1.get(6) == parse) {
								
								completed[6] = true;
								completed[history1] = true;
								System.out.println("done");
								
							}
							else {
								
								card7.setIcon(colect[counter1.get(6)]);
								System.out.println("wrong card.");
								
							}
						}
					}
					
				}
				
			}
		});
		card7.setBounds(220, 147, 90, 100);
		frame.getContentPane().add(card7);
		
		JButton card6 = new JButton("");
		card6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (playing == true) {
					count++;
					
					if(count > 2) {
					}
					else if (count == 1)	{
						if (completed[5] == true) {	
						}
						else {
							
							card6.setIcon(colect[counter1.get(5)]);
							Integer identity = counter1.get(5);
							history.add(identity);
							history1 = 5;
							
						}
					}
					
					else if (count == 2) {
						if (completed[5] == true) {
						}
						else {
							
							trys = (trys + 1);
							attempts.setText("" + trys);
							
							card6.setIcon(colect[counter1.get(5)]);
							int parse = history.get(0);
							
							if (counter1.get(5) == parse) {
								
								completed[5] = true;
								completed[history1] = true;
								System.out.println("done");
								
							}
							else {
								
								card6.setIcon(colect[counter1.get(5)]);
								System.out.println("wrong card.");
								
							}
						}
					}
					
					
				}
			}
		});
		card6.setBounds(120, 147, 90, 100);
		frame.getContentPane().add(card6);
		
		JButton card9 = new JButton("");
		card9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (playing == true) {
					count++;
					
					if(count > 2) {
					}
					else if (count == 1)	{
						if (completed[8] == true) {
						}
						else {
							
							card9.setIcon(colect[counter1.get(8)]);
							Integer identity = counter1.get(8);
							history.add(identity);
							history1 = 8;
							
						}
					}
					
					else if (count == 2) {
						if (completed[8] == true) {
						}
						else {
							
							trys = (trys + 1);
							attempts.setText("" + trys);
							
							card9.setIcon(colect[counter1.get(8)]);
							int parse = history.get(0);
							
							if (counter1.get(8) == parse) {
								
								completed[8] = true;
								completed[history1] = true;
								System.out.println("done");
								
							}
							else {
								
								card9.setIcon(colect[counter1.get(8)]);
								System.out.println("wrong card.");
								
							}
						}
					}
					
					
				}
			}
		});
		card9.setBounds(20, 258, 90, 100);
		frame.getContentPane().add(card9);
		
		JButton card12 = new JButton("");
		card12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (playing == true) {
					count++;
					
					if(count > 2) {
					}
					else if (count == 1)	{
						if (completed[11] == true) {
						}
						else {
							
							card12.setIcon(colect[counter1.get(11)]);
							Integer identity = counter1.get(11);
							history.add(identity);
							history1 = 11;
							
						}
					}
					
					else if (count == 2) {
						if (completed[11] == true) {
						}
						else {
							
							trys = (trys + 1);
							attempts.setText("" + trys);
							
							card12.setIcon(colect[counter1.get(11)]);
							int parse = history.get(0);
							
							if (counter1.get(11) == parse) {
								
								completed[11] = true;
								completed[history1] = true;
								System.out.println("done");
								
							}
							else {
								
								card12.setIcon(colect[counter1.get(11)]);
								System.out.println("wrong card.");
								
							}
						}
					}
					
					
				}
				
			}
		});
		card12.setBounds(320, 258, 90, 100);
		frame.getContentPane().add(card12);
		
		JButton card11 = new JButton("");
		card11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (playing == true) {
					count++;
					
					if(count > 2) {
					}
					else if (count == 1)	{
						if (completed[10] == true) {
						}
						else {
							
							card11.setIcon(colect[counter1.get(10)]);
							Integer identity = counter1.get(10);
							history.add(identity);
							history1 = 10;
							
						}
					}
					
					else if (count == 2) {
						if (completed[10] == true) {
						}
						else {
							
							trys = (trys + 1);
							attempts.setText("" + trys);
							
							card11.setIcon(colect[counter1.get(10)]);
							int parse = history.get(0);
							
							if (counter1.get(10) == parse) {
								
								completed[10] = true;
								completed[history1] = true;
								System.out.println("done");
								
							}
							else {
								
								card11.setIcon(colect[counter1.get(10)]);
								System.out.println("wrong card.");
								
							}
						}
					}
					
					
				}
				
			}
		});
		card11.setBounds(220, 258, 90, 100);
		frame.getContentPane().add(card11);
		
		JButton card10 = new JButton("");
		card10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (playing == true) {
					count++;
					
					if(count > 2) {
					}
					else if (count == 1)	{
						if (completed[9] == true) {
						}
						else {
							
							card10.setIcon(colect[counter1.get(9)]);
							Integer identity = counter1.get(9);
							history.add(identity);
							history1 = 9;
							
						}
					}
					
					else if (count == 2) {
						if (completed[9] == true) {
						}
						else {
							
							trys = (trys + 1);
							attempts.setText("" + trys);
							
							card10.setIcon(colect[counter1.get(9)]);
							int parse = history.get(0);
							if (counter1.get(9) == parse) {
								
								completed[9] = true;
								completed[history1] = true;
								System.out.println("done");
								
							}
							else {
								
								card10.setIcon(colect[counter1.get(9)]);
								System.out.println("wrong card.");
								
							}
						}
					}
					
					
				}
				
			}
		});
		card10.setBounds(120, 258, 90, 100);
		frame.getContentPane().add(card10);
		
		JButton card13 = new JButton("");
		card13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (playing == true) {
					count++;
					
					if(count > 2) {
					}
					else if (count == 1)	{
						if (completed[12] == true) {
						}
						else {
							
							card13.setIcon(colect[counter1.get(12)]);
							Integer identity = counter1.get(12);
							history.add(identity);
							history1 = 12;
							
						}
					}
					
					else if (count == 2) {
						if (completed[12] == true) {
						}
						else {
							
							trys = (trys + 1);
							attempts.setText("" + trys);
							
							card13.setIcon(colect[counter1.get(12)]);
							int parse = history.get(0);
							
							if (counter1.get(12) == parse) {
								
								completed[12] = true;
								completed[history1] = true;
								System.out.println("done");
								
							}
							else {
								
								card13.setIcon(colect[counter1.get(12)]);
								System.out.println("wrong card.");
								
							}
						}
					}
					
					
				}
				
			}
		});
		card13.setBounds(20, 369, 90, 100);
		frame.getContentPane().add(card13);
		
		JButton card16 = new JButton("");
		card16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (playing == true) {
					count++;
					
					if(count > 2) {
					}
					else if (count == 1)	{
						if (completed[15] == true) {
						}
						else {
							
							card16.setIcon(colect[counter1.get(15)]);
							Integer identity = counter1.get(15);
							history.add(identity);
							history1 = 15;
							
						}
					}
					
					else if (count == 2) {
						if (completed[15] == true) {
						}
						else {
							
							trys = (trys + 1);
							attempts.setText("" + trys);
							
							card16.setIcon(colect[counter1.get(15)]);
							int parse = history.get(0);
							
							if (counter1.get(15) == parse) {
								
								completed[15] = true;
								completed[history1] = true;
								System.out.println("done");
								
							}
							else {
								
								card16.setIcon(colect[counter1.get(15)]);
								System.out.println("wrong card.");
								
							}
						}
					}
					
					
				}
			}
		});
		card16.setBounds(320, 369, 90, 100);
		frame.getContentPane().add(card16);
		
		JButton card15 = new JButton("");
		card15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (playing == true) {
					count++;
					
					if(count > 2) {	
					}
					else if (count == 1)	{
						if (completed[14] == true) {
						}
						else {
							
							card15.setIcon(colect[counter1.get(14)]);
							Integer identity = counter1.get(14);
							history.add(identity);
							history1 = 14;
							
						}
					}
					
					else if (count == 2) {
						if (completed[14] == true) {
						}
						else {
							
							trys = (trys + 1);
							attempts.setText("" + trys);
							
							card15.setIcon(colect[counter1.get(14)]);
							int parse = history.get(0);
							
							if (counter1.get(14) == parse) {
								
								completed[14] = true;
								completed[history1] = true;
								System.out.println("done");
								
							}
							else {
								
								card15.setIcon(colect[counter1.get(14)]);
								System.out.println("wrong card.");
								
							}
						}
					}
					
					
				}
			}
		});
		card15.setBounds(220, 369, 90, 100);
		frame.getContentPane().add(card15);
		
		JButton card14 = new JButton("");
		card14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (playing == true) {
					count++;
					
					if(count > 2) {
					}
					else if (count == 1)	{
						if (completed[13] == true) {
						}
						else {
							
							card14.setIcon(colect[counter1.get(13)]);
							Integer identity = counter1.get(13);
							history.add(identity);
							history1 = 13;
							
						}
					}
					
					else if (count == 2) {
						if (completed[13] == true) {
						}
						else {
							
							trys = (trys + 1);
							attempts.setText("" + trys);
							
							card14.setIcon(colect[counter1.get(13)]);
							int parse = history.get(0);
							
							if (counter1.get(13) == parse) {
								
								completed[13] = true;
								completed[history1] = true;
								System.out.println("done");
								
							}
							else {
								
								card14.setIcon(colect[counter1.get(13)]);
								System.out.println("wrong card.");
								
							}
						}
					}
					
					
				}
			}
		});
		card14.setBounds(120, 369, 90, 100);
		frame.getContentPane().add(card14);
		
		JButton play = new JButton("play");
		play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playing = true;
				history.clear();
				attempts.setText("" + 0);
				trys = 0;
				count = 0;
				
				
				buttons[0] = card1;
				buttons[1] = card2;
				buttons[2] = card3;
				buttons[3] = card4;
				buttons[4] = card5;
				buttons[5] = card6;
				buttons[6] = card7;
				buttons[7] = card8;
				buttons[8] = card9;
				buttons[9] = card10;
				buttons[10] = card11;
				buttons[11] = card12;
				buttons[12] = card13;
				buttons[13] = card14;
				buttons[14] = card15;
				buttons[15] = card16;
				
				
				card1.setIcon(colect[8]);
				card2.setIcon(colect[8]);
				card3.setIcon(colect[8]);
				card4.setIcon(colect[8]);
				card5.setIcon(colect[8]);
				card6.setIcon(colect[8]);
				card7.setIcon(colect[8]);
				card8.setIcon(colect[8]);
				card9.setIcon(colect[8]);
				card10.setIcon(colect[8]);
				card11.setIcon(colect[8]);
				card12.setIcon(colect[8]);
				card13.setIcon(colect[8]);
				card14.setIcon(colect[8]);
				card15.setIcon(colect[8]);
				card16.setIcon(colect[8]);
				
				counter1.clear();
				counter2.clear();
				
				for (int i = 0; i < 16; i++) {		
					completed[i] = false;
					
					// resets the "done" value to each card.
				}
				for (int i = 0; i < 8; i++) {	
					counter2.add(i);
					counter2.add(i);
					
					// will make 00 11 22 33 44 55 66 77
					// so that each pairs of digits corresponding to itself will be assigned to 2 random cards.
				}
				for (int i = 0; i < 16; i++) {
					int randomNum = ThreadLocalRandom.current().nextInt(0, counter2.size());
					counter1.add(counter2.get(randomNum));
					counter2.remove(randomNum);
				}
			}
		});
		play.setBounds(10, 509, 89, 23);
		frame.getContentPane().add(play);
		
		JButton guess = new JButton("guess again");
		guess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (playing == true) {
					if (count >= 2) {
						
						for (int i = 0; i < completed.length; i++) {
							if (completed[i] == true) {
				
								buttons[i].setIcon(colect[9]); // image for good job

							}
										
							else {
								
								buttons[i].setIcon(colect[8]); // image for the brick wall
							   
							}	
						}
						history.remove(0);
						count = 0;
					}
					else {
					}
				}
				else {
				}
			}
		});
		guess.setBounds(109, 509, 122, 23);
		frame.getContentPane().add(guess);
		
		JButton exit = new JButton("exit");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		exit.setBounds(241, 509, 89, 23);
		frame.getContentPane().add(exit);
		
		JLabel lblNewLabel = new JLabel("hover over me");
		lblNewLabel.setToolTipText("Click Play to start, then click Guess Again after each guess.");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(330, 494, 94, 52);
		frame.getContentPane().add(lblNewLabel);
		
		attempts = new JTextField();
		attempts.setHorizontalAlignment(SwingConstants.CENTER);
		attempts.setEditable(false);
		attempts.setBounds(320, 8, 86, 20);
		frame.getContentPane().add(attempts);
		attempts.setColumns(10);
	}
}
