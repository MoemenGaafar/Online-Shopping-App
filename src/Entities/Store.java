package Entities;
// Stores class

import java.util.*;

public class Store {

	int storeID;
	String name;
	String type;
	StoreOwner storeOwner;
	LinkedList<Product> products;
	
	public StoreOwner getStoreOwner() {
		return storeOwner;
	}
	public void setStoreOwner(StoreOwner storeOwner) {
		this.storeOwner = storeOwner;
	}
	public int getStoreID() {
		return storeID;
	}
	public void setStoreID(int storeID) {
		this.storeID = storeID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public LinkedList<Product> getProducts() {
		return products;
	}
	public void setProducts(LinkedList<Product> products) {
		this.products = products;
	}
	
	public Store(int storeID, String name, String type, StoreOwner storeOwner) {
		super();
		this.storeID = storeID;
		this.name = name;
		this.type = type;
		this.products = new LinkedList<Product>();
		this.storeOwner = storeOwner; 
	} 
	
	boolean addProduct( String name, int price, String description, int quantity, String agreement,
			Types type, Brand brand, SystemProduct systemProduct, Store store) {
		Product product = new Product(name,price, description, quantity, agreement,
				brand, systemProduct, store); 
		products.add(product); 
		return true; 
	}
	
	@Override
	public String toString() {
		return "Store [nationalID=" + storeID + ", name=" + name + ", type=" + type + ", products=" + products + ", store owner=" + storeOwner.username + "]";
	}
	
	
	
}
