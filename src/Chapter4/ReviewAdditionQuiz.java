package Chapter4;

import java.util.Scanner;

public class ReviewAdditionQuiz {
    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Ask question
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = sc.nextInt();

        // Check answer
        while (number1 + number2 != answer) {
            System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
            answer = sc.nextInt();
        }
        System.out.println("You got it! " + number1 + " + " + number2 + " = " + answer);
    }
}
