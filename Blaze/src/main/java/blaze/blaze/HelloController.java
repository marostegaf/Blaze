package blaze.blaze;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {

    @FXML
    private Circle corCircle;

    @FXML
    private Label corText;

    @FXML
    private TextField n1;

    @FXML
    private TextField n2;

    @FXML
    private TextField n3;

    @FXML
    private TextField n4;

    @FXML
    private TextField n5;

    @FXML
    private TextField n6;

    @FXML
    private TextField n7;

    @FXML
    private TextField newValue;

    @FXML
    ImageView myImageView;



    @FXML
    private void textColor(TextField field) {
        if (Integer.parseInt(field.getText()) == 15) {
            field.setStyle("-fx-background-color: transparent;-fx-border-color: linear-gradient(to right, red 50%, black 50%);-fx-border-width: 0px 0px 2px");
        } else {
            if (Integer.parseInt(field.getText()) <= 7) {
                field.setStyle("-fx-background-color: transparent;-fx-border-color: red; -fx-border-width: 0px 0px 2px;");
            } else {
                field.setStyle("-fx-background-color: transparent;-fx-border-color: black; -fx-border-width: 0px 0px 2px;");
            }
        }
    }
    @FXML
    private void addListenerToTextField(TextField field) {
        field.setOnKeyReleased(event -> {
            textColor(field);
        });
    }

    @FXML
    public void sumFields(ActionEvent event) {
        int sum = 0;
        if (newValue.getText().isBlank() == false) {
            n1.setText(n2.getText());
            n2.setText(n3.getText());
            n3.setText(n4.getText());
            n4.setText(n5.getText());
            n5.setText(n6.getText());
            n6.setText(n7.getText());
            n7.setText(newValue.getText());

        }

        if (n1.getText().isBlank() == true) {
            n1.setText("0");
        } else {
            sum += Integer.parseInt(n1.getText());
        }

        if (n2.getText().isBlank() == true) {
            n2.setText("0");
        } else {
            sum += Integer.parseInt(n2.getText());
        }

        if (n3.getText().isBlank() == true) {
            n3.setText("0");
        } else {
            sum += Integer.parseInt(n3.getText());
        }

        if (n4.getText().isBlank() == true) {
            n4.setText("0");
        } else {
            sum += Integer.parseInt(n4.getText());
        }

        if (n5.getText().isBlank() == true) {
            n5.setText("0");
        } else {
            sum += Integer.parseInt(n5.getText());
        }

        if (n6.getText().isBlank() == true) {
            n6.setText("0");
        } else {
            sum += Integer.parseInt(n6.getText());
        }

        if (n7.getText().isBlank() == true) {
            n7.setText("0");
        } else {
            sum += Integer.parseInt(n7.getText());
        }

        if (sum % 2 == 0) {
            corText.setText("BLACK");
            corText.setStyle("-fx-border-color: black; -fx-border-width: 2px 2px 2px; -fx-text-fill: black");
            corCircle.setStyle("-fx-fill: black");

        } else {
            corText.setText("RED");
            corText.setStyle("-fx-border-color: red; -fx-border-width: 2px 2px 2px; -fx-text-fill: red");
            corCircle.setStyle("-fx-fill: red");
        }

        textColor(n1);
        textColor(n2);
        textColor(n3);
        textColor(n4);
        textColor(n5);
        textColor(n6);
        textColor(n7);
    }
    public void handleMouseClicked(MouseEvent event) {
        TextField textField = (TextField) event.getSource();
        textField.clear();
    }

    @FXML
    public void btnCloseOnAction(MouseEvent e) {

        System.exit(0);
    }

    Image myImage = new Image(getClass().getResourceAsStream("Blaze.png"));

    @FXML
    public void initialize() {
        addListenerToTextField(n1);
        addListenerToTextField(n2);
        addListenerToTextField(n3);
        addListenerToTextField(n4);
        addListenerToTextField(n5);
        addListenerToTextField(n6);
        addListenerToTextField(n7);
        addListenerToTextField(newValue);
        myImageView.setImage(myImage);
    }
}
