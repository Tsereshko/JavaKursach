package com.example.reception.Controllers.Menu;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.example.reception.Patient;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class PatientMenuController {
    private ObservableList<Patient> patientsData = FXCollections.observableArrayList();
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Patient, String> addressColumn;

    @FXML
    private TableColumn<Patient, String> dateOfBirthColumn;
    @FXML
    private TableColumn<Patient, String> firstnameColumn;
    @FXML
    private TableColumn<Patient, Boolean> genderColumn;

    @FXML
    private TableColumn<Patient, Integer> idColumn;

    @FXML
    private TableColumn<Patient, String> lastnameColumn;

    @FXML
    private TableColumn<Patient, String> patronymicColumn;

    @FXML
    private TableView<Patient> tablePatient;

    @FXML
    private Button departmentButton;

    @FXML
    private Button doctorButton;

    @FXML
    void initialize() {
        doctorButton.setOnAction(doctorButtonAction());
        departmentButton.setOnAction(departmentButtonAction());
    }

    private EventHandler<ActionEvent> departmentButtonAction(){
        return actionEvent -> {
            doctorButton.getScene().getWindow().hide();

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

    private EventHandler<ActionEvent> doctorButtonAction(){
        return actionEvent -> {
            doctorButton.getScene().getWindow().hide();

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
