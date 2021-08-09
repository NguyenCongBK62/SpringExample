package net.codejava.contact.model;

public class Contact {
	private Integer id;
	private String name;
	private String address;
	private String email;
	private String phone;

	public Contact(Integer id, String name, String email, String address, String phone) {
		this(name, email, address, phone);
		this.id = id;
	}

	public Contact(String name, String email, String address, String phone) {
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", phone=" + phone
				+ "]";
	}

}
