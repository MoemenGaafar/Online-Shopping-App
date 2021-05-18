package Entities;
//Inventory of all registered onsite stores using linked list


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class OnsiteStoresInventory {

	ObservableList<Store> onsiteStores;

	public ObservableList<Store> getStores() {
		return onsiteStores;
	}

	public void setStores(ObservableList<Store> onsiteStores) {
		this.onsiteStores = onsiteStores;
	}

	public OnsiteStoresInventory() {
		this.onsiteStores = FXCollections.emptyObservableList();
	}
	
	public Boolean addStore(int nationalID, String name, String type, StoreOwner storeOwner, String address) {
		OnsiteStore store = new OnsiteStore(nationalID, name, type, storeOwner, address); 
		onsiteStores.add(store); 
		return true; 
	}
	
}
