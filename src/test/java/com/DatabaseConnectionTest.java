import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class DatabaseConnectionTest {
   

    @BeforeEach
    void connect() {
        DatabaseConnection.connect();
    }

    @AfterEach
    void disconnect() {
        DatabaseConnection.disconnect();
    }

    @Test
    void checkConnection() {
        assertTrue(DatabaseConnection.isConnected());
    }

    @Test
    void checkConnectionOff() {
        DatabaseConnection.disconnect();
        assertFalse(DatabaseConnection.isConnected());
    }
}
