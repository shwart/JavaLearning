package inheritanceExcercise;

public class AddtoCart extends Login{
	
	private String productName;
	private int quantity;
	private double unitprice;
	
	
	
    public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public double getUnitprice() {
		return unitprice;
	}



	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}





	public double totalPrice() 
		{
			double totalPrice = quantity*unitprice;
			return totalPrice;
		
		}
	
	
	public void CartInfo()
    {
	
		System.out.println("******CheckOut********");
    	System.out.println("Product added to Cart:"+getProductName());
    	System.out.println("No of Products: "+getQuantity());
    	System.out.println("Price per product:"+" "+ getUnitprice());
    	System.out.println("Total Price:"+totalPrice());
    	
        
    }

}
