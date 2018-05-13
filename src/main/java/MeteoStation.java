import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class MeteoStation {

    @SerializedName("id_stacji")
    @Expose
    private String idStacji;

    @SerializedName("stacja")
    @Expose
    private String stacja;

    @SerializedName("data_pomiaru")
    @Expose
    private String dataPomiaru;

    @SerializedName("godzina_pomiaru")
    @Expose
    private String godzinaPomiaru;

    @SerializedName("temperatura")
    @Expose
    private String temperatura;

    @SerializedName("predkosc_wiatru")
    @Expose
    private String predkoscWiatru;

    @SerializedName("kierunek_wiatru")
    @Expose
    private String kierunekWiatru;

    @SerializedName("wilgotnosc_wzgledna")
    @Expose
    private String wilgotnoscWzgledna;

    @SerializedName("suma_opadu")
    @Expose
    private String sumaOpadu;

    @SerializedName("cisnienie")
    @Expose
    private String cisnienie;
}

