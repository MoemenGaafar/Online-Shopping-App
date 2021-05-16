package Entities;
//Inventory of all suggested onsite stores using observable list

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class OnsiteStoreSuggestionsInventory {

	ObservableList<Store> onsiteStoreSuggestions;

	public ObservableList<Store> getOnsiteStoreSuggestions() {
		return onsiteStoreSuggestions;
	}

	public void setOnsiteStoreSuggestions(ObservableList<Store> storeSuggestions) {
		this.onsiteStoreSuggestions = storeSuggestions;
	}

	public OnsiteStoreSuggestionsInventory() {
		this.onsiteStoreSuggestions = FXCollections.emptyObservableList();
	}

	public Boolean addStoreSuggestion(int nationalID, String name, String type, ObservableList<Product> products, StoreOwner storeOwner) {
		Store storeSuggestion = new Store(nationalID, name, type, storeOwner); 
		onsiteStoreSuggestions.add(storeSuggestion); 
		return true; 
	}
	
}
