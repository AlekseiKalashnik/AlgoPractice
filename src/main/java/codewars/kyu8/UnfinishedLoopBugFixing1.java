package codewars.kyu8;

import java.util.ArrayList;
import java.util.List;

public class UnfinishedLoopBugFixing1 {
    public static List CreateList(int number)
    {
        List<Object> list = new ArrayList<>();

        for(int count = 1; count <= number; count++)
        {
            list.add(count);
        }

        return list;
    }
    //Oh no, Timmy's created an infinite loop! Help Timmy find and fix the bug in his unfinished for loop!
}
