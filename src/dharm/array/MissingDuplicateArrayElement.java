package dharm.array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MissingDuplicateArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

		Integer [] ar={1,2,3,3,4,6};
		
				List al=Arrays.asList(ar);
				HashSet hs=new HashSet(al); 
				int sumOfArray=sumArrayElement(hs);
				int sumofArrayCount=sumOfArrayCount(hs.size()+1);
		int missingElement=sumofArrayCount-sumOfArray;
		System.out.println("Array Elements are :");
		for (int j=0;j<ar.length;j++){
			System.out.println(ar[j]);
		}
		System.out.println("Missing Array Elements is : "+missingElement);
				
	}
	
	public static int sumArrayElement(HashSet<Integer> hs){
		int sum=0;
		for(Integer obj: hs){
			
			sum=sum+ obj;
			System.out.println("sum : "+sum);
		}
		return sum;
	}
	public static int sumOfArrayCount(int n){
		return (n*(n+1))/2;
	}

}
