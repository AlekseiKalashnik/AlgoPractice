package codewars.kyu8;

import java.util.Arrays;

public class SumWithoutHighestAndLowestNumber {
    public static int sum(int[] numbers) {
        if (numbers == null) {
            return 0;
        }
        if (numbers.length == 1) {
            return 0;
        }
        int min = Arrays.stream(numbers).min().orElse(0);
        int max = Arrays.stream(numbers).max().orElse(0);
        int res = Arrays.stream(numbers).sum();
        return res - min - max;
    }
    //Sum all the numbers of a given array ( cq. list ), except the highest and the lowest element ( by value, not by index! ).
    //
    //The highest or lowest element respectively is a single element at each edge, even if there are more than one with the same value.
    //
    //Mind the input validation.
    //
    //Example
    //{ 6, 2, 1, 8, 10 } => 16
    //{ 1, 1, 11, 2, 3 } => 6
}
