package exceptionHandling;

public class ExceptionHandlingConcepts {

	public static void main(String[] args) {

		// If write code 10-12 without try block,Java will throw an exception (throw an error)
		// Array out of bounds and will not execute the code after that line
		// So enclose within a try block

		//The try statement allows to define a block of code to be tested for errors while it is being executed.


		try
		{
			System.out.println("Program Started...");
			int num[] = {1,2,3};
			System.out.println(num[5]);
			// this statement will never execute
            // as exception is raised by above statement
       	   //go to catch block
			System.out.println("Code within try block after exception occured");

		}

		// Catch the exception

		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Code within catch block after exception occured");
			// print the exception
			System.out.println(e); 
			// Shows error with where the error comes
			//e.printStackTrace();
			System.out.println("Code within catch block");

		}
		

	}



}
