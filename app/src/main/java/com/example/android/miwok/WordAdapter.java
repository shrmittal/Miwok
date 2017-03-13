package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
/**
 * Created by SHREYA on 3/12/2017.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0,words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       View listItemView=convertView;
        if(listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);

        }
        Word current=getItem(position);
        TextView miwokTranslation=(TextView)listItemView.findViewById(R.id.textView);
        miwokTranslation.setText(current.getMiwokTranslation());
        TextView defaultTranslation=(TextView)listItemView.findViewById(R.id.textView2);
        defaultTranslation.setText(current.getDefaultTranslation());

        return listItemView;
    }
}
