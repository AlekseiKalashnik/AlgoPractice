package codewars.kyu7;

import java.util.ArrayList;
import java.util.List;

public class DeadFish {
    public static int[] parse(String data) {
        int value = 0;
        List<Integer> result = new ArrayList<>();
        for(char letter : data.toCharArray()) {
            switch (letter) {
                case 'i' -> value++;
                case 'd' -> value--;
                case 's' -> value *= value;
                case 'o' -> result.add(value);
                default -> throw new IllegalArgumentException("Not valid code letter");
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    //Write a simple parser that will parse and run Deadfish.
    //
    //Deadfish has 4 commands, each 1 character long:
    //
    //- `i` increments the value (initially `0`)
    //- `d` decrements the value
    //- `s` squares the value
    //- `o` outputs the value into the return array
    //
    //Invalid characters should be ignored.
    //Deadfish.parse("iiisdoso") =- new int[] {8, 64};
}
