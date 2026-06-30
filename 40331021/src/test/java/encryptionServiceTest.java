import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EncryptionServiceTest {

    @Test
    void encryptTest(){

        EncryptionService service = new EncryptionService();

        String result = service.encrypt("Hello");

        assertNotNull(result);

    }

}