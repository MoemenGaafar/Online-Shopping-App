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

public class LoginController {
	private Stage prevStage;
   
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

}