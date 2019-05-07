import java.util.Scanner;

public class Main {


    public static void main(String[] args){
      Users personFirstname = new Users();
      personFirstname.setName("");
        System.out.println(personFirstname.getName());

        Users personSurname = new Users();
        personSurname.setSurname("");
        System.out.println(personSurname.getSurname());

        Scanner result = new Scanner(System.in);
        System.out.println("Enter firstname");
        String resultName = result.nextLine();
        System.out.println("first name " + resultName);

    }

}
