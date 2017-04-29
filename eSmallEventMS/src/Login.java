/**
 * Created by Hamza on 29-Apr-17.
 */
import java.util.Scanner;

public class Login {
    static Scanner input = new Scanner(System.in);
    private static String uname;
    private static String pwd;


    public static void main(String[] args) {


        System.out.println("Welcome to the EMS");
        System.out.println("Enter your Credentials: ");
        System.out.print("Username: ");
        uname = input.next();
        System.out.print("Password: ");
        pwd  = input.next();

        LoginManager lm = new LoginManager(uname,pwd);






        // write your code here
    }



}
