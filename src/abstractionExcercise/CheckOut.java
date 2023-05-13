package abstractionExcercise;

public class CheckOut {

	public static void main(String[] args) {
		
		// Object can not be created for an Abstract class
		// accessed with the inherited class
		
		BillingInfo bill = new BillingInfo();
		
		// seller details
		System.out.println("Seller Info:");
		System.out.println("************************");
		bill.sellerName();
		bill.sellerAddress("12 abc dr","Toronto", "Ontario");
		bill.noOfProducts(500);
		bill.bestSellingProduct();
		System.out.println();
		
		// billing info
		System.out.println("Billing Info:");
		System.out.println("************************");
		bill.billingInfo("Walmart");
		bill.billingInfo("10 xyz dr","Brampton", "Ontario");
		bill.paymentType("Credit Card");
		bill.cardNumber("123456");
		bill.cardHolderName("Jo", "Nik");
		bill.cvv(230);
		bill.expiryDate("05", "2025");
		
		
		
	}
		
		
	
}
