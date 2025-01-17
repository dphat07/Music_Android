package com.example.musicapp_android.Data;

public class Theme {
    private String id;
    private String name;

    public Theme() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Theme(String id, String name, String image) {
        this.id = id;
        this.name = name;
        this.image = image;
    }

    private String image;
}
