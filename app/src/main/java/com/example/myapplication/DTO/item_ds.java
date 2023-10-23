package com.example.myapplication.DTO;

import java.io.Serializable;

public class item_ds implements Serializable {
    public int img;
    public String name;
    public String date;
    public String time;
    public String dulieu;
    public String cataname;

    public item_ds() {
    }

    public item_ds(int img,String name, String date, String time, String dulieu,String cataname) {
        this.img = img;
        this.name = name;
        this.date = date;
        this.time = time;
        this.dulieu = dulieu;
        this.cataname = cataname;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getCataname() {
        return cataname;
    }

    public void setCataname(String cataname) {
        this.cataname = cataname;
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
