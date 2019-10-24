package dharm.array;

public class SecondLargestArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		int temp=0;
		int ar[] ={2,3,6,8,15,78,45,90};
		for(int i=0;i<ar.length;i++){
			for(int j=1;j<ar.length;j++){
				if(ar[i]<ar[j]){
					temp=ar[j];
					ar[j]=ar[i];
					ar[i]=temp;
				}
			}
		}
		System.out.println("Size of Array is :"+ar.length);
		System.out.println("Second Largest number is :"+ar[ar.length-1]);*/
		
		//Febnocci Series:
		int sum=0, num1=0, num2=1;
		
		for(int i=0;i<50;i++){
			System.out.println(num1);
			sum=num1+num2;
			num1=num2;
			num2=sum;
			
			
		}
	}

}
