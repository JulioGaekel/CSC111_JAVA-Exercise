import java.util.Locale;
import java.util.Scanner;

public class ComputeLoanPayments {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);

        // Enter annual interest rate in percentage
        System.out.print("Enter annual interest rate, e.g., 7.25%: ");
        double annualInterestRate = sc.nextDouble();

        // Obtain monthly interest rate
        double monthlyInterestRate = annualInterestRate /1200; // The program needs to convert it into a decimal by dividing it by 100. To obtain the monthly interest rate from the annual interest rate, divide it by 12, since a year has 12 months. So, to obtain the monthly interest rate in decimal format, you need to divide the annual interest rate in percentage by 1200.

        System.out.print("Enter numbers of years as an integer, e.g. 5: ");
        int numberOfYears = sc.nextInt();

        System.out.print("Enter loan amount, e.g., 120000.95: ");
        double loanAmount = sc.nextDouble();

        // Calculate payment
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears *12));
        double totalPayment = monthlyPayment * numberOfYears * 12;

        // Display results
        System.out.println("The monthly payment is $" + (int)(monthlyPayment * 100)/100.0);
        System.out.println("The total payment is $" + (int)(totalPayment * 100)/100.0);

    }
}
