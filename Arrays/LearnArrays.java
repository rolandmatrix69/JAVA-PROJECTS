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

        // ***********************Multi Dimensional Arrays********************/

        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println(Arrays.deepToString(matrix));
        // 2D array 2*3 matrix
        int[][] matrices = { { 1, 2, 3 }, { 3, 4, 5 }, { 5, 6, 7 }, { 7, 8, 9 } };
        System.out.println(Arrays.deepToString(matrices));

        int[][][] cube = {
                // Layer 0
                {
                        { 1, 2, 3 },
                        { 4, 5, 6 },
                        { 7, 8, 9 }
                },
                // Layer 1
                {
                        { 10, 11, 12 },
                        { 13, 14, 15 },
                        { 16, 17, 18 }
                },
                // Layer 2
                {
                        { 19, 20, 21 },
                        { 22, 23, 24 },
                        { 25, 26, 27 }
                }
        };
        // Three 3×3 tables stacked together - a 3×3×3 cube!
        System.out.println(Arrays.deepToString(cube));

    }
}
