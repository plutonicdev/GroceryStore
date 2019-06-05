package com.quintus.labs.grocerystore.model;

public class Offer {
    String image;

    public Offer(String image) {
        this.image = image;
    }

    public Offer() {
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
