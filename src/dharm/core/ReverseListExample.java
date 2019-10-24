package dharm.core;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseListExample {
public static void main(String args[]){
	List al= new ArrayList <String>();
	al.add("Hello India");
	al.add("I am Dharmesh");
	Collections.reverse(al);
	System.out.println(al.toString());
	
	//How can convert Array to List
	String ar[] ={"Hello","India","I","am","a","Indian"};
	convertArrayToList(ar);
}

//How can convert Array to List
public static void convertArrayToList(String ar[]){
	//String ar[] ={"Hello","India","I","am","a","India"};
	List al =new ArrayList();
	al=Arrays.asList(ar);
	System.out.println(al);
}

}
