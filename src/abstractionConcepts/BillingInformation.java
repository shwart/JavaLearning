package abstractionConcepts;

// we can not create object for AddProductToCart as it is an abstract class
// So, we can only access with extending it by BillingInformation class
// and then access with object of BillingInformation class
// when we extend it will show an error and when hover on it , click on add unimplemented methods
//then it will create non abstract method bodies here for those abstract methods in parent class with @Override

public class BillingInformation extends AddProductToCart{
	
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
	
	//( Here we define the body for abstract methods)
	// Implementation of abstract methods done in the class which inherits it

	@Override
	public void productCategory() {
		
		
		System.out.println("Product Category is Grocery:");
	}

	@Override
	public void quantityInStock() {
		
		System.out.println("Product quantity in stock is 100:");
		
	}

	@Override
	public void productUnit() {

		System.out.println("Product unit is boxes:");
		
	}
	
	

}
