package Entities;

//Onsite stores Class - inherits Store class


public class OnsiteStore extends Store{
	
	String address; 

	public OnsiteStore(int storeID, String name, String type, StoreOwner storeOwner, String address) {
		super(storeID, name, type, storeOwner);
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
		return "OnsiteStore [storeID=" + storeID + ", name=" + name + ", type=" + type
				+ ", products=" + products + "address=" + address +  "]";
	}

	
	
	
}
