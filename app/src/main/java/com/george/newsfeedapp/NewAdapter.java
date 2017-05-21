package com.george.newsfeedapp;

import android.content.Context;

import android.support.annotation.NonNull;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class NewAdapter extends ArrayAdapter<New> {

    //Creating a context reference so to use it in getView method with getResources
    private final Context mContext;

    //Creating the constructor
    public NewAdapter(Context context, List<New> news) {
        super(context, 0, news);
        mContext = context;
    }

    //Overriding the getView method
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }
        //Get the object located at this position in the list
        New currentNew = getItem(position);
        //Below we find the TextViews in the news_list_item.xml layout with specfic IDs.
        //Then we set the spesific text for each TextView
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.titleText);
        titleTextView.setText(currentNew.getmTitle());
        TextView sectionTextView = (TextView) listItemView.findViewById(R.id.sectionText);
        sectionTextView.setText(currentNew.getmSection());

        TextView dummyTitleText = (TextView) listItemView.findViewById(R.id.dummyTitleText);
        dummyTitleText.setText(mContext.getResources().getString(R.string.dummyTitleText));
        TextView dummySectionText = (TextView) listItemView.findViewById(R.id.dummySectionText);
        dummySectionText.setText(mContext.getResources().getString(R.string.dummySectionText));

        WebView webView = (WebView)listItemView.findViewById(R.id.webView);
        //Use the below methods to zoom out the view and fit it inside the webView
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        //load the thumbnailurl to the webview
        webView.loadUrl(currentNew.getmUrlThumbnail());

        return listItemView;
    }

}
