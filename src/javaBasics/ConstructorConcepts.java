package javaBasics;

public class ConstructorConcepts {

	public static void main(String[] args)
	{
    
    System.out.println("        Constructor Illustration:");
    System.out.println("*****************************************");
		
    System.out.println("Default Constructor:");
    System.out.println("======================================");
    		
    Students stud1 =new Students();
    Students stud2 =new Students();
    
    System.out.println();
	System.out.println();
	
	
    System.out.println("Method accessed by first object:");
    System.out.println("======================================");
    
    // Initialize variables
    
    stud1.rollNum = 1;
    stud1.firstName = "Niya";
    stud1.lastName = "Das";
    stud1.course = "Testing";
    stud1.learningJava = true;
    stud1.StudentInfo();
    
    System.out.println();
	System.out.println();
	
    System.out.println("Method accessed by second object:");
    System.out.println("======================================");
    stud2.rollNum = 2;
    stud2.firstName = "Neha";
    stud2.lastName = "John";
    stud2.course = "Java";
    stud2.batch = "May";
    stud2.learningJava = false;
    stud2.StudentInfo();
    
    System.out.println();
	System.out.println();
	
    System.out.println("Constructor with single parameter:");
    System.out.println("======================================");
    Students stud3 =new Students("John");
    stud3.rollNum = 3;
    stud3.lastName = "Mic";
    stud3.course = "Python";
    stud3.batch = "May";
    stud3.learningJava = false;
    stud3.StudentInfo();
    
    System.out.println();
	System.out.println();
    
    System.out.println("Constructor with two parameters:");
    System.out.println("======================================");
    Students stud4 =new Students("Virat", "Kohli");
    stud4.rollNum = 4;
    stud4.course = "Cricket";
    stud4.learningJava = false;
    stud4.StudentInfo();

	}

	

}
