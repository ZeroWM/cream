package tdd;

public class FizzBuzz3 {
    public static String getNumber(int i) {
        if(i % 15 == 0 ) return i + "FizzBuzz";
        if(i % 3 == 0 ) return i + "Fizz";
        if(i % 5 == 0 ) return i + "Buzz";

        return String.valueOf(i);
    }
}
