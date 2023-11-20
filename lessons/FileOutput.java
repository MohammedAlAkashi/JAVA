package lessons;

import java.util.ArrayList;
import java.io.*;

public class FileOutput {
	public static void main(String[] args) {
		
		String[] cheeses = {"kraft singles", "gouda", "bie", "parmesean", "havarti"};
		
		try {
			FileOutputStream fout = new FileOutputStream("cheese.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			
			// Specifying ISO standard for file output
			OutputStreamWriter out = new OutputStreamWriter(bout, "8859_1");
			
			// Write contents from array
			for (int i = 0; i < cheeses.length; i++) {
				
				out.write(cheeses[i] + "\n");
				
			}
			
			// forces data to be written
			out.flush();
			
			// clear memory			
		}
		catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
}
