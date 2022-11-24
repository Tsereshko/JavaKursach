package com.example.reception.Controllers.Menu;

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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class DoctorMenuController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> cabinetColumn;

    @FXML
    private Button departmentButton;

    @FXML
    private TableColumn<?, ?> departmentColumn;

    @FXML
    private TableColumn<?, ?> firstnameColumn;

    @FXML
    private TableColumn<?, ?> functionColumn;

    @FXML
    private TableColumn<?, ?> idColumn;

    @FXML
    private TableColumn<?, ?> lastnameColumn;

    @FXML
    private Button patientButton;

    @FXML
    private TableColumn<?, ?> patronymicColumn;

    @FXML
    private TableColumn<?, ?> phoneColumn;

    @FXML
    private TableView<?> tableDoctor;

    @FXML
    void initialize() {
        patientButton.setOnAction(patientButtonAction());
        departmentButton.setOnAction(departmentButtonAction());
    }

    private EventHandler<ActionEvent> departmentButtonAction() {
        return actionEvent -> {
            patientButton.getScene().getWindow().hide();
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("/com/example/reception/Menu/department_menu.fxml"));
                loader.load();

                Parent parent = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(parent));
                stage.show();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };
    }

    private EventHandler<ActionEvent> patientButtonAction() {
        return actionEvent -> {
            patientButton.getScene().getWindow().hide();
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("/com/example/reception/Menu/patient_menu.fxml"));
                loader.load();

                Parent parent = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(parent));
                stage.show();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };
    }

}


