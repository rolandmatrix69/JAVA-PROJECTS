package Controlflow;

public class ControlFlow {
    public static void main(String[] args) {
        /************* Comparism Operators *********************/
        // Used to compare primitive values
        // int y = 5;
        // int z = 4;
        // System.out.println(y == z);
        // System.out.println(y != z);
        // System.out.println(y > z);
        // System.out.println(y < z);
        // System.out.println(y >= z);
        // System.out.println(y <= z);

        /************* Logical Operators ********************/
        // Used to combine one or more boolean expression
        // AND Operator: Bothe expressions have to be true
        int temperature = 32;
        // True when number is within range and false otherwise
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);

        // OR Operator: At least one expression should be true
        boolean hasHighIncome = true;
        boolean hasGoodCredit = false;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasGoodCredit || hasHighIncome) && !hasCriminalRecord;
        System.out.println(isEligible);
    }
}
