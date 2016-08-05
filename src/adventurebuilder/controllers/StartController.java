package adventurebuilder.controllers;

import adventurebuilder.models.AdventureDetails;
import adventurebuilder.views.Editor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class StartController {

    @FXML Button btnQuit = new Button();
    @FXML Button btnPlay = new Button();
    @FXML Button btnEditor = new Button();





    private Editor editor = new Editor();



    public void play(ActionEvent event){



    }

    public void edit(ActionEvent event){
        try {
            editor.display();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();



    }

    public void quit(ActionEvent event){
        // exit

    }




}



