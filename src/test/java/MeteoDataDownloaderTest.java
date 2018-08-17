import niebiescyapp.MeteoDataDownloader;
import org.junit.jupiter.api.Test;
import niebiescyapp.MeteoDataDownloader;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MeteoDataDownloaderTest {


    @Test
     void shouldReturnNotNullfromURL() {

    assertNotNull(MeteoDataDownloader.fromURL(),"Is not Null");

    }

    @Test
    void shouldReturnTorunfromURL() {

        assertTrue(MeteoDataDownloader.fromURL("torun").contains("Toruń"));

    }

}