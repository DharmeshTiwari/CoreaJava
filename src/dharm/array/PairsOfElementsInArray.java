package dharm.array;

public class PairsOfElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar1[]={2,5,7,8,9};
		int ar2[]={15,12,4,5,7};
		int ar3[]=new int[10];
		int sum=20;
		String numbers ="";
		for(int i=0;i<ar1.length;i++){
			for(int j=0;j<ar2.length;j++){
				if(ar1[i]+ar2[j]==sum){
					numbers=numbers +" [ "+ar1[i]+ " "+ar2[j] +" ]";
				}
				else
					continue;
			}
		}
		System.out.println(numbers);

	}

}
