import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserRepository {
    private Database db;

    UserRepository(Database db) {
        this.db = db;
    }

    public void findAll() {
        String sql = "SELECT * FROM users";

        try {
            PreparedStatement st = db.connect().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                System.out.println("result " + rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

