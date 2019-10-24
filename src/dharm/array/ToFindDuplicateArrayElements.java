package dharm.array;

import java.util.HashSet;

public class ToFindDuplicateArrayElements {

	public static void main(String args[]){
	int ar[] = {2,4,6,7,8,9,3,2,6};
	/*	
	// Finding Duplicate element by using For loop	
		for(int i=0;i<ar.length;i++){
			for(int j=i;j<ar.length;j++){
				if(ar[i]==ar[j] && i!=j){
					System.out.println("Duplicate Element "+ar[j]);
				}
			}
		}*/
HashSet hs = new HashSet <Integer>();
for(int i=0;i<ar.length;i++){
	if(hs.add(ar[i])==false){
		System.out.println("Duplicate Elements "+ar[i] );
	}
}
		
	}
}
