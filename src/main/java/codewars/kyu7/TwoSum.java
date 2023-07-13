package codewars.kyu7;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum1(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }


    public static int[] twoSum2(int[] numbers, int target) {
        Map<Integer, Integer> numToIndexMapping = new HashMap<>(numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            if (numToIndexMapping.containsKey(target - numbers[i])) {
                return new int[]{i, numToIndexMapping.get(target - numbers[i])};
            } else {
                numToIndexMapping.put(numbers[i], i);
            }
        }
        return new int[0];
    }
    //Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    //
    //You may assume that each input would have exactly one solution, and you may not use the same element twice.
    //
    //You can return the answer in any order.
    //
    //
    //
    //Example 1:
    //
    //Input: nums = [2,7,11,15], target = 9
    //Output: [0,1]
    //Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    //Example 2:
    //
    //Input: nums = [3,2,4], target = 6
    //Output: [1,2]
    //Example 3:
    //
    //Input: nums = [3,3], target = 6
    //Output: [0,1]
}