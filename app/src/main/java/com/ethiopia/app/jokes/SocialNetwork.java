package com.ethiopia.app.jokes;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class SocialNetwork extends AppCompatActivity {

    Toolbar toolbarWidget;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_network);
        toolbarWidget= (Toolbar) findViewById(R.id.toolbar);

        toolbarWidget.setNavigationIcon(R.drawable.ic_action_back);
        setSupportActionBar(toolbarWidget);

        ImageView socialNetworkFacebook=(ImageView)findViewById(R.id.facebook);
        socialNetworkFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("http://www.facebook.com/tib.solg?");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntent);
            }
        });

        ImageView socialNetworkTwitter=(ImageView)findViewById(R.id.twitter);
        socialNetworkTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("http://www.twitter.com");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntent);
            }
        });

        ImageView socialNetworkInstagram=(ImageView)findViewById(R.id.instagram);
        socialNetworkInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("http://www.instagram.com/dani_man666/");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntent);
            }
        });

        toolbarWidget.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(SocialNetwork.this,"Back Arrow Toolbar Image Icon Clicked",Toast.LENGTH_LONG).show();
                finish();
            }
        });


//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }


}
