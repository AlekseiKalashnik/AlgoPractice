package codewars.kyu7;

import java.util.Objects;

public class ExesAndOhs {
    public static void main(String[] args) {
        System.out.println(getXO("xxxooo"));
    }

    public static boolean getXO(String str) {
        String res = str.toLowerCase();
        int x = 0;
        int o = 0;
        for (char c : res.toCharArray()) {
            if (Objects.equals(c, 'o')) {
                o++;
            } else {
                if (Objects.equals(c, 'x')) {
                    x++;
                }
            }
        }
        return  o == x;
    }
}
