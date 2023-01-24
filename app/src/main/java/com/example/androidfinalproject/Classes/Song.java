package com.example.androidfinalproject.Classes;

public class Song {

    private String name = "";
    private String nameAuthor = "";
    private String image = "";
    private int duration = 0;
    private boolean star = false;
    public Song() {
    }

    public String getName() {
        return name;
    }

    public Song setName(String name) {
        this.name = name;
        return this;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public Song setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
        return this;
    }

    public int getDuration() {
        return duration;
    }

    public Song setDuration(int duration) {
        this.duration = duration;
        return this;
    }

    public String getImage() {
        return image;
    }

    public Song setImage(String image) {
        this.image = image;
        return this;
    }

    public boolean isFavorite() {
        return star;
    }

    public Song setFavorite(boolean star) {
        this.star = star;
        return this;
    }


}