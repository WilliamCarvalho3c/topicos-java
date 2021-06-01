package entities;

public class Produto {
	private String name;
	private String email;
	public Produto() {
		
	}
	
	
	public Produto(String name, String email, int room) {
		this.name = name;
		this.email = email;
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


	public String toString() {
		return "Produto name=" 
				+ name 
				+ ", email=" 
				+ email 
				+ ", room=" 
				+ "";
	}
	

	
}
