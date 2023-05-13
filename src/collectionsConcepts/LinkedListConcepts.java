package collectionsConcepts;


import java.util.Collections;
import java.util.LinkedList;

public class LinkedListConcepts {

	public static void main(String[] args) {
		
		// If we want to retrieve an element, linkedlist  do search in  sequential order
		

		LinkedList<String> ls = new LinkedList<String>();
		

		// Add elements sequential
		ls.add("Toyota");
		ls.add("Honda");
		ls.add("BMW");
		ls.add("Audi");
		ls.add("Honda");
		ls.add("Acura");


		//Print the Linked List
		System.out.println("Linked List:"+ls);
      
		
		// for each
		// Datatype of list varible:objname
		System.out.println("Linked List with for each loop:");
		for(String i :ls)
		{
			System.out.println(i);
	     }
	      


		// Add elements to specific index
		ls.add(2, "Tesla");
		System.out.println("Linked List after element added to 2nd index:"+ls);

		// Add 1st element
		ls.addFirst("Merecedas");
		System.out.println("Linked List after element added to front:"+ls);

		// Add last element
		ls.addLast("Lamborgini");
		System.out.println("Linked List after element added to rear:"+ls);




		//Size
		System.out.println("Size of Linked List: "+ls.size());

		//Retrieve elements

		System.out.println("Elerment at index 4:"+ ls.get(4));
		System.out.println("1st Elerment:"+ ls.getFirst());
		System.out.println("Last Elerment:"+ ls.getLast());


		// Remove specific element
		ls.remove(0);
		System.out.println("Linked List after deletion of a specific element:"+ls);

		// Remove 1st element
		ls.removeFirst();
		System.out.println("Linked List after deletion of first element:"+ls);

		// Remove last element
		ls.removeLast();
		System.out.println("Linked List after deletion of last element:"+ls);

		// remove linked list
		//ls.clear();

		// Check linked list contains an element

		System.out.println("Contains a specific element?:"+ ls.contains("Tesla"));
		System.out.println("Contains a specific element?:"+ ls.contains("Suzuki"));

		// Print the index of an element
		// retrieves negative , if not found
		System.out.println("Index of a specific element?:"+ ls.indexOf("Tesla"));
		System.out.println("Index of a specific element?:"+ ls.indexOf("Suzuki"));

		// Check the linked list is empty or not
		System.out.println("Is the linkedList empty?:"+ls.isEmpty());

		//Substring
		System.out.println("Substring: "+ls.subList(1, 4));

		//Sorting

		Collections.sort(ls);
		System.out.println("Sorted List:"+ls);

		// Reverse
		Collections.reverse(ls);
		System.out.println("Reversed List:"+ls);


		// frequency


		System.out.print("Frequency of element Honda: ");
		System.out.println(Collections.frequency(ls, "Honda"));













	}

}
