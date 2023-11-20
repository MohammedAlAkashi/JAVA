package lessons;

public class BubbleSort {
	public static void main(String[] args) {
		
		int[] myArray = {49, 14, 36, 27, 11, 1, 87, 0, 9};
		
		bubbleSort(myArray);
		
		for (int i = 0; i < myArray.length; i++) {
			
			System.out.println(myArray[i]);
			
		}
		
	}
	
	
	// DESCRIPTION - Sorts array of integers in ascending order.
	//             - requires user-defined swap method
	// PARAMETERS - int[] a
	// RETURN TYPE - void
	
	public static void bubbleSort(int[] a) {
		
		boolean elementSwapped = true;
		
		while (elementSwapped == true) {
			
			elementSwapped = false;
			
			for (int i = 0; i < a.length - 1; i++) {
				
				if (a[i] > a[i+1]) {
					
					swap(a, i, i+1);
					
					elementSwapped = true;
					
				}
				
			}
			
			
		}
		
	}
	
	
	
	// DESCRIPTION - Swaps elements in a array at index x with index y
	// PARAMETERS - int[] a, int x, int y
	// RETURN TYPE - void
	
	private static void swap(int[] a, int x, int y) {
		
		int temp = a[x];
		
		a[x] = a[y];
		
		a[y] = temp;
		
	}

}
