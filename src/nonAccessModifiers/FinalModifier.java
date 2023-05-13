package nonAccessModifiers;

public class FinalModifier {

	// final - 	Attributes and methods cannot be overridden/modified

	// final variable - It can't be changed because final variable once assigned a value can never be changed.

	final int age = 10;
	final double x = 3.14;

	public static void main(String[] args) {
		FinalModifier myObj = new FinalModifier();

		// will generate an error: cannot assign a value to a final variable

		//  myObj.age = 50; 
		// myObj.x = 25; 	  

		System.out.println(myObj.x);
		System.out.println(myObj.age);

	}
}

// final method -  we cannot override it.

/*
 * class Bike{ final void run(){System.out.println("running");} }
 * 
 * class Honda extends Bike{ void
 * run(){System.out.println("running safely with 100kmph");}
 * 
 * public static void main(String args[]){ Honda honda= new Honda();
 * honda.run(); }
 */


//final class - it cannot be extended or inherited by any other class, 
//Final class provides security as classes that can be extended can leak sensitive data of potential users but final classes make data elements safe and secure.

/*
 * final class Bike{}
 * 
 * class Honda1 extends Bike{ void
 * run(){System.out.println("running safely with 100kmph");}
 * 
 * public static void main(String args[]){ Honda1 honda= new Honda1();
 * honda.run(); } }
 * 
 */