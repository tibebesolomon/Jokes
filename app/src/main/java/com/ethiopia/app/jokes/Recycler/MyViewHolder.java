package com.ethiopia.app.jokes.Recycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.ethiopia.app.jokes.R;

/**
 * Created by tibsolg on 2/21/2017.
 */
public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    TextView nameTxt;
    TextView description;
    ItemClickListener itemClickListener;
    TextView txtOptionDigit;


    public MyViewHolder(View itemView) {
        super(itemView);

        nameTxt=(TextView)itemView.findViewById(R.id.nameTxt);
        description=(TextView)itemView.findViewById(R.id.descTxt);
//        txtOptionDigit=(TextView)itemView.findViewById(R.id.txtOptionDigit);
        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener ic){
        this.itemClickListener=ic;
    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClick(v,getLayoutPosition());
    }
}
