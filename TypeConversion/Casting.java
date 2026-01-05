package TypeConversion;

public class Casting {
    public static void main(String[] args) {
        // Implicit Casting(Automatic Casting)
        // byte > short > int > long > float > double
        short w = 1;
        int x = w + 2;
        System.out.println(x);

        double y = 1.1;
        double z = y + 2;
        System.out.println(z);
        // Explicit Casting
        double a = 1.1;
        int b = (int) a + 2;
        System.out.println(b);
        // Type Conversion from String to integer
        String c = "1";
        int d = Integer.parseInt(c) + 3;
        System.out.println(d);
    }

}
