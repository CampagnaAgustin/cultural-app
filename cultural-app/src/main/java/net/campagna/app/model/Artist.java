package net.campagna.app.model;

import java.util.ArrayList;
import java.util.LinkedList;

public class Artist {

    private Integer id;
    private String name;
    private Integer members;
    private ArrayList<String> tags;
    private String img = "artist.png";
    private ArrayList<String> links;

    public Artist(){
        this.tags = new ArrayList<>();
        this.links = new ArrayList<>();
    }

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

    public Integer getMembers() {
        return members;
    }

    public void setMembers(Integer members) {
        this.members = members;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
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
