package Sandbox;

// import section

import javax.swing.JOptionPane;

public class JavaLoginPage {
	public static void main(String[] args) {
		
		// Variables.
		boolean loop = true;
		String username = "Mohammed Al-Akashi";
		
		while(loop) {
			String login = JOptionPane.showInputDialog("Enter your password: ");
			System.out.println(login);
			
			// Login page
			
			try {
				
				if (login.equals("password")) {
					
					JOptionPane.showMessageDialog(null, "welcome " + username);
					loop = false;
					
				}
				else {
					
					JOptionPane.showMessageDialog(null, "invalid credentials.");
					loop = true;
				}
			} catch(Exception e){System.out.println(e);}
			
		}
	}

}
