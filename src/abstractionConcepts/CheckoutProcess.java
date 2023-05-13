package abstractionConcepts;

public class CheckoutProcess {

	public static void main(String[] args) {
		
		// Object can not be created for an Abstract class
		// accessed with the inherited class
		
		BillingInformation bill = new BillingInformation();
		
		// product details
		bill.productCategory();
		bill.productName("Egg");
		bill.productPrice(5.99);
		bill.quantityInStock();
		bill.quantity(5);
		bill.productUnit();
		
		// billing info
		bill.paymentType("Credit Card");
		bill.cardNumber("123456");
		bill.cardHolderName("Jo", "Nik");
		
		
		
	}
		
		
	
}
