package interfaceExcercise;


public class CheckOut implements SellerInfo, BillingInfo {

	public static void main(String[] args) {
		
		
		CheckOut  c = new CheckOut();
		
		// seller details
		System.out.println("Seller Info:");
		System.out.println("************************");
		c.sellerName();
		c.sellerAddress("12 abc dr","Toronto", "Ontario");
	c.noOfProducts(500);
		c.bestSellingProduct();
		System.out.println();
		
		
		// billing info
		System.out.println("Billing Info:");
		System.out.println("************************");
		c.billingInfo("Walmart");
	c.billingInfo("10 xyz dr","Brampton", "Ontario");
		c.paymentType("Credit Card");
		c.cardNumber("123456");
		c.cardHolderName("Jo", "Nik");
		c.cvv(230);
		c.expiryDate("04", "2027");
	
	}

public void sellerName() {
		
		System.out.println("Seller name is: Amazon");
		
	}

	
	public void bestSellingProduct() {
		
		System.out.println("Best selling product is: Iphone");
		
	}
	
	public void sellerAddress(String street, String city, String province)
	{
		System.out.println("Seller Address:"+ street+", "+city+", "+province);
	}

	public int noOfProducts(int number )
	{
		System.out.println("No of Products offer:"+number);
		return number;
	}
	
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
	

	

	

}
