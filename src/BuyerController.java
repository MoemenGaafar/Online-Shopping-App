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

public class BuyerController implements Initializable{

private Buyer buyer;

private Stage prevStage;

private LinkedList<OnsiteStore> onsiteStoresList; 

private LinkedList<OnlineStore> onlineStoresList; 

private LinkedList<Product> productsList;

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
    productsList = new LinkedList<Product>(); 
    try {        	
    	File myObj = new File("src\\resources\\products.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
          String name = myReader.nextLine();
          //Product product = new Product(name); 
          //productsList.add(product);        
        }
        myReader.close();        
    }
    catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	
} 

public void setStage(Stage prevStage) {
    this.prevStage = prevStage;
}
	
}
