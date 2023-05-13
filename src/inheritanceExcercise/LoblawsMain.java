package inheritanceExcercise;

public class LoblawsMain {

	public static void main(String[] args) {
		

		Login log = new Login();
		
		// Parent - child 
		// Single inheritance - login class inherits register class
		//with the object of login(child class),we can access the methods&variables from register(parent) class
		
		System.out.println("Single Inheritance");
		System.out.println("==========================");
		log.setEmail("casa@gmail.com");
		log.setPassword("abc");
		log.setConfirmpassword("abc");
		
		log.RegInfo();
		log.LoginInfo();
		
		// Child of login & Grand child of register class
		// Can access data from both the class as cart inherits login class and login inherits register class
		
		AddtoCart cart = new AddtoCart();
		
		System.out.println("Multilevel Inheritance");
		System.out.println("==========================");
		cart.setEmail("abc@gmail.com");
		cart.setPassword("abcd");
		cart.setConfirmpassword("abcd");
		cart.setProductName("Chicken Drumstick");
		cart.setQuantity(2);
		cart.setUnitprice(9.99);
		cart.RegInfo();
		cart.LoginInfo();
		cart.CartInfo();
		
		
		
		
		
		

	}

}
