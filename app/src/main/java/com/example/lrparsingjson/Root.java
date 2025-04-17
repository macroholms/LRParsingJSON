package com.example.lrparsingjson;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Date;

public class Root{
    public enum Status{
        @SerializedName("active")
        active,
        @SerializedName("disabled")
        disabled
    }
    @SerializedName("cart")
    public ArrayList<Cart> cart;
    @SerializedName("date")
    public Date date;
    @SerializedName("discount")
    public double discount;
    @SerializedName("emails")
    public ArrayList<String> emails;
    @SerializedName("is_premium")
    public boolean is_premium;
    @SerializedName("location")
    public Location location;
    @SerializedName("loyalty_points")
    public int loyalty_points;
    @SerializedName("message")
    public String message;
    @SerializedName("name")
    public Name name;
    @SerializedName("phoneNumber")
    public String phoneNumber;
    @SerializedName("status")
    public Status status;
    @SerializedName("total_orders")
    public int total_orders;

    public ArrayList<Cart> getCart() {
        return cart;
    }

    public void setCart(ArrayList<Cart> cart) {
        this.cart = cart;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public ArrayList<String> getEmails() {
        return emails;
    }

    public void setEmails(ArrayList<String> emails) {
        this.emails = emails;
    }

    public boolean isIs_premium() {
        return is_premium;
    }

    public void setIs_premium(boolean is_premium) {
        this.is_premium = is_premium;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getLoyalty_points() {
        return loyalty_points;
    }

    public void setLoyalty_points(int loyalty_points) {
        this.loyalty_points = loyalty_points;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getTotal_orders() {
        return total_orders;
    }

    public void setTotal_orders(int total_orders) {
        this.total_orders = total_orders;
    }

    public Root(String message, String phoneNumber, Status status, Name name,
                ArrayList<Cart> cart, ArrayList<String> emails, Location location, Date date,
                boolean is_premium,  int loyalty_points, int total_orders,  int discount) {
        this.cart = cart;
        this.date = date;
        this.discount = discount;
        this.emails = emails;
        this.is_premium = is_premium;
        this.location = location;
        this.loyalty_points = loyalty_points;
        this.message = message;
        this.name = name;
        this.status = status;
        this.phoneNumber = phoneNumber;
        this.total_orders = total_orders;
    }
}
