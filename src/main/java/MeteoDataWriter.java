import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class MeteoDataWriter {


    private List<MeteoStation> listOfMeteoStations;

    //TODO method can possibly take object as an argument
    public String jsonWriter() {

        String jsonStringHolder;
        jsonStringHolder = MeteoDataDownloader.fromURL("");


        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jp = new JsonParser();
        //TODO null argument checker
        JsonElement je = jp.parse(jsonStringHolder);
        String prettyJsonString = gson.toJson(je);

        try {

            String filename = "daneIMGW.json";
            String workingDirectory = System.getProperty("user.dir");
            String absoluteFilePath;


            absoluteFilePath = workingDirectory + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + filename;
            // System.out.println("Final filepath : " + absoluteFilePath);


            FileWriter writer = new FileWriter(absoluteFilePath);
            writer.write(prettyJsonString);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


        return jsonStringHolder;


    }

    /**
     * Method to create and fulfill ArrayList with weather for all cities
     *
     * @param jsonStringHolder from jsonWriter() method
     * @return meteoStationsCollection
     */
    public List<MeteoStation> MeteoCollection(String jsonStringHolder) {
        MeteoDataWriter meteoDataWriter = new MeteoDataWriter();

        Gson gson = new GsonBuilder().create();

        TypeToken<List<MeteoStation>> token = new TypeToken<List<MeteoStation>>() {
        };

        listOfMeteoStations = gson.fromJson(meteoDataWriter.jsonWriter(), token.getType());

        return listOfMeteoStations;
    }


}
