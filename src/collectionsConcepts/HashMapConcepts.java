package collectionsConcepts;

import java.util.*;
import java.util.Map.Entry;

public class HashMapConcepts {

	public static void main(String[] args) {
		
		// Create a HashMap object hm
		//A HashMap however, store items in "key/value" pairs
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		// Add keys and values
		hm.put(1, "Toyota");
		hm.put(2,"Honda");
		hm.put(3,"BMW");
		hm.put(4,"Audi");
		hm.put(5,"Acura");
		
		//Print the Array List
				System.out.println("Hash Map:"+hm);
						
			   //Size
			   System.out.println(" Hash Map Size: "+hm.size());
			   
			   //Access a value with key
			   System.out.println(" Hash Map Element at index 3: "+hm.get(3));
			   
			   
			   hm.replace(2, "Suzuki");
			   System.out.println("Hashmap after value Replaced "+hm);
			   
			   //Remove an item
			   hm.remove(3);
			   System.out.println(" Hash Map after removal"+hm);
			   
			   
			   // print/retrieve
			   
			   for(Map.Entry m: hm.entrySet())
			   {
				   System.out.println(m.getKey()+" "+m.getValue());
				   
			   }
		
			   System.out.println("Size:"+hm.size());
			   
			   //check for key and if not present then add
			   hm.putIfAbsent(3, "Corolla");
			   System.out.println("New hasmap: "+hm);
			   hm.putIfAbsent(6, "Tesla");
			   System.out.println("New hasmap: "+hm);
			   // can not add coz already value present
			   hm.putIfAbsent(2, "Tesla");
			   System.out.println("New hasmap: "+hm);
			  
			   
			   
	}

	

}
