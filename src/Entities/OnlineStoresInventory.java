package Entities;
//Inventory of all registered online stores using linked list


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class OnlineStoresInventory {

	ObservableList<Store> onlineStores;

	public ObservableList<Store> getStores() {
		return onlineStores;
	}

	public void setStores(ObservableList<Store> onlineStores) {
		this.onlineStores = onlineStores;
	}

	public OnlineStoresInventory() {
		this.onlineStores = FXCollections.emptyObservableList();
	}
	
	public Boolean addStore(int nationalID, String name, String type, StoreOwner storeOwner) {
		Store onlineStore = new OnlineStore(nationalID, name, type, storeOwner); 
		onlineStores.add(onlineStore); 
		return true; 
	}
	
}
