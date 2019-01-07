package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;

public class ControllerContact {

    @FXML
    private TextField textfieldPhone;
    @FXML
    private TextField textfieldCarreer;
    @FXML
    private DatePicker datepickerBirthday;
    @FXML
    private Button buttonImportImage;
    @FXML
    private TextField textfieldAdress;
    @FXML
    private Button buttonCloseWindow;
    @FXML
    private TextField textfieldEmail;
    @FXML
    private ImageView imageView;
    @FXML
    private TextField textfieldNickname;
    @FXML
    private TextField textfieldCity;
    @FXML
    private TextField textfieldName;
    @FXML
    private TextField textfieldFacebook;
    @FXML
    private TextField textfieldInstagram;
    @FXML
    private Button buttonSave;
    @FXML
    private Button buttonCancel;
    @FXML
    private TextField textfieldState;
    @FXML
    private TextField textfieldLastName;
    @FXML
    private TextField textfieldWebsite;
    @FXML
    private TextField textfieldTwitter;
    @FXML
    private TextField textfieldCountry;
    @FXML
    private TextField textfieldMobile;

    @FXML
    void importImage(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select an image");

        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg"));

        final Node source = (Node) event.getSource();
        final Stage stage = (Stage) source.getScene().getWindow();

        File file = fileChooser.showOpenDialog(stage);
        imageView.setImage(new Image(file.toURI().toString()));
    }

    @FXML
    void closeWindow(ActionEvent event) {
        final Node source = (Node) event.getSource();
        final Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    @FXML
    void createContact(ActionEvent event) {
        Boolean createProfile = false;
        createProfile = true;

        if (createProfile) {
            Person person = new Person(Integer.toString(Database.getListPerson().size()), textfieldName.getText(),
                    textfieldLastName.getText(), new Button(textfieldName.getText() + " " + textfieldLastName.getText()),
                    textfieldNickname.getText(), datepickerBirthday.getPromptText(),
                    imageView.getImage(), textfieldEmail.getText(), textfieldPhone.getText(), textfieldMobile.getText(),
                    "Notes", "Company", "Position", textfieldCountry.getText(),
                    textfieldState.getText(), textfieldCity.getText(), textfieldAdress.getText(),
                    /*Cambiar*/textfieldCarreer.getText(), textfieldWebsite.getText(), textfieldFacebook.getText(),
                    textfieldTwitter.getText(), textfieldInstagram.getText());
            Database.addPerson(person);

            Alert dialogAlert = new Alert(Alert.AlertType.INFORMATION);
            dialogAlert.setTitle("Message");
            dialogAlert.setHeaderText(null);
            dialogAlert.setContentText("Your user has been successfully created.");
            dialogAlert.initStyle(StageStyle.UTILITY);
            dialogAlert.showAndWait();

            closeWindow(event);
        }
    }
}
