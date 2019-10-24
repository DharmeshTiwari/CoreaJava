package dharm.fibonacci;

import java.util.Scanner;

public class fibonacci_UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1=0, num2=1,sum=0, count;
System.out.println("Pls enter Fabonicc count : ");
Scanner input=new Scanner(System.in);
count=input.nextInt();
input.close();
for(int i=1;i<=count;i++)
{
	System.out.println("Fibonacci Series is : "+num1);
	sum=num1+num2;
	num1=num2;
	num2=sum;
}

	}

}
