package interfaceQuestion.copy;

public class SavingsAccount extends AbstractBankAccount {


	// Implementation of Methods from BankAccount interface
	
	
	public double deposit(double depAmount) {
		
		System.out.println("Amount deposited to your Savings account:"+depAmount+" CAD");
		double newBal = currentBal + depAmount;
		  currentBal = newBal;
		  return  currentBal;
		
		}
	

	
	public double withdraw(double withdrawAmount) {
		
		
		  if(currentBal <= 0)
		  {
				System.out.println("Your balance is negative, please keep a minimum balance!");
		  }
				
		  else if (withdrawAmount > currentBal )
		  {
			  System.out.println("Insufficient balance!You can not withdraw the amount");
		  }
		  else
		  {
			  System.out.println("Amount withdrawn from your Savings account:"+withdrawAmount+" CAD");
			  double newBal = currentBal - withdrawAmount;
		      currentBal = newBal;
			  	  }
			  
		  return  currentBal;

		
		
	}

	
	public void getBalance() {
		
		System.out.println("Account Balance of your Savings account:"+currentBal+" CAD");
		//return currentBal;
		
		
	}



	
	

	public void calcInterest( int n, double r)
	{
		
		System.out.println("No of Periods:"+n);
		System.out.println("Interest Rate:"+r);
		double interest = currentBal*n*r;
		System.out.println("Interest you earned:"+interest);
		
	}




	
	
}

