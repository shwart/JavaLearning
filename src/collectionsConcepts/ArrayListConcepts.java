package collectionsConcepts;

/*import java.util.ArrayList;
import java.util.Collections;*/

import java.util.*;
public class ArrayListConcepts {

	public static void main(String[] args) {

		// Create an ArrayList object

		ArrayList<String> strarrlist = new ArrayList<String>();
		ArrayList<String> strarrlist1 = new ArrayList<String>();

		// Add elements to ArrayList
		strarrlist.add("One");
		strarrlist.add("Two");
		strarrlist.add("Three");
		strarrlist.add("Four");
		strarrlist.add("Five");



		strarrlist1.add("Zero");
		strarrlist1.add("Two");
		strarrlist1.add("Three");
		strarrlist1.add("Two");
		strarrlist1.add("Five");

		strarrlist.add(1, "One");


		//Print the Array List
		System.out.println("Array List:"+strarrlist);

		// Loop through the elements of ArrayList /Print the Array List - for loop

		System.out.print("Array List with for loop:");
		for (int i = 0; i < strarrlist.size(); i++) 
		{
			System.out.print(strarrlist.get(i)+" ");
		}
		System.out.println();

		// Loop through the elements of ArrayList / Print the Array List- for each loop

		System.out.print("Array List with for each loop:");
		for (String i : strarrlist) {
			System.out.print(i);
		}
		System.out.println();

		//Size
		System.out.println("Size of Array List: "+strarrlist.size());

		// Retrieve an element
		System.out.println("Element at index 3: "+strarrlist.get(3));

		// Index of an element
		System.out.println("Index of an element in List1:"+strarrlist.indexOf("Three"));
		System.out.println("Index of an element in List2:"+strarrlist1.indexOf("Two"));
		System.out.println("Last Index of an elememt in List2:" +strarrlist1.lastIndexOf("Two"));


		//Modify an element
		strarrlist.set(0, "Zero");
		System.out.println("After changing an element:"+strarrlist);

		// Check Array List contains an element
		System.out.println("Array List contains element 'Three' :"+strarrlist.contains("Three"));

		// Check Array List equal to another array list
		System.out.println(("Array List equal to another arraylist: "+strarrlist.equals(strarrlist1)));

		// Check the array list is empty or not
		System.out.println("Is the ArrayList empty?:"+strarrlist.isEmpty());

		// Remove an element
		strarrlist.remove(4);
		System.out.println("Array List after removal:"+strarrlist);

		// Remove all the elements 
		// strarrlist.clear();



		//Substring
		System.out.println("Substring: "+strarrlist.subList(1, 4));



		// Sorted array list
		Collections.sort(strarrlist);
		System.out.println("Sorted Array List:"+strarrlist);


		// Reverse
		Collections.reverse(strarrlist);
		System.out.println("Reversed Array List:"+strarrlist);
		
		System.out.print("Frequency of element Two:");
		System.out.print(Collections.frequency(strarrlist1, "Two"));

	}

}
