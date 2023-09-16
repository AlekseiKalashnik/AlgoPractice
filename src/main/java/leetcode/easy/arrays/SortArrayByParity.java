package leetcode.easy.arrays;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] ints) {
        int i = 0, j = ints.length - 1;
        while (i < j) {
            if (ints[i] % 2 == 1) {
                int tmp = ints[i];
                ints[i] = ints[j];
                ints[j] = tmp;
            }
            if (ints[i] % 2 == 0) i++;
            if (ints[j] % 2 == 1) j--;
        }
        return ints;
    }
}
