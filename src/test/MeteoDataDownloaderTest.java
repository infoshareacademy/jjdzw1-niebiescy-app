import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeteoDataDownloaderTest {

    @AfterEach
    void tearDown() {
    }

    @Test
    void shouldReturnNotNullfromURL() {

    assertNotNull(MeteoDataDownloader.fromURL(),"Is not Null");

    }

    @Test
    void shouldReturnTorunfromURL() {

        assertTrue(MeteoDataDownloader.fromURL("torun").contains("Toruń"));

    }

}