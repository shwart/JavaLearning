package javaBasics;

public class LoopStatements {

	public static void main(String[] args) {

		System.out.println("        Loop Statements Illustration:");
		System.out.println("*****************************************");


		System.out.println("For loop:");
		System.out.println("======================================");

		// For loop - when we know the specific times the loop to run

		for(int i = 0; i <=5; i++)
		{
			System.out.println(i);

		}
		System.out.println();

		System.out.println("For loop- with if:");
		System.out.println("======================================");

		for(int i = 0; i <=5; i++)
		{
			if(i==1)
				System.out.println(i);

		}
		System.out.println();
		

		for(int i = 0; i <=5; i++)
		{
			if(i<5)
				System.out.println(i);

		}
		System.out.println();

		System.out.println("For loop- Break:");
		System.out.println("======================================");
		for(int i = 0; i <=5; i++)
		{
			if(i==3)
				break;
			System.out.println(i);

		}

		System.out.println();


		System.out.println("For loop-Continue:");
		System.out.println("======================================");
		for(int i = 0; i <=5; i++)
		{
			if(i==3)
				continue;
			System.out.println(i);

		}
		System.out.println();

		
		for(int i = 0; i <=10; i++)
		{
			if(i==3)
				continue;
			if(i==8)
				continue;
			System.out.println(i);

		}
		System.out.println();


		System.out.println("For loop- Days of a Week:");
		System.out.println("======================================");
		for(int i = 0; i <=8; i++)
		{
			SwitchStatementDays(i);

		}
		System.out.println();
		
		//nested loop
		System.out.println("Nested Loop:");
		System.out.println("======================================");
		System.out.println();
		
		for (int i = 1; i <= 3; i++) {
			
			System.out.println("******Multiplication Table of "+i+"******");
			System.out.println();
			  
			  
			  // Inner loop
			  for (int j = 1; j <= 10; j++) {
				  
				  int pdt=i*j;
			    System.out.println(i+" x " +j+ "="+pdt); 
			    
			  }
			  System.out.println();
			  
			  
			} 



		System.out.println("While loop:");
		System.out.println("======================================");

		//While - it will run till the condition is true
		int j = 0;
		while (j <= 7) {
			SwitchStatementDays(j);
			j++;
		}
		System.out.println();

		System.out.println("Do While loop:");
		System.out.println("======================================");
		// do while- run the code once and then check for condition
		int k = 0;
		do {
			SwitchStatementDays(k);
			k++;
		}
		while (k <= 7);

		System.out.println();

		System.out.println("Do While:");
		System.out.println("======================================");
		int k1 = 1;
		do {
			SwitchStatementDays(k1);
			k1++;
		}
		while (k1 == 0);
	}



	public static void SwitchStatementDays(int day)
	{
		String message;
		switch(day)
		{
		case 1:
			message = "Sunday";
			break;
		case 2:
			message = "Monday";
			break;
		case 3:
			message = "Tuesday";
			break;
		case 4:
			message = "Wednesday";
			break;
		case 5:
			message = "Thursday";
			break;
		case 6:
			message = "Friday";
			break;
		case 7:
			message = "Saturday";
			break;
		default:
			message = "Invalid day";
			break;

		}
		System.out.println("Daycount entered is "+day+" and the day is "+message); 	
	}
}


