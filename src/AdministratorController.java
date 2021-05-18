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


public class AdministratorController implements Initializable {
	
    private Administrator administrator; 
    
    private OnsiteStoresInventory onsiteStoreSuggestionsInventory; 
    
    private OnlineStoresInventory onlineStoreSuggestionsInventory;
    
    private CategoriesInventory categoriesInventory; 

    
    
    public Administrator getAdministrator() {
		return administrator;
	}

	public void setAdministrator(Administrator administrator) {
		this.administrator = administrator;
	}

	public OnsiteStoresInventory getOnsiteStoreSuggestionsInventory() {
		return onsiteStoreSuggestionsInventory;
	}

	public void setOnsiteStoreSuggestionsInventory(OnsiteStoresInventory onsiteStoreSuggestionsInventory) {
		this.onsiteStoreSuggestionsInventory = onsiteStoreSuggestionsInventory;
	}

	public OnlineStoresInventory getOnlineStoreSuggestionsInventory() {
		return onlineStoreSuggestionsInventory;
	}

	public void setOnlineStoreSuggestionsInventory(OnlineStoresInventory onlineStoreSuggestionsInventory) {
		this.onlineStoreSuggestionsInventory = onlineStoreSuggestionsInventory;
	}

	public CategoriesInventory getCategoriesInventory() {
		return categoriesInventory;
	}

	public void setCategoriesInventory(CategoriesInventory categoriesInventory) {
		this.categoriesInventory = categoriesInventory;
	}

	@FXML
    private TextField NameTextField;

    @FXML
    private TextField MaxPriceTextField;

    @FXML
    private TextField MinPriceTextField;

    @FXML
    private ChoiceBox<String> CategoryChoiceBox;

    @FXML
    private ChoiceBox<String> TypeChoiceBox;

    @FXML
    private Button AddSystemProductButton;

    @FXML
    private TableView<Store> OnlineSSuggestionsTableView;

    @FXML
    private Button OnlineAddressSSuggestionButton;

    @FXML
    private ChoiceBox<Boolean> OnlineSSuggestionAction;

    @FXML
    private TableView<Store> OnsiteSSuggestionsTableView;

    @FXML
    private Button OnsiteAddressSSuggestionButton;

    @FXML
    private ChoiceBox<Boolean> OnsiteSSuggestionAction;

    @FXML
    void addSystemProduct(ActionEvent event) {

    }

    @FXML
    void addressOnlineSSuggestion(ActionEvent event) {

    }

    @FXML
    void addressOnsiteSSuggestion(ActionEvent event) {

    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		// Initialize categories inventory
		categoriesInventory = new CategoriesInventory(); 
        try {        	
        	File myObj = new File("resources\\brands.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String name = myReader.nextLine();
              categoriesInventory.addCategory(name);        
            }
            myReader.close();        
	    }
        catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
     // Initialize onsite stores inventory
     		onsiteStoreSuggestionsInventory = new OnsiteStoresInventory(); 
     		try {    	
         	File myObj = new File("resources\\onsiteStores.txt");
             Scanner myReader = new Scanner(myObj);
             while (myReader.hasNextLine()) {
               int nationalID = Integer.parseInt(myReader.nextLine());
               String name = myReader.nextLine();
               String type = myReader.nextLine();
               String username = myReader.nextLine();
               String address = myReader.nextLine();
               StoreOwner storeOwner = new StoreOwner(username, "-"); 
               onsiteStoreSuggestionsInventory.addStore(nationalID, name, type, storeOwner, address);
               }
             myReader.close();
     		}
     		catch (FileNotFoundException e) {
     		      System.out.println("An error occurred.");
     		      e.printStackTrace();
     		    }
             
             // Initialize online stores inventory 
     		onlineStoreSuggestionsInventory = new OnlineStoresInventory(); 
             try {        	
             	File myObj = new File("resources\\onlineStores.txt");
                 Scanner myReader = new Scanner(myObj);
                 while (myReader.hasNextLine()) {
                   int nationalID = Integer.parseInt(myReader.nextLine());
                   String name = myReader.nextLine();
                   String type = myReader.nextLine();
                   String username = myReader.nextLine();
                   StoreOwner storeOwner = new StoreOwner(username, "-"); 
                   onlineStoreSuggestionsInventory.addStore(nationalID, name, type, storeOwner); 	  
                            
                 }
                 myReader.close();        
     	    }
             catch (FileNotFoundException e) {
     		      System.out.println("An error occurred.");
     		      e.printStackTrace();
     		    }
	}

}