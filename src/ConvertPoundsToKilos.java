import java.util.Scanner;

public class ConvertPoundsToKilos {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt for input
        System.out.print("Enter a number in pounds: ");
        double pounds = sc.nextDouble();

        // Convert pounds to kilograms
        double kilos = pounds * 0.454;

        // Display result
        System.out.println(pounds + " pounds is " + kilos + " kilos");
    }
}
