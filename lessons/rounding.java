package Lessons;

public class rounding {
	public static void main(String[] args) {
		
		double myDouble1 = 13.69;
		double myDouble2 = 13.44;
		double myDouble3 = 43.21;
		
		double Final = (myDouble3 * 100);
		Final = Math.round(Final);
		
		System.out.println(Math.round(myDouble1));
		System.out.println(Math.round(myDouble2));
		
		System.out.println(Final / 100);
	}

}
