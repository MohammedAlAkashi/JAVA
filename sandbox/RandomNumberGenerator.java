package Sandbox;

//imports
import java.util.Random;

public class RandomNumberGenerator {
	public static void main(String[] args) {
		
		
		// not truly random but it works.
		Random random = new Random();
		
		// picks a "random" number between 0 - 6, you can make it
		// to where its between 1 - 6 by doing
		// int x = random.nextInt(6)+1;
		// doing random.nextBoolean will choose between true and false
		// random.nextDouble picks a random decimal between 0 - 1
		// example: 0.657182
		 
		int x = random.nextInt(7);
		System.out.println(x);
		
	}

}
