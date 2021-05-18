package Entities; 
//Inventory of all registered categories using linked list

import java.util.LinkedList;

public class CategoriesInventory {

	LinkedList<Category> categories;

	public LinkedList<Category> getCategorys() {
		return categories;
	}

	public void setCategorys(LinkedList<Category> categories) {
		this.categories = categories;
	}

	public CategoriesInventory() {
		this.categories = new LinkedList<Category>();
	}
	
	public Boolean addCategory(String name)
	{
		Category brand = new Category(name); 
		categories.add(brand); 
		return true; 	
	}
	
}