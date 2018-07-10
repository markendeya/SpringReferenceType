package com.app;

public class Address {
	private int AddrId ;
	private String location;
	public Address() {
		super();
	}
	public int getAddrId() {
		return AddrId;
	}
	public void setAddrId(int addrId) {
		AddrId = addrId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Address [AddrId=" + AddrId + ", location=" + location + "]";
	}
	

}
