package UserDatabase;

public class users {
	
	public String username;
	public String password; 
	
	public users (String username, String password) {
		this.username = username;
		this.password = password;
		
	}
	
	public String toString()   { 
        return username + " " + password + " "; 
	}
	
}
	