package adventurebuilder.views;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Created by PY-DEV on 7/30/2016.
 */
public class Editor{

    @FXML Tab map = new Tab();
    @FXML ChoiceBox directionRoom = new ChoiceBox();

    public void display() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/adventurebuilder/controllers/editor.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Adventure Builder Editor");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.setResizable(false);
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/adventurebuilder/res/logo.png")));




        primaryStage.show();


    }




}
