/*
 * John Smith
 * CITC 1311 PO2 - Puretskiy
 * Calculator application using java FXML and Scene Builder. takes user input and performs correct calculation based on what arithmetic button is clicked.
 * user must click back into text field after arithmetic button is clicked.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Calculator extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        //set icon for application
        Image icon = new Image("/icons/calculator-icon.png");
        stage.getIcons().add(icon);
        //
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
