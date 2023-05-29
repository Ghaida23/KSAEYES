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
public class Booking extends CreateAccount {

    public String name;
    public String email;
    public int ticnum;
    public int ticketnum = 0;
    public double totalPrice = 0.0;
    public String activity;
    public String date;

    Booking() {

    }

    Booking(String n, String e, String act, String dis, double price) {
        name = n;
        email = e;
        activity = act + "\n" + dis;
        totalPrice = price;
    }

    public void setdate() {
        Scanner input = new Scanner(System.in);
        System.out.println("choose a date according to the dates above:");
        date = input.nextLine();
    }

    public double setprice() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many tickets would you like to book?[no more then ]");
        ticnum = input.nextInt();
        while(ticnum > 10){
            System.out.println("you can't book more than 10 tickets\nHow many tickts you want to book?");
            ticnum = input.nextInt();
        }
        double p = totalPrice;
        
        for (int i = 1; i < ticnum; i++) {
            totalPrice += p;

        }
        return totalPrice;
    }

    public int setpticnum() {
        for (int i = 0; i < ticnum; i++) {
            ticketnum++;
        }
        return ticketnum;
    }

    public String toString() {
        return "Name: " + name + "\n" + "Email: " + "\n" + email
                + "\nActivity Name: " + activity + "\nDay: " + date + "\n" + "Number of Tickets:" + ticketnum + " Tickets\n"
                + "Price: " + totalPrice + "SAR\n";
    }
}
