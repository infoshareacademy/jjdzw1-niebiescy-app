public class Main {

    public static void main(String[] args) {

        //System.out.println(MeteoDataDownloader.fromURL("warszawa"));
        MeteoDataWriter writer = new MeteoDataWriter();
        System.out.println(writer.jsonWriter());
        System.out.println(writer.MeteoCollection(writer.jsonWriter()).get(10).getStacja());

    }

}
