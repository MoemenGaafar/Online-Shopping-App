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

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BuyerController implements Initializable{

private Buyer buyer;

private Stage prevStage;

private LinkedList<OnsiteStore> onsiteStoresList; 

private LinkedList<OnlineStore> onlineStoresList; 

private LinkedList<Product> productsList;

private LinkedList<Brand> brandsList;

private LinkedList<Category> categoriesList;


public Buyer getBuyer() {
	return buyer;
}

public void setBuyer(Buyer buyer) {
	this.buyer = buyer;
}


@FXML
private TextField ProductQuantityTextField;

@FXML
private TextField AddressTextField;

@FXML
private CheckBox AgreementsCheckBox;

@FXML
private Button MakePaymentButton;

@FXML
private TextField PaymentIDTextField;

@FXML
private ChoiceBox<?> PaymentTypeCheckBox;

@FXML
private Button ConfirmPaymentButton;

@FXML
private TableView<Product> ProductsTableView;

@FXML
private TableColumn<Product, String> ProductNameCol;

@FXML
private TableColumn<Product, Integer> ProductPriceCol;

@FXML
private TableColumn<Product, String> ProductDescriptionCol;

@FXML
private TableColumn<Product, String> ProductStoreNameCol;


@FXML
private TableColumn<Product, Integer> ProductQuantityCol;


@FXML
void handleAgreementsCheckBox(ActionEvent event) {

}

@FXML
void makePayment(ActionEvent event) {

}

@FXML
void ConfirmPayment(ActionEvent event) {

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
	          OnsiteStore onsiteStore = new OnsiteStore(storeID, name, type, null, address);  
        	  onsiteStoresList.add(onsiteStore);         
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
	              OnlineStore onlineStore = new OnlineStore(storeID, name, type, null);  
            	  onlineStoresList.add(onlineStore);          
	            }
	            myReader.close();        
		    }
	        catch (FileNotFoundException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
	
	
	
	// Initialize products inventory
	productsList = Utilities.loadProducts();
	
	final ObservableList<Product> productsData = FXCollections.observableArrayList(productsList);
	
//	ProductNameCol.setCellValueFactory(
//		    new PropertyValueFactory<Person,String>("firstName")
//		);
//		lastNameCol.setCellValueFactory(
//		    new PropertyValueFactory<Person,String>("lastName")
//		);
//		emailCol.setCellValueFactory(
//		    new PropertyValueFactory<Person,String>("email")
//		);
	
} 

public void setStage(Stage prevStage) {
    this.prevStage = prevStage;
}
	
}
