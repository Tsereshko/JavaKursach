package com.example.reception.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SingInController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField loginField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button singInButton;

    @FXML
    private Button singUpButton;

    @FXML
    void initialize() {
        singInButton.setOnAction(singInButtonAction());

        singUpButton.setOnAction(singUpButtonAction());
    }


    private EventHandler<ActionEvent> singInButtonAction() {
        return actionEvent -> {
            singInButton.getScene().getWindow().hide();

            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("/com/example/reception/Menu/patient_menu.fxml"));
                loader.load();

                Parent parent = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(parent));
                stage.showAndWait();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };
    }

    private EventHandler<ActionEvent> singUpButtonAction() {
        return actionEvent -> {
            singUpButton.getScene().getWindow().hide();

            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("/com/example/reception/SingUp/sing_up.fxml"));
                loader.load();

                Parent parent = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(parent));
                stage.showAndWait();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };
    }


}