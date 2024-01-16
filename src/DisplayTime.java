import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an integer in seconds: ");
        int timeInSeconds = sc.nextInt();

        // Caculate time in minutes and seconds
        int minutes = timeInSeconds / 60;
        int remainingSeconds = timeInSeconds % 60;

        // Display result
        System.out.println(timeInSeconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
    }
}
