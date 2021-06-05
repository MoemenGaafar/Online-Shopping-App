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
import javafx.fxml.Initializable;
import java.util.LinkedList;

// Controller Class for store owner boundary 

public class StoreOwnerController implements Initializable{
	
	private Stage prevStage;

	private StoreOwner storeOwner; 
    
    private LinkedList<OnsiteStore> onsiteStoresList; 
    
    private LinkedList<OnlineStore> onlineStoresList; 
    
    private LinkedList<SystemProduct> systemProductsList; 
    
    private LinkedList<Brand> brandsList; 
	
    public void setStage(Stage prevStage) {
        this.prevStage = prevStage;
    }
    	
    
	public StoreOwner getStoreOwner() {
		return storeOwner;
	}

	public void setStoreOwner(StoreOwner storeOwner) {
		this.storeOwner = storeOwner;
	}

    public LinkedList<OnsiteStore> getOnsiteStoresList() {
		return onsiteStoresList;
	}


	public void setOnsiteStoresList(LinkedList<OnsiteStore> onsiteStoresList) {
		this.onsiteStoresList = onsiteStoresList;
	}


	public LinkedList<OnlineStore> getOnlineStoresList() {
		return onlineStoresList;
	}


	public void setOnlineStoresList(LinkedList<OnlineStore> onlineStoresList) {
		this.onlineStoresList = onlineStoresList;
	}


	public LinkedList<Brand> getBrandsList() {
		return brandsList;
	}


	public void setBrandsList(LinkedList<Brand> brandsList) {
		this.brandsList = brandsList;
	}






	@FXML
    private Button AddOnsiteProductButton;

    @FXML
    private TextField ProductNameTextField;

    @FXML
    private TextField ProductDescriptionTextField;

    @FXML
    private TextField ProductAgreementsTextField;

    @FXML
    private TextField ProductQuantityTextField;

    @FXML
    private TextField ProductPriceTextField;

    @FXML
    private ChoiceBox<String> OnlineProductStoreChoiceBox;

    @FXML
    private Button AddOnlineProductButton;

    @FXML
    private ChoiceBox<String> SystemProductChoiceBox;
    
    @FXML
    private ChoiceBox<String> BrandChoiceBox;

    @FXML
    private ChoiceBox<String> OnsiteProductStoreChoiceBox;

    @FXML
    private TextField OnlineStoreNameTextField;

    @FXML
    private TextField OnlineStoreIDTextField;

    @FXML
    private TextField OnlineStoreTypeTextField;

    @FXML
    private Button AddOnlineSSuggestionButton;

    @FXML
    private TextField OnsiteStoreNameTextField;

    @FXML
    private TextField OnsitetoreIDTextFeild;

    @FXML
    private TextField OnsiteStoreTypeTextField;

    @FXML
    private Button AddOnsiteSSuggestionButton;

    @FXML
    private TextField OnsiteStoreAddressTextField;
    
  
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

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		// Initialize onsite stores inventory
		onsiteStoresList = new LinkedList<OnsiteStore>(); 
		try {    	
    	File myObj = new File("src\\resources\\onsiteStores.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
          int storeID = Integer.parseInt(myReader.nextLine());
          String name = myReader.nextLine();
          String type = myReader.nextLine();
          String username = myReader.nextLine();
          String address = myReader.nextLine();
          if (username == this.storeOwner.getUsername())
          {
        	  OnsiteStore onsiteStore = new OnsiteStore(storeID, name, type, this.storeOwner, address);  
        	  onsiteStoresList.add(onsiteStore); 
          }          
        }
        myReader.close();
		}
		catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
        
        // Initialize online stores inventory 
		onlineStoresList = new LinkedList<OnlineStore>(); 
        try {        	
        	File myObj = new File("src\\resources\\onlineStores.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              int storeID = Integer.parseInt(myReader.nextLine());
              String name = myReader.nextLine();
              String type = myReader.nextLine();
              String username = myReader.nextLine();
              if (username == this.storeOwner.getUsername())
              {
            	  OnlineStore onlineStore = new OnlineStore(storeID, name, type, this.storeOwner);  
            	  onlineStoresList.add(onlineStore);         	  
              }          
            }
            myReader.close();        
	    }
        catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
        
        // Initialize system products inventory 
        systemProductsList = new LinkedList<SystemProduct>(); 
        try {        	
        	File myObj = new File("src\\resources\\systemProducts.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String name = myReader.nextLine();
              int min = Integer.parseInt(myReader.nextLine());
              int max = Integer.parseInt(myReader.nextLine());
              Types type = Types.valueOf(myReader.nextLine());
              String categoryName = myReader.nextLine();
              Category category = new Category(categoryName);
              SystemProduct systemProduct = new SystemProduct(name, min, max, type, category);
              systemProductsList.add(systemProduct);        
            }
            myReader.close();        
	    }
        catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
        
        // Initialize brands inventory
        brandsList = new LinkedList<Brand>(); 
        try {        	
        	File myObj = new File("src\\resources\\brands.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String name = myReader.nextLine();
              String categoryName = myReader.nextLine();
              Category category = new Category(categoryName);
              Brand brand = new Brand(name, category); 
              brandsList.add(brand);        
            }
            myReader.close();        
	    }
        catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	

}
