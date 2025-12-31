package Types;

public class PrimitiveTypes {
    public static void main(String[] args) {
        byte myAge = 30;
        System.out.println(myAge);

        long viewsCount = 3_000_234_567L;
        // adding an L after numbers that belong to the long category stops the compiler
        // from seeing it as an int.
        System.out.println(viewsCount);

        float price = 10.99F;
        // adding an F after numbers that belong to the float category stops the
        // compiler from seeing it as an double.
        System.out.println(price);

        char initial = 'E';
        // the char type only allows one character
        System.out.println(initial);

        boolean isEligible = true;
        // boolean values are just true or false
        System.out.println(isEligible);

    }
}
