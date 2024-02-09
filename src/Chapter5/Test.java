package Chapter5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number, max;
        number = sc.nextInt();
        max = number;

        do {
            System.out.print("Enter an integer: ");
            number = sc.nextInt();
            if (number > max) {
                max = number;
            }
        } while (number != 0);

        System.out.println("max is " + max);
        System.out.println("number " + number);
    }
}
