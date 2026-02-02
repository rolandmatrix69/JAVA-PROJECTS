package ProjectMortgageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variable and Constant Declaration
        final byte PERCENT = 100;
        final byte MONTHS_IN_YEARS = 12;
        // Avoid Magic numbers in your code, Use constants to describe them
        int principal = 0;
        float annualInterest = 0;
        byte years = 0;
        float monthlyInterest = 0;

        while (true) {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.print("Enter a Number between 1,000 and 1,000,000: ");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            annualInterest = scanner.nextFloat();
            if (annualInterest > 0 && annualInterest <= 30)
                break;
            System.out.println("Enter a value greater than 0 or less than or equal to 30: ");
            monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEARS;
        }

        while (true) {
            System.out.print("Period (Years): ");
            years = scanner.nextByte();
            if (years >= 1 && years <= 30)
                break;
            System.out.println("Enter a value between 1 and 30: ");
        }
        int numberOfPayments = years * MONTHS_IN_YEARS;

        double mortgage = principal * ((monthlyInterest * Math.pow((1 +
                monthlyInterest), numberOfPayments))
                / (Math.pow((1 + monthlyInterest),
                        numberOfPayments) - 1));
        // Mortgage Formula
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

    }

}
