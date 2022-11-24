import java.sql.*;

public class DatabaseHandler extends Configs{
    Connection dbConnection;

    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://"+dbHost+":"+dbPort + "/" + dbName;

        dbConnection = DriverManager.getConnection(connectionString, dbUserName, dbPass);

        return dbConnection;
    }

    public void singUpPatient(String name){
        String insert = "INSERT INTO " + Const.PATIENT_TABLE + "(" +
                Const.PATIENT_FIRSTNAME + "," + Const.PATIENT_LASTNAME + "," +
                Const.PATIENT_USERNAME +"," + Const.PATIENT_PASSWORD + "," +
                Const.PATIENT_GENDER + ")" +
                "VALUES(?,?,?,?,?)";

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);

            prSt.setString(1, "1");
            prSt.setString(2, "2");
            prSt.setString(3, name);
            prSt.setString(4, "3");
            prSt.setString(5, "муж");

            prSt.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

    public ResultSet singInPatient(String login, String password){
        ResultSet result = null;

        String select = "SELECT * FROM " + Const.PATIENT_TABLE + " WHERE " +
                Const.PATIENT_USERNAME + "=? AND " + Const.PATIENT_PASSWORD + "=?";

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            prSt.setString(1, login);
            prSt.setString(2, password);

            result = prSt.executeQuery();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
