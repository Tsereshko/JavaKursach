import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DatabaseHandler db = new DatabaseHandler();
        db.singUpPatient("oijfwo");

    }
}
