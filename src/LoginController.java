import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import Entities.*;
//import classes.AlertBox;
//import classes.login.LoginController;
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
    void register(ActionEvent event) throws IOException {
        String username = UsernameTextField.getText();
        String password = PasswordTextField.getText();
        String type = TypeChoiceBox.getValue();
        
        String filename = "";
        if (type == "Store Owner") {
        	filename = "storeOwners.txt";
        }
        else if (type == "Buyer") {
        	filename = "buyers.txt";
        }
        FileWriter fw = new FileWriter("src\\resources\\" + filename, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(username + "\n" + password + "\n");
        bw.close();
    }
    
    public void setStage(Stage prevStage) {
        this.prevStage = prevStage;
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		// Initialize store owners inventory
		storeOwnerInventory = new StoreOwnerInventory();
		try {
	    	File myObj = new File("src\\resources\\storeOwners.txt");
	    	System.out.println(myObj.getAbsolutePath());
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
		
		
		// Initialize buyers inventory
		buyerInventory = new BuyerInventory();
		try {
	    	File myObj = new File("src\\resources\\buyers.txt");
	    	System.out.println(myObj.getAbsolutePath());
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
       
		TypeChoiceBox.getItems().add("Store Owner");
		
		TypeChoiceBox.getItems().add("Buyer");

	}

}