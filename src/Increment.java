import java.sql.SQLOutput;

public class Increment {
    public static void main(String[] args) {
        int x = 1; // Create initial variable

        System.out.println("Before the call, x is " + x);
        increment(x); // Calls out increment method (listed below), however, does not modify variable x
        System.out.println("After the call, x is " + x); // Prints 1
    }

    public static void increment(int n) { // n is substituted in this case by x (see call of method above)
        n++;
        System.out.println("n inside the method is " + n);
    }
}
