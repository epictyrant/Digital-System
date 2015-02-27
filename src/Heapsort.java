
public class Heapsort {
	//  intital varibles they are empty and will get their values 
	// when we call main and the following function execute

	static int SizeofArray,  max ,l, r;
	static int[]array;
	// our main statement adjust the string here
    public static void main(String[] args) {
    	//   change input here to make it work
    	long StartTime = System.nanoTime();
        int []input={6,10,1,8,7,9,3,2,4,11};
        // sends it to our heap creator
        heap(input);
        //prints out our array
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
            
        }
        long endTime = System.nanoTime();

		System.out.println("Took "+(endTime - StartTime) + " ns");
    }
    //creates the heap and sorts it
        static void heap(int[] arraypass){
        	// copies the array into a main array
        	array=arraypass;
        	//makes a semiglobal array size
        	SizeofArray= array.length-1;
        	//send our array and half the array size to x
        	for(int x= SizeofArray/2; x>=0; x--){
        		makeheap(array, x);
        	}
        	// once again swaps the size of the array after spliting it up
        	for (int y =SizeofArray; y>0; y--){
        		swap(0,y);
        		// minus one to the size of the array as it shrinks
        		SizeofArray=SizeofArray-1;
        		makeheap(array, 0);
        	
        	}
        }
        
       static void makeheap(int[] input, int size ){
        	l=2*size;
        	r=2*size+1;
        	for(int i=0;i<array.length;i++){
                System.out.print(array[i] + " ");
            }
        	System.out.println("");
        	//checks the left hand size
        	if (l<= SizeofArray && input[l]>input[size]){
        		max=l;
        	}
        	else
        	// makes it so when the first statement fail right works
        		max=size;
        	//}
        	if(r<=SizeofArray && input[r] >input[max]){
        		max=r;
        	}
        	// prints out the array
        	for(int i=0;i<array.length;i++){
                System.out.print(array[i] + " ");
            }
        	
        	System.out.println();
        	//if all else fails send it to swap and then try again
        	if(max!=size){
        		swap( size, max);
        		makeheap(input, max);
        	}
        }
       // the swap function exchanges
        static void swap(int arrsize, int flip ){
        	//a temp equation to hold the location in the array
        	int hold= array[arrsize];
        	// overrides the that location
        	array[arrsize]=array[flip];
        	//and now replaces the max with temp
        	array[flip]=hold;
        	

        }
   
}