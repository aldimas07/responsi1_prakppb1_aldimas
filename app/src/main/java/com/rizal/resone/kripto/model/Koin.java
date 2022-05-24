package com.rizal.resone.kripto.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.rizal.resone.kripto.R;

import java.util.Arrays;
import java.util.List;

public class Koin implements Parcelable {
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.icon);
        dest.writeString(this.nama);
        dest.writeString(this.deskripsi);
        dest.writeString(this.sejarah);
    }

    public void readFromParcel(Parcel source) {
        this.icon = source.readInt();
        this.nama = source.readString();
        this.deskripsi = source.readString();
        this.sejarah = source.readString();
    }

    protected Koin(Parcel in) {
        this.icon = in.readInt();
        this.nama = in.readString();
        this.deskripsi = in.readString();
        this.sejarah = in.readString();
    }

    public static final Parcelable.Creator<Koin> CREATOR = new Parcelable.Creator<Koin>() {
        @Override
        public Koin createFromParcel(Parcel source) {
            return new Koin(source);
        }

        @Override
        public Koin[] newArray(int size) {
            return new Koin[size];
        }
    };
}
