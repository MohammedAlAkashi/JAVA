public class BinaryLinearSearch {

    public boolean iterativeBinarySearch(int[] array, int keyword) {
        int left = 0;
		    int right = array.length - 1;
    		int middle = ((left + right) / 2);
    
    		while (left <= right) {
    
    			// match found, no need to continue
    			if (keyword == array[middle]) {
    				return true;
    			}
    
    			// match not found, might be on left side
    			else if (keyword < array[middle]) {
    				right = middle - 1;
    				middle = (left + right) / 2;
    			}
    
    			// match not found, might be on right side
    			else if (keyword > array[middle]) {
    				left = middle + 1;
    				middle = (left + right) / 2;
    			}
    		}
    
    		return false;
      }

}
