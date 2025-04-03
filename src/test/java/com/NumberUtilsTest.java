import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
public class NumberUtilsTest {

    @ParameterizedTest
    @ValueSource(ints={2,4,50,6})
    void test(int number){
        assertTrue(NumberUtils.isEven(number));
    }

}
