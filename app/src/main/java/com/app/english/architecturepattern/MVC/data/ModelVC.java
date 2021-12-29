package com.app.english.architecturepattern.MVC.data;

public class ModelVC {
    private int id ;
    private String name ;
    private String date ;
    private String descrption ;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
    public String getDescrption() {
        return descrption;
    }
    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }
    public ModelVC(int id, String name, String date, String descrption) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.descrption = descrption;
    }
}
