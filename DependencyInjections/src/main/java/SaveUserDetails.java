import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class SaveUserDetails {

    private Database db;

public SaveUserDetails(Database database){
    this.db = database;
    System.out.println("database " + database);
}
    public void saveData(/*int user_id,*/String username,String lastname)  {
String query = "INSERT INTO users (username,lastname) "
        + "VALUES (?,?)";
        try {
//            Connection conn = null;

            PreparedStatement statement =this.db.connect().prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
//            statement.setInt(1,user_id);
            statement.setString(1,username);
            statement.setString(2,lastname);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args){

    }
}