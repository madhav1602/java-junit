import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
class TimeOutTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})
    void evenTest(int number) {
        boolean res = (number % 2 == 0);
        assertEquals(res, TimeOut.isEven(number));
    }

    @Timeout(4)
    @Test
    void testTask() throws InterruptedException {
        TimeOut.longRunningTask();
    }
}