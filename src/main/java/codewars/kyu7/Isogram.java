package codewars.kyu7;

import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public static boolean isIsogram(String str) {
        Set<Character> set = new HashSet<>();
        char[] chars = str.toLowerCase().toCharArray();

        for (char c : chars) {
            set.add(c);
        }
        return set.size() == str.length() ? true : false;
    }

    public static void main(String[] args) {

    }

//    Isograms
//
//    An isogram is a word that has no repeating letters, consecutive or non-consecutive.
//    Implement a function that determines whether a string that contains only letters is an isogram.
//    Assume the empty string is an isogram. Ignore letter case.
//
//    Example: (Input --> Output)
//
//    "Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case)
//
//    isIsogram "Dermatoglyphics" = true
//    isIsogram "moose" = false
//    isIsogram "aba" = false
}
