package codewars.kyu7;

public class Vowels {

    public static int getCount1(String str) {
        return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
    }

////////////////////////////////////////////////////////////////

    public static int getCount2(String str) {
        int vowelsCount = 0;
        for(int i = 0; i < str.length(); i++) {
            switch(str.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelsCount++;
            }
        }
        return vowelsCount;
    }
}
