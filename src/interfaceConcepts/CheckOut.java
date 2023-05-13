package interfaceConcepts;

import abstractionConcepts.AddProductToCart;
import abstractionConcepts.BillingInformation;

// implements the class, and we can implement n number of classes
// Achieves multiple inheritance
//If we want use data from multiple class , then make them as interfaces
// It will ask to provide bodies of methods
//a class can implement n interfaces and extend only one class 
//public class CheckOut extends AddProductToCart implements AddToCart, BillingInfo {

public class CheckOut implements AddToCart, BillingInfo {
	
	// class extends class
	// class implements interface...n
	// interface extends interface
	// class extends class implements interface...n

	public static void main(String[] args) {
		
		
		CheckOut  c = new CheckOut();
		
		// product details
		c.productCategory();
		c.productName("Egg");
		c.productPrice(5.99);
		c.quantityInStock();
		c.quantity(10);
		c.productUnit();
		
		// billing info
		c.paymentType("Credit Card");
		c.cardNumber("123456");
		c.cardHolderName("Jo", "Nik");
		c.cvv(230);
		c.expiryDate("04", "2027");
	
	}

	public void productName(String productName)
	{
		System.out.println("Product chosen is"+productName);
	}

	public double productPrice(double productPrice)
	{
		System.out.println("Product price is"+productPrice);
		return productPrice;
	}

	public String paymentType(String paytype)
	{
		System.out.println("Pay type is:"+paytype);
		return paytype;
	}
	
	public void cardNumber(String number)
	{
		System.out.println("Card Number:"+number);
		
	}
	public void cardHolderName(String fname, String lname)
	{
		System.out.println("Card Holder:"+fname+""+lname);
		
	}

	@Override
	public void cvv(int cvv) {
		System.out.println("CVV:"+cvv);
		
	}

	@Override
	public void expiryDate(String month, String year) {
		
		System.out.println("Expiry Date:"+month+"-"+year);
		
	}

public void productCategory() {
		
		
		System.out.println("Product Category is Grocery:");
	}

	
	public void quantityInStock() {
		
		System.out.println("Product quantity in stock is 100:");
		
	}

	public void productUnit() {

		System.out.println("Product unit is boxes:");
		
	}

	public int quantity(int quanity)
	{
		System.out.println("Product quantity is"+quanity);
		return quanity;
	}

	

	

}
