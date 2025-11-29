package AT3;
package AT3.src.DataBase;

public class DataBase {


import java.sql.*;

public class Database {

    public static Connection conectar() {
        try {
            return DriverManager.getConnection("jdbc:sqlite:pessoas.db");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}

}
