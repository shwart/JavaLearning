package javaBasics;

public class ConditionalStatements {

	public static void main(String[] args) {

		System.out.println("        Conditional Statements Illustration:");
		System.out.println("*****************************************");

		System.out.println("Simple If Statements:");
		System.out.println("======================================");
		testIfStatement("John",17);
		testIfStatement("Mark",18);
		testIfStatement("Jim",19);
		System.out.println();

		System.out.println("If Else Statements:");
		System.out.println("======================================");
		testIfElseStatement("John",10);
		testIfElseStatement("Mark",18);
		testIfElseStatement("Jim",50);
		System.out.println();

		System.out.println("Else If Statements:");
		System.out.println("======================================");
		testElseIfStatement("Jim",5);
		testElseIfStatement("Mia",10);
		testElseIfStatement("John",12);
		testElseIfStatement("Mark",18);
		testElseIfStatement("Jim",50);
		testElseIfStatement("Martin",70);
		System.out.println();

		System.out.println("Switch Statements:");
		System.out.println("======================================");
		ConditionalStatements obj = new ConditionalStatements();
		obj.SwitchStatement("Red");
		obj.SwitchStatement("Purple");
		obj.SwitchStatement("Black");
		obj.SwitchStatement("Yellow");
		obj.SwitchStatement("Green");
		obj.SwitchStatement("green");
		System.out.println();
		
		System.out.println("Switch Statements - Days of the Week:");
		System.out.println("======================================");
		obj.SwitchStatementDays(0);
		obj.SwitchStatementDays(1);
		obj.SwitchStatementDays(2);
		obj.SwitchStatementDays(3);
		obj.SwitchStatementDays(4);
		obj.SwitchStatementDays(5);
		obj.SwitchStatementDays(6);
		obj.SwitchStatementDays(7);
		obj.SwitchStatementDays(8);
		
	}
	
	// Simple If 

	public static void testIfStatement(String name, int age)
	{

		if(age>= 18)
		{
			System.out.println(name+" is able to vote as the age is "+age);
		}

	}
   
	// If Else

	public static void testIfElseStatement(String name, int age)
	{

		if(age>= 18)
		{
			System.out.println(name+" is able to vote as the age is "+age);
		}
		else
		{
			System.out.println(name+" is not able to vote as the age is "+age);
		}

	}
	
	// Else If 

	public static void testElseIfStatement(String name, int age)
	{
		//can use || , != also

		if(age< 10)
		{
			System.out.println(name+" is not able to vote at all as the age is "+age);
		}
		else if(age>= 10 && age<15)
		{
			System.out.println(name+" is able to vote in next 5 years as the age is "+age);
		}
		//else if(((age>= 15 && age<18) && (age== 40)) && (age != 45))
		else if(age>= 15 && age<18)
		{
			System.out.println(name+" is able to vote in next 3 years as the age is "+age);
		}

		else if(age>= 18 && age<=60)
		{
			System.out.println(name+" is able to vote as the age is "+age);
		}

		else
		{
			System.out.println(name+" is not able to vote");
		}
	}

	
	// Switch
	
	
	/*switch(expression) {
	  case x:
	    // code block
	    break;
	  case y:
	    // code block
	    break;
	  default:
	    // code block
	}*/
	
	public void SwitchStatement(String color)
	{

		switch(color)
		{
		case "Red":
			System.out.println("Color is Red");
			break;
		case "Green":
			System.out.println("Color is Green");
			break;
		case "Purple":
			System.out.println("Color is Purple");
			break;
		case "Yellow":
			System.out.println("Color is Yellow");
			break;
			default:
				System.out.println("No Matching Color"); 	
		}

	}
	
	
	public void SwitchStatementDays(int day)
	{

		switch(day)
		{
		case 1:
			System.out.println("Daycount entered is "+day+" and the day is Sunday");
			break;
		case 2:
			System.out.println("Daycount entered is "+day+" and the day is Monday");
			break;
		case 3:
			System.out.println("Daycount entered is "+day+" and the day is Tuesday");
			break;
		case 4:
			System.out.println("Daycount entered is "+day+" and the day is Wednesday");
			break;
		case 5:
			System.out.println("Daycount entered is "+day+" and the day is Thursday");
			break;
		case 6:
			System.out.println("Daycount entered is "+day+" and the day is Friday");
			break;
		case 7:
			System.out.println("Daycount entered is "+day+" and the day is Saturday");
			break;
			default:
				System.out.println("Daycount entered is "+day+" and the day is Invalid "); 	
		}

	}
	
}


