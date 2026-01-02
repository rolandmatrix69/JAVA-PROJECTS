package Strings;

public class LearnStrings {
    public static void main(String[] args) {
        String name = "Evans Roland" + " plays piano";
        // Plus sign concatenates strings
        System.out.println(name.replace("plays", "fires"));
        // .replace replaces the initial given argument with the new
        // Strings are immutable, even after using the .replace it doesn't change the
        // original.
        System.out.println(name);

        // ****************ESCAPE SEQUENCES********************//
        System.out.println("He said \"I'm going out\"");
        // We use the backlash to escape issues like the above
        System.out.println("c:\\Windows\\...");
        // Another example
        System.out.println("This is a boy \nHe Writes Code");
        // It can also be used to create a new line.
    }

}
