package Chapter2;

import java.util.Scanner;

public class DayCalculator {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt the user for number of days
        System.out.print("Enter day number and number of days to calculate: ");
        int currentDay = sc.nextInt(); // Here I can add an If-Statement to assign each number to a specific day. Must learn how to convert to String.
        int daysInFuture = sc.nextInt();

        // Calculate
        int dayGoal = (currentDay + daysInFuture) % 7;

        // Display result
        switch (dayGoal) {
            case 1: System.out.println("If you add " + daysInFuture + " days to " + currentDay + ", the day would be Monday"); break;
            case 2: System.out.println("If you add " + daysInFuture + " days to " + currentDay + ", the day would be Tuesday"); break;
            case 3: System.out.println("If you add " + daysInFuture + " days to " + currentDay + ", the day would be Wednesday"); break;
            case 4: System.out.println("If you add " + daysInFuture + " days to " + currentDay + ", the day would be Thurday"); break;
            case 5: System.out.println("If you add " + daysInFuture + " days to " + currentDay + ", the day would be Friday"); break;
            case 6: System.out.println("If you add " + daysInFuture + " days to " + currentDay + ", the day would be Saturday"); break;
            case 0: System.out.println("If you add " + daysInFuture + " days to " + currentDay + ", the day would be Sunday"); break;
        }
    }
}
