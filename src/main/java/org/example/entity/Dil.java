package org.example.entity;

public class Dil {
    private String ad;

    public Dil() {
    }

    public Dil(String ad) {
        this.ad = ad;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    @Override
    public String toString() {
        return "Dil{" +
                "ad='" + ad + '\'' +
                '}';
    }
}
