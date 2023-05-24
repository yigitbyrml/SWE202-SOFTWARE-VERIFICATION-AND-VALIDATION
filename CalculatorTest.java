//B201202045 YİĞİT BAYRAMLI SWE202
//Software Verification
//and Validation
//https://github.com/yigitfrb/SWE202-SOFTWARE-VERIFICATION-AND-VALIDATION.git
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {

    @ParameterizedTest
    @CsvSource({"10.0, 2.0, 5.0", "10.0, 4.0, 2.5", "12.5, 5.0, 2.5", "10.0, 2.5, 4.0", "12.5, 2.5, 5.0"})
    public void divide_shouldReturnCorrectResult(double a, double b, double expected) {
        double result = Calculator.divide(a, b);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"12.5, 0.0"})
    public void divide_byZero_shouldThrowException(double a, double b) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Calculator.divide(a, b);
        });
    }
}