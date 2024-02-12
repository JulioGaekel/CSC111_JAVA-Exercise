package Chapter5;

import java.util.Scanner;

public class CountPositiveAndNegativeNumberPlusAverage {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        int positiveNumberCount = 0;
        int negativeNumberCount = 0;

        int data;
        int sum = 0;
        // Prompt user to enter integer
        do {
            System.out.print("Enter an integer: ");
            data = sc.nextInt();
            sum += data;
            if (data > 0) {
                positiveNumberCount++;
            } else if (data < 0){
                negativeNumberCount++;
            }
        } while (data != 0);

        System.out.println("The number of positives is " + positiveNumberCount);
        System.out.println("The number of negatives is " + negativeNumberCount);
        System.out.println("The sum is " + sum);

        float average = sum / ((float)positiveNumberCount + (float)negativeNumberCount);

        System.out.printf("The average is %.2f", average);
    }
}
