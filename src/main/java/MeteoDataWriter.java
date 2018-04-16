import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class MeteoDataWriter {

    private MeteoDataDownloader dataWriter = new MeteoDataDownloader();

    public String jsonWriter() {

        String jsonStringHolder;
        jsonStringHolder = MeteoDataDownloader.fromURL("");


        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jp = new JsonParser();
        JsonElement je = jp.parse(jsonStringHolder);
        String prettyJsonString = gson.toJson(je);

        try {

            String filename = "daneIMGW.json";
            String workingDirectory = System.getProperty("user.dir");
            String absoluteFilePath;


            absoluteFilePath = workingDirectory + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + filename;
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
