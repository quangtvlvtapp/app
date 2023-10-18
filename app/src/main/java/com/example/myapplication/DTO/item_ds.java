package com.example.myapplication.DTO;

public class item_ds {
    public String name;
    public String date;
    public String time;
    public String dulieu;

    public item_ds() {
    }

    public item_ds(String name, String date, String time, String dulieu) {
        this.name = name;
        this.date = date;
        this.time = time;
        this.dulieu = dulieu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDulieu() {
        return dulieu;
    }

    public void setDulieu(String dulieu) {
        this.dulieu = dulieu;
    }
}
