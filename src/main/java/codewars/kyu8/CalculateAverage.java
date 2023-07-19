package codewars.kyu8;

import java.util.Arrays;

public class CalculateAverage {
    public static double find_average(int[] array){
        return Arrays.stream(array).average().orElse(0);
    }

    //  public static double find_average(int[] array){
    //  double result = 0;
    //    for(double i: array) result += i;
    //    return result / array.length;
    //  }
    //Write a function which calculates the average of the numbers in a given list.
    //Empty arrays should return 0.
}
