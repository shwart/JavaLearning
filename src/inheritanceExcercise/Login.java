package inheritanceExcercise;

public class Login extends Register {
	
	// no need to set unme &pwd as register  lass already has those
	
	/*
	 * private String email;
	 * 
	 * private String password;
	 * 
	 * 
	 * 
	 * public String getEmail() { return email; }
	 * 
	 * 
	 * public void setEmail(String email) { this.email = email; }
	 * 
	 * 
	 * public String getPassword() { return password; }
	 * 
	 * 
	 * public void setPassword(String password) { this.password = password; }
	 */

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

}
