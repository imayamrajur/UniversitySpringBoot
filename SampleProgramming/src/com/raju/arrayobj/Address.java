package com.raju.arrayobj;

public class Address {
	private String doorNo;
	private String streetName;
	private String place;
	private String pinCode;

	public Address(String doorNo, String streetName, String place, String pinCode) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.place = place;
		this.pinCode = pinCode;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public String getPlace() {
		return place;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", streetName=" + streetName + ", place=" + place + ", pinCode=" + pinCode
				+ "]";
	}

}
