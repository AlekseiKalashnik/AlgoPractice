package codewars.kyu8;

public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        String[] fullName = name.split(" ");
        String firstname = fullName[0];
        String lastname = fullName[1];
        return (firstname.charAt(0) + "." + lastname.charAt(0)).toUpperCase();
    }

    //Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
    //
    //The output should be two capital letters with a dot separating them.
    //
    //It should look like this:
    //
    //Sam Harris => S.H
    //
    //patrick feeney => P.F
}
