package javaBasics;

public class StudentDetailsMethods {

	public static void main(String[] args) {
		
		// Creating object for class
    	
    	StudentDetails obj1 = new StudentDetails();
    	StudentDetails obj2 = new StudentDetails();
    	
    	System.out.println("        Methods Illustration:");
    	System.out.println("*****************************************");
    	
    	// Calling method1
    	
    	System.out.println("No parameters, No return type:");
    	System.out.println("======================================");
    	
    	obj1.printDetails();
    	System.out.println();
    	System.out.println();
    	
    	// Calling method2 by passing arguments
    	
    	System.out.println("Passing parameters without return type");
    	System.out.println("======================================");
    	obj1.printStudentName("Niya","Mathew");
    	System.out.println();
    	System.out.println();
    	
    	
    	// Calling method3 by passing arguments
    	//It should return a string
    	
    	System.out.println("Passing parameters with return type");
    	System.out.println("======================================");
    	
    	System.out.println("Student1:");
    	String str1 = obj1.printStudentDetails(1,"Niya","Mathew",'A');
    	System.out.println(str1);
    	System.out.println("Student2:");
    	String str2 = obj1.printStudentDetails(2,"Neha","John",'B');
    	System.out.println(str2);
    	System.out.println();
    	System.out.println();
    
    	
    	//Updating values to method ,without hard coding -do not want to change in method argument like did in line 80/83 instead,access variable with object
    	
    	obj1.firstName = "Devu";
    	obj1.lastName = "Sai";

    	obj2.rollNum = 15;
    	obj2.batch = 'B';

    	System.out.println("Passing values in runtime");
    	System.out.println("======================================");

    	String st3 =obj1.printStudentDetails(12, obj1.firstName, obj1.lastName, 'M');

    	System.out.println(st3);

    	String st4 = obj1.printStudentDetails(obj2.rollNum, "Jo", "Nick", obj2.batch);

    	System.out.println(st4);

    	obj1.printStudentName(obj1.firstName, obj1.lastName);
    	System.out.println();
    	System.out.println();
    	
    	// static method inside a static main method can be done without object
        // non static method inside a static main method we need to create object of that class -> objectname.methodname; onjectname.variablename
    	// Here it is only possible to call by class name
    	System.out.println("Static method without object");
    	System.out.println("======================================");
    	
    	
    	System.out.println("Static reference with class name: " + StudentDetails.studentLearningJava());

    	

	}

}
