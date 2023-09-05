package secaodez;

public class Alguel {
	private String name, email;
	private int rent;
	
	
	
	public Alguel(String name, String email, int rent) {
		this.name = name;
		this.email = email;
		this.rent = rent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	
}
