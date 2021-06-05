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

public class BuyerController implements Initializable{

private Buyer buyer;

private Stage prevStage;

public Buyer getBuyer() {
	return buyer;
}

public void setBuyer(Buyer buyer) {
	this.buyer = buyer;
}

@Override
public void initialize(URL arg0, ResourceBundle arg1) {
	// TODO Auto-generated method stub
	
} 

public void setStage(Stage prevStage) {
    this.prevStage = prevStage;
}
	
}
