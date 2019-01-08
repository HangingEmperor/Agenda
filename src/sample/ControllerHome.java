package sample;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ControllerHome implements Initializable {

    @FXML
    private Label labelAddress;
    @FXML
    private ImageView imageView;
    @FXML
    private Label labelPostalCode;
    @FXML
    private Label labelPhone;
    @FXML
    private TextField textfieldFacebook;
    @FXML
    private Label labelElectronicMail;
    @FXML
    private Label labelCompanyAndPosition;
    @FXML
    private TextField textfieldInstagram;
    @FXML
    private Pane panelDisplayContact;
    @FXML
    private Button buttonCreateContact;
    @FXML
    private Label labelNameComplete;
    @FXML
    private TextField textfieldWebsite;
    @FXML
    private TextField textfieldTwitter;
    @FXML
    private Label labelMobile;
    @FXML
    private Label labelCityStateCountry;
    @FXML
    private Label labelNickName;
    @FXML
    private Label labelBirthday;
    @FXML
    private ImageView imageviewClose;
    @FXML
    private ImageView imageviewMobileIcon;
    @FXML
    private ImageView imageviewPhoneIcon;
    @FXML
    private TableView<Person> tableView;
    @FXML
    private TableColumn<Person, Button> tableColumnName;

    private double xOffset = 0;
    private double yOffset = 0;

    public void refreshTable() {
        List<Person> listPersona = Database.getListPerson();
        tableView.setItems(FXCollections.observableArrayList(listPersona));

        listPersona.get(Database.listPerson.size() - 1).getCompleteName().setId("" + (Database.listPerson.size() - 1));
        listPersona.get(Database.listPerson.size() - 1).getCompleteName().setOnAction(event -> {
            int id = Integer.parseInt(((Button) event.getSource()).getId());
            displayProfile(id);
        });
    }

    private void displayProfile(int id) {
        labelNameComplete.setText(Database.getListPerson().get(id).getCompleteName().getText());
        labelPhone.setText(Database.getListPerson().get(id).getPhone());
        labelMobile.setText(Database.getListPerson().get(id).getMobile());
        labelElectronicMail.setText(Database.getListPerson().get(id).getEmail());
        labelNickName.setText(Database.getListPerson().get(id).getNickName());
        labelCityStateCountry.setText(Database.getListPerson().get(id).getCity() + ", "
                + Database.getListPerson().get(id).getState() + ", "
                + Database.getListPerson().get(id).getCountry());
        labelAddress.setText(Database.getListPerson().get(id).getAddress());
        labelPostalCode.setText(Database.getListPerson().get(id).getPostalCode());
        labelCompanyAndPosition.setText(Database.getListPerson().get(id).getCompany() + ", "
                + Database.getListPerson().get(id).getPosition());
        labelBirthday.setText(Database.getListPerson().get(id).getBirthday());

        textfieldFacebook.setText(Database.getListPerson().get(id).getSocialNetworksFacebook());
        textfieldInstagram.setText(Database.getListPerson().get(id).getSocialNetworksInstagram());
        textfieldTwitter.setText(Database.getListPerson().get(id).getSocialNetworksTwitter());
        textfieldWebsite.setText(Database.getListPerson().get(id).getWebsite());

        imageView.setImage(Database.getListPerson().get(id).getProfilePicture());

        panelDisplayContact.setVisible(true);
    }

    @FXML
    void createContact(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/create.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("View data person");
        primaryStage.setScene(new Scene(root, 600, 520));
        primaryStage.setResizable(false);

        primaryStage.initStyle(StageStyle.UNDECORATED);
        root.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
        });
        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                primaryStage.setX(event.getScreenX() - xOffset);
                primaryStage.setY(event.getScreenY() - yOffset);
            }
        });

        primaryStage.showAndWait();
        refreshTable();
    }

    @FXML
    void closeWindow() {
        System.exit(0);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tableColumnName.setCellValueFactory(new PropertyValueFactory<>("completeName"));
        List<Person> listPersona = Database.getListPerson();
        tableView.setItems(FXCollections.observableArrayList(listPersona));

        Image image = new Image(getClass().getResourceAsStream("img/close.png"));
        imageviewClose.setImage(image);
        image = new Image(getClass().getResourceAsStream("img/phone.png"));
        imageviewPhoneIcon.setImage(image);
        image = new Image(getClass().getResourceAsStream("img/mobile.png"));
        imageviewMobileIcon.setImage(image);

        panelDisplayContact.setVisible(false);
    }
}
