package week3.atm;

import java.util.Scanner;

/**
 * @author JOSEPH
 * ATM
 */
public class Atm {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);

        int attempts = 3;
        int balance = 1500;
        int option;

        boolean loginSuccessful;

        while (true) {
            System.out.print("Username: ");
            userName = input.nextLine();

            System.out.print("Password: ");
            password = input.nextLine();

            if (!(userName.equals("patika") && password.equals("dev123"))) {
                attempts--;
                System.out.println("Invalid username or password. Please try again.");
                System.out.println("Remaining Attempts: " + attempts);
                loginSuccessful = false;
            } else {
                loginSuccessful = true;
            }

            if (attempts == 0) {
                System.out.println("Your account has been blocked, please contact the bank.");
                break;
            }

            while (loginSuccessful) {
                System.out.println("" +
                        "1-Deposit Money\n" +
                        "2-Withdraw Money\n" +
                        "3-Check Balance \n" +
                        "4-Log out");

                System.out.print("Choose an Option : ");

                option = input.nextInt();

                switch (option) {
                    case 1:
                        System.out.print("Amount: ");
                        int amount = input.nextInt();
                        balance += amount;
                        break;
                    case 2:
                        System.out.print("Amount: ");
                        amount = input.nextInt();
                        if (amount > balance) {
                            System.out.println("Not Enough Balance.");
                        } else {
                            balance -= amount;
                        }
                        break;
                    case 3:
                        System.out.println("Balance : " + balance);
                        break;
                    case 4:
                        System.out.println("See you again !");
                        return;

                }
                System.out.println("==============");

            }

        }


    }
}
