/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author JOUD
 */
public class Main {

    public static void main(String[] args) {
        CreateAccount account = new CreateAccount("", "", "");
        Booking book = new Booking();
        Scanner input = new Scanner(System.in);
        boolean notlogin = false;
        String username;
        String password;
        String email;
        int choose;

        do {
            System.out.println("WELCOME in KSA EYES");
            System.out.println("*************************");
            System.out.println("1- Create Account                   2-Login");
            choose = input.nextInt();

            if (choose == 1) {
                account.creatAccount();
            } else if (choose == 2) {

                input.nextLine();
                do {

                    System.out.println("Enter username: ");
                    username = input.nextLine();

                    System.out.println("Enter password: ");
                    password = input.nextLine();
                    email = account.getEmail();
                    if (account.getUsername() == "" || account.getPassword() == "") {
                        System.out.println("you dont have an account, please create an account to login" + "\nfill the information below to create an account");
                        account.creatAccount();
                    } else if (!username.equals(account.getUsername()) || !password.equals(account.getPassword())) {
                        System.out.println("Error: Incorrect username or password. Please try again.");
                    }
                } while (!username.equals(account.getUsername()) || !password.equals(account.getPassword()));

                System.out.println("Successfully logged in.");

                notlogin = true;
            }
        } while (!notlogin);
        Menu list = new Menu(account.getUsername(), account.getEmail());
        list.displayActivities();
    }
}
