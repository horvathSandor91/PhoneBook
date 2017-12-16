package telefonkonyv;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Telefonkonyv extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("nezet.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setTitle("Telefonkönyv");
        stage.setWidth(800);
        stage.setHeight(680);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
