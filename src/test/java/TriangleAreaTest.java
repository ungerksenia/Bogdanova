import lesson7.TriangleArea;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TriangleAreaTest {

    @DisplayName("Тест несуществующий треугольник")
    @ParameterizedTest
    @CsvSource({"0, 0, 0", "-1, 1, 1", "4, -4, 0", "6, 7, -8", "1, 2, 10", "3, 4, 8", "5, 1, 10"})
    public void testInvalidTriangle(int a, int b, int c) {
        Throwable thrown = Assertions.catchThrowable(() -> TriangleArea.triangleArea(a,b,c));
        Assertions.assertThat(thrown)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Такого треугольника не существует");
    }

    @DisplayName("Тест треугольник")
    @ParameterizedTest
    @CsvSource({"5, 9, 7, 17.41228014936585", "9, 6, 4, 9.56229574945264", "17, 6, 19, 50.19960159204453"})
    public void testTriangleArea(int a, int b, int c, double expected) {
        double calc = TriangleArea.triangleArea(a, b, c);
        Assertions.assertThat(calc)
                .isCloseTo(expected, Assertions.within(0.000001));
    }
}
