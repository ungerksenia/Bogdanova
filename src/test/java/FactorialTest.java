import lesson7.Factorial;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigInteger;

public class FactorialTest {

    @Test
    @DisplayName("Тест факториала 0")
    public void testZeroFactorial() {
        BigInteger calc = Factorial.factorial(0);
        Assertions.assertThat(calc).isEqualTo(1);
    }

    @DisplayName("Тест факториала")
    @ParameterizedTest
    @CsvSource({"1, 1", "2, 2", "3, 6", "5, 120", "10, 3628800"})
    public void testTenFactorial(int value, BigInteger expected) {
        BigInteger calc = Factorial.factorial(value);
        Assertions.assertThat(calc).isEqualTo(expected);
    }

    @Test
    @DisplayName("Тест факториала отрицательного числа")
    public void testNegativeFactorial() {
        Throwable thrown = Assertions.catchThrowable(() -> Factorial.factorial(-2));
        Assertions.assertThat(thrown)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Incorrect value: -2");
    }
}
