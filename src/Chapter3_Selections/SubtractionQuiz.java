package Chapter3_Selections;

import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
        // 1. Create Scanner object
        Scanner sc = new Scanner(System.in);

        // 2. Generate two random single-digit integers
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        // 3. If number2 > number1, swap positions
        if (number2 > number1) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        // 4. Prompt student to answer
        System.out.print("What is " + number1 + " - " + number2 + "? ");
        int answer = sc.nextInt();

        // 5. Grade the answer and display result
        if (number1 - number2 == answer) {
            System.out.println("You are correct!");
        } else {
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
        }
    }
}
