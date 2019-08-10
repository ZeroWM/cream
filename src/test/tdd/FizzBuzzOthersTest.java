package tdd;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;


class FizzBuzzOthersTest {

    @ParameterizedTest(name = "should return {0} given{1}")
    @CsvSource({"1,'1'",
                "3,'3Fizz'",
                "5, '5Buzz'",
                "15, '15FizzBuzz'"})
    @Test
    void test (int input, String words){
        assertThat(FizzBuzzOthers.of(input)).isEqualTo(words);
    }

}