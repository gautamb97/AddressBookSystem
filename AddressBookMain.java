import java.util.*;
public class AddressBookMain {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");
		Person personDetails = new Person();
		personDetails.creatingContact();
	}

}

class Person{
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	String emailAddress;
	int zipCode;
	long phoneNumber;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
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
		
		System.out.print("Name : "+getFirstName()+" "+getLastName()+", Address: " + getAddress() + ", City: "+city+", State: "+getState()+", Zip Code: "+getZipCode()+", Phone Number:"+getPhoneNumber()+", Email Address: "+getEmailAddress());
	}
}