package codewars.kyu8;

public class CountingDuplicates {
    public static void main(String[] args) {
        System.out.println(duplicateCount("abcde"));
    }

    public static int duplicateCount(String text) {
        if (text == null || text.isEmpty()) return 0;

        int result = 0;
        int[] count = new int[127];
        text = text.toUpperCase();
        String[] arr = text.split("");

        for (String s : arr) {
            int index = s.charAt(0);
            count[index]++;
        }

        for (int i : count) {
            if (i > 1) result++;
        }

        return result;
    }

}
