package com.ethiopia.app.jokes.mRecycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ethiopia.app.jokes.R;

/**
 * Created by tibsolg on 3/25/2017.
 */
public class mMyHolder extends RecyclerView.ViewHolder {

    TextView namTxt;
    ImageView img;

    public mMyHolder(View itemView){
        super(itemView);

        namTxt=(TextView)itemView.findViewById(R.id.namTxt);
        img=(ImageView)itemView.findViewById(R.id.movies_image);
    }
}
