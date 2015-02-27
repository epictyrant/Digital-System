import java.util.Random;


public class InsertSort {

	 public static void main(String[] args) {
		 //some varibles that we need the array that will hold
		 // our sorted array
		 //pass is the size of our array
		 // n is the for the loop
		 int[] array;
		 int pass=10, n, change;
		 //gives our array a bunch of none sorted varibles
			array = randgen(pass);
		long starttime= System.nanoTime();
			//our for loop to create sort the array
			for(int x=0; x<pass-1; x++){ 
				//saves the array location
				change = array[x];
				//save the location of the array
				n=x;
				//while n is bigger and location is smaller then change
				while(n >= 1 && array[n-1] >change){
					//move it down
					array[n] = array[n-1];
					n--;
					}
				array[n] = change;
			}
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
		
}
