package codewars.kyu8;

public class ReversedSequence {
    public static int[] reverse(int n){
        //your code
        int[] res = new int[n];
        for (int i=0; i<n; i++)
            res[i]=n-i;
        return res;
    }
    //Build a function that returns an array of integers from n to 1 where n>0.
    //
    //Example : n=5 --> [5,4,3,2,1]
}
