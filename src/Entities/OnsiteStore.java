package Entities;

//Onsite stores Class - inherits Store class


public class OnsiteStore extends Store{
	
	String address; 

	public OnsiteStore(int nationalID, String name, String type, StoreOwner storeOwner, String address) {
		super(nationalID, name, type, storeOwner);
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
