package net.campagna.app.model;

import java.util.ArrayList;

public class CulturalCenter {

    private Integer id;
    private String name;
    private String address;
    private String capacity;
    private String img = "centroCultural.png";
    private ArrayList<String> links;

    //<------------------------------ Getters and Setters ------------------------------>


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public ArrayList<String> getLinks() {
        return links;
    }

    public void setLinks(ArrayList<String> links) {
        this.links = links;
    }

}
