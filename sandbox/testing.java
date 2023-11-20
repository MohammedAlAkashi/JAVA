package sandbox;


public class testing {
	public static void main(String[] args) {
		
		int first = 187;
		int second = 15;
		int loop = 0;
		
		gcf(first, second, loop);
		
	}
	
	// takes 2 parameters, first and second number and finds the greatest common factor
	
	private static void gcf(int first, int second, int loop) {
		
		if (loop == 0) {
			System.out.println(first);
			System.out.println(second);
			first = (first % second);
			loop++;
			if (first > 1) {
				gcf(first, second, loop);
			}
		}
		else if (loop == 1){
			System.out.println(first);
			System.out.println(second);
			second = (second % first);
			loop = 0;
			if (first > 1) {
				gcf(first, second, loop);
			}
		}
	}

}
