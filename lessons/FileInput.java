package lessons;

import java.util.ArrayList;
import java.io.*;


public class FileInput {
	public static void main(String[] args) {
		
		// Variable
		ArrayList<String> myColours = new ArrayList();
		String colour;
		BufferedReader br = null;
		
		try {
			
			// open file, located under Java Project folder (not src folder)
			// right-click repository -> new -> file -> "filename.txt"
			
			br = new BufferedReader (new FileReader("colors.txt"));
			
			while ((colour = br.readLine()) != null) {
				
				myColours.add(colour);
				
			}
			
			br.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < myColours.size(); i++) {
			
			System.out.println(myColours.get(i));
			
		}
	}
}
