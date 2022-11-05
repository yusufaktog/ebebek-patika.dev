package week2.userlogin;

import java.util.Scanner;
/**
 * @author JOSEPH
 * simple user login module
 * if username & password correct, log in
 * otherwise ask for reset
 * new password can't be the same as the old one
 *
 */
public class UserLogin {

    public static void main(String[] args) {
        String defaultUserName = "patika";
        String defaultPassword = "java123";

        String username, password, newPassword = "";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Username: ");
        username = scanner.nextLine();


        System.out.print("Password: ");
        password = scanner.nextLine();


        boolean reset = false;

        if (!(username.equals(defaultUserName) && password.equals(defaultPassword))) {
            System.out.print("Incorrect username or password!\nDou you want to reset your password?\n1-YES\n2-NO\noption:");
            reset = scanner.nextInt() == 1;
        } else {
            System.out.println("Successfully logged in!");
        }


        if (reset) {

            scanner.nextLine();// empty space char

            System.out.print("New Password:");
            newPassword = scanner.nextLine();
        } else {
            return;
        }

        if (newPassword.equals(password)) {
            System.out.println("New Password can not be the same with the old one!");
        } else {
            System.out.println("Password have been changed successfully!");
        }


    }
}
