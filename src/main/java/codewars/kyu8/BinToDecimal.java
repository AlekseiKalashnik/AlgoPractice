package codewars.kyu8;

public class BinToDecimal {
    public static void main(String[] args) {
        System.out.println(binToDecimal("1001001"));
    }

    public static int binToDecimal(String inp){
        return Integer.parseInt(inp, 2);
    }
}
