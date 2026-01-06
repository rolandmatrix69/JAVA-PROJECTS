package TheMathClass;

import java.text.NumberFormat;
import java.util.Locale;

public class MathClass {
    public static void main(String[] args) {
        // int result = Math.round(1.1F);
        // System.out.println(result);
        // // Rounds up to the nearest whole number
        // int x = (int) Math.ceil(2.3);
        // System.out.println(x);
        // // Returns the smallest integer greater than or equal to the number
        // int y = (int) Math.floor(7.8);
        // System.out.println(y);
        // // Returns the smallest integer lesser than or equal to the number
        // int w = Math.max(1, 2);
        // System.out.println(w);
        // // Returns the highest of the two values
        // int random = (int) (Math.random() * 100);
        // System.out.println(random);
        // // Generates a random nummber between 1 and 100

        // //*********** FORMATTING NUMBERS *************************//
        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.UK);
        String dollars = currency.format(1234556778);
        // // Formatting the number in a currency format
        // String dollars = NumberFormat.getCurrencyInstance().format(700000000); //
        // Alernatively; This is also called method chaining
        String percent = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(dollars);
        System.out.println(percent);
    }

}
