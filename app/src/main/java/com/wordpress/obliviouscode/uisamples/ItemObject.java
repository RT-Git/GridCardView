package com.wordpress.obliviouscode.uisamples;

/**
 * Created by Ravi on 29-12-2016.
 */

public class ItemObject {


    private String heading;
    private String description;
    private int photo;

    public ItemObject(String heading, int photo, String description) {
        this.heading = heading;
        this.photo = photo;
        this.description = description;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }


//    public String getHeading() {
//        return heading;
//    }
//
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getPhoto() {
//        return photo;
//    }
//
//    public void setPhoto(int photo) {
//        this.photo = photo;
//    }
}