package com.example.demo;


import javax.persistence.*;
import java.util.Set;

@Entity
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long fruitID;
    private String fruit_name;
    private String available_day;
    private String start_time;
    private String end_time;
    private String picture;
    private String location;

    public long getFruitID() {
        return fruitID;
    }

    public void setFruitID(long fruitID) {
        this.fruitID = fruitID;
    }

    public String getFruit_name() {
        return fruit_name;
    }

    public void setFruit_name(String fruit_name) {
        this.fruit_name = fruit_name;
    }

    public String getAvailable_day() {
        return available_day;
    }

    public void setAvailable_day(String available_day) {
        this.available_day = available_day;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
