
public class MeteoDataWriter {

    MeteoDataDownloader dataWriter = new MeteoDataDownloader();

    public String jsonWriter() {

        String jsonStringHolder;

        jsonStringHolder =  dataWriter.fromURL("");










        return jsonStringHolder;


    }



}
