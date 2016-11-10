
public class Person {
	
	private String firstName;
	private String lastName;
	
	public Person (String firstName, String lastName) {
		firstName = "";
		lastName = "";
	}
	
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	public String getName() {
		return lastName + " " + firstName;
	}
	
}
