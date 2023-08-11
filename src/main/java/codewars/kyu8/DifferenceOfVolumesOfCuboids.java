package codewars.kyu8;

import java.util.stream.IntStream;

public class DifferenceOfVolumesOfCuboids {
    static int findDifference(int[] a, int[] b) {
        return Math.abs(a[0] * a[1] * a[2] - b[0] * b[1] * b[2]);
    }

//    return Math.abs(IntStream.of(firstCuboid).reduce(1, (acc, x) -> acc * x) - IntStream.of(secondCuboid).reduce(1, (acc, x) -> acc * x));
}
