package javaBasics;

public class Numbers {
	
	
	 int num1;
	 int num2;
	 int num3;
	 int num4;
	 public int num5;
	 
	// method with no parameter
	 
	public void display1() 
	   {
	    System.out.println("Method without parameter");
	   }
	
	// method with single parameter
	
	  public void display2(int num1) {
		  
	    System.out.println("Method with a single parameter: " + num1);
	   }
	  
	// method with two parameters & with return type
	  
	  public int addNumbers(int num2, int num3)
	   {
	    int sum = num2 + num3;
	    return sum;
	   }
	  
	// static method with single parameter & with return type
	  
	public static int square(int num4)
	    {
		 int square = num4 * num4;
		 return square;
		
		}
	
	//static method with single parameter & with return type boolean
	
	public boolean isOdd(int num5)
	{
	 return (num5 % 2 == 0);
	}
    

	
	
	
	
	
	
	

}
