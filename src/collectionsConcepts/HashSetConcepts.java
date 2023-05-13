package collectionsConcepts;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetConcepts {

	public static void main(String[] args) {
		
		// If we want to retrieve an element, hashset uses hashing mechanism it directly go and search
		//retrieving becomes faster
		// not takes duplicate elements

		HashSet<String> hs = new HashSet<String>();

		
		hs.add("Toyota");
		hs.add("Honda");
		hs.add("BMW");
		hs.add("Audi");
		
		
		//Print the Array List
		// Prints not in sequential order
		
		System.out.println("Hash Set:"+hs);
				
	   //Size
	   System.out.println("Hash Set Size: "+hs.size());
	   
	   // Adding duplicate elements
	   
	   hs.add("BMW");
	   hs.add("Acura");
	   
	   
	 //Even though BMW is is added twice it only appears once in the set 
	 //because every item in a set has to be unique.
	   System.out.println("Hash Set after adding duplicates:"+hs);
	   
	   //Check If an Item Exists
	   System.out.println("Hash Set contains Acura?:"+hs.contains("Acura"));
	   System.out.println("Hash Set contains Mazda?:"+hs.contains("Mazda"));
	   
	   // removes an element
	   hs.remove("Audi");
	   System.out.println("After removal:"+hs);
	   
	   //To get index/ an element then it should be converted to array list/linked list, and we can use all methods (sort also)
	   
	   ArrayList<String> list = new ArrayList<>(hs);
	   
	   System.out.print("Hash set as List :");
	   System.out.println(list);
	   
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println(list.get(i)+" ");
		}
	   
		
		/*
		 * // Create a HashSet object called numbers HashSet<Integer> numbers = new
		 * HashSet<Integer>();
		 * 
		 * // Add values to the set numbers.add(4); numbers.add(7); numbers.add(8);
		 * 
		 * // Show which numbers between 1 and 10 are in the set for(int i = 1; i <= 10;
		 * i++) { if(numbers.contains(i)) { System.out.println(i +
		 * " was found in the set."); } else { System.out.println(i +
		 * " was not found in the set."); } }
		 */
	    

	}

}
