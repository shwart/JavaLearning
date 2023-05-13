package interfaceConcepts;

public interface BillingInfo {
	
	// Interface methods are public by default,so without giving public is ok 
	
	public String paymentType(String paytype);
	
	public void cardNumber(String number);
	
	public void cardHolderName(String fname, String lname);
	
	public void cvv(int cvv);
	
	public void expiryDate(String month, String year);
	
	
	
	

}
