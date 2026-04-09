package Telusko;

public class Exercise {
  public static void main(String[] args) {

    // write code here
    int a = 20, b = 10;

    boolean result1 = a > b;
    boolean result2 = a > b && b > 0;

    System.out.println("Addition: " + (a + b));
    System.out.println("Subtraction: " + (a - b));
    System.out.println("Multiplication: " + a * b);
    System.out.println("Division: " + a / b);
    System.out.println("Is a greater than b? " + result1);
    System.out.println("Is a > b and b > 0? " + result2);
  }
}
