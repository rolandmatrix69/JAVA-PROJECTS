package Methods;

import java.util.Scanner;

public class cleanCoding {
    public static String greet(String name) {
        return ("Hello " + name);
    }

    public static int add(int a, int b) {
        return (a + b);

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String userInput = input.next();
        String message = greet(userInput);
        System.out.println(message);

        System.out.println(add(3, 5));

    }
}
