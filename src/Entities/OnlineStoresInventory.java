package Entities;
//Inventory of all registered online stores using linked list

import java.util.LinkedList;

public class OnlineStoresInventory {

	LinkedList<Store> onlineStores;

	public LinkedList<Store> getStores() {
		return onlineStores;
	}

	public void setStores(LinkedList<Store> onlineStores) {
		this.onlineStores = onlineStores;
	}

	public OnlineStoresInventory() {
		this.onlineStores = new LinkedList<Store>();
	}
	
	public Boolean addStore(int nationalID, String name, String type, StoreOwner storeOwner) {
		Store onlineStore = new OnlineStore(nationalID, name, type, storeOwner); 
		onlineStores.add(onlineStore); 
		return true; 
	}
	
}
