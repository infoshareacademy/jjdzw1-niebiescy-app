package niebiescyapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class MeteoStation {

    @SerializedName("id_stacji")
    @Expose
    private String stationId;

    @SerializedName("stacja")
    @Expose
    private String station;

    @SerializedName("data_pomiaru")
    @Expose
    private String measureDate;

    @SerializedName("godzina_pomiaru")
    @Expose
    private String measureTime;

    @SerializedName("temperatura")
    @Expose
    private String temperature;

    @SerializedName("predkosc_wiatru")
    @Expose
    private String windSpeed;

    @SerializedName("kierunek_wiatru")
    @Expose
    private String windDir;

    @SerializedName("wilgotnosc_wzgledna")
    @Expose
    private String humidity;

    @SerializedName("suma_opadu")
    @Expose
    private String rainfallSum;

    @SerializedName("cisnienie")
    @Expose
    private String pressure;
}

