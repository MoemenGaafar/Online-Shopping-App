package Entities;

import java.util.LinkedList;

public class BuyerInventory {

	LinkedList<Buyer> buyers;

	public LinkedList<Buyer> getBuyers() {
		return buyers;
	}

	public void setBuyers(LinkedList<Buyer> buyers) {
		this.buyers = buyers;
	}

	public BuyerInventory() {
		this.buyers = new LinkedList<Buyer>();
	}
	
	public Boolean addBuyer(String username, String password, String address) {
		Buyer buyer = new Buyer(username, password, address); 
		buyers.add(buyer); 
		return true; 
	}
	
}
