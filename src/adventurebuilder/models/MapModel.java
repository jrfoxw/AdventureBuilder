package adventurebuilder.models;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.paint.Color;

import java.util.ArrayList;

import static java.lang.String.format;

/**
 * Created by PY-DEV on 8/3/2016.
 */
public class MapModel {

    /**
     * Process information on displaying rooms mapped out on canvas layer.
     */

    private static int ROOMSIZEX = 50;
    private static int ROOMSIZEY = 50;
    private static int[] LIMITSIZE = {1100,1100};
    private static int[] MAXGRIDSIZE = {64,64};
    private static int GRIDSKIPSIZEX = 0;
    private static int GRIDSKIPSIXEY = 0;
    private static int SKIPGAP = 10;

    ArrayList<RoomModel> roomModels= new ArrayList<>();
    ArrayList<ItemModel> itemsInRoom = new ArrayList<>();

    TreeItem<String> rootView = new TreeItem<>();
    public Canvas canvas = new Canvas();
    public int posX = 0;
    public int posY = 0;



    public MapModel(){

//        this.canvas = canvas;
//        this.rootView = rootView;
//        this.posX = posX;
//        this.posY = posY;



    }

    public void drawMainLayout(Canvas canvas){

        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(5);

        gc.strokeRect(50,50,LIMITSIZE[0],LIMITSIZE[1]);
    }


    public void drawRoom(Canvas canvas, TreeItem<String> rootView, int posX, int posY){

        GraphicsContext gc = canvas.getGraphicsContext2D();



        gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(5);
        gc.strokeRect(posX+GRIDSKIPSIZEX,posX,posY,posY);
        GRIDSKIPSIZEX+=posX/2+SKIPGAP;

        int[] coords = {posX+GRIDSKIPSIZEX,posX,posY,posY};
        ArrayList<String> tempExits = new ArrayList<>();

        tempExits.add("E,W");

//        roomModels.add(new RoomModel("Test Room",coords,"Stuff","Test",tempExits));
//        int roomsArraySize = roomModels.size()-1;
//        TreeItem<String> newItem = new TreeItem<>(format("Room %d X:%d Y:%d",roomModels.get(roomsArraySize).getID_NUMBER(),
//                roomModels.get(roomsArraySize).getRoomLocationOnGrid()[0],
//                roomModels.get(roomsArraySize).getRoomLocationOnGrid()[2]));
//        rootView.getChildren().add(newItem);

        System.out.println("Attempting to draw..");




    }

    public void removeRoom(Canvas canvas, int item){

        GraphicsContext gc = canvas.getGraphicsContext2D();

        System.out.println("B4 Length:"+roomModels.size());
        RoomModel room = roomModels.get(item-1);

        System.out.println(format("deleting index:%d ID:%d",item,roomModels.get(item).getId()));
        gc.setStroke(Color.RED);
        int gridLocX1 = room.getRoomLocationOnGrid()[0];
        int gridLocX2 = room.getRoomLocationOnGrid()[1];
        int gridLocY1 = room.getRoomLocationOnGrid()[2];
        int gridLocY2 = room.getRoomLocationOnGrid()[3];

        gc.strokeRect(gridLocX1,gridLocX2,gridLocY1,gridLocY2);
        roomModels.remove(item-1);
        System.out.println("AF Length:"+roomModels.size());


    }

    public ArrayList<RoomModel> getRoomModels() {
        return roomModels;
    }

    public void setRoomModels(ArrayList<RoomModel> roomModels) {
        this.roomModels = roomModels;
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public TreeItem getRootView() {
        return rootView;
    }

    public void setRootView(TreeItem rootView) {
        this.rootView = rootView;
    }
}
