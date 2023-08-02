package codewars.kyu8;

import java.util.stream.IntStream;

public class ArrayPlusArray {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();
    }

    //    return Arrays.stream(arr1).sum() + Arrays.stream(arr2).sum();

    //I'm new to coding, and now I want to get the sum of two arrays...
    // Actually the sum of all their elements. I'll appreciate for your help.
    //
    //P.S. Each array includes only integer numbers. Output is a number too.

}
