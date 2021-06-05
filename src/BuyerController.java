import javafx.fxml.FXML;

import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.Scanner;

import javax.swing.event.ChangeListener;

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
private ChoiceBox<String> PaymentTypeCheckBox;

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

@FXML
void productSelected(ActionEvent event) {
//	Product selectedProduct = ProductsTableView.getSelectionModel().getSelectedItem();
//	System.out.println(selectedProduct);
//	AgreementsCheckBox.setText(selectedProduct.getAgreement());
}
	

@Override
public void initialize(URL arg0, ResourceBundle arg1) {
	
	// Initialize onsite stores inventory
	onsiteStoresList = Utilities.loadOnsiteStores();
	        
	// Initialize online stores inventory 
	onlineStoresList = Utilities.loadOnlineStores();
	
	
	
	// Initialize products inventory
	productsList = Utilities.loadProducts();
	
	final ObservableList<Product> productsData = FXCollections.observableArrayList(productsList);
	
	ProductNameCol.setCellValueFactory(
		    new PropertyValueFactory<Product,String>("name")
		);
	
	ProductPriceCol.setCellValueFactory(
		    new PropertyValueFactory<Product,Integer>("price")
		);
	
	ProductDescriptionCol.setCellValueFactory(
		    new PropertyValueFactory<Product,String>("description")
		);
	
	ProductQuantityCol.setCellValueFactory(
		    new PropertyValueFactory<Product,Integer>("quantity")
		);
	
	ProductStoreNameCol.setCellValueFactory(
		    new PropertyValueFactory<Product,String>("storeName")
		);
	 ProductsTableView.setItems(productsData);
	 
	 PaymentTypeCheckBox.getItems().add("On Delivery");
	 PaymentTypeCheckBox.getItems().add("Credit Card");
	 PaymentTypeCheckBox.getItems().add("Voucher");


} 

public void setStage(Stage prevStage) {
    this.prevStage = prevStage;
}
	
}
