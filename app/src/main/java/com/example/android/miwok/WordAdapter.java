package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
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
        TextView miwokTranslation=(TextView)listItemView.findViewById(R.id.miwok_translation);
        miwokTranslation.setText(current.getMiwokTranslation());
        TextView defaultTranslation=(TextView)listItemView.findViewById(R.id.default_translation);
        defaultTranslation.setText(current.getDefaultTranslation());

        ImageView image=(ImageView)listItemView.findViewById(R.id.image_icon);
       if(current.hasImage()) {
           image.setImageResource(current.getResource());
           image.setVisibility(View.VISIBLE);
       }
        else
       image.setVisibility(View.GONE);
        return listItemView;
    }
}
