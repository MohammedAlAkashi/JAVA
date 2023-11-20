package lessons;

public class LinearSearch {
	
	// Global counter (for lesson only)
	static int numSearches = 0;
	
	public static void main(String[] args) {
		
		String[] unSortedArray = {"peace", "blue", "salmon", "brown", "green", 
				"orange", "purple", "red", "black", "white"};
		String[] sortedArray = {"black", "blue", "brown", "green", 
				"orange", "peach", "purple", "red", "salmon", "white"};
		
		String pattern = "cyan";
		
		System.out.println(unsortedLinearSearch(unSortedArray, pattern));
		System.out.println(numSearches);
		numSearches = 0;
		System.out.println(sortedLinearSearch(sortedArray, pattern));
		System.out.println(numSearches);
		
	}
	
	
	// DESCRIPTION - Returns true if pattern matched in array. Array must be sorted.
	// PARAMETERS - String[], String
	// RETURN TYPE - boolean
	private static boolean sortedLinearSearch(String[] sortedArray, String pattern) {
		for (int i = 0; i < sortedArray.length; i++) {
			numSearches++;
			if(sortedArray[i].compareTo(pattern) == 0) {
				return true;
			}
			if (sortedArray[i].compareTo(pattern) > 0) {
				return false;
			}
		}
		
		return false;
	}

	// DESCRIPTION - Returns true if pattern matched in array
	// PARAMETERS - String[], String
	// RETURN TYPE - boolean

	private static boolean unsortedLinearSearch(String[] unSortedArray, String pattern) {
		for (int i = 0; i < unSortedArray.length; i++) {
			numSearches++;
			if (unSortedArray[i].equals(pattern)) {
				
				return true;
				
			}	
		}
		
		return false;
		
	}
}
