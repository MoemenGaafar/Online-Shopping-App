package Entities;

import java.util.LinkedList;


public class OnsiteStore extends Store{
	
	String address; 

	public OnsiteStore(int nationalID, String name, Types type, LinkedList<Product> products, String address) {
		super(nationalID, name, type, products);
		this.address =  address; 
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "OnsiteStore [nationalID=" + nationalID + ", name=" + name + ", type=" + type
				+ ", products=" + products + "address=" + address +  "]";
	}

	
	
	
}
