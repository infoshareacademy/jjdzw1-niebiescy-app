import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class MeteoDataDownloader {


    public static String fromURL() {

        try {
            URL remoteServer = new URL("https://danepubliczne.imgw.pl/api/data/synop/format/json");
            URLConnection connection = remoteServer.openConnection();

            BufferedReader bf = new BufferedReader(new InputStreamReader(connection.getInputStream(), Charset.forName("UTF-8")));


            String inputLine = new String();
            StringBuilder outputString = new StringBuilder();

            while ((inputLine = bf.readLine()) != null) {

                outputString.append(inputLine);

            }

            return outputString.toString();


        } catch (Exception e) {
            e.printStackTrace();
        }


        return null;

    }


}
