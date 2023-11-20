package sandbox;

import java.util.concurrent.ThreadLocalRandom;

public class something {
	public static void main(String[] args) {
		
		int randomNum = ThreadLocalRandom.current().nextInt(0, 16 + 1);
		System.out.println(randomNum);
		
	}

}
