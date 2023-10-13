package codewars.kyu8;

import java.util.stream.IntStream;

public class GetTheMeanOfAnArray {
    public static int getAverage(int[] marks) {
        return (IntStream.of(marks).sum()) / marks.length;
    }

    //It's the academic year's end, fateful moment of your school report.
    // The averages must be calculated.
    // All the students come to you and entreat you to calculate their average for them.
    // Easy !
    // You just need to write a script.
    //
    //Return the average of the given array rounded down to its nearest integer.
    //
    //The array will never be empty.
}
