import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Main {

    public static void main(String[] args){
        Database db = new Database();
        System.out.println( db.connect()
        );

        UserRepository r = new UserRepository(db);
        r.findAll();
//Users user = new Users();
//        System.out.println("User " + user.getName());


//SaveUserDetails userDetails = new SaveUserDetails(db);
//
//
//    UsersInput userName = new UsersInput();
//    String name = userName.input();
//
//    UsersInput userSurname = new UsersInput();
//    String surname = userSurname.lastNameInput();
//        userDetails.saveData(/*1,*/ name, surname);
    }

    public static void show(Database db){

        try{

            String sql = "select * from users";
            PreparedStatement st = db.connect().prepareStatement(sql);
            System.out.println("RS ");
            ResultSet rs = st.executeQuery();
//            String name = rs.getString(1);
//            System.out.println();
//            String surname = rs.getString(2);
//            while(rs.next()){
//                System.out.println("DB: "+rs.getString(2));
//            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
