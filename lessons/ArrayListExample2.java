package lessons;

import java.util.ArrayList;
import java.util.Comparator; // need for sorting

public class ArrayListExample2 {
	public static void main(String[] args) {
		ArrayList<String> row1 = new ArrayList();
		
		row1.add(0, "A");
		row1.add(1, "B");
		row1.add(2, "C");
		row1.add(3, "D");
		row1.add(4, "E");
		
		System.out.println(row1.toString());
		row1.add(1, "F");
		System.out.println(row1.toString());
		System.out.println(row1.get(1));
		System.out.println(row1.contains("E"));
		System.out.println(row1.indexOf("F"));
		System.out.println(row1.lastIndexOf("F"));
		
		row1.remove("F");
		System.out.println(row1.toString());
		// A - Z. lowest number to highest number.
		row1.sort(Comparator.naturalOrder());
		System.out.println(row1.toString());
		
		
	}

}
