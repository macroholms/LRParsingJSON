package com.example.lrparsingjson;

import com.google.gson.annotations.SerializedName;

public class Coordinates{
    @SerializedName("latitude")
    public double latitude;
    @SerializedName("longitude")
    public double longitude;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Coordinates(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
