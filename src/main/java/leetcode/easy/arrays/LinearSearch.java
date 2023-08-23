package leetcode.easy.arrays;

public class LinearSearch {
    public static boolean linearSearch(int[] array, int length, int element) {
        // Check for edge cases. Is the array null or empty?
        // If it is, then we return false because the element we're
        // searching for couldn't possibly be in it.
        if (array == null || length == 0) {
            return false;
        }

        // Carry out the linear search by checking each element,
        // starting from the first one.
        for (int i = 0; i < length; i++) {
            // We found the element at index i.
            // So we return true to say it exists.
            if (array[i] == element) {
                return true;
            }
        }

        // We didn't find the element in the array.
        return false;
    }
    /*
    * If the index is not known, which is the case most of the time, then we can check every element in the Array.
    * We continue checking elements until we find the element we're looking for, or we reach the end of the Array.
    * This technique for finding an element by checking through all elements one by one is known as the linear search algorithm.
    * In the worst case, a linear search ends up checking the entire Array. Therefore, the time complexity for a linear search is O(N).
    * Let's see the linear search algorithm in action, with all the edge cases handled properly.
    *
    * When we say edge cases, we basically mean scenarios that you wouldn't expect to encounter.
    * For example, the element you're searching for might not even exist in the Array.
    * Or, an even rarer, but possible, scenario is that the input Array doesn't contain any elements at all, or perhaps it is null.
    * It's important to handle all of these edge cases within the code.
* */
}
