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
    }

}
