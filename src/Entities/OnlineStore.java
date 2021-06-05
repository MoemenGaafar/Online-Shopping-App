package Entities;
// Online stores Class - inherits Store class

public class OnlineStore extends Store {

	public OnlineStore(int storeID, String name, String type, StoreOwner storeOwner) {
		super(storeID, name, type, storeOwner);
	}

	@Override
	public String toString() {
<<<<<<< HEAD
		return "storeID=" + storeID + ", name=" + name + ", type=" + type;
=======
		return "OnlineStore [storeID=" + storeID + ", name=" + name + ", type=" + type
				+ "]";
>>>>>>> branch 'master' of https://github.com/MoemenGaafar/Online-Shopping-App.git
	}

	
}
