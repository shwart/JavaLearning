package exceptionHandling;

public class MultipleCatchBlock {

	public static void main(String[] args) {

		try{    
            int a[]=new int[5];    
            a[5]=30/0; // go to 1st catch , if there is not specific exception catch,then goes to 19th catch  
            //System.out.println(a[7]); // if this occurs,2nd catch executed
            }    
           catch(ArithmeticException e)  
              {  
               System.out.println("Arithmetic Exception occurs"+e);  
              }    
           catch(ArrayIndexOutOfBoundsException e)  
              {  
               System.out.println("ArrayIndexOutOfBounds Exception occurs"+e);  
              }    
           catch(Exception e)  
              {  
               System.out.println("Parent Exception occurs"+e);  
              }             
           System.out.println("rest of the code");    
	}

}
