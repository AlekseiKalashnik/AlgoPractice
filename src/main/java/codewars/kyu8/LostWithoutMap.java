package codewars.kyu8;

import java.util.Arrays;

public class LostWithoutMap {
    public static int[] map(int[] arr) {
        return Arrays.stream(arr).map(x -> x*2).toArray();
    }

    //public static int[] map(int[] arr) {
    //      for (int i = 0; i < arr.length; i++) {
    //        arr[i] *= 2;
    //      }
    //      return arr;
    //  }
    //
    //Given an array of integers, return a new array with each value doubled.
    //For example:
    //[1, 2, 3] --> [2, 4, 6]
}
