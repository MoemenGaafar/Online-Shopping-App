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

// Controller class for login boundary

public class LoginController implements Initializable {
	private Stage prevStage;
	
	private BuyerInventory buyerInventory; 
	
	private StoreOwnerInventory storeOwnerInventory; 
	
	
   
    public BuyerInventory getBuyerInventory() {
		return buyerInventory;
	}

	public void setBuyerInventory(BuyerInventory buyerInventory) {
		this.buyerInventory = buyerInventory;
	}

	public StoreOwnerInventory getStoreOwnerInventory() {
		return storeOwnerInventory;
	}

	public void setStoreOwnerInventory(StoreOwnerInventory storeOwnerInventory) {
		this.storeOwnerInventory = storeOwnerInventory;
	}

	@FXML
    private TextField UsernameTextField;

    @FXML
    private PasswordField PasswordTextField;
    
    @FXML
    private ChoiceBox<String> TypeChoiceBox;

    @FXML
    private Button LoginButton;

    @FXML
    private Button RegisterButton;

    @FXML
    void login(ActionEvent event) {

    }
    
    @FXML
    void register(ActionEvent event) {

    }
    
    public void setStage(Stage prevStage) {
        this.prevStage = prevStage;
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		File file = new File(".");
		for(String fileNames : file.list()) System.out.println(fileNames);
		
		// Initialize buyers inventory
		buyerInventory = new BuyerInventory();
		try {
	    	File myObj = new File("\\src\\resources\\buyers.txt");
	        Scanner myReader = new Scanner(myObj);
	        while (myReader.hasNextLine()) {
	          String username = myReader.nextLine();
	          String password = myReader.nextLine();
	          String address = myReader.nextLine();
	          buyerInventory.addBuyer(username, password, address);}
	          myReader.close();    	
		}
		catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }				
		       
		
		// Initialize store owners inventory
		storeOwnerInventory = new StoreOwnerInventory();
		try {			
	    	File myObj = new File("storeOwners.txt");
	        Scanner myReader = new Scanner(myObj);
	        while (myReader.hasNextLine()) {
	          String username = myReader.nextLine();
	          String password = myReader.nextLine();
	          storeOwnerInventory.addStoreOwner(username, password); 
	        }
	        myReader.close();        
		}
		catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }	
		
		
		
        
        
		
	}

}