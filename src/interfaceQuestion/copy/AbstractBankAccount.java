package interfaceQuestion.copy;

public abstract class AbstractBankAccount implements BankAccount {

	double currentBal;



	public abstract double withdraw(double amount);

	public void makeDeposit(double amount)
	{

		System.out.println("Amount you deposited :"+amount+" CAD");
		double newBal = currentBal + amount;
		currentBal = newBal;
		//System.out.println("Your Current Balance is"+currentBal +" CAD"); 

	}

	public void getBalance()
	{

		System.out.println("Your Current Balance is"+currentBal +" CAD"); 

	}

}
