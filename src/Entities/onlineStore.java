package Entities;

import java.util.LinkedList;

public class onlineStore extends Store {

	public onlineStore(int nationalID, String name, Types type, LinkedList<Product> products) {
		super(nationalID, name, type, products);
	}

	@Override
	public String toString() {
		return "onlineStore [nationalID=" + nationalID + ", name=" + name + ", type=" + type + ", products=" + products
				+ "]";
	}

	
}
