package lessons;

public class TwoDArrayChocolateBars {
	public static void main(String[] args) {
		
		int rows = 4;
		int cols = 2;
		double[][] inventory = new double[rows][cols];
		double retailValue = 0.0;
		double valueWithTax = 0.0;
		int numBars = 0;
		final double TAX_RATE = 0.13;
		
		// Mars
		
		inventory[0][0] = 23;
		inventory[0][1] = 1.49;
		
		// Kit Kat
		
		inventory[1][0] = 13;
		inventory[1][1] = 1.29;
		
		// O Henry
		
		inventory[2][0] = 42;
		inventory[2][1] = 1.69;
		
		// Snickers
		
		inventory[3][0] = 27;
		inventory[3][1] = 1.39;
		
		double sum = 0;
		double price = 0;
		
		for (int i = 0; i < inventory.length; i++) {
			
			sum = (sum + inventory[i][0]);

		}
		
		for (int i = 0; i < inventory.length; i++) {
			
			retailValue = retailValue + (inventory[1][0] * inventory[1][1]);
			
		}
		
		System.out.println(retailValue);
		System.out.println(sum);
		System.out.println(price);
		System.out.println("\n\n");
		
		
		valueWithTax = retailValue + (retailValue + TAX_RATE);
		valueWithTax = valueWithTax * 100;
		valueWithTax = Math.round(valueWithTax);
		System.out.println(valueWithTax);
	}

}
