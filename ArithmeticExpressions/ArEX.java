package ArithmeticExpressions;

public class ArEX {
    public static void main(String[] args) {
        int result = 10 + 3;
        System.out.println(result);
        // Arithmetic operators include + - * /
        int x = 1;
        x++;
        System.out.println(x);
        // Increment operators
        int y = 2;
        // int z = y++;
        // Here z is first the initial value of y
        int z = ++y;
        // Here y is incremented by 1 before assigned to z
        System.out.println(y);
        System.out.println(z);

        int w = 3;
        w += 3;
        // Augmented Assignment operators
        System.out.println(w);

    }

}
