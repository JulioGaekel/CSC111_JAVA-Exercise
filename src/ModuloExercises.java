import java.util.Scanner;

public class ModuloExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 2 numbers: ");
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();

        int remainder = dividend % divisor;

        System.out.println("The remainder of " + dividend + " % " + divisor + " is " + remainder);
    }
}
