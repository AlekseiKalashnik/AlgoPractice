package codewars.kyu8;

public class BasicOperations {
    public static Integer basicMath(String op, int v1, int v2) {
        int result = 0;

        switch (op) {
            case "+":
                result = v1 + v2;
                break;
            case "-":
                result = v1 - v2;
                break;
            case "*":
                result = v1 * v2;
                break;
            case "/":
                result = v1 / v2;
                break;
        }

        return result;
    }

    //Your task is to create a function that does four basic mathematical operations.
    //
    //The function should take three arguments - operation(string/char), value1(number), value2(number).
    //The function should return result of numbers after applying the chosen operation.
    //
    //Examples(Operator, value1, value2) --> output
    //('+', 4, 7) --> 11
    //('-', 15, 18) --> -3
    //('*', 5, 5) --> 25
    //('/', 49, 7) --> 7
}