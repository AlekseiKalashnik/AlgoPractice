package leetcode.easy.arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int lastNonZeroAt = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int tmp = nums[lastNonZeroAt];
                nums[lastNonZeroAt] = nums[i];
                nums[i] = tmp;

                lastNonZeroAt++;
            }
        }
    }
}
