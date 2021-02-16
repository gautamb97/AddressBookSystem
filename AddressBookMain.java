import java.util.*;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");
		Contact personDetails = new Contact("firstName", "last name", "address ", "city ", "state", "email address", 0,
				0);
		personDetails.addingContacts();

	}

}

class Contact {
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	String emailAddress;
	int zipCode;
	long phoneNumber;

	public Contact(String firstName, String lastName, String address, String city, String state, String emailAddress,
			int zipCode, long phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.emailAddress = emailAddress;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public int getZipCode() {
		return zipCode;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	static Scanner phoneBookDetails = new Scanner(System.in);

	public void creatingContact() {
		System.out.println("Enter your first name : ");
		setFirstName(phoneBookDetails.next());
		System.out.println("Enter your last name : ");
		setLastName(phoneBookDetails.next());
		System.out.println("Enter your address : ");
		setAddress(phoneBookDetails.nextLine());
		setAddress(phoneBookDetails.nextLine());
		System.out.println("Enter your city : ");
		setCity(phoneBookDetails.next());
		System.out.println("Enter your State : ");
		setState(phoneBookDetails.next());
		System.out.println("Enter your zip code : ");
		setZipCode(phoneBookDetails.nextInt());
		System.out.println("Enter your phone number : ");
		setPhoneNumber(phoneBookDetails.nextLong());
		System.out.println("Enter your email address : ");
		setEmailAddress(phoneBookDetails.next());

	}

	public void addingContacts() {

		creatingContact();
		Contact details = new Contact(firstName, lastName, address, city, state, emailAddress, zipCode, phoneNumber);
		List<Object> personDetailsSet = new ArrayList<>();
		details.getFirstName();
		details.getLastName();
		details.getAddress();
		details.getCity();
		details.getState();
		details.getEmailAddress();
		details.getZipCode();
		details.getPhoneNumber();
		personDetailsSet.add(details);

		System.out.println(
				"--------------------------------------------------------------------------------------------------");
		System.out.println(personDetailsSet);
		System.out.println(
				"--------------------------------------------------------------------------------------------------");
	}

	@Override
	public String toString() {
		return "[firstName =" + firstName + ", lastName =" + lastName + ", city =" + city + ", state =" + state
				+ ", zip =" + zipCode + ", phone =" + phoneNumber + ", email address =" + emailAddress + "]\n";
	}

}
