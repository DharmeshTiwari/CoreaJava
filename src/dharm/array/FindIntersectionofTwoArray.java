package dharm.array;

public class FindIntersectionofTwoArray {

	public static void main(String args[]){
	int ar1[] ={1,3,6,7,9};
	int ar2[] ={2,4,6,9};
	int ar3 [] = new int [ar1.length+ar2.length];
	String intr="";
	int a=0;
	for(int i=0;i<ar1.length;i++){
		for(int j=0;j<ar2.length;j++){
			if(ar1[i]==ar2[j]){
				ar3[a]=ar1[i];
				a++;
			}
			else 
				continue;
		}
		
	}
	for(int k=0;k<ar3.length;k++){
		System.out.println(ar3[k]);
	}
	
	}
}
