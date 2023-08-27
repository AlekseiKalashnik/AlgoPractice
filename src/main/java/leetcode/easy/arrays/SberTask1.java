package leetcode.easy.arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class SberTask1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 1, 2, 2, 7, 8, 8, 3, 5, 5, 5, 9, 0};
        System.out.println(getSecondUniqueNumber(arr));
    }

    static int getSecondUniqueNumber(int[] arr) {

        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int number : arr) {
            if (!map.containsKey(number)) {
                map.put(number, 1);
            } else {
                map.put(number, map.get(number) + 1);
            }
        }

        return map.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .distinct()
                .skip(1)
                .findFirst()
                .orElse(0);
    }
}
