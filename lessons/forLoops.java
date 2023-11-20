package lessons;

import java.util.Scanner;

public class forLoops {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numofloops = 5;
		
		System.out.println("how much times to loop");
		numofloops = sc.nextInt();
		
		for(int i = 0; i <= numofloops; i++) {
			
			System.out.println("h e l l o");
			
		}
	}

}
