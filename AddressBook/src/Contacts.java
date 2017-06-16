import java.util.*;

public class Contacts {
	
	private Person person;
	private Address address;
	
	public Scanner input = new Scanner(System.in);
	
	HashMap<Person, Address> contacts;
	
	public Contacts () {
		
		contacts = new HashMap<Person,Address>();
	}
	
	public void newPerson () {
		
		System.out.print("Enter first name: ");
		String fn = input.nextLine();
		
		System.out.print("Enter last name: ");
		String ln = input.nextLine();
		
		Person person = new Person(fn,ln);
	}
	
	public void newAddress() {
		
		System.out.print("Enter street: ");
		String street = input.nextLine();
		
		System.out.print("Enter city: ");
		String city = input.nextLine();		
		
		System.out.print("Enter postal code: ");
		String pc = input.nextLine();
		
		System.out.print("Enter country ");
		String country = input.nextLine();
		
		System.out.print("Enter phone number: ");
		long pn = input.nextLong();
		
		Address address = new Address(street,city,pc,country,pn);
	}
	
	public void addContact(Person p, Address a) {
		contacts.put(p, a);
	}
	
	public void removeContact(Person p) {
		contacts.remove(p);
	}
	
	public void getContact(Person p) {
		contacts.get(p);
	}
	
	public void bookSize() {
		contacts.size();
	}
	
	public boolean hasContact (Person p) {
		return contacts.containsKey(p);
	}
	
	public boolean hasValue (Address a) {
		return contacts.containsValue(a);
	}
	
}
