package com.example.lrparsingjson;

import com.google.gson.annotations.SerializedName;

public class Name{
    @SerializedName("first")
    public String first;
    @SerializedName("last")
    public String last;
    @SerializedName("middle")
    public String middle;

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public Name(String first, String last, String middle) {
        this.first = first;
        this.last = last;
        this.middle = middle;
    }
}
