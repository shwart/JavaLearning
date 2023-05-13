package polymorphismConcepts;

public class MethodOverloading {

	public static void main(String[] args) {

		System.out.println("Method Overloading:");
		System.out.println("*************************************");


		loginDetails("abc@gmail.com","abcd");
		System.out.println();
		loginDetails("abc@gmail.com","abcd","abcd");	
		System.out.println();
		loginDetails("abc@gmail.com","abcd","abcd",28);	


	}

	// MethodOverloading
	// Methods should be within the same class
	// 1. Same method name with different no of parameters

	static void loginDetails(String email, String password)
	{  
		System.out.println("Method 1:");
		System.out.println("=======================================");
		System.out.println("User entered email :"+email);
		System.out.println("User entered password :"+password);
	}

	static void loginDetails(String email, String password, String confirmpassword)
	{
		System.out.println("Method 2:");
		System.out.println("=======================================");
		System.out.println("User entered email :"+email);
		System.out.println("User entered password :"+password);
		System.out.println("User confirmed password as :"+confirmpassword);
	}

	// 2. Same method name with different type of parameters

	static void loginDetails(String email, String password, String confirmpassword, int age)
	{
		System.out.println("Method 3:");
		System.out.println("=======================================");
		System.out.println("User entered email :"+email);
		System.out.println("User entered password :"+password);
		System.out.println("User confirmed password as :"+confirmpassword);
		System.out.println("User entered age :"+age);

	}

	/*
	 * public void square() { System.out.println("No Parameter Method Called"); }
	 * 
	 * public int square( int number ) { int square = number * number;
	 * System.out.println("Method with Integer Argument Called:"+square); return
	 * square; }
	 * 
	 * public float square( float number ) { float square = number * number;
	 * System.out.println("Method with float Argument Called:"+square); return
	 * square; }
	 */

}
