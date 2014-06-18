package com.spring4.core.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "Think Talent")
public class Company {

	@Autowired(required = true)
	@Value(value = "Think Talent")
	private String companyName;

	@Autowired(required = true)
	@Value("Bimal Rath")
	private String companyCEO;

	@Autowired
	public Address companyAddress;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyCEO() {
		return companyCEO;
	}

	public void setCompanyCEO(String companyCEO) {
		this.companyCEO = companyCEO;
	}

	public Address getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(Address companyAddress) {
		this.companyAddress = companyAddress;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("[").append("companyName = " + companyName)
				.append("companyCEO = " + companyCEO).append("]");
		return buffer.toString();
	}

}
