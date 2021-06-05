import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
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
	
	private Stage prevStage;

	private Administrator administrator; 
    
    private LinkedList<OnsiteStore> onsiteStoreSuggestionsList; 
    
    private LinkedList<OnlineStore> onlineStoreSuggestionsList; 
    
    private LinkedList<Category> categoriesList;
    
    private LinkedList<Brand> brandsList;

    
    
    public Administrator getAdministrator() {
		return administrator;
	}

	public void setAdministrator(Administrator administrator) {
		this.administrator = administrator;
	}

	public LinkedList<OnsiteStore> getOnsiteStoreSuggestionsList() {
		return onsiteStoreSuggestionsList;
	}

	public void setOnsiteStoreSuggestionsList(LinkedList<OnsiteStore> onsiteStoreSuggestionsList) {
		this.onsiteStoreSuggestionsList = onsiteStoreSuggestionsList;
	}

	public LinkedList<OnlineStore> getOnlineStoreSuggestionsList() {
		return onlineStoreSuggestionsList;
	}

	public void setOnlineStoreSuggestionsList(LinkedList<OnlineStore> onlineStoreSuggestionsList) {
		this.onlineStoreSuggestionsList = onlineStoreSuggestionsList;
	}

	public LinkedList<Category> getCategoriesList() {
		return categoriesList;
	}

	public void setCategoriesList(LinkedList<Category> categoriesList) {
		this.categoriesList = categoriesList;
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
    private TextField BrandNameTextField;

    @FXML
    private ChoiceBox<String> BrandCategoryNameChoiceBox;

    @FXML
    private Button AddBrandButton;
    

    @FXML
    void addBrand(ActionEvent event) {

    }

    @FXML
    void addSystemProduct(ActionEvent event) {

    }

    @FXML
    void addressOnlineSSuggestion(ActionEvent event) {

    }

    @FXML
    void addressOnsiteSSuggestion(ActionEvent event) {

    }
    
    public void setStage(Stage prevStage) {
        this.prevStage = prevStage;
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		// Initialize categories inventory
	    categoriesList = new LinkedList<Category>(); 
        try {        	
        	File myObj = new File("src\\resources\\brands.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String name = myReader.nextLine();
              Category category = new Category(name); 
              categoriesList.add(category);        
            }
            myReader.close();        
	    }
        catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
     // Initialize onsite stores inventory
            onsiteStoreSuggestionsList = new LinkedList<OnsiteStore>(); 
     		try {    	
         	File myObj = new File("src\\resources\\onsiteStores.txt");
             Scanner myReader = new Scanner(myObj);
             while (myReader.hasNextLine()) {
               int nationalID = Integer.parseInt(myReader.nextLine());
               String name = myReader.nextLine();
               String type = myReader.nextLine();
               String username = myReader.nextLine();
               String address = myReader.nextLine();
               StoreOwner storeOwner = new StoreOwner(username, "-"); 
               OnsiteStore onsiteStoreSuggestion = new OnsiteStore(nationalID, name, type, storeOwner, address);
               onsiteStoreSuggestionsList.add(onsiteStoreSuggestion); 
               }
             myReader.close();
     		}
     		catch (FileNotFoundException e) {
     		      System.out.println("An error occurred.");
     		      e.printStackTrace();
     		    }
             
             // Initialize online stores inventory 
     		onlineStoreSuggestionsList = new LinkedList<OnlineStore>();  
             try {        	
             	File myObj = new File("src\\resources\\onlineStores.txt");
                 Scanner myReader = new Scanner(myObj);
                 while (myReader.hasNextLine()) {
                   int nationalID = Integer.parseInt(myReader.nextLine());
                   String name = myReader.nextLine();
                   String type = myReader.nextLine();
                   String username = myReader.nextLine();
                   StoreOwner storeOwner = new StoreOwner(username, "-"); 
                   OnlineStore onlineStoreSuggestion = new OnlineStore(nationalID, name, type, storeOwner);
                   onlineStoreSuggestionsList.add(onlineStoreSuggestion);   
                            
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