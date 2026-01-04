package Arrays;

import java.util.Arrays;

public class LearnArrays {
    public static void main(String[] args) {
        int[] numbers = { 3, 7, 2, 9, 6 };
        System.out.println(numbers.length);
        // Used to check the length of an array
        Arrays.sort(numbers);
        // Used to arrange numbers
        System.out.println(Arrays.toString(numbers));

        char[] letters = { 'e', 'v', 'a', 'n', 's' };
        Arrays.sort(letters);
        System.out.println(Arrays.toString(letters));
    }
}
