package Entities;

import java.util.LinkedList;

public class StoresInventory {

	LinkedList<Store> stores;

	public LinkedList<Store> getStores() {
		return stores;
	}

	public void setStores(LinkedList<Store> Stores) {
		this.stores = Stores;
	}

	public StoresInventory() {
		this.stores = new LinkedList<Store>();
	}
	
	public Boolean addStore(int nationalID, String name, Types type, LinkedList<Product> products, StoreOwner storeOwner) {
		Store store = new Store(nationalID, name, type, storeOwner); 
		stores.add(store); 
		return true; 
	}
	
}
