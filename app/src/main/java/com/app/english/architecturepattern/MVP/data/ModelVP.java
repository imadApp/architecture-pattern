package com.app.english.architecturepattern.MVP.data;

public class ModelVP {
    int id ;
    String name ;
    String title ;
    String description ;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ModelVP(int id, String name, String title, String description) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.description = description;

    }
}
