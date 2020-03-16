package com.ethiopia.app.jokes;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;

public class Comment extends AppCompatActivity {

    private static String url = "http://facebook.com";

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_amh1);
        setSupportActionBar(toolbar);

        webView = (WebView) findViewById(R.id.web_view);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // launching facebook comments activity
                openComment();
            }
        });

        // loading web page
        webView.loadUrl(url);
    }

    private void openComment() {
        Intent intent = new Intent(Comment.this, FbCommentsActivity.class);

        // passing the article url
        intent.putExtra("url", "http://www.androidhive.info/2016/06/android-firebase-integrate-analytics/");
        startActivity(intent);
    }


    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main_comments, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.amh_jokes:
                Intent intent = new Intent(Comment.this, Funy_Amahric1.class);
                startActivity(intent);
                break;

            case R.id.eng_jokes:
                intent = new Intent(Comment.this, Funy_English2.class);
                startActivity(intent);
                break;

            case R.id.other_jokes:
                intent = new Intent(Comment.this, Funy_Other3.class);
                startActivity(intent);
                break;

            case R.id.about_us:
                intent = new Intent(Comment.this, About_Us.class);
                startActivity(intent);
            case R.id.rateApp:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.ethiopia.app.jokes")));

                break;



            default:
                super.onOptionsItemSelected(item);
        }
        return true;
    }

}
