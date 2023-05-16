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
    private static String[] activities = { "City Tour", "Museum Visit", "Food Tasting", "Outdoor Adventure", "Hiking", "Camping", "Skydiving", "Sandboarding"};
    private static String[] descriptions = {
        "Take a guided tour of the city's most famous landmarks and attractions.",
        "Explore the city's rich cultural heritage at one of its many museums.",
        "Sample the city's diverse cuisine at its best restaurants and food markets.",
        "Experience the great outdoors with activities like hiking, camping, and more.",
        "Go for a scenic hike on nearby trails and take in the natural beauty of the area.",
        "Spend a night or more camping in the great outdoors and enjoy activities like hiking, fishing, and campfires.",
        "Experience the thrill of free-falling through the air and parachuting safely to the ground.",
        "Ride a board down sand dunes and experience the thrill of surfing the desert."
    };
    
  Menu(){}
    public void displayActivities() {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (choice != 0){
            System.out.println("Choose an activity:");
            for (int i = 0; i < activities.length; i++) {
                System.out.println((i + 1) + ". " + activities[i]);
            }
            System.out.println("Enter activity number (or 0 to exit): ");
            choice = input.nextInt();
            if (choice > 0 && choice <= activities.length) {
                System.out.println(descriptions[choice - 1]);
                System.out.println("Do you want to book this activity? (Y/N): ");
                String answer = input.next();
                if (answer.equalsIgnoreCase("Y")) {
                    System.out.println("Activity booked!");
                } else {
                    System.out.println("Activity not booked.");
                }
            }else if(choice > activities.length){
                System.out.println("wrong number!, please choose from the list above");
            }
        } 
        input.close();
    }
}
    