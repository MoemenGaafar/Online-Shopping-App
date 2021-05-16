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

// Controller class for login boundary

public class LoginController {
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
    
    // Constructor for controller
    public LoginController() throws FileNotFoundException
    {
    	// Initialize buyers inventory
    	buyerInventory = new BuyerInventory(); 
    	File myObj = new File("buyers.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
          String username = myReader.nextLine();
          String password = myReader.nextLine();
          String address = myReader.nextLine();
          buyerInventory.addBuyer(username, password, address); 
        }
        myReader.close();
        
        // Initialize store owners inventory
        storeOwnerInventory = new StoreOwnerInventory(); 
    	myObj = new File("buyers.txt");
        myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
          String username = myReader.nextLine();
          String password = myReader.nextLine();
          storeOwnerInventory.addStoreOwner(username, password); 
        }
        myReader.close();
    }
    

    @FXML
    void register(ActionEvent event) {

    }
    
    public void setStage(Stage prevStage) {
        this.prevStage = prevStage;
    }

}