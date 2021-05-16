import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import Entities.*;

public class StoreOwnerController {

    @FXML
    private TextField OnlineProductNameTextField;

    @FXML
    private TextField OnlineProductDescriptionTextField;

    @FXML
    private TextField OnlineProductAgreementsTextField;

    @FXML
    private ChoiceBox<String> OnlineProductTypeChoiceBox;

    @FXML
    private TextField OnlineProductQuantityTextField;

    @FXML
    private TextField OnlineProductPriceTextField;

    @FXML
    private ChoiceBox<String> OnlineProductStoreChoiceBox;

    @FXML
    private Button AddOnlineProductButton;

    @FXML
    private TextField OnsiteProductNameTextField1;

    @FXML
    private TextField OnsiteProductDescriptionTextField1;

    @FXML
    private TextField OnsiteProductAgreementsTextField1;

    @FXML
    private ChoiceBox<String> OnsiteProductTypeChoiceBox1;

    @FXML
    private TextField OnsiteProductQuantityTextField1;

    @FXML
    private TextField OnsiteProductPriceTextField1;

    @FXML
    private ChoiceBox<String> OnsiteProductStoreChoiceBox1;

    @FXML
    private Button AddOnsiteProductButton1;

    @FXML
    private TextField OnlineStoreNameTextField;

    @FXML
    private TextField OnlineStoreNationalIDTextField;

    @FXML
    private TextField OnlineStoreTypeTextField;

    @FXML
    private Button AddOnlineSSuggestionButton;

    @FXML
    private TextField OnsiteStoreNameTextField1;

    @FXML
    private TextField OnsiteStoreNationalIDTextField1;

    @FXML
    private TextField OnsiteStoreTypeTextField1;

    @FXML
    private Button AddOnsiteSSuggestionButton1;

    @FXML
    private TextField OnsiteStoreAddressTextField;
    
    @FXML
    private ChoiceBox<String> OnlineProductSystemProductChoiceBox;

    @FXML
    private ChoiceBox<String> OnsiteProductSystemProductChoiceBox1;

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

}
