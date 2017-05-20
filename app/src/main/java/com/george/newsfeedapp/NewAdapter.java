package com.george.newsfeedapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
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
        //Below we find the TextViews in the list_item.xml layout with specficthe IDs.
        //Then we set the spesific text for each TextView
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.titleText);
        titleTextView.setText(currentNew.getmTitle());

        TextView sectionTextView = (TextView) listItemView.findViewById(R.id.sectionText);
        sectionTextView.setText(currentNew.getmSection());

        TextView urlTextView = (TextView) listItemView.findViewById(R.id.urlText);
        urlTextView.setText(currentNew.getmUrl());

        TextView dummyTitleText = (TextView) listItemView.findViewById(R.id.dummyTitleText);
        dummyTitleText.setText(mContext.getResources().getString(R.string.dummyTitleText));

        TextView dummySectionText = (TextView) listItemView.findViewById(R.id.dummySectionText);
        dummySectionText.setText(mContext.getResources().getString(R.string.dummySectionText));

        TextView dummyUrlText = (TextView) listItemView.findViewById(R.id.dummyUrlText);
        dummyUrlText.setText(mContext.getResources().getString(R.string.dummyUrlText));

        return listItemView;
    }
}
