package Controlflow;

import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /************* Comparism Operators *********************/
        // Used to compare primitive values
        // int y = 5;
        // int z = 4;
        // System.out.println(y == z);
        // System.out.println(y != z);
        // System.out.println(y > z);
        // System.out.println(y < z);
        // System.out.println(y >= z);
        // System.out.println(y <= z);

        /************* Logical Operators ********************/
        // Used to combine one or more boolean expression
        // AND Operator: Bothe expressions have to be true
        // int temperature = 32;
        // True when number is within range and false otherwise
        // boolean isWarm = temperature > 20 && temperature < 30;
        // System.out.println(isWarm);

        // OR Operator: At least one expression should be true
        // boolean hasHighIncome = true;
        // boolean hasGoodCredit = false;
        // boolean hasCriminalRecord = false;
        // boolean isEligible = (hasGoodCredit || hasHighIncome) && !hasCriminalRecord;
        // System.out.println(isEligible);

        /****************************
         * CONTROL FLOW
         ******************************************/

        System.out.print("Enter your Temperature: ");
        int temp = input.nextInt();

        if (temp > 30) {
            System.out.println("It's a hot day\nDrink Plenty of water");
        } else if (temp > 20)
            System.out.println("It's a nice day");
        else
            System.out.println("It's a cold day");
    }
}
