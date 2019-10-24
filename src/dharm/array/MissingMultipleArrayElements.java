package dharm.array;

public class MissingMultipleArrayElements {
	public static void main (String args[]){
		
		int ar []= {2,3,3,5,7,7,15};
		int maxsize=maxSizeOfArray(ar);
		int arcopy[] = new int[maxsize+1];
		for(int i=0;i<ar.length;i++){
			arcopy[ar[i]]=1;
		}
		
		
		for(int j=1;j<=maxsize;j++){
			if(arcopy[j]==0)
				System.out.println("  "+j);
		}
		
	}

	
	public static int maxSizeOfArray(int ar[]){
		int max=ar[0];
		for(int i=0;i<ar.length;i++){
			if(ar[i]>max){
				max=ar[i];
			}
			
		}
		return max;
	
}
	
}
