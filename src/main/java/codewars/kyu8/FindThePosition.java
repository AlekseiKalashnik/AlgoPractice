package codewars.kyu8;

public class FindThePosition {
    public static void main(String[] args) {
        System.out.println(position('a'));
    }

    public static String position(char alphabet)
    {
        return "Position of alphabet: " + ((int) alphabet - 96);
    }
}
