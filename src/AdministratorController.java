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


public class AdministratorController {

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

}