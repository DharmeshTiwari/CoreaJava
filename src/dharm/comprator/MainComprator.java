package dharm.comprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainComprator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comprator_Employee e1= new Comprator_Employee(1,"Dharm",20);
		Comprator_Employee e2= new Comprator_Employee(3,"Raj",30);
		Comprator_Employee e3= new Comprator_Employee(10,"Darsh",40);
		Comprator_Employee e4= new Comprator_Employee(5,"Deepka",50);
		Comprator_Employee e5= new Comprator_Employee(2,"Shaurya",60);
		List al=new ArrayList<Comprator_Employee>();
		al.add(e1) ; al.add(e2);al.add(e3);al.add(e4);al.add(e5);
		Collections.sort(al,new Test_Comprator());
		System.out.println("After Sorting");
		for(int i=0;i<al.size();i++){
			Comprator_Employee obj= (Comprator_Employee)al.get(i);
			System.out.println("Id :"+obj.getId()+" name : "+obj.getName()+ " age :"+obj.getAge());
		}
		
		Collections.sort(al, new Comparator<Comprator_Employee>(){
			@Override
			public int compare(Comprator_Employee obj1, Comprator_Employee obj2){
				return obj1.getName().compareTo(obj2.getName());
			}
			
			
		});
		
		System.out.println("After Sorting");
		for(int i=0;i<al.size();i++){
			Comprator_Employee obj= (Comprator_Employee)al.get(i);
			System.out.println("Id :"+obj.getId()+" name : "+obj.getName()+ " age :"+obj.getAge());
		}
		
		
		
	}

}
