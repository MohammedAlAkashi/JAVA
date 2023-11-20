package Sandbox;

public class SwitchExamples {
	public static void main(String[] args) {
		
		String day = "Friday";
		
		// switches are good when you have a lot of if statements
		// its also good to compare values? like days of the week.
		// note, always add a "break" to get out of the switch. 
		// so that the code can continue to run without getting
		// stuck in the "case".
		// also, switches need a variable to compare the data that
		// it has, in this example, I gave it a day so that it can
		// compare it to the list of the days I gave it to.
		// with the data provided, it will correspond accordingly to
		// the variable "day"
		// there is also a "default" which is a else statement if there
		// is no match.
		
		switch(day) {
		
			case "Sunday": System.out.println("It is Sunday");
			break;
			case "Monday": System.out.println("It is Monday");
			break;
			case "Tuesday": System.out.println("It is Tuesday");
			break;
			case "Wensday": System.out.println("It is Wensday");
			break;
			case "Thursday": System.out.println("It is Thursday");
			break;
			case "Friday": System.out.println("It is Friday");
			break;
			case "Saturday": System.out.println("It is Saturday");
			break;
			default: System.out.println("That is not a day");
		
		}
		
	}

}
