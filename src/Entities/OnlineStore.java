package Entities;
// Online stores Class - inherits Store class

public class OnlineStore extends Store {

	public OnlineStore(int nationalID, String name, String type, StoreOwner storeOwner) {
		super(nationalID, name, type, storeOwner);
	}

	@Override
	public String toString() {
		return "OnlineStore [nationalID=" + nationalID + ", name=" + name + ", type=" + type + ", products=" + products
				+ "]";
	}

	
}
