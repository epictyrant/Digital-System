
public class QuickSort {
	
	static int length, globalLow, globalhigh, median;
	static int[]array;
	
	
	
	public static void main(String[] args) {
    	//   change input here to make it work
		// start timer for the program
    	long StartTime = System.nanoTime();
    	
    	// out input array
        int []input={6,10,1,8,7,9,3,2,4,11};
        // copy it to our global
        array=input;
        //gives global varible the length of the array
        length=array.length-1;
        //sends to the quicksort
		quicksort(0,length);
      //prints out our array at the end
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
            
        }
        // record the end time of the program
        long endTime = System.nanoTime();
        //prints out the end time of the program
		System.out.println("Took "+(endTime - StartTime) + " ns");
    }

	// the quicksort function that has the lowest and highest as varibles
	static void quicksort(int bottom, int top){
		// copy our input varibles to the ones found in this function
		globalLow=bottom;
		globalhigh=top;
		// create a middle or pivot point
		median = array[(bottom+(top-bottom)/2)];

		//while the lowest varible is still small then we are fine
		while(globalLow<= globalhigh){
			//compares the location of the smaller one is still smaller mid point
			while(array[globalLow]<median){
				//make the small one bigger
				globalLow++;
			}
			//makes sure that the location of the 
			while(array[globalhigh]>median){
				//decrease it so that we can continue to sort
				globalhigh--;
			}
			//when the two intersect send it to swap
			if (globalLow<=globalhigh){
				swap(globalLow ,globalhigh);
				globalLow++;
				globalhigh--;
			}
		}
		
			// recursive part will put it bottom is less then high
		    if (bottom < globalhigh){
		        quicksort(bottom, globalhigh);
		    }
		    //similar but with high being passed
		      if (globalLow < top){
		        quicksort(globalLow, top);	
		      }
		}
		

	
	
	//took this function from my heapsort because i can
    static void swap(int arrsize, int flip ){
    	//a temp equation to hold the location in the array
    	int hold= array[arrsize];
    	// overrides the that location
    	array[arrsize]=array[flip];
    	//and now replaces the max with temp
    	array[flip]=hold;
		//System.out.println("in swap ");
    }

	
}
