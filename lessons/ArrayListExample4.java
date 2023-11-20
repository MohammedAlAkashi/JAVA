package lessons;

import java.util.ArrayList;

public class ArrayListExample4 {
	public static void main(String[] args) {
		ArrayList<String> row1 = new ArrayList();
		ArrayList<String> row2 = new ArrayList();
		ArrayList<String> row3 = new ArrayList();
		ArrayList<String> row4 = new ArrayList();
		
		ArrayList<ArrayList<String>> my2DArrayList = new ArrayList();
		
		row1.add("2000");
		row1.add("Volkswagon");
		row1.add("Beetle");
		row1.add("Blue");
		
		row2.add("1987");
		row2.add("Volkswagon");
		row2.add("Beetle");
		row2.add("White");
		
		row3.add("2012");
		row3.add("Dodge");
		row3.add("Grand Caravan");
		row3.add("Black");

		row4.add("2018");
		row4.add("BMW");
		row4.add("X1");
		row4.add("Black");
		
		my2DArrayList.add(row1);
		my2DArrayList.add(row2);
		my2DArrayList.add(row3);
		my2DArrayList.add(row4);
		
		// print the cars
		
		for (int i = 0; i < my2DArrayList.size(); i++) {
			
			for (int j = 0; j <row1.size(); i++) {
				
				System.out.println(my2DArrayList.get(i));
				
			}
			
		}
		
	}

}
