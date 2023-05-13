package interfaceQuestion.copy;

public class BankTest {

	public static void main(String[] args) {
		
		System.out.println("Question 7 - OUTPUT");
		System.out.println("***************************");
		
		
		SavingsAccount save = new SavingsAccount();
		
		System.out.println("Savings Account:");
		System.out.println("===============================");
		
		
		save.currentBal = 4500;
		//save.makeDeposit(1200);
		save.getBalance();
		
		
		save.deposit(4550);
		save.getBalance();
		save.withdraw(1000.5);
		save.getBalance();
		save.calcInterest(1, 0.02);
		System.out.println();
		
		CheckingAccount check = new CheckingAccount();
		System.out.println("Checking Account:");
		System.out.println("===============================");
		
		check.currentBal = 4050.50;
		check.getBalance();
		check.deposit(4550);
		check.getBalance();
		check.withdraw(1000.5);
		check.getBalance();
		
		

	}

}
