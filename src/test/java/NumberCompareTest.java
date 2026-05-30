import lesson7.NumberCompare;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class NumberCompareTest {

    @DisplayName("Тест сравнения чисел")
    @ParameterizedTest
    @CsvSource({"2, 3, 2 меньше 3", "5, 1, 5 больше 1", "-7, 9, -7 меньше 9", "8, 8, Числа равны"})
    public void testNumberCompare(int a, int b, String expected) {
        String result = NumberCompare.numberCompare(a, b);
        Assertions.assertThat(result).isEqualTo(expected);
    }
}
