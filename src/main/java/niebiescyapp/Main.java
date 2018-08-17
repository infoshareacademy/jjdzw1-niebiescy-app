package niebiescyapp;

public class Main {

    public static void main(String[] args) {

        MeteoDataWriter meteoDataWriter = new MeteoDataWriter();
        MeteoStation meteoStation = meteoDataWriter.getWeatherByCity("Hel");
        System.out.println("Pogoda dla miasta: "+meteoStation.getStation()+" temperatura: "+meteoStation.getTemperature());


           niebiescyapp.Menu menu = new niebiescyapp.Menu();
        menu.runMenu();

    }

}
