package sandbox;


public class test{
	public static void main(String[] args) {
		
	    int [] myArray = {10, 73, 54, 13, 1, 87, 13, 4, 67, 90};
	    
			
		selectionSort(myArray);
			
		for (int i = 0; i < myArray.length; i++) {
				
			System.out.println(myArray[i]);
				
		}
			
	}
	
	public static void selectionSort(int[] a) {
		
		for (int i = 0; i < a.length - 1; i++) {
			
			for (int j = i + 1; j < a.length; j++) {
				
				if (a[j] < a[i]) {
					
					swap(a, i, j);
					
				}
				
			}
			
		}
		
	}

	private static int[] swap(int[] a, int x, int y) {
		
		int thirdVar = a[x];
		a[x] = a[y];
		a[y] = thirdVar;
		
		return a;
		
	}
}