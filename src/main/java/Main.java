public class Main {

    public static void main(String[] args) {



        System.out.println(MeteoDataDownloader.fromURL());
        System.out.println(MeteoDataDownloader.fromURL("warszawa"));
        System.out.println(MeteoDataDownloader.fromURL("torun"));
        System.out.println(MeteoDataDownloader.fromURL("jeleniagora"));



    }

}
