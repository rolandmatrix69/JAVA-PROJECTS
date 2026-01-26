package Controlflow;

import java.util.Arrays;
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

        // System.out.print("Enter your Temperature: ");
        // int temp = input.nextInt();

        // if (temp > 30) {
        // System.out.println("It's a hot day\nDrink Plenty of water");
        // } else if (temp > 20)
        // System.out.println("It's a nice day");
        // else
        // System.out.println("It's a cold day");

        // System.out.println("Enter your Income: ");
        // int income = input.nextInt();
        // String className = income > 100000 ? "First Class" : "Economy";// Ternary
        // Operator
        // System.out.println(className);

        // System.out.println("1. Admin");
        // System.out.println("2. Moderator");
        // System.out.println("3. Organizer");
        // System.out.print("Choose your role: ");

        // int role = input.nextInt();
        // String password;

        // switch (role) {
        // case 1:
        // System.out.print("Welcome, You're an admin\nInput your password: ");
        // password = input.next();
        // if (password.equals("TLDDC196")) {
        // System.out.println("You've logged in as an admin!");
        // } else
        // System.out.println("Wrong password!");
        // break;
        // case 2:
        // System.out.println("Welcome, you're a moderator");
        // break;
        // case 3:
        // System.out.println("Welcome, you're an organizer");
        // break;
        // default:
        // System.out.println("Welcome, You're a guest");
        // break;
        // }

        /*************** LOOPS *********************/

        // FOR LOOPS
        // for (int i = 5; i > 0; i--) {
        // System.out.println("Hello World " + i);
        // }
        // WHILE LOOPS

        // String userInput = "";

        // while (true) {
        // System.out.print("Input: ");
        // userInput = input.nextLine().toLowerCase();
        // if (userInput.equals("pass"))
        // continue;
        // if (userInput.equals("quit"))
        // break;
        // System.out.println(input);
        // }

        // FOR EACH LOOP

        String[] fruits = { "Apple", "Orange", "Fruits" };
        System.out.println(Arrays.toString(fruits));

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
