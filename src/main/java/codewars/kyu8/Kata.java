package codewars.kyu8;

import java.util.Arrays;

public class Kata {
    public static int[] digitize(long n) {
        String numStr = String.valueOf(n);
        int digits[] = new int[numStr.length()];
        int counter = 0;

        for(int i = numStr.length() - 1; i >= 0; i--) {
            digits[i] = Integer.parseInt(Character.toString(numStr.charAt(counter++)));
        }

        return digits;

        //return new StringBuilder().append(n)
        //                                  .reverse()
        //                                  .chars()
        //                                  .map(Character::getNumericValue)
        //                                  .toArray();
    }

    //Convert number to reversed array of digits
    //Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
    //
    //Example(Input => Output):
    //35231 => [1,3,2,5,3]
    //0 => [0]
}
