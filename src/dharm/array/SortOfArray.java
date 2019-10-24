package dharm.array;

public class SortOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tem;
		int ar[]= {2,4,60,4,10,2,7,45,23,80,52};
for(int i=0;i<ar.length;i++){
	for(int j=i;j<ar.length;j++){
		if(ar[i]>ar[j]){
			tem=ar[j];
			ar[j]=ar[i];
			ar[i]=tem;
		}
	}
	
}

System.out.println("After Soring the Array : ");
for(int k=0;k<ar.length;k++){
	System.out.println(ar[k]);
}
	}

}
