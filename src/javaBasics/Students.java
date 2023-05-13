package javaBasics;

public class Students {
	
	// Global variables - created in class but outside the method
	
	int rollNum;
	String firstName;
    String lastName;
    String course;
    String batch;
    boolean learningJava;
    
    
    Students()
    {
    	batch = "March & April";
    	System.out.println("This is a default constructor");
    }
    
    Students(String firstName)
    {
    	// firstName - Refers to local variable which is passed in the constructor main class
    	//this - Refers to the current object in a method or constructor
    	//For using this-variable names should be same
    	//this.global variable = local variable
    	//this.firstName - Refers to global variable which is initialized in the class outside your constructor/method
    	
    	
    	this.firstName = firstName;
    	System.out.println("This is a constructor with single parameter");
    	System.out.println();
    }

    Students(String firstName, String lName1){

		this.firstName = firstName;
		// global variable = local variable having a different name,if do not want to use this keyword
		lastName = lName1;
		batch = "March & April";
		System.out.println("This is a parameterized constructor with 2 paramater");

	}
    
    public void StudentInfo()
    {
    
    	System.out.println("Student ID:"+rollNum);
    	System.out.println("Name: "+firstName+" "+lastName);
    	System.out.println("Batch:"+" "+batch);
    	System.out.println("Course:"+course);
    	System.out.println("Is student learning Java?:"+learningJava);
    	
        
    }
}
