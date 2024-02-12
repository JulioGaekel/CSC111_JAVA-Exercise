package Chapter5;

public class ConversionTableKilosToPounds {
    public static void main(String[] args) {
        // Display headers
        System.out.print(" Kilograms               Pounds\n");

        final double POUNDS_PER_KILOGRAM = 2.2;
        int kilo = 1;

        for (int i = 1; i < 200; i++) {
            double pounds = kilo * POUNDS_PER_KILOGRAM;
            if (i % 2 != 0) {
                System.out.printf(" %3d                      %5.1f\n", kilo, pounds);
            }
            kilo++;
        }
    }
}
