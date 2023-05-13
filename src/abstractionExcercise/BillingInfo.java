package abstractionExcercise;

// we can not create object for AddProductToCart as it is an abstract class
// So, we can only access with extending it by BillingInformation class
// and then access with object of BillingInformation class
// when we extend it will show an error and when hover on it , click on add unimplemented methods
//then it will create non abstract method bodies here for those abstract methods in parent class with @Override

public class BillingInfo extends SellerInfo{
	
	
	public String billingInfo(String billingname)
	{
		System.out.println("Biller Name is:"+billingname);
		return billingname;
	}
	
	public void billingInfo(String street, String city, String province)
	{
		System.out.println("Billing Address:"+ street+", "+city+", "+province);
	}
	
	public String paymentType(String paytype)
	{
		System.out.println("Card Type:"+paytype);
		return paytype;
	}
	
	public void cardNumber(String number)
	{
		System.out.println("Card Number:"+number);
		
	}
	public void cardHolderName(String fname, String lname)
	{
		System.out.println("Card Holder:"+fname+" "+lname);
		
	}
	
	public void cvv(int cvv) {
		System.out.println("CVV:"+cvv);
		
	}

	public void expiryDate(String month, String year) {
		
		System.out.println("Expiry Date:"+month+"-"+year);
		
	}
	
	
	// Implementation of abstract methods done in the class which inherits it

	@Override
	public void sellerName() {
		
		System.out.println("Seller name is: Amazon");
		
	}

	@Override
	public void bestSellingProduct() {
		
		System.out.println("Best selling product is: Iphone");
		
	}
	
	

}
