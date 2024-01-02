package codewars.kyu6;

public class FindTheParityOutlier {
    public static void main(String[] args) {
        int[] x = new int[] {2, 4, 0, 100, 4, 11, 2602, 36};
        System.out.println(find(x));
    }

    static int find(int[] integers) {
        int oddCount = 0;
        for (int n : integers) {
            if (n % 2 != 0) {
                oddCount += 1;
            }
        }

        if (oddCount == 1) {
            for (int n : integers) {
                if (n % 2 != 0) {
                    return n;
                }
            }
        } else {
            for (int n : integers) {
                if (n % 2 == 0) {
                    return n;
                }
            }
        }
        return 0;
    }
}
