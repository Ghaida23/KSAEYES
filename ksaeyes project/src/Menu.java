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
public class Menu {

    private static String[] activities = {"City Tour", "Space Museum", "Food Tasting", "Outdoor Adventure", "Hiking", "Camping", "Skydiving", "Sandboarding"};
    private static String[] descriptions = {
        "-Take a guided tour of the city's most famous landmarks and attractions.\n-RIYADH\n-Available from: 1-30 June 2023",
        "-Explore the latest research and dicovries that have been observed in space, in a simple and fun way at the Space Museum.\n-JEDDAH \n-Available from: 5-12 June 2023",
        "-Sample the city's diverse cuisine at its best restaurants and food markets.\n-DAMMAM \n-Available at any date",
        "-Experience the great outdoors activities with a groub of other tourists.\n-ABHA\n-Available from: 1-15 August 2023",
        "-Go for a scenic hike on nearby trails and take in the natural beauty of the area.\n-ABHA\n-Available from: 1-15 May 2023",
        "-Spend a night or more camping in the great outdoors and enjoy activities campfires.\n-RIYADH \n-Available from: 23-27 January 2023",
        "-Experience the thrill of free-falling through the air and parachuting safely to the ground.\n-ABHA\n-Available at any date",
        "-Ride a board down sand dunes and experience the thrill of surfing the desert.\n-RIYADH\n-Available from: 4-27 January"
    };
    public static double[] prices = {50, 30, 150, 70, 170, 200, 100, 100};
    public String n;
    public String e;

    Menu(String n, String e) {
        this.n = n;
        this.e = e;
    }

    public void displayActivities() {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Choose an activity:");
            for (int i = 0; i < activities.length; i++) {
                System.out.println((i + 1) + ". " + activities[i]);
            }
            System.out.println("Enter activity number (or 0 to exit): ");
            choice = input.nextInt();
            if (choice > 0 && choice <= activities.length) {
                System.out.println(descriptions[choice - 1]);
                System.out.println("-" + prices[choice - 1] + "SAR");
                System.out.println("Do you want to book this activity? (Y/N): ");
                String answer = input.next();
                if (answer.equalsIgnoreCase("Y")) {

                    Booking book = new Booking(n, e, activities[choice - 1], descriptions[choice - 1], prices[choice - 1]);

                    book.setdate();
                    book.setprice();
                    book.setpticnum();

                    System.out.println(book.toString());
                    System.out.println("Activity booked!");

                } else {
                    System.out.println("Activity not booked.");
                }
            } else if (choice > activities.length) {
                System.out.println("wrong number!, please choose from the list above");
            }
        }
        input.close();
    }
}
