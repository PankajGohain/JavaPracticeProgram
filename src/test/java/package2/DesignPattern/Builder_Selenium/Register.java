package package2.DesignPattern.Builder_Selenium;

//https://www.digitalocean.com/community/tutorials/builder-design-pattern-in-java

public class Register {

	private String firstName;
	private String lastName;
	private String email;
	private String telephone;
	private String password;
	private String confirmPassword;

	public Register(RegisterBuilder registerBuider) {

		this.firstName = registerBuider.firstName;
		this.lastName = registerBuider.lastName;
		this.email = registerBuider.email;
		this.telephone = registerBuider.telephone;
		this.password = registerBuider.password;
		this.confirmPassword = registerBuider.confirmPassword;

	}

	// getter

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getTelephone() {
		return telephone;
	}

	public String getPassword() {
		return password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public static class RegisterBuilder {

		private String firstName;
		private String lastName;
		private String email;
		private String telephone;
		private String password;
		private String confirmPassword;

		// setters

		public RegisterBuilder setFirstName(String firstName) {
			this.firstName = firstName;
			return this; // returns current class object
		}

		public RegisterBuilder setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public RegisterBuilder setPassword(String password) {
			this.password = password;
			return this;
		}

		public RegisterBuilder setConfirmPassword(String confirmPassword) {
			this.confirmPassword = confirmPassword;
			return this;
		}

		public RegisterBuilder setEmail(String email) {
			this.email = email;
			return this;
		}

		public RegisterBuilder setTelephone(String telephone) {
			this.telephone = telephone;
			return this;
		}

		public Register build() {
			return new Register(this);
		}

	}
}
