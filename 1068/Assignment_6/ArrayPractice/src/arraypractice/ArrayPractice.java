package arraypractice;

/**
 *
 * @author jfiore
 */

public class ArrayPractice {
    /* sets every item in A[] to initialValue */
	 public static void initialize(int A[], int initialValue) {
	    	
    	// Loop through the array and assign given initialValue to each element in array
    	for(int i = 0; i < A.length; i++) {
    		A[i] = initialValue;
    	}
        return;
    }

    /* returns the average of the items in A
     * Be careful: A[] is an array of int and the method returns
     * double. What do we do to handle this? */
	 public static double average(int A[]) {
    	double sum = 0;
    	for(int i = 0; i < A.length; i++) {
    		sum = sum + A[i];
    	}    	
        return sum/A.length;
     }

    /* returns the number of times that x appears in A[] */
	 public static int numOccurrences(int A[], int x) {
    	int count = 0;
    	for(int i = 0; i < A.length; i++) {
    	
    		if(x == A[i]) {
    			count++;
    		}
    	}
        return count;
	 }


    /* returns the index of the first occurrence of
     * x in A[] or -1 if x doesn't exist in A[] */
	 public static int find(int A[], int x) {
		 
    	for(int i = 0; i < A.length; i++) {
    		if(x == A[i]) {
    			return i;
    		}
    	}
        return -1;
	 }

    /* Returns the index of the first occurrence of
     * item within the first n elements of A[] or -1
     * if item is not among the first n elements of A[] */
	 public static int findN(int A[], int item, int n) {
		 
	    	for(int i = 0; i < n && i < A.length; i++) {
	    		
	    		if(item == A[i])
	    			return i;
	    	}
	        return -1;
	    }

    /* returns the index of the last occurrence of
     * x in A[] or -1 if x doesn't exist in A[] */
    public static int findLast(int A[], int x) {
    	
    	for(int i = A.length - 1; i >= 0 ; i--) {
    		
    		if(x == A[i]) {
    			return i;
    		}
    	}
        return -1;
    }

    /* returns the largest item found in A */
    public static int largest(int A[]) {
    	
    	if(A.length <= 0) {
    		return -1;
    	}
    	int large = A[0];
    	for(int i = 1; i < A.length; i++) {
    		
    		if(large < A[i]) {
    			
    			large = A[i];
    		}
    	}
        return large;
     }

    /* returns the index of the largest item found in A */
    public static int indexOfLargest(int A[]) {
    	int largest = largest(A);
    	return find(A, largest);
    }

    /* returns the index of the largest odd number
     * in A[] or -1 if A[] contains no odd numbers */
    public static int indexOfLargestOdd(int A[]) {
    	
    	if(A.length <= 0) {
    		return -1;
    	}
    	int largeOdd = 1;
    	for(int i = 0; i < A.length; i++) {
    		
    		if(A[i] % 2 != 0) {
    			
    			if(largeOdd < A[i]) {
    				largeOdd = A[i];
    			}
    		}
    	}
        return find(A, largeOdd);
     }

    /* inserts n into A[] at A[index] shifting all */
    /*  the previous items one place to the right. For example */
    /*  if A is  */
    /*   |---+---+---+---+---+---+---+---+---+---| */
    /*   | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | */
    /*   |---+---+---+---+---+---+---+---+---+---| */
    /*   | 5 | 7 | 6 | 9 | 4 | 3 | 0 | 0 | 0 | 0 | */
    /*   |---+---+---+---+---+---+---+---+---+---| */

    /*   and we call insert(A, 15, 1), A then becomes */

    /*   |---+----+---+---+---+---+---+---+---+---| */
    /*   | 0 |  1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | */
    /*   |---+----+---+---+---+---+---+---+---+---| */
    /*   | 5 | 15 | 7 | 6 | 9 | 4 | 3 | 0 | 0 | 0 | */
    /*   |---+----+---+---+---+---+---+---+---+---| */
    /*  the element in A[] that's in the right-most */
    /*    position is removed.                      */
    /*                                              */
    /*  if index < 0 or index >= A.length-1, the method */
    /*                                    does nothing */
    public static void insert(int A[], int n, int index) {
    	int temp;
    	for(int i = 0;i < A.length;i++) {
    		if(i >= index && i != A.length-1) {
    			temp = A[i];
    			A[i] = n;
    			n = temp;
    		}
    	}
    	
        return;
     }

    /* returns a new array consisting of all of the
     * elements of A[] */
    public static int[] copy(int A[]) {
    	
    	int copy[] = new int[A.length];
    	for(int i = 0; i < A.length; i++) {
    		
    		copy[i] = A[i];
    	}
        return copy;
    }

    /* Returns a new array consisting of all of the
       first n elements of A[]. If n>A.length, returns a
       new array of size n, with the first A.length elements
       exactly the same as A, and the remaining n-A.length elements
       set to 0. If n<=0, returns null. */
    public static int[] copyN(int A[], int n) {
    	
    	if(n <= 0) {
    		return null;
    	}
    	else {
    		int[] copy = new int[n];    		
    		for(int i = 0; i < A.length && i < n; i++) {
    			copy[i] = A[i];
    		}
    		return copy;
    	}
    }

    /* returns a new array consisting of all of the
     * elements of A[] followed by all of the
     * elements of B[]. For example, if 
     A[] is: {10,20,30} and 
     B[] is: {5, 9, 38}, the method returns the
     array : {10,20,30,5,9,38} */
    public static int[] copyAll(int A[], int B[]) {
    	int copy[] = new int[A.length + B.length];
    	for(int i = 0; i < A.length; i++) {
    		copy[i] = A[i];
    	}
    	
    	for(int i = A.length, j = 0; j < B.length; i++,j++) {
    		copy[i] = B[j];
    	}
    	
    	return copy;
    }

    /* reverses the order of the elements in A[].
     * For example, if A[] is:
     {10,20,30,40,50}, after the method, A[] would
     be {50,40,30,20,10} */
    public static void reverse(int A[]) {
    	int temp;
    	for(int i = 0, j = A.length-1; i < j; i++, j--) {
    		temp = A[j];
    		A[j] = A[i];
    	
    		A[i] = temp;
    	}
    	
    	for(int i = 0;i < A.length; i++) {
    		System.out.print(A[i]+ " ");
    	}
    	
        return;
     }

    /* Extra credit:
     *
     * Returns a new array consisting of all of the
     * elements of A, but with no duplicates. For example,
     * if A[] is {10,20,5,32,5,10,9,32,8}, the method returns
     * the array {10,20,5,32,9,8} */
    
    public static int[] uniques(int A[]) {
    	int[] copy = new int[A.length];
    	if(A.length <= 0) {
    		return copy; 
    	}  		
    	int uniqueCount = 0;
    	copy[uniqueCount++] = A[0];
   
    	
        return copyN(copy, uniqueCount);
    }

    public static void main(String[] args) {
    	
		
    }
}
