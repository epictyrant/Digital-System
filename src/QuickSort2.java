import java.util.Arrays;


/*public class QuickSort2 {
	
	static int length, globalLow, globalhigh, median;
	static int[]array;
	
	
	
	public static void main(String[] args) {
    	//   change input here to make it work
		// start timer for the program
    	long StartTime = System.nanoTime();
        int []input={4,5,2,1};
        array=input;
        sort(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
            
        }
        long endTime = System.nanoTime();

		System.out.println("Took "+(endTime - StartTime) + " ns");
    }

	static void sort(int[] input){

			length=array.length-1;

			quicksort(0,length);
	
	}
	
	static void quicksort(int low, int high) {
	    int i = low, j = high;
	    // Get the pivot element from the middle of the list
	    int pivot = array[low + (high-low)/2];

	    // Divide into two lists
	    while (i <= j) {
	      // If the current value from the left list is smaller then the pivot
	      // element then get the next element from the left list
	      while (array[i] < pivot) {
	        i++;
	      }
	      // If the current value from the right list is larger then the pivot
	      // element then get the next element from the right list
	      while (array[j] > pivot) {
	        j--;
	      }

	      // If we have found a values in the left list which is larger then
	      // the pivot element and if we have found a value in the right list
	      // which is smaller then the pivot element then we exchange the
	      // values.
	      // As we are done we can increase i and j
	      if (i <= j) {
	        swap(i, j);
	        i++;
	        j--;
	      }
	    }
	    // Recursion
	    if (low < j)
	      quicksort(low, j);
	    if (i < high)
	      quicksort(i, high);
	  }

	
	
	//toke this function from my heapsort because i can
    static void swap(int arrsize, int flip ){
    	//a temp equation to hold the location in the array
    	int hold= array[arrsize];
    	// overrides the that location
    	array[arrsize]=array[flip];
    	//and now replaces the max with temp
    	array[flip]=hold;
		//System.out.println("in swap ");
    }
    import java.util.Arrays;

    /*
     * To change this template, choose Tools | Templates
     * and open the template in the editor.
     */

    /**
     *
     * @author Jon
     */
    public class QuickSort2 {
        public static void main(String[] args)
        {
            int[] A = {6,10,1,8,7,9,3,2,4,11};
            System.out.println(A.length-1);
            quicksort(A, 0, A.length-1);
            for(int i=0; i<A.length; i++)
            System.out.print(A[i] + " ");
            
        }
        public static void quicksort(int[] a, int startIndex, int endIndex)
        {
            System.out.println(Arrays.toString(a));
            if(startIndex >= endIndex)
            {
                
            }
            else
            {
                System.out.println(Arrays.toString(a));
                int pivotIndex = partition(a, startIndex, endIndex);
                System.out.println("hello");
                System.out.println(startIndex);
                System.out.println(pivotIndex-1);
                quicksort(a, startIndex, pivotIndex-1);
                quicksort(a, pivotIndex, endIndex-1);
                
            }
        }
        public static int partition(int[] a, int startIndex, int endIndex)
        {
            
            int pivotIndex = (startIndex+(endIndex-startIndex)/2);
            int pivot = a[pivotIndex];
            System.out.println(startIndex);
            System.out.println(endIndex + "pussy");
            swap(a, pivotIndex, endIndex);
            int centerIndex = startIndex;
            for(int j=startIndex; j<endIndex-1; j++)
            {
                if(a[j] < pivot)
                {
                    System.out.println(centerIndex);
                    System.out.println(endIndex);
                    swap(a, j, centerIndex);
                    centerIndex = centerIndex + 1;
                }
            }
            for(int j=endIndex; j>pivot; j--)
            {
                if(a[j] < pivot)
                {
                    System.out.println(centerIndex);
                    System.out.println(endIndex);
                    swap(a, j, centerIndex);
                    centerIndex = centerIndex + 1;
                }
            }
            System.out.println(centerIndex+ " gay");
            System.out.println(endIndex);
            swap(a, centerIndex, endIndex);
            return centerIndex;
        }
        public static void swap(int[] a, int one, int two)
        {
            int temp = a[one];
            a[one]=a[two];
            a[two] = temp;
        }
    }
	

