package nonAccessModifiers;

public class StaticModifier {

	/*
	 * The static keyword is used to create variables 
	 * When a variable is declared static in Java programming, it means that the variable belongs to the class itself rather than to any specific instance of the class. 
	 * This means that there is only one copy of the variable in memory, regardless of how many instances of the class are created.
	 * Static variables are also known as class variables. Local variables cannot be
	 * declared static.
	 */

	static String course ="Java";

	// Static method

	static void myStaticMethod() {

		System.out.println("Static methods can be called without creating objects");

	}
	
	//method to display the values  
		void display (){

			System.out.println("course:"+course);
		}  


	public static void main(String[] args) {

		StaticModifier s = new StaticModifier();


		// Call static variable using object reference variable s 

		System.out.println("Acessing static variable  with classname:"+StaticModifier.course);

		// Call static variable directly 

		System.out.println("Acessing static variable  directly:"+course);

		// Call the static method

		myStaticMethod();
		StaticModifier.myStaticMethod();

		s.display();


		//initialization-we can change the college of all objects by the single line of code  
		// s.course="BBDIT";
	}


}

// abstract- abstrctionconcepts pkg

// The synchronized keyword used to indicate that a method can be accessed by only one thread at a time. 
//The synchronized modifier can be applied with any of the four access level modifiers.
