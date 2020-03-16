package com.ethiopia.app.jokes.mRecycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ethiopia.app.jokes.R;
import com.ethiopia.app.jokes.mData.TVShow;
import com.ethiopia.app.jokes.mPicasso.PicassoClient;

import java.util.ArrayList;

/**
 * Created by tibsolg on 3/25/2017.
 */
public class mMyAdapter extends RecyclerView.Adapter<mMyHolder> {

    Context c;
    ArrayList<TVShow>tvShows;

    public mMyAdapter(Context c,ArrayList<TVShow>tvShows){
        this.c=c;
        this.tvShows=tvShows;
    }

    @Override
    public mMyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.modelimg,parent,false);
        mMyHolder holder=new mMyHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(mMyHolder holder, int position) {

        holder.namTxt.setText(tvShows.get(position).getName());

        PicassoClient.downlodeImage(c,tvShows.get(position).getUrl(),holder.img);

    }

    @Override
    public int getItemCount() {
        return tvShows.size();
    }
}
