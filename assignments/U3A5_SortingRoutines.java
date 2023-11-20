package assignments;
public class U3A5_SortingRoutines {

    public static void main(String[] args) {

        // unsorted data
        int[] myIntegers = {9, 7, 8, 6, 3, 5, 4, 1, 2, 0};
        String[] myStrings = {"dog", "cat", "horse", "opposum", "hippopotamus"};
        
        // sort integers ascending
        selectionSortInt(myIntegers, 0, 1);
        System.out.println("Integers assorted in ascending order: ");
        for (int i = 0; i < myIntegers.length; i++) 
            System.out.print(myIntegers[i] + " ");
        
        // sort integers descending
        selectionSortInt(myIntegers, 0, 2);
        System.out.println("\n\nIntegers assorted in descending order: ");
        for (int i = 0; i < myIntegers.length; i++) 
            System.out.print(myIntegers[i] + " ");
        
        // sorted Strings ascending
        selectionSortString(myStrings, 0, 1);
        System.out.println("\n\nStrings assorted in ascending order: ");
        for (int i = 0; i < myStrings.length; i++) 
            System.out.print(myStrings[i] + " ");
        
        // sorted Strings descending
        selectionSortString(myStrings, 0, 2);
        System.out.println("\n\nStrings assorted in descending order: ");
        for (int i = 0; i < myStrings.length; i++) 
            System.out.print(myStrings[i] + " ");

    }


    // DESCRIPTION: Recursively sorts integers in ascending or descending order.
    //                            Requires user-defined swapInt(x, y) method.
    // PARAMETERS: array - array of integers
    //                            recursiveIndex - set to 0
    //                            order - 1 for ascending, 2 for descending
    // RETURN TYPE - void
    public static void selectionSortInt(int[] array, int recursiveIndex, int order) {
    	
    	
    	if (order == 1) {
			while (recursiveIndex < array.length) {
				int j = recursiveIndex + 1;
				if (j < array.length) {
					if (array[j] < array[recursiveIndex]) {
						swapInt(array, recursiveIndex, j);
						recursiveIndex++;
						selectionSortInt(array, recursiveIndex, 1);
					}	
				}
				else {
					recursiveIndex++;
				}
			}
    	}
    }

    
    // DESCRIPTION: Recursively sorts Strings in ascending or descending order.
    //                            Requires user-defined swapString(x, y) method.
    // PARAMETERS: array - array of Strings
    //                            recursiveIndex - set to 0
    //                            order - 1 for ascending, 2 for descending
    // RETURN TYPE - void
    public static void selectionSortString(String[] array, int recursiveIndex, int order) {
    	if (order == 1) {
			for (int i = recursiveIndex; i < array.length - 1; i++) {
				
				for (int j = i + 1; j < array.length; j++) {
					
					int ji = (char) array[j].charAt(0);
					int ij = (char) array[i].charAt(0);
					
					if (ji < ij) {
						
						swapString(array, i, j);
						
					}
					
				}
				
			}
    	}
    	else if (order == 2) {
    		
			for (int i = recursiveIndex; i < array.length - 1; i++) {			
				for (int j = i + 1; j < array.length; j++) {
					
					int ji = (char) array[j].charAt(0);
					int ij = (char) array[i].charAt(0);
					
					if (ji > ij) {
						
						swapString(array, i, j);
						
					}	
				}	
			}
    	}
    }

    
    // DESCRIPTION: Swaps integers at index x with index y.
    // PARAMETERS: a - array of integers
    //                            x - index of integer to swap with y
    //                            y - index of integer to swap with x
    // RETURN TYPE: void
    public static void swapInt(int[] a, int x, int y)  {
    	
    	
    	System.out.println("Inside swap method");
            
		int thirdVar = a[x];
		a[x] = a[y];
		a[y] = thirdVar;
		
		
		
    }
    
    
    // DESCRIPTION: Swaps Strings at index x with index y.
    // PARAMETERS: a - array of Strings
    //                           x - index of String to swap with y
    //                           y - index of String to swap with x
    // RETURN TYPE: void
    public static String[] swapString(String[] a, int x, int y)  {

		String thirdVar = a[x];
		a[x] = a[y];
		a[y] = thirdVar;
		
		return a;
    	
    }   
}