package codewars.kyu8;

public class DoubleChar {
    public static String doubleChar(String s){
        StringBuilder srtingBuilder = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            srtingBuilder.append(s.charAt(i)).append(s.charAt(i));
        }
        return srtingBuilder.toString();
    }


//    public static String doubleChar(String s){
//        String word = "";
//        for(int i = 0; i < s.length(); i++){
//            word= word + s.charAt(i) + s.charAt(i);
//        }
//        return word;
//    }

    //Given a string, you have to return a string in which each character (case-sensitive) is repeated once.
    //
    //Examples (Input -> Output):
    //* "String"      -> "SSttrriinngg"
    //* "Hello World" -> "HHeelllloo  WWoorrlldd"
    //* "1234!_ "     -> "11223344!!__  "
}
