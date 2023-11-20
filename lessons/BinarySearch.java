package lessons;

public class BinarySearch {
	
	static int numSearches = 0;
	
	public static void main(String[] args) {
		
		String[] sortedArray = {"black", "blue", "brown", "green", 
				"orange", "peach", "purple", "red", "salmon", "white"};
		String pattern = "cyan";
		
		
		// SORTED BINARY TREE
		System.out.println(binarySearch(sortedArray, pattern));
		System.out.println(numSearches);
		
		
		
	}
	
	private static boolean binarySearch(String[] searchArray, String pattern) {
	
		int left = 0;
		int right = 9;
		int middle = ((left + right) / 2);
		
		while (left <= right) {
			
			numSearches++;
			
			// match found, no need to continue
			if (pattern.compareTo(searchArray[middle]) == 0) {
				return true;
			}
			
			// match not found, might be on left side
			else if (pattern.compareTo(searchArray[middle]) < 0) {
				right = middle - 1;
				middle = (left + right) / 2;
			}
			
			// match not found, might be on right side
			else if (pattern.compareTo(searchArray[middle]) > 0) {
				left = middle + 1;
				middle = (left + right) / 2;
			}
		}
		
		return false;
	}
}
