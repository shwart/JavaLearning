package interfaceExcercise;

public interface BillingInfo {
	
	public String billingInfo(String billingname);
	
	public void billingInfo(String street, String city, String province);
	
	public String paymentType(String paytype);
	
	public void cardNumber(String number);
	
	public void cardHolderName(String fname, String lname);
	
	public void cvv(int cvv);
	
	public void expiryDate(String month, String year);
	

}
