package Chapter2;

import java.util.Scanner;

public class SumDigitsInInteger {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt for input
        System.out.print("Enter a number between 0 and 1000: ");
        int inputNumber = sc.nextInt();

        // Compute
        int remainderOne = inputNumber % 10;
        int rest = inputNumber / 10;

        int remainderTwo = rest % 10;
        rest = rest / 10;

        int remainderThree = rest % 10;

        // Display result
        System.out.println("The sum of the digits is " + (remainderOne + remainderTwo + remainderThree));

    }
}
