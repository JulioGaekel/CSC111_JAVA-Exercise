package Chapter3_Selections;

import java.util.Locale;
import java.util.Scanner;

/*Body Mass Index (BMI) is a measure of health based on height and weight. It can be calculated by taking your weight in kilograms and dividing it by the square of your height in meters. The interpretation of BMI for people 20 years or older is as follows:

BMI Interpretation
BMI < 18.5 Underweight
18.5 ≤ BMI < 25.0 Normal
25.0 ≤ BMI < 30.0 Overweight
30.0 ≤ BMI Obese*/
public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.print("Enter weight in pounds: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = sc.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        // Compute BMI
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        System.out.println("BMI is " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
