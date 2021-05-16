import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import Entities.*;

// Controller Class for store owner boundary 

public class StoreOwnerController {
	
    private StoreOwner storeOwner; 
    
    private OnsiteStoresInventory onsiteStoresInventory; 
    
    private OnlineStoresInventory onlineStoresInventory; 
    
    private SystemProductsInventory systemProductsInventory; 
    
    private BrandsInventory brandsInventory; 
	
	public StoreOwner getStoreOwner() {
		return storeOwner;
	}

	public void setStoreOwner(StoreOwner storeOwner) {
		this.storeOwner = storeOwner;
	}

	public OnsiteStoresInventory getOnsiteStoresInventory() {
		return onsiteStoresInventory;
	}

	public void setOnsiteStoresInventory(OnsiteStoresInventory onsiteStoresInventory) {
		this.onsiteStoresInventory = onsiteStoresInventory;
	}

	public OnlineStoresInventory getOnlineStoresInventory() {
		return onlineStoresInventory;
	}

	public void setOnlineStoresInventory(OnlineStoresInventory onlineStoresInventory) {
		this.onlineStoresInventory = onlineStoresInventory;
	}



	@FXML
    private TextField OnlineProductNameTextField;

    @FXML
    private TextField OnlineProductDescriptionTextField;

    @FXML
    private TextField OnlineProductAgreementsTextField;

    @FXML
    private ChoiceBox<String> OnlineProductTypeChoiceBox;

    @FXML
    private TextField OnlineProductQuantityTextField;

    @FXML
    private TextField OnlineProductPriceTextField;

    @FXML
    private ChoiceBox<String> OnlineProductStoreChoiceBox;

    @FXML
    private Button AddOnlineProductButton;

    @FXML
    private TextField OnsiteProductNameTextField1;

    @FXML
    private TextField OnsiteProductDescriptionTextField1;

    @FXML
    private TextField OnsiteProductAgreementsTextField1;

    @FXML
    private ChoiceBox<String> OnsiteProductTypeChoiceBox1;

    @FXML
    private TextField OnsiteProductQuantityTextField1;

    @FXML
    private TextField OnsiteProductPriceTextField1;

    @FXML
    private ChoiceBox<String> OnsiteProductStoreChoiceBox1;

    @FXML
    private Button AddOnsiteProductButton1;

    @FXML
    private TextField OnlineStoreNameTextField;

    @FXML
    private TextField OnlineStoreNationalIDTextField;

    @FXML
    private TextField OnlineStoreTypeTextField;

    @FXML
    private Button AddOnlineSSuggestionButton;

    @FXML
    private TextField OnsiteStoreNameTextField1;

    @FXML
    private TextField OnsiteStoreNationalIDTextField1;

    @FXML
    private TextField OnsiteStoreTypeTextField1;

    @FXML
    private Button AddOnsiteSSuggestionButton1;

    @FXML
    private TextField OnsiteStoreAddressTextField;
    
    @FXML
    private ChoiceBox<String> OnlineProductSystemProductChoiceBox;

    @FXML
    private ChoiceBox<String> OnsiteProductSystemProductChoiceBox1;
    
 // Constructor for controller
    public StoreOwnerController() throws FileNotFoundException
    {
    	// Initialize onsite stores inventory
    	onsiteStoresInventory = new OnsiteStoresInventory(); 
    	File myObj = new File("onsiteStores.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
          int nationalID = Integer.parseInt(myReader.nextLine());
          String name = myReader.nextLine();
          String type = myReader.nextLine();
          String username = myReader.nextLine();
          String password = myReader.nextLine();
          String address = myReader.nextLine();
          if (username == this.storeOwner.getUsername())
          {
        	  onsiteStoresInventory.addStore(nationalID, name, type, this.storeOwner, address);         	  
          }          
        }
        myReader.close();
        
        // Initialize online stores inventory 
        onlineStoresInventory = new OnlineStoresInventory(); 
    	myObj = new File("onlineStores.txt");
        myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
          int nationalID = Integer.parseInt(myReader.nextLine());
          String name = myReader.nextLine();
          String type = myReader.nextLine();
          String username = myReader.nextLine();
          String password = myReader.nextLine();
          if (username == this.storeOwner.getUsername())
          {
        	  onlineStoresInventory.addStore(nationalID, name, type, this.storeOwner);         	  
          }          
        }
        myReader.close();
        
        // Initialize system products inventory 
        systemProductsInventory = new SystemProductsInventory(); 
        
        // Initialize brands inventory
        brandsInventory = new BrandsInventory(); 
    }

    @FXML
    void addOnlineProduct(ActionEvent event) {

    }

    @FXML
    void addOnlineSSuggestion(ActionEvent event) {

    }

    @FXML
    void addOnsiteProduct(ActionEvent event) {

    }

    @FXML
    void addOnsiteSSuggestion(ActionEvent event) {

    }

}
