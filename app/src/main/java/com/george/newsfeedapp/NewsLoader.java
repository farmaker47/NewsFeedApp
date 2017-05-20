package com.george.newsfeedapp;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;



public class NewsLoader extends AsyncTaskLoader<List<New>> {

    /** Query URL */
    private String mUrl;

    //Constructor for the NewsLoader
    public NewsLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    //This is on a background thread.
    @Override
    public List<New> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of earthquakes.
        List<New> news = QueryUtils.fetchNewsData(mUrl);
        return news;
    }
}
