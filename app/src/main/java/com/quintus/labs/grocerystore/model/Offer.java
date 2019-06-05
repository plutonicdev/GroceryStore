package com.quintus.labs.grocerystore.model;

/**
 * Created by Quintus Labs on 18-Feb-2019.
 * www.quintuslabs.com
 */
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
