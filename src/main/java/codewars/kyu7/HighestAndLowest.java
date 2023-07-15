package codewars.kyu7;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HighestAndLowest {
    public static String highAndLow(String numbers) {
        Set<Integer> set = new HashSet<>();
        numbers.trim();
        String[] arr = numbers.split(" ");
        for (String s : arr) {
            set.add(Integer.parseInt(s));
        }

        int max = Collections.max(set);
        int min = Collections.min(set);
        return max + " " + min;
    }
    //In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
    //
    //Examples
    //highAndLow("1 2 3 4 5")  // return "5 1"
    //highAndLow("1 2 -3 4 5") // return "5 -3"
    //highAndLow("1 9 3 4 -5") // return "9 -5"
}
