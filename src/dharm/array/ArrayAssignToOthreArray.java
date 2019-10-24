package dharm.array;

public class ArrayAssignToOthreArray {

	public static void main(String ar[]){
		int ar1 [] = new int[100];
		int ar2[] = new int[50];
		ar2=ar1;
		System.out.println(ar2.length);
		int counter=0;
		String arss= "HelloIndia Grow   India";
				System.out.println(arss.length());
				String args1 []=arss.split(" ");
				String args2 []=arss.split("\\s+");
				System.out.println(args2.length);
				for(int i=0; i<args1.length;i++){
					if(args1[i].length()>0){
						counter=counter+1;
						System.out.println(args1[i]);
					}	
				}
				System.out.println(args1.length+"  "+ counter);
				
				
		
	}
}
