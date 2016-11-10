

public class Address {
	
	private String street;
	private String city;
	private String postalCode;
	private String country;
	private long phoneNumber;
	
	public Address (String street, String city, String postalCode, String country, long phoneNumber) {
		street = "";
		city = "";
		postalCode = "";
		country = "";
		phoneNumber = 0;
	}
	
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public String getCountry() {
		return country;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
