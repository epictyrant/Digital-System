
import java.util.Scanner;

public class BitToBinary {
	 public static void main(String[] args) {
		 //ints needed to save number
		int q=1, save =0;
		//used to save your bits
		String change="";
		
		// gets the input from the user
		Scanner inpu = new Scanner(System.in);
		// a loop just to make my life easier
		while(q==1){
			//asks the user for code and gets it back
			System.out.println("Please input your string: ");
			change=inpu.nextLine();
			System.out.println(change);
		
			save=convert(change);
			System.out.println("Your Decimal number is: " + save);
	
		}
	 }
	 
	 public static int convert(String x){
		 //used to save some ints
		 int what=0, SizeOfString=0, test=0;
		 // to find all the length of string
		 SizeOfString=x.length();
		 //loops until the string is done
		 
		 for(int n =0; n<SizeOfString; n++){
			//
			 if((x.charAt(SizeOfString-1-n)-48)>0)
			what=what+(int) Math.pow(2,n);


		 }
		 return(what);
	 }
	
}/*
public int RecBinarySearch( int Array[], int high, low, size){
	//Find the mid point
	int midP =(high+low)/2;
	//check the array is empty
	if(high<low);{
			//Array is empty
	}

	if(size<Array[midP]){
			//shift the array
			High=midP-1;
			// recursive step
			RecBinarySearch( Array[], high,low,size);
	}
	else if(size>Array[midP]);{
			//shift the array
			low=midP - 1;
			// recursive step
			RecBinarySearch( Array[], high,low,size);
	}
	
}*/
