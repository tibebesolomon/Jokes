package com.ethiopia.app.jokes.Recycler;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ethiopia.app.jokes.R;

import java.util.ArrayList;

/**
 * Created by tibsolg on 2/21/2017.
 */
public class MyRecyclerAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context c;
    ArrayList<Jokes>joke;

    public MyRecyclerAdapter(Context c,ArrayList<Jokes>joke){
        this.c=c;
        this.joke=joke;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.model,null);
        MyViewHolder holder=new MyViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder,final int position) {
        holder.nameTxt.setText(joke.get(position).getName());
        holder.description.setText(joke.get(position).getDescription());
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View v, int pos) {
//                Toast.makeText(c,joke.get(pos).getDescription(),Toast.LENGTH_SHORT).show();
//                Toast.makeText(c,joke.get(pos).getName(),Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, joke.get(pos).getName() + "\n\n" + joke.get(pos).getDescription()+"\n\n"+"TS Software and Web development.");



                Intent intent1 = Intent.createChooser(intent, "Share");
                v.getContext().startActivity(intent1);


            }
        });

    }

    @Override
    public int getItemCount() {
        return joke.size();
    }
}
