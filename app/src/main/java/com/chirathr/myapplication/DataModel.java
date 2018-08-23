package com.chirathr.myapplication;

import java.util.Locale;

public class DataModel {
    private int imageDrawable;
    private String title;
    private String subTitle;

    public DataModel(int id) {
        imageDrawable = R.drawable.list_image;
        title = String.format(Locale.ENGLISH, "Title %d Goes Here", id);
        subTitle = String.format(Locale.ENGLISH, "Sub title %d goes here", id);
    }

    public int getImageDrawable() {
        return imageDrawable;
    }

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }
}
