package com.george.newsfeedapp;

/**
 * Created by farmaker1 on 19/05/2017.
 */

public class New {
    //Variable to store the title's name
    private String mTitle;
    //Variable to store the section's name
    private String mSection;
    //Variable to store the url's name
    private String mUrl;
    //Variable to store the thumbnails url
    private String mUrlThumbnail;
//    //Creating an empty constructor for
//    There are three common reasons to define a default constructor:
//
//    To construct an object with default values.
//    To initialize an object that doesn't need parameters in that initialization process.
//    To redefine the scope of the constructor. Making the constructor private will prevent anyone but the class itself from constructing an object.
    private New(){

    }
    //Creating the constructor of 4 Strings
    public New (String title,String section,String url,String urlthumbnail){
        mTitle = title;
        mSection = section;
        mUrl = url;
        mUrlThumbnail = urlthumbnail;
    }

    //Creating the getter methods to use them in the custom adapter
    public String getmTitle(){
        return mTitle;
    }
    public String getmUrl(){
        return mUrl;
    }
    public String getmSection(){
        return mSection;
    }
    public String getmUrlThumbnail(){
        return mUrlThumbnail;
    }
}
