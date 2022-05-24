package com.rizal.resone.kripto.model;

import com.rizal.resone.kripto.R;

import java.util.Arrays;
import java.util.List;

public class Koin {
    private int icon;
    private String nama;
    private String deskripsi;
    private String sejarah;
    public static List<Koin> listKoin = Arrays.asList(
            new Koin(R.drawable.bitcoin, "Bitcoin", "adasdasdasdasdasd", "asdasdasdasdasdasd")
    );

    public Koin(int icon, String nama, String deskripsi, String sejarah) {
        this.icon = icon;
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.sejarah = sejarah;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getSejarah() {
        return sejarah;
    }

    public void setSejarah(String sejarah) {
        this.sejarah = sejarah;
    }
}
