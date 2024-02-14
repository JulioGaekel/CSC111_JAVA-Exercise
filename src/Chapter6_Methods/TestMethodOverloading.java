package Chapter6_Methods;
/* Method overloading exists when several methods are creating with the same name but different parameters. When the method is called, the program will choose the method to be used depending on the amount and type of parameters.*/
public class TestMethodOverloading {
    public static void main(String[] args) {
        // Invoke the max method with int parameters
        System.out.println("The maximum of 3 and 4 is " + max(3,4));

        // Invoke the max method with two double parameters
        System.out.println("The maximum of 3.0 and 4.0 is " + max(3.0, 4.0));

        // Invoke the max method with three double parameters
        System.out.println("The maximum of 3.0, 5.4 and 10.14 is " + max(3.0, 4.0, 10.14));
    }

    // Method returns the max value of two integers
    public static int max(int num1, int num2) {
        int maxNum;
        if (num1 > num2) {
            maxNum = num1;
        } else {
            maxNum = num2;
        }
        return maxNum;
    }

    // Method returns the max value of two double parameters
    public static double max(double num1, double num2) {
        double maxNum;
        if (num1 > num2) {
            maxNum = num1;
        } else {
            maxNum = num2;
        }
        return maxNum;
    }

    // Method returns the max value of three double parameters
    public static double max(double num1, double num2, double num3) {
        double maxNum;
        if (num1 > num2 && num1 > num3) {
            maxNum = num1;
        } else if (num2 > num1 && num2 >num3) {
            maxNum = num2;
        } else {
            maxNum = num3;
        }
        return maxNum;
    }
}
