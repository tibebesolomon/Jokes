package com.ethiopia.app.jokes;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;

import java.io.File;

public class About_Us extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about__us);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_amh1);
        toolbar.setNavigationIcon(R.drawable.ic_action_back);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ImageView image = (ImageView) findViewById(R.id.about_usImage);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
        image.startAnimation(animation);





        TextView txt = (TextView) findViewById(R.id.contact_us);
        txt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(About_Us.this, Feedback.class);
                startActivity(intent);
                //Start the feedback activity
//                Intent intent = new Intent(getApplicationContext(), About_Us.class);

            }
        });

        TextView txt2 = (TextView) findViewById(R.id.contact_call);
        txt2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri number = Uri.parse("tel:+251929140168");
                Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                startActivity(callIntent);
            }
        });


        ImageView icon=new ImageView(this);
        icon.setImageResource(R.drawable.ic_add_circle_black_48dp);

        com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton actionButton = new com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton.Builder(this)
                .setContentView(icon)
                .build();
        SubActionButton.Builder itemBuilder=new SubActionButton.Builder(this);

        ImageView itemIcon1=new ImageView(this);
        itemIcon1.setImageResource(R.drawable.facebook);

        ImageView itemIcon2=new ImageView(this);
        itemIcon2.setImageResource(R.drawable.twitter);

        ImageView itemIcon3=new ImageView(this);
        itemIcon3.setImageResource(R.drawable.instagram);

        SubActionButton button1=itemBuilder.setContentView(itemIcon1).build();
        SubActionButton button2=itemBuilder.setContentView(itemIcon2).build();
        SubActionButton button3=itemBuilder.setContentView(itemIcon3).build();

        FloatingActionMenu actionMenu=new FloatingActionMenu.Builder(this)
                .addSubActionView(button1)
                .addSubActionView(button2)
                .addSubActionView(button3)
                .attachTo(actionButton)
                .build();


        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("http://www.facebook.com/tib.solg?");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntent);
//                Toast.makeText(Setting.this,"Alarm Icon Clicked",Toast.LENGTH_LONG).show();
            }
        });

        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
//                intent = new Intent(Funy_Amahric1.this, Funy_Other3.class);
//                startActivity(intent);
                Uri webpage = Uri.parse("http://www.twitter.com");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntent);
            }
        });

        button3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("http://www.instagram.com/dani_man666/");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntent);
            }
        });


        Button btnSendFeedback = (Button) findViewById(R.id.btnSendFeedback);
        btnSendFeedback.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(About_Us.this, Feedback.class);
                startActivity(intent);
                //Start the feedback activity
//                Intent intent = new Intent(getApplicationContext(), About_Us.class);

            }
        });

        Button appInfo = (Button) findViewById(R.id.app_info);
        appInfo.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(About_Us.this, App_Info.class);
                startActivity(intent);
                //Start the feedback activity
//                Intent intent = new Intent(getApplicationContext(), About_Us.class);

            }
        });

        Button about_us = (Button) findViewById(R.id.about_our);
        about_us.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater=(LayoutInflater)About_Us.this.getSystemService(LAYOUT_INFLATER_SERVICE);
                View layout=inflater.inflate(R.layout.about,(ViewGroup)findViewById(R.id.root));
                AlertDialog.Builder adb=new AlertDialog.Builder(About_Us.this);
                adb.setView(layout);
                adb.show();
            }
        });

        Button socialNetwork=(Button)findViewById(R.id.socialnetwork);
        socialNetwork.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(About_Us.this,SocialNetwork.class);
                startActivity(intent);
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

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main_aboutus, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){

            case R.id.eng_jokes:
                Intent intent = new Intent(About_Us.this, Funy_English2.class);
                startActivity(intent);
                break;

            case R.id.other_jokes:
                intent = new Intent(About_Us.this, Funy_Other3.class);
                startActivity(intent);
                break;

            case R.id.action_settings:
                intent = new Intent(About_Us.this, Setting.class);
                startActivity(intent);
                break;

            case R.id.amh_jokes:
                intent = new Intent(About_Us.this, Funy_Amahric1.class);
                startActivity(intent);
                break;

            case R.id.action_Suggestion:
                openComment();
                break;

            case R.id.action_share:
                try {
                    PackageManager pm=getPackageManager();
                    ApplicationInfo ai=pm.getApplicationInfo(getPackageName(), 0);
                    File srcFile=new File(ai.publicSourceDir);
                    Intent share=new Intent();
                    share.setAction(Intent.ACTION_SEND);
                    share.setType("application/com.example.tibsolg.pray");
                    share.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(srcFile));
                    startActivity(Intent.createChooser(share,"Share"));
                }catch (Exception e){
                    Log.e("shareApp", e.getMessage());
                }

            case R.id.rateApp:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.ethiopia.app.jokes")));

                break;



            default:
                super.onOptionsItemSelected(item);
        }
        return true;
    }
    private void openComment() {
        Intent intent = new Intent(this, FbCommentsActivity.class);

        // passing the article url
//        intent.putExtra("url", "http://www.androidhive.info/2016/06/android-firebase-integrate-analytics/");
        startActivity(intent);
    }

}



