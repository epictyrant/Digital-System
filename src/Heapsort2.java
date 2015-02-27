
public class Heapsort2 {
	//  intital varibles they are empty and will get their values 
	// when we call main and the following function execute

	static int created, times;
	static int zero=0;
	static int[]array, original;
	
    public static void main(String[] args) {
        int []input={4,1,3,2};
        zero=input.length;
        sort(input);
        for(int i=0;i<input.length;i++){
            System.out.print(input[i] + " ");
        }
    }
	// takes an array 
    private static int N;
    /* Sort Function */
    public static void sort(int arr[])
    {       
        heapify(arr);        
        for (int i = N; i > 0; i--)
        {
            swap(arr,0, i);
            N = N-1;
            maxheap(arr, 0);
        }
    }     
    /* Function to build a heap */   
    public static void heapify(int arr[])
    {
        N = arr.length-1;
        for (int i = N/2; i >= 0; i--)
            maxheap(arr, i);        
    }
    /* Function to swap largest element in heap */        
    public static void maxheap(int arr[], int i)
    { 
        int left = 2*i ;
        int right = 2*i + 1;
        int max = i;
        for(int i1=0;i1<zero;i1++){
            System.out.print(arr[i1] + " ");
        }
    	System.out.println();
        if (left <= N && arr[left] > arr[i])
            max = left;
        if (right <= N && arr[right] > arr[max])        
            max = right;
 
        if (max != i)
        {
            swap(arr, i, max);
            maxheap(arr, max);
        }
    }    
    /* Function to swap two numbers in an array */
    public static void swap(int arr[], int i, int j)
    {

        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp; 
    	for(int i1=0;i1<zero;i1++){
            System.out.print(arr[i1] + " ");
        }
    	System.out.println("in swap");
    }   
}