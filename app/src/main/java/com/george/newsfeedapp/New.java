package com.george.newsfeedapp;

/**
 * Created by farmaker1 on 19/05/2017.
 */

public class New {
    private String mTitle;
    private String mSection;
    private String mUrl;

    public New (String title,String section,String url){
        mTitle = title;
        mSection = section;
        mUrl = url;
    }

    public String getmTitle(){
        return mTitle;
    }
    public String getmUrl(){
        return mUrl;
    }
    public String getmSection(){
        return mSection;
    }
}
