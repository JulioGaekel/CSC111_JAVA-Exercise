package Chapter2;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a temperature in Fahrenheit: ");
        double degreesFahrenheit = sc.nextDouble();

        // Convert from F to C
        double degreesCelsius = (5.0 / 9) * (degreesFahrenheit - 32);

        // Display temperature in C
        System.out.println(degreesFahrenheit + " degrees Fahrenheit is " + degreesCelsius + " degrees Celsius.");
    }
}
