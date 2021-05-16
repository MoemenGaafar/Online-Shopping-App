package Entities; 
//Inventory of all registered brands using linked list

import java.util.LinkedList;

public class BrandsInventory {

	LinkedList<Brand> brands;

	public LinkedList<Brand> getBrands() {
		return brands;
	}

	public void setBrands(LinkedList<Brand> brands) {
		this.brands = brands;
	}

	public BrandsInventory() {
		this.brands = new LinkedList<Brand>();
	}
	
}