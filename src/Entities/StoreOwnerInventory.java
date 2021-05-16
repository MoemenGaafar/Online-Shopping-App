package Entities;
//Inventory of all registered store users using linked list


import java.util.LinkedList;

public class StoreOwnerInventory {

	LinkedList<StoreOwner> storeOwners;

	public LinkedList<StoreOwner> getStoreOwners() {
		return storeOwners;
	}

	public void setStoreOwners(LinkedList<StoreOwner> storeOwners) {
		this.storeOwners = storeOwners;
	}

	public StoreOwnerInventory() {
		this.storeOwners = new LinkedList<StoreOwner>();
	}
	
	public Boolean addStoreOwner(String username, String password) {
		StoreOwner storeOwner = new StoreOwner(username, password); 
		storeOwners.add(storeOwner); 
		return true; 
	}
	
	
}
