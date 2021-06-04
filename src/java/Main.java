/**
 * 
 */
package java;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;


/**
 * @author LENOVO
 *
 */
public class Main extends Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
        FXMLLoader loader = new FXMLLoader(getClass().getResource("views/login.fxml"));
        Parent root = loader.load();

        LoginBoundary boundary = loader.getController();

        controller.setStage(primaryStage);
        primaryStage.setTitle("Shopping Application");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();		
	}

}
