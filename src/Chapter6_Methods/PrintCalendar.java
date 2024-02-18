package Chapter6_Methods;

import java.util.Scanner;

public class PrintCalendar {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter year
        System.out.print("Enter full year (e.g. 1991): ");
        int year = sc.nextInt();

        // Prompt the user to enter month
        System.out.print("Enter month as a number between 1 and 12: ");
        int month = sc.nextInt();

        // Print calendar for the month of the year according to input
        printMonth(year, month);
    }

    // A stub for printMonth may look like this
    public static int printMonth(int year, int month) {
        System.out.println(month + " " + year);
    }

    // A stub for printMonthTitle may look like this
    public static void printMonthTitle(int year, int month) {
    }

    // Stub for getMonthBody
    public static void getMonthBody(int year, int month) {
    }

    //Stub for getMonthName
    
}
