import java.util.Scanner;

public class ShowCurrentTime {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt for input
        System.out.print("Enter the time zone offset to GMT, e.g. -6: ");
        int timezoneOffSet = sc.nextInt();

        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60; // The remainder result will be the current second when the method is called upon.

        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        System.out.println("The current time is: " + (currentHour + timezoneOffSet) + ":" + currentMinute + ":" + currentSecond + " GMT");

    }
}
