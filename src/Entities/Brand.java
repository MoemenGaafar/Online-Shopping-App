package Entities;

public class Brand {

	int brandID; 
	String BrandName;
	public int getBrandID() {
		return brandID;
	}
	public void setBrandID(int brandID) {
		this.brandID = brandID;
	}
	public String getBrandName() {
		return BrandName;
	}
	public void setBrandName(String brandName) {
		BrandName = brandName;
	}
	
	public Brand(int brandID, String brandName) {
		this.brandID = brandID;
		BrandName = brandName;
	} 
	
	
}
