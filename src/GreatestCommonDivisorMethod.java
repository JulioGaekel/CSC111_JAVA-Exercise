import java.util.Scanner;

public class GreatestCommonDivisorMethod {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter two integers
        System.out.print("Enter first integer: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = sc.nextInt();

        // Display output
        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd(n1, n2));
    }

    // Create method. Return the gcd of two integers
    public static int gcd(int n1, int n2) {
        int gcd = 1; // Initial gcd is 1
        int k = 2; // Possible gcd

        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k ==0) {
                gcd = k;
            }
            k++;
        }
        return gcd; // Return gcd. Requires "return" since int value is expected with this method.
    }
}
