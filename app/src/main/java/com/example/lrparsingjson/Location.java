package com.example.lrparsingjson;

import com.google.gson.annotations.SerializedName;

public class Location {
    @SerializedName("city")
    public String city;
    @SerializedName("Coordinates")
    public Coordinates coordinates;
    @SerializedName("country")
    public String country;
    @SerializedName("delivery_available")
    public boolean delivery_available;
    @SerializedName("delivery_cost")
    public double delivery_cost;
    @SerializedName("delivery_radius")
    public double delivery_radius;
    @SerializedName("street")
    public String street;

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isDelivery_available() {
        return delivery_available;
    }

    public void setDelivery_available(boolean delivery_available) {
        this.delivery_available = delivery_available;
    }

    public double getDelivery_cost() {
        return delivery_cost;
    }

    public void setDelivery_cost(double delivery_cost) {
        this.delivery_cost = delivery_cost;
    }

    public double getDelivery_radius() {
        return delivery_radius;
    }

    public void setDelivery_radius(double delivery_radius) {
        this.delivery_radius = delivery_radius;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Location(String street, String city, String country, Coordinates coordinates,
                    boolean delivery_available, double delivery_cost,
                    double delivery_radius) {
        this.city = city;
        this.coordinates = coordinates;
        this.country = country;
        this.delivery_available = delivery_available;
        this.delivery_cost = delivery_cost;
        this.delivery_radius = delivery_radius;
        this.street = street;
    }
}
