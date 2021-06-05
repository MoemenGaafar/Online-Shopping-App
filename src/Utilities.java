import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

import Entities.Brand;
import Entities.Category;
import Entities.Product;
import Entities.SystemProduct;
import Entities.Types;

public class Utilities {
	
	static LinkedList<Category> categories;
	static LinkedList<Brand> brands;
	static LinkedList<SystemProduct> systemProducts;
	static LinkedList<Product> products;
	
	/////////////////////////////////////////////////// LOADERS ///////////////////////////////////////////
	
	static LinkedList<Product> loadProducts(){
		products = new LinkedList<Product>();
		loadCategories();
		loadBrands();
		loadSystemProducts();
		try {        	
		    	File myObj = new File("src\\resources\\products.txt");
		        Scanner myReader = new Scanner(myObj);
		        while (myReader.hasNextLine()) {
		          String name = myReader.nextLine();
		          int price = Integer.parseInt(myReader.nextLine());
		          String description = myReader.nextLine();
		          int quantity = Integer.parseInt(myReader.nextLine());
		          String agreement = myReader.nextLine();
		          Brand brand = getBrand(myReader.nextLine());
		          SystemProduct sysProduct = getSystemProduct(myReader.nextLine());
		          Product product = new Product(name, price, description, quantity, agreement, brand, sysProduct, null); 
		          products.add(product);        
		        }
		        myReader.close();
		 }
		 catch (FileNotFoundException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
		 }
		
		return products;
	}
	
	static LinkedList<Category> loadCategories(){
		categories = new LinkedList<Category>(); 
		try {        	
		    	File myObj = new File("src\\resources\\categories.txt");
		        Scanner myReader = new Scanner(myObj);
		        while (myReader.hasNextLine()) {
		          String name = myReader.nextLine();
		          Category category = new Category(name); 
		          categories.add(category);        
		        }
		        myReader.close();
		 }
		 catch (FileNotFoundException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
		 }
		
		return categories;	
	}

	static LinkedList<Brand> loadBrands(){
		loadCategories();
		brands = new LinkedList<Brand>(); 
		try {        	
		    	File myObj = new File("src\\resources\\brands.txt");
		        Scanner myReader = new Scanner(myObj);
		        while (myReader.hasNextLine()) {
		          String name = myReader.nextLine();
		          Category category = getCategory(myReader.nextLine());
		          Brand brand = new Brand(name, category); 
		          brands.add(brand);        
		        }
		        myReader.close();
		 }
		 catch (FileNotFoundException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
		 }
		
		return brands;	
	}
	
	static LinkedList<SystemProduct> loadSystemProducts(){
		loadCategories();
		systemProducts = new LinkedList<SystemProduct>(); 
		try {        	
		    	File myObj = new File("src\\resources\\systemProducts.txt");
		        Scanner myReader = new Scanner(myObj);
		        while (myReader.hasNextLine()) {
		          String name = myReader.nextLine();
		          int min = Integer.parseInt(myReader.nextLine());
		          int max = Integer.parseInt(myReader.nextLine());
		          Types type = getType(myReader.nextLine());
		          Category category = getCategory(myReader.nextLine());
		          SystemProduct sysProduct = new SystemProduct(name, min, max, type, category);
		          systemProducts.add(sysProduct);        
		        }
		        myReader.close();
		 }
		 catch (FileNotFoundException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
		 }
		
		return systemProducts;	
	}
	
	///////////////////////////////////////// HELPERS ///////////////////////////////////////////////
	
	static Category getCategory(String categoryName) {
		for (int i = 0; i < categories.size(); i++) {
			if (categories.get(i).getCategoryName().equals(categoryName)) {
				return categories.get(i);
			}
		}
		return null;
	}
	
	static Brand getBrand(String brandName) {
		for (int i = 0; i < brands.size(); i++) {
			if (brands.get(i).getBrandName().equals(brandName)) {
				return brands.get(i);
			}
		}
		return null;
	}
	
	static SystemProduct getSystemProduct(String systemProductName) {
		for (int i = 0; i < systemProducts.size(); i++) {
			if (systemProducts.get(i).getName().equals(systemProductName)) {
				return systemProducts.get(i);
			}
		}
		return null;
	}
	
	static Types getType(String type) {
		switch (type) {
		case "Onsite": return Types.Onsite;
		case "Online": return Types.Online;
		default: return null;
		}
	}
}
