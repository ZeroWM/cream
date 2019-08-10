package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    Fibonacci fibonacci = new Fibonacci();

    @Test
    public void should_get_fibonacci_number_success(){
        int cases[][]={{0,0},{1,1},{2,1},{3,2}};
        for(int i=0 ; i <cases.length; i++) {
            assertEquals(cases[i][1], fibonacci.fib(cases[i][0]));
        }
    }

}