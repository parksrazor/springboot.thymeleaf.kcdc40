package com.parksrazor.web.user;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
public class User {
	private String  userid,passwd,name,ssn, addr, 
			profile, email, phoneNumber, registerDate;
	@Override
	public String toString() {
		return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s", userid,passwd,name,ssn, addr,profile, email, phoneNumber, registerDate);
	}
}
