package day2;

public class Customer {
	// Private attributes
	private int cid;
	private String name;
	private String address;
	private String city;

	// Getter for cid
	public int getCid() {
		return cid;
	}

	// Setter for cid
	public void setCid(int cid) {
		this.cid = cid;
	}

	// similarly getter and Setters for all objects
	public String getName() {
		return name;
	}

	// setter
	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", address=" + address + ", city=" + city + "]";
	}

}
