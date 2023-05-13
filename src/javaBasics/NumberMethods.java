package javaBasics;

public class NumberMethods {

	public static void main(String[] args) {
		
       // Creating object for class
    	
		Numbers obj = new Numbers();
		
		System.out.println("        Methods Illustration:");
    	System.out.println("*****************************************");
    	
    	// Calling methods
    	
    	obj.display1();
    	System.out.println("======================================");
    	
    	obj.display2(10); 
    	System.out.println("======================================");
    	
    	System.out.println("Static method with a single parameter& with returntype:");
    	obj.num4 = 5;
    	int result = Numbers.square(5);
    	System.out.println("Square of "+obj.num4+":"+result);
    	System.out.println("======================================");
    	
    	System.out.println("Method with two parameters & with return type");
    	obj.num2 = 10;
    	obj.num3 = 25;
    	int sum = obj.addNumbers(obj.num2,obj.num3);
    	System.out.println("Sum of "+obj.num2+" and "+obj.num3+":"+sum);
    	System.out.println("======================================");
    	
    	System.out.println("Boolean method with a single parameter:");
    	// Initialize variable
    	obj.num5=15;
    	System.out.println(obj.num5+" is odd?:" + obj.isOdd(15));

       
    	System.out.println("======================================");
    	System.out.println("Updating values in runtime:");
    	obj.num2 = 12;
    	obj.num4 = 20;
    	int rslt1 =obj.addNumbers(obj.num2, 15);
        System.out.println("Sum:"+rslt1);
        int rslt2 = Numbers.square(obj.num4);
        System.out.println("Square:"+rslt2);

    	

    	
	}

}
