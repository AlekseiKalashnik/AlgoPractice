package codewars.kyu8;

public class YouOnlyNeedOneBeginner {
    public static boolean check(Object[] a, Object x) {
        for(Object b: a)
            if(b.equals(x))
                return true;
        return false;
    }

    //public static boolean check(Object[] a, Object x) {
    //        return Arrays.asList(a).contains(x);
    //    }
    //
    //You will be given an array a and a value x.
    //All you need to do is check whether the provided array contains the value.
    //Array can contain numbers or strings. X can be either.
    //Return true if the array contains the value, false if not.
}
