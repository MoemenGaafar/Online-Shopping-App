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
	
	public Boolean addStore(int nationalID, String name, String type, LinkedList<Product> products, StoreOwner storeOwner) {
		Store store = new Store(nationalID, name, type, storeOwner); 
		onsiteStores.add(store); 
		return true; 
	}
	
}
