package com.springdi;

public class Address {

	public String flatNo;

	public String ownerName;

	public String city;

	public String state;

	public String getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
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

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("[").append("flatNo = " + flatNo)
				.append(", ownerName = " + ownerName).append(", city = " + city)
				.append(", state = " + state).append("]");
		// TODO Auto-generated method stub
		return buffer.toString();
	}

	public Address(String flatNo, String ownerName, String city, String state) {
		super();
		this.flatNo = flatNo;
		this.ownerName = ownerName;
		this.city = city;
		this.state = state;
		System.out.println("Constructor with multiple argument invoked");
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
