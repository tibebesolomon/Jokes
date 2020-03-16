package com.ethiopia.app.jokes.mPicasso;

import android.content.Context;
import android.widget.ImageView;

import com.ethiopia.app.jokes.R;
import com.squareup.picasso.Picasso;

/**
 * Created by tibsolg on 3/25/2017.
 */
public class PicassoClient {

    public static void downlodeImage(Context c,String url,ImageView img){

        if (url!=null && url.length()>0){
            Picasso.with(c).load(url).placeholder(R.drawable.placeholder).into(img);
        }else {
            Picasso.with(c).load(R.drawable.placeholder).into(img);
        }
    }
}
