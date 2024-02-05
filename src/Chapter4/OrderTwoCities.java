package Chapter4;

import java.util.Scanner;

public class OrderTwoCities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first city: ");
        String city1 = sc.nextLine();

        System.out.print("Enter the second city: ");
        String city2 = sc.nextLine();

        if (city1.compareTo(city2) < 0) {
            System.out.println("The cities in alphabetical order are " + city1 + " " + city2);
        } else {
            System.out.println("The cities in alphabetical order are " + city2 + " " + city1);
        }
    }
}
