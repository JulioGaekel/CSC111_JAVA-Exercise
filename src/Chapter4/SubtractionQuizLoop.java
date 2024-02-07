package Chapter4;

import java.util.Scanner;

public class SubtractionQuizLoop {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Create variables
        final int NUMBER_OF_QUESTIONS = 5;
        int correctCount = 0; // Count the number of correct answers
        int count = 0; // Count the number of questions
        long startTime = System.currentTimeMillis();
        String output = " "; // output string is initially empty

        // Generate two random single-digit integers. This should repeat until NUMBER_OF_QUESTIONS
        while (count < NUMBER_OF_QUESTIONS) {
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);

            // 2. If number1 < number2, swap number1 with number2
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            // Prompt the student to answer the math problem
            System.out.print("What is " + number1 + " - " + number2 + "? ");
            int answer = sc.nextInt();

            // Grade the answer and display the result
            if (number1 - number2 == answer) {
                System.out.println("You are correct!");
                correctCount++;
            } else {
                System.out.println("Your answer is wrong.\n" + number1 + " - " + number2 + " should be " + (number1 - number2));
            }

            count++; // Regardless of the result, count goes one instance up in order to reach NUMBER_OF_QUESTIONS
            output += "\n" + number1 + "-" + number2 + "=" + answer + ((number1 - number2 == answer) ? " correct" : " wrong"); // Add each question, given answer and grade to a string starting each instance in a new line
        }
        long endTime = System.currentTimeMillis(); // Get end time
        long testTime = endTime - startTime; // Get total duration of the test

        System.out.println("Correct count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds\n" + output); // Display summary of test
    }
}
