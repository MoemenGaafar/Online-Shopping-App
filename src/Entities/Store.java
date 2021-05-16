package Entities;
// Stores class

import java.util.*;

public class Store {

	int nationalID; 
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
	public int getNationalID() {
		return nationalID;
	}
	public void setNationalID(int nationalID) {
		this.nationalID = nationalID;
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
	
	public Store(int nationalID, String name, String type, StoreOwner storeOwner) {
		super();
		this.nationalID = nationalID;
		this.name = name;
		this.type = type;
		this.products = new LinkedList<Product>();
		this.storeOwner = storeOwner; 
	} 
	
	boolean addProduct( String name, int price, String description, int quantity, String agreement,
			Types type, Brand brand, SystemProduct systemProduct) {
		Product product = new Product(name,price, description, quantity, agreement,
				type, brand, systemProduct); 
		products.add(product); 
		return true; 
	}
	
	@Override
	public String toString() {
		return "Store [nationalID=" + nationalID + ", name=" + name + ", type=" + type + ", products=" + products + ", store owner=" + storeOwner.username + "]";
	}
	
	
	
}
