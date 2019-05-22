

import java.sql.Connection;
import java.sql.DriverManager;
public class Database {


    private final String url = "jdbc:postgresql://localhost/java_project";
    private final String user = "";
    private final String password = "";

    public Connection connect() {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("hi moral");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("db running ");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return conn;

    }

}






