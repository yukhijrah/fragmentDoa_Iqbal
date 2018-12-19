package iqbal.app.kumpulandoa.model;

import java.io.Serializable;

public class ModelAdzan implements Serializable {
    private String namaSholat, waktuSholat;

    public ModelAdzan(String namaSholat, String waktuSholat) {
        this.namaSholat = namaSholat;
        this.waktuSholat = waktuSholat;
    }

    public String getNamaSholat() {
        return namaSholat;
    }

    public String getWaktuSholat() {
        return waktuSholat;
    }
}
