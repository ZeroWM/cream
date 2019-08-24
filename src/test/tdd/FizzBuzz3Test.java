package tdd;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;


class FizzBuzz3Test {

    @ParameterizedTest(name = "should return{0} given{1}")
    @CsvSource({"3,'3Fizz'",
                "5,'5Buzz'",
                "15,'15FizzBuzz'"})
    @Test
    public void should_mod_3_return_fizz_success(int input, String words) {
        assertThat(FizzBuzz3.getNumber(input)).isEqualTo(words);
    }



}