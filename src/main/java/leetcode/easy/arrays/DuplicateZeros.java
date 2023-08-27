package leetcode.easy.arrays;

import java.util.Arrays;

public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {  //[1,0,2,3,0,4,5,0] -> [1,0,0,2,3,0,0,4]
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int k = arr.length - 1; k >= i + 1; k--) {
                    arr[k] = arr[k - 1];
                }
                i += 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    //Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
    //
    //Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.
    //
    //
    //
    //Example 1:
    //
    //Input: arr = [1,0,2,3,0,4,5,0]
    //Output: [1,0,0,2,3,0,0,4]
    //Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
    //Example 2:
    //
    //Input: arr = [1,2,3]
    //Output: [1,2,3]
    //Explanation: After calling your function, the input array is modified to: [1,2,3]
}
