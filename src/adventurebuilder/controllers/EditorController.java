package adventurebuilder.controllers;

import adventurebuilder.models.AdventureDetails;
import adventurebuilder.models.MapModel;
import adventurebuilder.models.RoomModel;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.paint.Color;

import java.util.ArrayList;

import static java.lang.String.format;

/**
 * Created by PY-DEV on 7/30/2016.
 */
public class EditorController {




    // Room Tab
    @FXML Label roomRefNumber = new Label();
    @FXML TextField roomTitle = new TextField();
    @FXML ChoiceBox directionRoom = new ChoiceBox();
    @FXML TextField roomExits = new TextField();
    @FXML TextField roomItems = new TextField();
    @FXML TextField roomNpcs = new TextField();
    @FXML TextArea roomShort = new TextArea();
    @FXML TextArea roomLong = new TextArea();

    @FXML ChoiceBox listOfRooms = new ChoiceBox();

    ObservableList<String> roomsListId = FXCollections.observableArrayList("Room List");

    //Items Tab




    @FXML ChoiceBox itemWeightChoice = new ChoiceBox();
    @FXML ChoiceBox npcsAlignmentChoice = new ChoiceBox();


    @FXML TextField rooms = new TextField();
    @FXML TextField scoreMultiplier = new TextField();
    @FXML TextField maxScore = new TextField();
    @FXML TextField items = new TextField();
    @FXML TextField npcs = new TextField();


    @FXML TextField difficulty = new TextField();
    @FXML TextField title = new TextField();
    @FXML TextField author = new TextField();

    // convert to DatePicker
    @FXML TextField date = new TextField();
    @FXML TextArea intro = new TextArea();
    @FXML TextField version = new TextField();
    @FXML Canvas canvas = new Canvas(800,460);

    @FXML Tab map = new Tab();
    @FXML Tab roomsTab = new Tab();
    @FXML Tab itemsTab = new Tab();
    @FXML Tab npcsTab = new Tab();

    @FXML TreeView roomTreeView = new TreeView();

    Boolean roomsTabSelected = false;
    MapModel mapModel = new MapModel();
    TreeItem<String> rootItem = new TreeItem<>("ROOMS");
    ArrayList<RoomModel> roomsList = new ArrayList<>();
    private static int roomINC = 1;
    String roomLocation = "";
    StringBuilder roomEx, roomNp, roomIte;





    // Convert to choiceBox






    public void save (ActionEvent event){

//        AdventureDetails adventureDetails = new AdventureDetails(rooms, scoreMultiplier,
//                maxScore, items, npcs, difficulty, title, author, version, date, intro);

        System.out.println("Adventure: ");

    }




    public void itemsTabSelect(){

        itemWeightChoice.setItems(FXCollections.observableArrayList("weightless", "light", "medium", "heavy", "unmovable"));


    }

    public void npcsTabSelect(){

        npcsAlignmentChoice.setItems(FXCollections.observableArrayList("Good","Neutral","Evil"));
    }



    public void handle(Event event) {
     if(map.isSelected()){


         mapModel.drawMainLayout(canvas);



     }else if(roomsTab.isSelected()){


//         if(roomsList != null){
//
//             for(RoomModel r: roomsList) {
//                 listOfRooms.setItems(FXCollections.observableArrayList(""+r.getId()));
//             }
//         }

         if(!roomsTabSelected) {
             directionRoom.setItems(FXCollections.observableArrayList("Start Room", "North", "South", "East", "West"));
             roomsTabSelected = true;
         }
     }
        directionRoom.setValue("Start Room");
        directionRoom.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
                @Override
                public void changed(ObservableValue observableValue, Object o, Object t1) {
                        System.out.println("Selected: " + t1.toString());
                    roomLocation = t1.toString();


                }
            });
    }



   public void addRoom(ActionEvent event){









       directionRoom.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
           @Override
           public void changed(ObservableValue observableValue, Object o, Object t1) {
               System.out.println("Selected: " + t1.toString());
               roomLocation = t1.toString();


           }
       });


//       listOfRooms.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener() {
//           @Override
//           public void changed(ObservableValue observableValue, Object o, Object t1) {
//               System.out.println("Selected: " + t1.toString());
//               roomTitle.setText(roomsList.get()));
//               roomLocation = t1.toString();
//
//
//           }
//       });

       listOfRooms.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
           @Override
           public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
               roomTitle.setText(roomsList.get(t1.intValue()-1).getRoomShortTitle());
               System.out.println("Selected: " + t1.toString());
               roomLocation = t1.toString();
           }
       });


       roomEx = new StringBuilder(roomExits.getText());

       roomsList.add(new RoomModel(roomTitle.getText(),roomEx));

//        roomsList.add(new RoomModel(roomTitle.getText(),
//                roomEx.append(roomExits.getText()),
//                roomIte.append(roomItems.getText()),
//                roomNp.append(roomNpcs.getText()), roomShort.getText(), roomLong.getText()));

       roomRefNumber.setText("#"+roomsList.get(roomsList.size()-1).getId());

       if(listOfRooms.getItems().size() > roomsList.size()){listOfRooms.getItems().clear();}

           RoomModel roomIndex = roomsList.get(roomsList.size()-1);
           roomsListId.add(format("ID: %d  NAME: %s ",roomIndex.getId(),roomIndex.getRoomShortTitle()));
           listOfRooms.setItems(roomsListId);
           listOfRooms.setValue(roomsList.get(0).getRoomShortTitle());


       roomTitle.clear();

       System.out.println("RoomList Size = "+roomsList.size());
       System.out.println("ChoiceBox Size = "+listOfRooms.getItems().size());


   }

   public void addRoomToMap (ActionEvent event){

        mapModel.drawRoom(canvas,rootItem,100,50);
        rootItem.setExpanded(true);




//        TreeItem<Void> newItem = new TreeItem<>();
//
//
//
//        newItem.setValue(mapModel.drawRoom(canvas,100,50));



//        rootItem.getChildren().addAll();
//
//        roomINC++;
//
        roomTreeView.setRoot(rootItem);


    }

    public void delRoomFromMap (ActionEvent event){


        int roomToBeDeleted = rootItem.getChildren().indexOf(roomTreeView.getSelectionModel().getSelectedItem());
        System.out.println("Length of Tree : "+rootItem.getChildren().size());
        rootItem.getChildren().remove(roomTreeView.getSelectionModel().getSelectedItem());

        mapModel.removeRoom(canvas,roomToBeDeleted);



    }





}
