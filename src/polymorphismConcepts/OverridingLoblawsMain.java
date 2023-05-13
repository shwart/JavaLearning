package polymorphismConcepts;

public class OverridingLoblawsMain {

	public static void main(String[] args) {
		
        RegisterParent reg = new RegisterParent();
		LoginChild log = new LoginChild();
		
		// parentobject.parentmethod
		
		reg.UserInfo("parent@gmail.com", "abc");
		System.out.println("***********************");
		
		// Method overriding
		// In inheritance, when we call parent method with child class object,it prints the parent method data
		// But.here when we call the method with child object,it will not run as the child method has same method with same paramters
		// And the method in child class is printed due to method overriding 
		// child class method overrides the parent class method
		System.out.println("========Method overriding=======");
		log.UserInfo("child@gmail.com", "abcd");
		
		
		/*
		 * Example: parent class - products,which has a method
		 * getProductByBrandName(Srring brndname)- 200 pdts it ll return all products of
		 * a particular brand on loblaws site child class - categories-
		 * home/grocery,which has a method getProductByBrandName(Srring brndname)- 100
		 * pdts it ll return all products of a particular brand inside home/grocery
		 * category e g:no Name brand- has pdts in Food, home/kitchen
		 * 
		 */
		
		
		

	}

}
