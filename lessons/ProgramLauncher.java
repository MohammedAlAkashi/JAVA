package lessons;

import lessons.myObjects.*;
import java.util.Scanner;

public class ProgramLauncher {
	public static void main(String[] args) {
		
		String myString = "some text";
		
		String myString2 = new String("some more random text");
		
		String myString3 = new String();
		
		Car myVehicle1 = new Car(myString3, myString3, myString3, 0);
		Boat myBoat = new Boat();
		
//		myBoat.setColor("blue");
//		myBoat.setMake("blue boat");
//		myBoat.setModel("1978");
//			
//		System.out.println(myBoat.getMake());
//		System.out.println(myBoat.getModel());
//		System.out.println(myBoat.getColor());
//		
//		System.out.println(myBoat.toString());]
		
		myVehicle1.setAirbags(4);
		System.out.println(myVehicle1.getAirbags());
		
	}

}
