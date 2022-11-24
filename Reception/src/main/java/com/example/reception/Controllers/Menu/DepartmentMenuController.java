package com.example.reception.Controllers.Menu;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.example.reception.Department;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class DepartmentMenuController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label departmentButton;

    @FXML
    private Button doctorButton;

    @FXML
    private TableColumn<Department, Integer> idColumn;

    @FXML
    private TableColumn<Department, String> nameColumn;

    @FXML
    private Button patientButton;

    @FXML
    private TableColumn<Department, String> phoneColumn;

    @FXML
    private TableView<Department> tablePatient;

    @FXML
    void initialize() {
        patientButton.setOnAction(patientButtonAction());
        doctorButton.setOnAction(doctorButtonAction());
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

    private EventHandler<ActionEvent> doctorButtonAction() {
        return actionEvent -> {
            patientButton.getScene().getWindow().hide();

            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("/com/example/reception/Menu/doctor_menu.fxml"));
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
