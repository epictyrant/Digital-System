import java.util.Arrays;
import java.util.Random;
public class MergeSort {

	 public static void main(String[] args) {
		 //some varibles that we need the array that will hold
		 // our sorted array
		 //pass is the size of our array
		 int pass=10;
		 int[] array;

		 //sends the array to pick up a bunch of random numbers
			array = randgen(pass);
			//starts the timer
			long starttime= System.nanoTime();
			
			//the beginning of our merge sort we send our array to it
				sort(array);
			
			//ends our timer minus the two
			long endTime = System.nanoTime();
			System.out.println("Took "+(endTime - starttime) + " ns"); 
		}	 

	 // random number generator
		public static int[] randgen( int size){
			int[] a = new int[size];
			Random gen = new Random();
			// places those numbers into our array
			for(int x=0; x<size; x++) {
				a[x]=gen.nextInt();
			
	 }
			return a;
		}
		
		// a recursive function sorts and merges
		public static void sort(int[]input){
			//checks if array is larger then one then continues
			if (input.length>1){
				//makes arrays out of half of the size of the original
				int halfsize =input.length/2;
				//copies the arrays from 0 to the half way then the other half to end
				int[] Left =  Arrays.copyOfRange(input, 0, halfsize);
				int[] Right = Arrays.copyOfRange(input, halfsize, input.length);
				//fill those arrays with the ints for the master array
				/*for(int y = 0; y <input.length;y++ ){
					if (y < halfsize)
					Left[y]=input[y];
				}
				for(int y = halfsize; y<=input.length;y++ ){
					Right[y]=input[y];
				}*/
				//sorts the array again
				 sort(Left);
		         sort(Right);
		         //send it to the merge once both are in parts
		         mergeing(input,Left,Right);
				 
			}
		}
		// starts ordering and merging
		static void mergeing(int[] array, int[] leftside, int[] rightside){
			// sets all the numbers to zero
			int start=0, left=0, right=0;
			//creates two ints that make the size of the appropiate sides
			int rightsize=rightside.length, leftsize=leftside.length, size;
			//combines both of them
			size=leftsize+rightsize;
			// begins ordering the parts
			while(start<size){
				//the outer if statment that check that both the iteration are smaller then the 
				if((right<rightsize)&& (left<leftsize)){
					//if right is larger make the left larger and reorder the array
					if (rightside[right]>leftside[left]){
						array[start]=leftside[left];
						start++;
						left++;
					}
					else{
						//if it fails then do the opposite and make right larger
						array[start] = rightside[right];
						start++;
						right++;
					}
				}
				else{
					//left must be smaller then size of the array then loop through the array
						if(left<=leftsize){
							for(;right<rightsize;start++){
								//while right is smaller loop until larger then the size
								// does similar to the top one and reorders
								array[start]=rightside[right];
								right++;
							}
							//right must be smaller the size
							if(right<=rightsize){
								for(;left<leftsize;start++,left++){
									array[start]=leftside[left];
								}
								
					}
				}
			}
			
		}
		}
}
