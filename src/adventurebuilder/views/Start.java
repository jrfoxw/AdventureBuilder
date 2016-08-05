package adventurebuilder.views;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Start extends Application {

    // Will be stored in sql or realm db.





    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/adventurebuilder/controllers/start.fxml"));
        primaryStage.setTitle("Adventure Builder");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/adventurebuilder/res/logo.png")));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
