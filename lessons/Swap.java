package lessons;

public class Swap {
	
	public static void main(String[] args) {
		
		int[] myArray = {27, 1, 11, 49, 14, 26, 87};
		boolean swapped = false;
		
		while (swapped == false) {
			sorting(myArray, swapped);
		}
		
		
		for (int i = 0; i < myArray.length; i++) {
			
			System.out.println(myArray[i]);
			
		}
	}

	private static boolean sorting(int[] myArray, boolean swapped) {
		for (int i = 1; i < myArray.length; i++) {
			
			if (myArray[i - 1] > myArray[i]) {
				
				swapped = true;
				swap(myArray, i-1 , i);
				
				if (swapped == true) {
					
					sorting(myArray, swapped);
					
				}
				
			}
			
		}
		return swapped;
	
	}

	private static int[] swap(int[] a, int x, int y) {
		
		int thirdVar = a[x];
		a[x] = a[y];
		a[y] = thirdVar;
		
		return a;
		
		
	}

}
