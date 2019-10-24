package dharm.palindrom;

public class PalindromNumber {
public static void main(String args[]){

	int num=46664; int sum=0; int temp=0;int rem=0;
	temp=num;
	while(num>0){
		rem=num%10;
		sum=(sum*10)+rem;
		num=num/10;
	}
	if(sum==temp){
		System.out.println("Number is palindrom : "+sum);
	}
	else{
		System.out.println("Number is not a palindrom : "+sum);
	}
}
}
