package dharm.fibonacci;

public class TestFibonacci {
public static void main(String args[]){
/*	int num1=0, num2=1, sum=1, count=50;
	for (int i=1;i<=count;i++){
		System.out.println(num1);
		sum=num1+num2;
		num1=num2;
		num2=sum;
		
	}*/
	int count1=0;
	int ar1[]={2,4,6,3,6,8,9};
	int ar2[]={1,5,6,8,10,11,14};
	int ar3[]=new int[ar1.length+ar2.length];
	for(int i=0;i<ar1.length;i++){
		for(int j=0;j<ar2.length;j++){
			if(ar1[i]==ar2[j]){
				ar3[count1]=ar1[i];
				count1++;
			}
			else
				continue;
		}
	}
	for(int k=0;k<=ar2.length;k++){
		if(ar3[k]!=0)
			System.out.println(ar3[k]);
	}
}
}
