package io.fitfoodie.food;

public abstract class RegisteredUser {

	
	private String name;
	private Address address;
	private Account account;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account acc) {
		this.account = acc;
	}
}