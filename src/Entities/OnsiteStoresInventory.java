package Entities;
//Inventory of all registered onsite stores using linked list

import java.util.LinkedList;

public class OnsiteStoresInventory {

	LinkedList<Store> onsiteStores;

	public LinkedList<Store> getStores() {
		return onsiteStores;
	}

	public void setStores(LinkedList<Store> onsiteStores) {
		this.onsiteStores = onsiteStores;
	}

	public OnsiteStoresInventory() {
		this.onsiteStores = new LinkedList<Store>();
	}
	
	public Boolean addStore(int nationalID, String name, String type, StoreOwner storeOwner, String address) {
		OnsiteStore store = new OnsiteStore(nationalID, name, type, storeOwner, address); 
		onsiteStores.add(store); 
		return true; 
	}
	
}
