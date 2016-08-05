package adventurebuilder.models;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.ArrayList;

/**
 * Created by PY-DEV on 7/30/2016.
 */
public class RoomModel {


    /**
     * Setup Room information for player to interact with
     */


    private static int ROOM_NUMBER = 0;
    private static int ID_NUMBER = 999;
    private int id;
    private int[] roomLocationOnGrid = new int[4];
    private String roomShortTitle;
    private String roomVerboseDescription;
    private String roomBriefDescription;
    private String cardinalDirectionOnMap;
    private StringBuilder roomExits = new StringBuilder();
    private StringBuilder roomItems = new StringBuilder();
    private StringBuilder roomNpcs = new StringBuilder();



    public RoomModel(String roomShortTitle, StringBuilder roomExits){

        ID_NUMBER++;
        this.id = ID_NUMBER;
        this.roomShortTitle = roomShortTitle;
        this.roomExits = roomExits;

    }



    public RoomModel(String roomShortTitle,
                     StringBuilder roomExits, StringBuilder roomItems,
                     StringBuilder roomNpcs, String roomBriefDescription,
                     String roomVerboseDescription){

        ID_NUMBER++;
        this.id = ID_NUMBER;
        this.roomShortTitle = roomShortTitle;
//        this.cardinalDirectionOnMap = cardinalDirectionOnMap;
        this.roomExits = roomExits;
        this.roomNpcs = roomNpcs;
        this.roomBriefDescription = roomBriefDescription;
        this.roomVerboseDescription = roomVerboseDescription;

    }


    public RoomModel(String roomShortTitle,
                     int[] roomLocationOnGrid,
                     String roomVerboseDescription,
                     String roomBriefDescription,
                     StringBuilder roomExits) {
        ROOM_NUMBER++;
        ID_NUMBER++;
        this.id = ID_NUMBER;

        this.roomShortTitle = roomShortTitle;
        this.roomLocationOnGrid = roomLocationOnGrid;
        this.roomVerboseDescription = roomVerboseDescription;
        this.roomBriefDescription = roomBriefDescription;
        this.roomExits = roomExits;
    }

    public RoomModel(String roomShortTitle,
                     int[] roomLocationOnGrid,
                     String roomVerboseDescription,
                     String roomBriefDescription,
                     String cardinalDirectionOnMap,
                     StringBuilder roomExits,
                     StringBuilder roomItems,
                     StringBuilder roomNpcs) {

        ROOM_NUMBER++;
        ID_NUMBER++;
        this.roomShortTitle = roomShortTitle;
        this.roomLocationOnGrid = roomLocationOnGrid;
        this.roomVerboseDescription = roomVerboseDescription;
        this.roomBriefDescription = roomBriefDescription;
        this.cardinalDirectionOnMap = cardinalDirectionOnMap;
        this.roomExits = roomExits;
        this.roomItems = roomItems;
        this.roomNpcs = roomNpcs;
    }




    public Integer getRoomNumber() {
        return ROOM_NUMBER;
    }


    public String getRoomShortTitle() {
        return roomShortTitle;
    }

    public void setRoomShortTitle(String roomShortTitle) {
        this.roomShortTitle = roomShortTitle;
    }

    public String getRoomVerboseDescription() {
        return roomVerboseDescription;
    }

    public void setRoomVerboseDescription(String roomVerboseDescription) {
        this.roomVerboseDescription = roomVerboseDescription;
    }

    public String getRoomBriefDescription() {
        return roomBriefDescription;
    }

    public void setRoomBriefDescription(String roomBriefDescription) {
        this.roomBriefDescription = roomBriefDescription;
    }

    public StringBuilder getRoomExits() {
        return roomExits;
    }

    public void setRoomExits(StringBuilder roomExits) {
        this.roomExits = roomExits;
    }

    public StringBuilder getRoomItems() {
        return roomItems;
    }

    public void setRoomItems(StringBuilder roomItems) {
        this.roomItems = roomItems;
    }

    public StringBuilder getRoomNpcs() {
        return roomNpcs;
    }

    public void setRoomNpcs(StringBuilder roomNpcs) {
        this.roomNpcs = roomNpcs;
    }

    public String getCardinalDirectionOnMap() {
        return cardinalDirectionOnMap;
    }

    public void setCardinalDirectionOnMap(String cardinalDirectionOnMap) {
        this.cardinalDirectionOnMap = cardinalDirectionOnMap;
    }

    public int[] getRoomLocationOnGrid() {
        return roomLocationOnGrid;
    }

    public void setRoomLocationOnGrid(int[] roomLocationOnGrid) {
        this.roomLocationOnGrid = roomLocationOnGrid;
    }

    public int getID_NUMBER() {
        return ID_NUMBER;
    }

    public void setID_NUMBER(int ID_NUMBER) {
        this.ID_NUMBER = ID_NUMBER;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
