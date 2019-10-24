package dharm.prime;

public class TestPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0;
		String primenum="";  
		
		for(int i=1;i<=100;i++){
			
			int counter=0;
			
			for(num=i;num>=1;num--)
			{
				if(i%num==0){
					counter=counter+1;
				}
			}
			if(counter==2){
				primenum=primenum+ " , "+i +" ";
			}
		}
		System.out.println("Prime numbere between 1 t0 100 are :" +primenum);

	}

}
