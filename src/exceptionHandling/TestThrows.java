package exceptionHandling;

import java.io.IOException;

public class TestThrows {
	
	// throws used with methods

	public static void main(String[] args) throws IOException { //declare exception  
		
		TestThrows t=new TestThrows();  
	     t.method();  
	  
	    System.out.println("Normal flow...");  
	
	
	}
	
	public void method() throws IOException{ 
		
		  System.out.println("Device operation performed");  
		 
	}  
	
}


