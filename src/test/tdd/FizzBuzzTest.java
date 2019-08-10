package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void should_mod_3_success() {
        assertEquals(fizzBuzz.getNumber(3), "3Fizz");
    }


    @Test
    public void should_mod_5_success(){
        assertEquals(fizzBuzz.getNumber(5),"5Buzz");
    }

    @Test
    public void should_mod_15_success(){
        assertEquals(fizzBuzz.getNumber(55),"FizzBuzz");
    }



}