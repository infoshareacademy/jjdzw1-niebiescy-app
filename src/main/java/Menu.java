import java.util.Scanner;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Menu {

    void runMenu() {

        System.out.println("*****************Display weather for selected city******************");

        boolean userContinue = true;

        while (userContinue) {

            MeteoDataWriter writer = new MeteoDataWriter();
            writer.MeteoCollection(writer.jsonWriter());

            int collectionSize = writer.getListOfMeteoStations().size();

            System.out.println("Please enter city name");
            printCitiesNamesPrintInBrackets();

            String userCity;
            Scanner read = new Scanner(System.in);
            userCity = read.nextLine();

            boolean checkIfCityExists = writer.getListOfMeteoStations().stream()
                    .anyMatch(MeteoStation -> userCity.equals(MeteoStation.getStacja()));

            int userStationId = -1;

            if (checkIfCityExists) {
                for (int j = 0; j < collectionSize - 1; j++) {
                    if (writer.getListOfMeteoStations().get(j).getStacja().equals(userCity)) {
                        userStationId = j;

                    }

                }

                printWeatherForSelectedCity(userStationId);
            } else {
                System.out.println("Sorry, we dont have weather for this city");
            }

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
        System.out.print(writer.getListOfMeteoStations().get(collectionSize - 1).getStacja() + "]"+"\n");
    }

    private void printWeatherForSelectedCity(int userStationId) {

        MeteoDataWriter writer = new MeteoDataWriter();
        writer.MeteoCollection(writer.jsonWriter());

        System.out.println("\nPogoda dla miasta: " + writer.getListOfMeteoStations().get(userStationId).getStacja()+"\n");
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
