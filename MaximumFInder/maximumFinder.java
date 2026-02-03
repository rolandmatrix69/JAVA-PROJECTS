package MaximumFInder;

import java.util.Scanner;

public class maximumFinder {

    public static double maximum(double x, double y, double z) {
        double maximumValue = x;

        if (y > maximumValue) {
            maximumValue = y;
        }
        if (z > maximumValue) {
            maximumValue = z;
        }
        return maximumValue;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three values seperated by spaces: ");

        double result1 = input.nextDouble();
        double result2 = input.nextDouble();
        double result3 = input.nextDouble();

        double result = maximum(result1, result2, result3);

        System.out.println("Maximum is: " + result);

    }

}
