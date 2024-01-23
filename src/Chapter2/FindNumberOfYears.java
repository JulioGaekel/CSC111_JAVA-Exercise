package Chapter2;

import java.util.Scanner;

public class FindNumberOfYears {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        long totalMinutes = sc.nextLong();

        // Compute
        long totalHours = totalMinutes / 60;
        long remainingHours = totalMinutes % 60;

        int totalDays = (int)totalHours / 24;
        int remainingDays = (int)totalDays % 365;
        int totalYears = totalDays / 365;

        System.out.println(totalMinutes + " minutes is approximately " + totalYears + " years and " + remainingDays + " days");
    }
}
