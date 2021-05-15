package Entities;

import java.util.LinkedList;

public class StoreSuggestionsInventory {

	LinkedList<Store> storeSuggestions;

	public LinkedList<Store> getStoreSuggestions() {
		return storeSuggestions;
	}

	public void setStores(LinkedList<Store> storeSuggestions) {
		this.storeSuggestions = storeSuggestions;
	}

	public StoreSuggestionsInventory() {
		this.storeSuggestions = new LinkedList<Store>();
	}
	
	public Boolean addStoreSuggestion(int nationalID, String name, Types type, LinkedList<Product> products, StoreOwner storeOwner) {
		Store storeSuggestion = new Store(nationalID, name, type, storeOwner); 
		storeSuggestions.add(storeSuggestion); 
		return true; 
	}
	
}
