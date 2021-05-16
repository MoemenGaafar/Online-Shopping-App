package Entities;
//Inventory of all suggested online stores using observable list

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class OnlineStoreSuggestionsInventory {

	ObservableList<Store> onlineStoreSuggestions;

	public ObservableList<Store> getOnlineStoreSuggestions() {
		return onlineStoreSuggestions;
	}

	public void setOnlineStoreSuggestions(ObservableList<Store> storeSuggestions) {
		this.onlineStoreSuggestions = storeSuggestions;
	}

	public OnlineStoreSuggestionsInventory() {
		this.onlineStoreSuggestions = FXCollections.emptyObservableList();
	}
	
	public Boolean addStoreSuggestion(int nationalID, String name, String type, ObservableList<Product> products, StoreOwner storeOwner) {
		Store storeSuggestion = new Store(nationalID, name, type, storeOwner); 
		onlineStoreSuggestions.add(storeSuggestion); 
		return true; 
	}
	
}
