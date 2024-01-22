package Chapter3_Selections;

import java.util.Scanner;

/*program that prompts the user to enter an integer. If the number is a multiple of 5, the program displays HiFive. If the number is divisible by 2, it displays HiEven.*/
public class SimpleIfDemo {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt for input
        System.out.print("Enter number in integer: ");
        int input = sc.nextInt();

        if (input % 5 == 0) {
            System.out.println("HiFive!");
        }

        if (input % 2 == 0) {
            System.out.println("HiEven!");
        }
    }
}
