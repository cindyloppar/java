import java.util.Scanner;

public class UsersInput {

    Users users = new Users();

    public String input() {
        Scanner result = new Scanner(System.in);
        System.out.println("Enter firstname");
        String resultName = result.nextLine();
        System.out.println("Firstname is " + resultName);

        return users.getName();
    }

    Users lastName = new Users();
       public String lastNameInput(){
    Scanner resultSurname = new Scanner(System.in);
    System.out.println("Enter Surname");
    String surnameResult = resultSurname.nextLine();
    System.out.println("Surname is "+ surnameResult);

        return lastName.getSurname();
}
}