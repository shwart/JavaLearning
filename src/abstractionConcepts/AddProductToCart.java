package abstractionConcepts;

// Why And When To Use Abstract Classes and Methods?
//To achieve security - hide certain details and only show the important details of an object.


// Abstract class

public abstract class AddProductToCart {


	// Abstract methods
	// They are used only in an abstract class and does not have a body


	public abstract void productCategory();

	public void productName(String productName)
	{
		System.out.println("Product chosen is"+productName);
	}

	public double productPrice(double productPrice)
	{
		System.out.println("Product price is"+productPrice);
		return productPrice;
	}


	public abstract void quantityInStock();

	public int quantity(int quanity)
	{
		System.out.println("Product quantity is"+quanity);
		return quanity;
	}


	public abstract void productUnit();



}
