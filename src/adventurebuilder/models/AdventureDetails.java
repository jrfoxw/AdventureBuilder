package adventurebuilder.models;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Date;

/**
 * Created by PY-DEV on 7/30/2016.
 */
public class AdventureDetails {

    /**
     *
     * Author and Adventure information stored in SQL.
     *
     */

    private TextField totalRooms = new TextField();
    private TextField scoreMultiplier = new TextField();
    private TextField maxScore = new TextField();
    private TextField totalItems = new TextField();
    private TextField totalNpcs = new TextField();


    // Adventure & Author info
    private TextField difficulty = new TextField();
    private TextField adventureTitle = new TextField();
    private TextField adventureAuthor = new TextField();
    private TextField adventureVersion = new TextField();
    private DateFormat dateFormat;
    private TextField adventureDate = new TextField();
    private TextArea adventureIntro = new TextArea();

    public AdventureDetails(TextField totalRooms, TextField scoreMultiplier, TextField maxScore, TextField totalItems,
                            TextField totalNpcs, TextField difficulty, TextField adventureTitle, TextField adventureAuthor,
                            TextField adventureVersion, TextField adventureDate, TextArea adventureIntro) {
        this.totalRooms = totalRooms;
        this.scoreMultiplier = scoreMultiplier;
        this.maxScore = maxScore;
        this.totalItems = totalItems;
        this.totalNpcs = totalNpcs;
        this.difficulty = difficulty;
        this.adventureTitle = adventureTitle;
        this.adventureAuthor = adventureAuthor;
        this.adventureVersion = adventureVersion;
        this.adventureDate = adventureDate;
        this.adventureIntro = adventureIntro;
    }

    public TextField getTotalRooms() {
        return totalRooms;
    }

    public void setTotalRooms(TextField totalRooms) {
        this.totalRooms = totalRooms;
    }

    public TextField getScoreMultiplier() {
        return scoreMultiplier;
    }

    public void setScoreMultiplier(TextField scoreMultiplier) {
        this.scoreMultiplier = scoreMultiplier;
    }

    public TextField getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(TextField maxScore) {
        this.maxScore = maxScore;
    }

    public TextField getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(TextField totalItems) {
        this.totalItems = totalItems;
    }

    public TextField getTotalNpcs() {
        return totalNpcs;
    }

    public void setTotalNpcs(TextField totalNpcs) {
        this.totalNpcs = totalNpcs;
    }

    public TextField getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(TextField difficulty) {
        this.difficulty = difficulty;
    }

    public String getAdventureTitle() {
        return adventureTitle.getText();
    }

    public void setAdventureTitle(TextField adventureTitle) {
        this.adventureTitle = adventureTitle;
    }

    public TextField getAdventureAuthor() {
        return adventureAuthor;
    }

    public void setAdventureAuthor(TextField adventureAuthor) {
        this.adventureAuthor = adventureAuthor;
    }

    public TextField getAdventureVersion() {
        return adventureVersion;
    }

    public void setAdventureVersion(TextField adventureVersion) {
        this.adventureVersion = adventureVersion;
    }

    public TextField getAdventureDate() {
        return adventureDate;
    }

    public void setAdventureDate(TextField adventureDate) {
        this.adventureDate = adventureDate;
    }

    public TextArea getAdventureIntro() {
        return adventureIntro;
    }

    public void setAdventureIntro(TextArea adventureIntro) {
        this.adventureIntro = adventureIntro;
    }
}
