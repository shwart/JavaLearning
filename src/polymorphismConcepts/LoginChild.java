package polymorphismConcepts;

public class LoginChild extends RegisterParent {

	private String email;

	private String password;



	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	public void clickSignin()

	{
		System.out.println("User Clicks on sign In button");
	}

	public void LoginInfo()
	{
		System.out.println("******Login********");
		System.out.println("Email:"+getEmail());
		System.out.println("Password: "+getPassword());
		clickSignin();
		System.out.println();   	

	}

	// Perform a task in different ways
	// Achieved in 2 ways
	// 1. Method overriding
	// Should happen bw 2 classes which have a parent-class relationship
	// method name & no&type of parameters must have same as parent class method 
	//can not override static method


	// just define the same method with diff type of parameters
	// If we give a same method as parent class with same name but typ of parameter different, string&strng in parent,string&int in child class&call method in parent, 
	//and then we call the method with child object it will print the parent method
	// as it is 2 different methods,no overriding
	//overrides ony if name,no&type of parameters same


	public void UserInfo(String username, String gpassword) {
		System.out.println("Child class info");
		System.out.println("Username:"+username);
		System.out.println("Password: "+password);

	}




}
