package com.example.bucketlist;

import androidx.annotation.DrawableRes;

public class Item {
    String heading;
    String description;
    int imageId;
    float decimalValue;

    public Item(String heading, String description, @DrawableRes int imageId, float decimalValue) {
        this.heading = heading;
        this.description = description;
        this.imageId = imageId;
        this.decimalValue = decimalValue;
    }
}
