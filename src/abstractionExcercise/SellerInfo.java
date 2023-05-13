package abstractionExcercise;


// Abstract class

public abstract class SellerInfo {

	

	public abstract void sellerName();

	public void sellerAddress(String street, String city, String province)
	{
		System.out.println("Seller Address:"+ street+", "+city+", "+province);
	}

	public int noOfProducts(int number )
	{
		System.out.println("No of Products offer:"+number);
		return number;
	}


	public abstract void bestSellingProduct();

	


}
