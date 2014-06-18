package com.spring4.core.dependencyInjection;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

	@Autowired(required = true)
	@Value(value = "5185")
	public String flatNo;

	@Autowired
	@Value("Ranjan Kumar patel")
	public String ownerName;

	@Autowired(required = true)
	@Value("Bhubaneswar")
	public String city;

	@Autowired(required = true)
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

	public Address() {
		super();
		System.out.println("No arg constructor address bean");
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("[").append("flatNo = " + flatNo)
				.append("ownerName = " + ownerName).append("city = " + city)
				.append("state = " + state).append("]");
		// TODO Auto-generated method stub
		return buffer.toString();
	}

}
