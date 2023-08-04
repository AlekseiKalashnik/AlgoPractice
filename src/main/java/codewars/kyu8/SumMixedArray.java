package codewars.kyu8;

import java.util.List;

public class SumMixedArray {
    public int sum(List<?> mixed) {
        return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
    }
    //Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.
    //
    //Return your answer as a number.
}
