import java.util.Scanner;

public class MiscExercisesAndNotes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*// Exponent Operations
        System.out.println(Math.pow(2, 3)); // Displays 8.0
        System.out.println(Math.pow(4, 0.5));
        System.out.println(Math.pow(2.5, 2));
        System.out.println(Math.pow(2.5, -2));*/

        /* // Integer Literals
        System.out.println(0B1111); // To denote a binary integer literal, use leading 0b or 0B (zero B). Displays 15.
        System.out.println(07777); // To denote an octal integer literal, use a leading 0 (zero). Displays 4095.
        System.out.println(0XFFFF); // To denote a hexadecimal integer literal, use a leading 0X (zero X). Displays 65535.*/

        /* // Scientific Notation
        Floating-point literals can be written in scientific notation in the form of a * 10b. For example, the scientific notation for 123.456 is 1.23456 * 102 and for 0.0123456 is 1.23456 * 10-2. A special syntax is used to write scientific notation numbers. For example, 1.23456 * 102 is written as 1.23456E2 or 1.23456E+2 and 1.23456 * 10-2 as 1.23456E-2. E (or e) represents an exponent and can be in either lowercase or uppercase.*/

        // 2.1 Evaluating Expressions and Operator Precedence

/*
        // Augmented Assignment Operators
        double a = 6.5;
        a += a + 1;
        System.out.println(a);
        a = 6;
        a /= 2;
        System.out.println(a);
*/
/*      INCREMENT AND DECREMENT OPERATORS
        int a = 6;
        int b = a++; // Two parts: 1) b = a 2) then modify a by adding 1.
        System.out.println(a); // Prints 7
        System.out.println(b); // Prints

        a = 6;
        b = ++a; // b equals a after being modified by 1. The a variable will also change permanently. Difference with the previous exercise is the order in which b is assign the value, pre- or post-modification.
        System.out.println(a);
        System.out.println(b); */

        // NUMERIC TYPE CONVERSIONS (CASTING)
        /*Casting a type with a small range to a type with a larger range is known as widening a type. Casting a type with a large range to a type with a smaller range is known as narrowing a type. Java will automatically widen a type, but you must narrow a type explicitly. The syntax for casting a type is to specify the target type in parentheses, followed by the
        variable’s name or the value to be cast. For example, the following statement:
        System.out.println((int)1.7); // Prints 1 */

/*        float f = 12.5F;
        int i = (int)f;
        System.out.println("f us " + f);
        System.out.println("i us " + i);*/

        // Write an if statement that assigns 1 to x if y is greater than 0.

/*        System.out.println("Enter an integer: ");
        int y = sc.nextInt();
        int x = 0;
        if (y > 0) {
            x = 1;
        }
        System.out.println(x);*/

        //Write an if statement that increases pay by 3% if score is greater than 90.
/*        double pay = 100;
        System.out.println("Enter a score: ");
        int score = sc.nextInt();

        if (score > 90) {
            pay = pay + (pay * 0.03);
        }
        System.out.println(pay);
        */

/*        int x = 3, y = 3;
        switch (x + 3) {
            case 6: y = 1;
            default: y += 1;
        }
        System.out.println(y);

        if (x + 3 == 6) {
            y = 1;
            y += 1;
        } else {
            y += 1;
        }
        System.out.println(y);*/

        // TODO: Continue with exercises,
        }
    }
}
