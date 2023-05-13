package interfaceQuestion.copy;

public class CheckingAccount implements BankAccount {

	double currentBal;
	
	public double deposit(double depAmount) {
		System.out.println("Amount deposited to your Checking account:"+depAmount+" CAD");
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
			  double newBal = currentBal - withdrawAmount;
		  currentBal = newBal;
			  System.out.println("Amount withdrawn from your Checking account:"+withdrawAmount+" CAD");
		  }
			  
		  return  currentBal;

		
	}

	
	public void getBalance() {
		System.out.println("Account Balance of your Checking account:"+currentBal+" CAD");
		
	}

}
