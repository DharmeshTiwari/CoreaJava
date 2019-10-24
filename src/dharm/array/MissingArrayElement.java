package dharm.array;

public class MissingArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar []={1,4,5,6,7,8,9,2};
		int sumofarray=sumOfArray(ar);
		int arrayelementcount=sumOfArraycount(ar.length);
		
		int missingelement=0;
		missingelement=sumOfArraycount(ar.length+1)-sumOfArray(ar);
		System.out.println("Array elemet is " +ar);
		System.out.println("Missing Array elemet is " +missingelement);
	}
	public static int sumOfArray(int ar[]){
		int sum=0;
		for(int i=0;i<ar.length;i++){
			sum=sum+ar[i];
		}
		return sum;
	}
	
	public static int sumOfArraycount(int count){
		
		return (count*(count+1))/2;
		
	}

}
