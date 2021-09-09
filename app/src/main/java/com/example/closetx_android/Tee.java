package com.example.closetx_android;

public class Tee {
    private String name;
    private String size;
    private String color;

    public Tee(String name, String size, String color) {
        this.name = name;
        this.size = size;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}