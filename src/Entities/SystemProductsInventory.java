package Entities;

import java.util.LinkedList;

public class SystemProductsInventory {

	LinkedList<SystemProduct> systemProducts;

	public LinkedList<SystemProduct> getproducts() {
		return systemProducts;
	}

	public void setProducts(LinkedList<SystemProduct> systemProducts) {
		this.systemProducts = systemProducts;
	}

	public SystemProductsInventory() {
		this.systemProducts = new LinkedList<SystemProduct>();
	}
	
	public Boolean addproduct(String name, range priceRange, Types type, Category category) {
		SystemProduct systemProduct = new SystemProduct(name, int min, int max, type,category); 
		systemProducts.add(systemProduct); 
		return true; 
	}
	
}
