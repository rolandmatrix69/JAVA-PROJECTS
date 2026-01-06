package ReadingInput;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ignore the warning if VScode brings it up
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.println("You are " + name);
    }

}
