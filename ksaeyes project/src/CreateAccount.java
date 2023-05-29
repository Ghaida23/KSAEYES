/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author JOUD
 */

import java.util.Scanner;

public class CreateAccount {

    private String username;
    private String email;
    private String password;

    public CreateAccount(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public CreateAccount() {
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean creatAccount() {
        Scanner input = new Scanner(System.in);

        while (username == "") {

            System.out.println("Enter Username: ");
            username = input.nextLine();
            if (username == "") {
                System.out.println("Please Enter a Username:");
                username = input.nextLine();
            }

        }

        while (email == "") {
            System.out.println("Enter Email: ");
            email = input.nextLine();
            if (email == "") {
                System.out.println("Please Enter Email:");
                email = input.nextLine();
            }

        }

        while (password == "" || password.length() < 8) {
            System.out.println("Enter password (8 characters minimum): ");
            password = input.nextLine();
            if (password == "") {
                System.out.println("Please Enter a Password:");
                password = input.nextLine();
            }
            if (password.length() < 8) {
                System.out.println("Error: Password should be at least 8 characters long.");
                password = "";
            }

        }

        String verifyPassword;
        do {
            System.out.println("Verify password: ");
            verifyPassword = input.nextLine();
            if (!password.equals(verifyPassword)) {
                System.out.println("Error: Passwords do not match.");
            }
        } while (!password.equals(verifyPassword));

        System.out.println("Your account has been created.");

        return true;
    }

}
