package com.example.myapplication.DTO;

public class item_w {
    public String namew;
    public String datew;
    public String timew;
    public String dulieuw;

    public item_w() {
    }

    public item_w(String namew, String datew, String timew, String dulieuw) {
        this.namew = namew;
        this.datew = datew;
        this.timew = timew;
        this.dulieuw = dulieuw;
    }

    public String getNamew() {
        return namew;
    }

    public void setNamew(String namew) {
        this.namew = namew;
    }

    public String getDatew() {
        return datew;
    }

    public void setDatew(String datew) {
        this.datew = datew;
    }

    public String getTimew() {
        return timew;
    }

    public void setTimew(String timew) {
        this.timew = timew;
    }

    public String getDulieuw() {
        return dulieuw;
    }

    public void setDulieuw(String dulieuw) {
        this.dulieuw = dulieuw;
    }
}
