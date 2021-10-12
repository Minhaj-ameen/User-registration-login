package project;

public class Member {
	
	private String fistName,lastName,username,password,address,contact;

	public Member(String fistName, String lastName, String username, String password, String address, String contact) {
		super();
		this.fistName = fistName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.address = address;
		this.contact = contact;
	}

	public Member() {
		super();
	}

	public String getFistName() {
		return fistName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getAddress() {
		return address;
	}

	public String getContact() {
		return contact;
	}
	
	
	
	
}
