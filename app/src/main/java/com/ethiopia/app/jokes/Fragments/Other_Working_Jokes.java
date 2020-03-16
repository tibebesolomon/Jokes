package com.ethiopia.app.jokes.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ethiopia.app.jokes.R;
import com.ethiopia.app.jokes.Recycler.Jokes;
import com.ethiopia.app.jokes.Recycler.MyRecyclerAdapter;

import java.util.ArrayList;

/**
 * Created by tibsolg on 2/21/2017.
 */
public class Other_Working_Jokes extends Fragment {

    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){

        View v=inflater.inflate(R.layout.other_work_jok,null);
        RecyclerView rv=(RecyclerView)v.findViewById(R.id.mRecyclerWork);
        rv.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        rv.setAdapter(new MyRecyclerAdapter(this.getActivity(),getWorkJokes()));

        return v;
    }

    private ArrayList<Jokes> getWorkJokes() {
        ArrayList<Jokes>joke=new ArrayList<>();
        Jokes jokes=new Jokes("Chocolate ice","we have To work tell and of die");
        joke.add(jokes);

        jokes=new Jokes("Chocolate","we have To work tell and of die");
        joke.add(jokes);

        jokes=new Jokes("Chocolate","we have To work tell and of die");
        joke.add(jokes);

        jokes=new Jokes("Chocolate","we have To work tell and of die");
        joke.add(jokes);

        return joke;
    }

    public String toString(){
        return "የስራ ቀልዶች";
    }
}
