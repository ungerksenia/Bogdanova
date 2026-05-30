import lesson7.Calculator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class CalculatorTest {

    @DisplayName("Тест суммы")
    @ParameterizedTest
    @CsvSource({"1, 1, 2", "2, 2, 4", "3, 6, 9", "5, 120, 125", "-10, 10, 0"})
    public void testSumCalculator(int a, int b, int expected) {
        int calc = Calculator.sum(a, b);
        Assertions.assertThat(calc).isEqualTo(expected);
    }

    @DisplayName("Тест вычитания")
    @ParameterizedTest
    @CsvSource({"1, 1, 0", "2, 2, 0", "3, 6, -3", "5, 120, -115", "-10, 10, -20"})
    public void testSubtractCalculator(int a, int b, int expected) {
        int calc = Calculator.subtract(a, b);
        Assertions.assertThat(calc).isEqualTo(expected);
    }

    @DisplayName("Тест умножения")
    @ParameterizedTest
    @CsvSource({"1, 1, 1", "-2, -2, 4", "3, 6, 18", "5, 120, 600", "-10, 10, -100"})
    public void testMultiplyCalculator(int a, int b, int expected) {
        int calc = Calculator.multiply(a, b);
        Assertions.assertThat(calc).isEqualTo(expected);
    }

    @DisplayName("Тест деления")
    @ParameterizedTest
    @CsvSource({"1, 1, 1", "-2, -2, 1", "3, 6, 0.5", "120, 5, 24", "-10, 10, -1"})
    public void testDivideCalculator(int a, int b, double expected) {
        double calc = Calculator.divide(a, b);
        Assertions.assertThat(calc)
                .isCloseTo(expected, Assertions.within(0.000001));
    }

    @Test
    @DisplayName("Тест деления на ноль")
    public void testZeroDivideCalculator() {
        Throwable thrown = Assertions.catchThrowable(() -> Calculator.divide(2,0));
        Assertions.assertThat(thrown)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("На ноль делить нельзя");
        }
}
