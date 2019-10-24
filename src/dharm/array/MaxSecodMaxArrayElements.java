package dharm.array;

public class MaxSecodMaxArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//****************  To Find second largest element in Array ************
		int ar[] = {2,30,4,10, 11, 100, 55, 17};
		/*int temp=0;
		for(int i=0;i<ar.length;i++){
			for(int j=i;j<ar.length;j++){
				if(ar[i]<ar[j]){
					temp=ar[j];
					ar[j]=ar[i];
					ar[i]=temp;
				}
			}
		}
		
		for(int k=0;k<ar.length;k++)
		System.out.println("Second largest array element : "+ ar[k]);*/
		
		
//********** To Find out Fibnacci Series*************************************	
/*			int sum=0,num1 =0,num2=1;
			for(int i=0;i<20;i++){
				sum=num1+num2;
				System.out.println(" Fibnoic series :"+ sum);
				num1=num2;
				num2=sum;
	
	
}*/
		
		
// **************   Prim Number**************************************
				/*String  primnumbers="";
				for(int i=1;i<=100;i++){
					int counter=0;
					for(int j=i;j>0;j--){
						if(i%j==0){
							counter=counter+1;
						}
						else
							continue;
					}
					if(counter==2)
						primnumbers =primnumbers+" "+i;	
				}
				System.out.println("Prim Numbers are : " +primnumbers);*/
		
// ************* check number is palindrom or not *******************************
/*		int num = 234432;
		int temp=num;
		int sum=0;
		int rem=0;
		while (num>0){
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		if(temp==sum){
			System.out.println("Number is Palindrom : "+temp);
		}
		else {
			System.out.println("Number is not a Palindrom number : "+temp);
		}
		*/
// ********** Check String is Palindrom or not *****************************
		String str="HelleH";
		String pld ="";
		char ch[] = str.toCharArray();
		int leng=ch.length-1;
		for(int i=leng;i>=0;i--){
			pld=pld+ch[i];
		}
		if(pld.equals(str))
			System.out.println("String is palindom : "+str);	
		
		else
			System.out.println("String is not a palindom : "+str);
	}

}
