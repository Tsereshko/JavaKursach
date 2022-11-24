module com.example.reception {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.reception to javafx.fxml;
    exports com.example.reception;
    exports com.example.reception.Controllers;
    opens com.example.reception.Controllers to javafx.fxml;
    exports com.example.reception.Controllers.Menu;
    opens com.example.reception.Controllers.Menu to javafx.fxml;
    exports com.example.reception.Controllers.SingUp;
    opens com.example.reception.Controllers.SingUp to javafx.fxml;
    exports com.example.reception.Documents;
    opens com.example.reception.Documents to javafx.fxml;
}