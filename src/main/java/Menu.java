import java.util.Scanner;

class Menu {

    private boolean userContinue = true;

    private int userStationId;

    public boolean isUserContinue() {
        return userContinue;
    }

    public void setUserContinue(boolean userContinue) {
        this.userContinue = userContinue;
    }

    public int getUserStationId() {
        return userStationId;
    }

    public void setUserStationId(int userStationId) {
        this.userStationId = userStationId;
    }

    public void runMenu() {

        System.out.println("*****************Display weather for selected city******************");
        while (userContinue) {

            MeteoDataWriter writer = new MeteoDataWriter();
            writer.MeteoCollection(writer.jsonWriter());
            int collectionSize = writer.getListOfMeteoStations().size();

            System.out.println("Please enter city name");
            printCitiesNamesPrintInBrackets();

            String userCity;
            Scanner read = new Scanner(System.in);
            userCity = read.nextLine();

            for (int i = 0; i < collectionSize - 1; i++) {
                if (writer.getListOfMeteoStations().get(i).getStacja().equals(userCity)) {
                    userStationId = i;
                }
            }

            printWeatherForSelectedCity(userStationId);

            System.out.println("Do you want to display weather for different city? [Type Y]");
            String userContinue2;
            Scanner read2 = new Scanner(System.in);
            userContinue2 = read2.nextLine();
            if (!userContinue2.equals("Y")) {
                userContinue = false;
            }
        }
    }

    private void printCitiesNamesPrintInBrackets() {

        MeteoDataWriter writer = new MeteoDataWriter();
        writer.MeteoCollection(writer.jsonWriter());
        int collectionSize = writer.getListOfMeteoStations().size();

        System.out.print("[");
        for (int i = 0; i < collectionSize - 2; i++) {
            System.out.print(writer.getListOfMeteoStations().get(i).getStacja() + ", ");
        }
        System.out.print(writer.getListOfMeteoStations().get(collectionSize - 1).getStacja() + "]");
        System.out.println("");
    }

    private void printWeatherForSelectedCity(int userStationId) {

        MeteoDataWriter writer = new MeteoDataWriter();
        writer.MeteoCollection(writer.jsonWriter());

        System.out.println("");
        System.out.println("Pogoda dla miasta: " + writer.getListOfMeteoStations().get(userStationId).getStacja());
        System.out.println("");
        System.out.println("Data pomiaru: " + writer.getListOfMeteoStations().get(userStationId).getDataPomiaru());
        System.out.println("Godzina pomiaru: " + writer.getListOfMeteoStations().get(userStationId).getGodzinaPomiaru());
        System.out.println("Temperatura: " + writer.getListOfMeteoStations().get(userStationId).getTemperatura());
        System.out.println("Predkosc wiatru: " + writer.getListOfMeteoStations().get(userStationId).getPredkoscWiatru());
        System.out.println("Kierunek wiatru: " + writer.getListOfMeteoStations().get(userStationId).getKierunekWiatru());
        System.out.println("Wilgotnosc wzgledna: " + writer.getListOfMeteoStations().get(userStationId).getWilgotnoscWzgledna());
        System.out.println("Suma opadów: " + writer.getListOfMeteoStations().get(userStationId).getSumaOpadu());
        System.out.println("Cisnienie: " + writer.getListOfMeteoStations().get(userStationId).getCisnienie());
    }
}
