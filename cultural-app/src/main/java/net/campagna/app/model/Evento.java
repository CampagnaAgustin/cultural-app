package net.campagna.app.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Evento {

    private Integer id;
    private String name;
    private CulturalCenter culturalCenter;
    private LocalDate date;
    private Double price;
    private ArrayList<Artist> artists;
    private String flyer = "flyer.png";
    private Boolean active = Boolean.TRUE;
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

    public CulturalCenter getCulturalCenter() {
        return culturalCenter;
    }

    public void setCulturalCenter(CulturalCenter culturalCenter) {
        this.culturalCenter = culturalCenter;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ArrayList<Artist> getArtists() {
        return artists;
    }

    public void setArtists(ArrayList<Artist> artists) {
        this.artists = artists;
    }

    public String getFlyer() {
        return flyer;
    }

    public void setFlyer(String flyer) {
        this.flyer = flyer;
    }

    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public ArrayList<String> getLinks() {
        return links;
    }

    public void setLinks(ArrayList<String> links) {
        this.links = links;
    }

}
