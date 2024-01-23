package Chapter2;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = sc.nextDouble();
        double gratuityRate = sc.nextDouble();

        double tip = subtotal * (gratuityRate / 100.0);
        double total = subtotal + tip;

        System.out.println("The gratuity is $" + tip + " and total is $" + total);
    }
}
