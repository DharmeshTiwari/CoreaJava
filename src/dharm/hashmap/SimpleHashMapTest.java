package dharm.hashmap;

import java.util.HashMap;
import java.util.Hashtable;

public class SimpleHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap <String, String>hm= new HashMap <String, String>();
		hm.put("1", "1");
		hm.put("2", "2");
		hm.put("3", "3");
		hm.put("1", "12");
		hm.put("1", "13");
		hm.put("1", "13");
		hm.put("1", "13");
		hm.put("4", null);
		
		System.out.println(hm.toString());
		
		Hashtable <String, String> ht = new Hashtable<String, String>();
		ht.put("1", "1"); 
		ht.put("2", "2");
		ht.put("3", "3");
		ht.put("1", "12");
		ht.put("1", "13");
		ht.put("1", "13");
		hm.put("1", "13");
		
		System.out.println(ht.toString());
		
		
	}

}
