package dharm.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainComprable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestComprable obj= new TestComprable(1,"Mohan",30);
		TestComprable obj1= new TestComprable(7,"Gita",35);
		TestComprable obj2= new TestComprable(3,"Ram",60);
		TestComprable obj3= new TestComprable(5,"Sohan",50);
		TestComprable obj4= new TestComprable(2,"Sita",60);
		TestComprable obj5= new TestComprable(6,"Radh",61);
		List al= new ArrayList<TestComprable>();
		al.add(obj);
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		al.add(obj4);
		al.add(obj5);
	
		System.out.println("Before Sorting");
		for(int i=0;i<al.size();i++){
			TestComprable testComprable=(TestComprable)al.get(i);
			System.out.println("Id: "+testComprable.getId()+" Name :"+testComprable.getName()+" Age :"+testComprable.getAge());
		}
		
		Collections.sort(al);
		System.out.println("After Sorting");
		for(int i=0;i<al.size();i++){
			TestComprable testComprable1=(TestComprable)al.get(i);
			System.out.println("Id: "+testComprable1.getId()+" Name :"+testComprable1.getName()+" Age :"+testComprable1.getAge());
		}

	}

}
