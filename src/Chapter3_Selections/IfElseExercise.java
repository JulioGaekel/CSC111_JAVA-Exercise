package Chapter3_Selections;

import java.util.Scanner;

public class IfElseExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pay = 100;

        System.out.print("Enter a score between 0 and 100: ");
        int score = sc.nextInt();

        if (score >= 90) {
            pay = pay + (int)(pay * 0.03);
        } else {
            pay = pay + (int)(pay * 0.01);
        }

        System.out.println("The total pay is $" + pay);
    }
}
