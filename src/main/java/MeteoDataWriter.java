import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.*;


public class MeteoDataWriter {

    MeteoDataDownloader dataWriter = new MeteoDataDownloader();

    public String jsonWriter() {

        String jsonStringHolder;
        jsonStringHolder = dataWriter.fromURL("");


        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jp = new JsonParser();
        JsonElement je = jp.parse(jsonStringHolder);
        String prettyJsonString = gson.toJson(je);

        try {

            String filename = "daneIMGW.json";
            String workingDirectory = System.getProperty("user.dir");


            String absoluteFilePath = "";


            absoluteFilePath = workingDirectory + File.separator + "/src/main/resources/" + filename;

            System.out.println("Final filepath : " + absoluteFilePath);


            FileWriter writer = new FileWriter(absoluteFilePath);
            writer.write(prettyJsonString);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


        return jsonStringHolder;


    }


}
