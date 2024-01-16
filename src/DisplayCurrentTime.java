public class DisplayCurrentTime {
    public static void main(String[] args) {
        /* ASSIGNMENT: The problem is to develop a program that displays the current time in GMT (Greenwich Mean Time) in the format hour:minute:second, such as 13:19:8.*/

        // Compute
        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60; // The remainder result will be the current second when the method is called upon.

        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        System.out.println("The current time is: " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");

    }


}
