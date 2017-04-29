/**
 * Created by Hamza on 29-Apr-17.
 */
public class LoginManager {

    private static String uname;
    private static String pwd;
    public static UserPanel user;

    public LoginManager(String name, String pass)
    {
        uname = name;
        pwd = pass;

        user = new UserPanel();
        main();

    }

    private static void main(){

        for (int i = 0; i<user.users.size();i++){

            if (uname.equals(user.users.equals(uname)) && user.users.equals(pwd)){

                System.out.println("Login Success");
            }

        }

    }


}
