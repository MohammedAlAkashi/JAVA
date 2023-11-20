package Sandbox;

// imports
import java.util.ArrayList;

public class TwoDArrayListExample {
	public static void main(String[] args) {
		
		// 2D ArrayList = a dynamic list of lists
		// You can change the size of these lists during runtime.
		
		// 2D array list
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		
		// this is a normal array list, not a 2D one
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("bread");
		bakeryList.add("pasta");
		bakeryList.add("donuts");
		
		ArrayList<String> produceList = new ArrayList();
		produceList.add("tomatos");
		produceList.add("peppers");
		produceList.add("cucumber");
		
		ArrayList<String> drinkList = new ArrayList();
		drinkList.add("soda");
		drinkList.add("water");
		drinkList.add("coffee");
		
		System.out.println(bakeryList);		
		
		// gets data in specified index, in this case; its bread.
		System.out.println(bakeryList.get(0));
		
		// you can combine lists.
		groceryList.add(produceList);
		groceryList.add(bakeryList);
		groceryList.add(drinkList);
		System.out.println(groceryList);
		
		// gets data in specified index, and then again
		// in a specified index ,in this case; its peppers.
		System.out.println(groceryList.get(0).get(1));
		
	}

}
