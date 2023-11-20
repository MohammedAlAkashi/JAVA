package lessons;

public class InsertionSort {
	public static void main(String[] args) {
		
		int[] myArray = {6, 3, 8, 2, 9, 0};
		
		interstionSort(myArray);
		
		for (int i = 0; i < myArray.length; i++) {
			
			System.out.println(myArray[i]);
			
		}
		
	}
	
	// DESCRIPTION - Sorts array of integers in ascending order.
	//             - requires user-defined swap method
	// PARAMETERS - int[] a
	// RETURN TYPE - void
	
	public static void interstionSort(int[] a) {
		
		for (int i = 1; i < a.length; i++) {
			
			int j = i;
			
			while ((j > 0) && (a[j - 1] > a[j])) {
				
				swap(a, j, j - 1);
				j--;
				
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
