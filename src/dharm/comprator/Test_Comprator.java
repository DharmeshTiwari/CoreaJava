package dharm.comprator;

import java.util.Comparator;


public class Test_Comprator implements Comparator <Comprator_Employee>{

	@Override
	public int compare(Comprator_Employee obj1, Comprator_Employee obj2){
		return (obj1.getId()<obj2.getId())? -1:(obj1.getId()>obj2.getId())?1:0;
	}
}
