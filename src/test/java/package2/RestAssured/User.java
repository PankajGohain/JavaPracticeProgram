package package2.RestAssured;

import com.fasterxml.jackson.databind.JsonNode;

public class User {

	public String name;
	public String email;
	private String[] roles;
	private boolean admin;
	private JsonNode address;
	
	//  private Map<String, Object> address;

	public JsonNode getAddress() {
		return address;
	}

	public void setAddress(JsonNode address) {
		this.address = address;
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

	public String[] getRoles() {
		return roles;
	}

	public void setRoles(String[] roles) {
		this.roles = roles;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public User() {
	}

	public User(String name, String email, String[] roles, boolean admin) {
		this.name = name;
		this.email = email;
		this.roles = roles;
		this.admin = admin;
	}

}
