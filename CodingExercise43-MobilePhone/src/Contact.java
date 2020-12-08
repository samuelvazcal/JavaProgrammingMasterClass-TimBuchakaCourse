public class Contact {
	private String name;
	private String phoneNumber;

	public Contact(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	//Instead of having to parse the parameter for the name and the phone number,
	//we can create a contact record
	//It's really just calling a constructor to create a new contact record
	public static Contact createContact(String name, String phoneNumber) {
		return new Contact(name,phoneNumber);
	}
}
