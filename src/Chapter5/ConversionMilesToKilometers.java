package Chapter5;

public class ConversionMilesToKilometers {
    public static void main(String[] args) {
        // Display header
        System.out.print(" Miles               Kilometers\n");

        final double KILOMETERS_PER_MILE = 1.609;

        int miles = 1;

        for (int i = 1; i <= 10; i++) {
            double kilometers = miles * KILOMETERS_PER_MILE;
            System.out.printf("%2d                   %5.3f\n", miles, kilometers);
            miles++;
        }
    }
}
