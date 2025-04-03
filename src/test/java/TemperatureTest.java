import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class TemperatureTest {
    @Test
    void testCToF() {
        assertEquals(32.0, TemperaturConverter.CToF(0));
    }

    @Test
    void testFToC() {
        assertEquals(0.0, TemperaturConverter.FToC(32));
    }

}
