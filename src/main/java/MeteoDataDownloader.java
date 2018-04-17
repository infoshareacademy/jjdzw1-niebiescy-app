import org.apache.commons.lang.StringEscapeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;


/**
 * @author Marek Witkowski
 */


public class MeteoDataDownloader {

    private static final Logger LOGGER = LoggerFactory.getLogger(MeteoDataDownloader.class);


    static String fromURL() {

        return fromURL("");

    }


    static String fromURL(String placeToReciv) {


        try {
            URL remoteServer = new URL(urlBuilder(placeToReciv));
            URLConnection connection = remoteServer.openConnection();

            BufferedReader bf = new BufferedReader(new InputStreamReader(connection.getInputStream(), Charset.forName("UTF-8")));


            String inputLine;
            StringBuilder outputString = new StringBuilder();

            while ((inputLine = bf.readLine()) != null) {

                outputString.append(inputLine);

            }

            LOGGER.debug("Json: " + StringEscapeUtils.unescapeJava(outputString.toString()));
            return StringEscapeUtils.unescapeJava(outputString.toString());


        } catch (Exception e) {
            LOGGER.error("Connection error.      URL: " + urlBuilder(placeToReciv));
            LOGGER.error("Connection error. Exeption: ", e);

        }

        return null;

    }

    private static String urlBuilder(String placeToReciv) {

        String address;

        if (placeToReciv == null || placeToReciv.equals("")) {

            address = "https://danepubliczne.imgw.pl/api/data/synop/format/json";
            LOGGER.debug("URL: " + address);
            return address;

        }

        address ="https://danepubliczne.imgw.pl/api/data/synop/station/" + placeToReciv.trim() + "/format/json";
        LOGGER.debug("URL: " + address);
        return address;


    }


}
