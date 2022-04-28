package package2.OmPrakash;

public class BillingAddress {

	private String firstName;
	private String lastName;
	private String addressLocation;
	private String city;
	private String postalCode;
	private String email;

	public BillingAddress() {

	}

	public BillingAddress(String firstName, String lastName, String addressLocation, String city, String postalCode,
			String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.addressLocation = addressLocation;
		this.city = city;
		this.postalCode = postalCode;
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddressLocation() {
		return addressLocation;
	}

	public void setAddressLocation(String addressLocation) {
		this.addressLocation = addressLocation;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
