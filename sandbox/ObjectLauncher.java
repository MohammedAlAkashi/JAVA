package sandbox;

import sandbox.myObjects.*;

public class ObjectLauncher {
	public static void main(String[] args) {
		
		Animal myAnimal1 = new Animal();
		Animal myAnimal2 = new Animal();
		Animal myAnimal3 = new Animal();
		
		Fruit myFruit1 = new Fruit();
		Fruit myFruit2 = new Fruit();
		Fruit myFruit3 = new Fruit();
		
		Vegetable myVegetable1 = new Vegetable();
		Vegetable myVegetable2 = new Vegetable();
		Vegetable myVegetable3 = new Vegetable();
		
		Robot myRobot1 = new Robot();
		Robot myRobot2 = new Robot();
		Robot myRobot3 = new Robot();
		
		Planet myPlanet1 = new Planet();
		Planet myPlanet2 = new Planet();
		Planet myPlanet3 = new Planet();
		
		myAnimal1.setAge(100);
		
		System.out.println(myAnimal1.getAge());
		
		
		
		
	}

}
