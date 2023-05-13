package polymorphismConcepts;

public class RegisterParent {
	
	private String email;

	private String password;
	private String confirmPassword;
	
	
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


	public String getConfirmPassword() {
		return confirmPassword;
	}


	public void setConfirmpassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

    public void checkPassword(String password, String confirmPassword)
    {
     if(password == confirmPassword)
    	 System.out.println("Passwords Match");
     else
    	 System.out.println("Passwords Mismatch");
     
    }
    public void clickCreatePcid()

    {
    	 System.out.println("User Clicks on Create PCId button");
    }
	
	public void RegInfo()
    {
		System.out.println("******Registration********");
    	System.out.println("Email:"+getEmail());
    	System.out.println("Password: "+getPassword());
    	System.out.println("Confirm Password:"+" "+getConfirmPassword());
    	checkPassword(getPassword(), getConfirmPassword());
    	System.out.println("User checks the privacy policy");
    	clickCreatePcid();
    	System.out.println();
        
    }

	public void UserInfo(String username, String password)
    {
		System.out.println("Parent class info");
    	System.out.println("Username:"+username);
    	System.out.println("Password: "+password);
  
        
    }

}
