import org.apache.commons.lang.StringEscapeUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;


/**
 * @author Marek Witkowski
 */


public class MeteoDataDownloader {


    public static String fromURL() {

        return fromURL("");

    }


    public static String fromURL(String placeToReciv) {


        try {
            URL remoteServer = new URL(urlBuilder(placeToReciv));
            URLConnection connection = remoteServer.openConnection();

            BufferedReader bf = new BufferedReader(new InputStreamReader(connection.getInputStream(), Charset.forName("UTF-8")));


            String inputLine = new String();
            StringBuilder outputString = new StringBuilder();

            while ((inputLine = bf.readLine()) != null) {

                outputString.append(inputLine);

            }

            return StringEscapeUtils.unescapeJava(outputString.toString());


        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }

    private static String urlBuilder(String placeToReciv) {


        if (placeToReciv == null || placeToReciv == "") {

            return "https://danepubliczne.imgw.pl/api/data/synop/format/json";

        }

        return "https://danepubliczne.imgw.pl/api/data/synop/station/" + placeToReciv.trim() + "/format/json";


    }


}
