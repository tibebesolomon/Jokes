package com.ethiopia.app.jokes;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;

public class Setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_amh1);
        setSupportActionBar(toolbar);

        Button btn=(Button)findViewById(R.id.fontsize);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Setting.this, com.ethiopia.app.jokes.SharedPreferences.class);
                startActivity(intent);
                //Start the feedback activity
//                Intent intent = new Intent(getApplicationContext(), About_Us.class);

            }
        });


//
//        ListAdapter cityAdapter=new ArrayAdapter<String>(this,R.layout.content_setting,Cities);
//
//        cityListView.setAdapter(city);

        ImageView icon=new ImageView(this);
        icon.setImageResource(R.drawable.plus);

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


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("http://www.facebook.com/tib.solg?");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntent);
//                Toast.makeText(Setting.this,"Alarm Icon Clicked",Toast.LENGTH_LONG).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                intent = new Intent(Funy_Amahric1.this, Funy_Other3.class);
//                startActivity(intent);
                Uri webpage = Uri.parse("http://www.twitter.com");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("http://www.instagram.com/dani_man666/");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntent);
            }
        });

    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main_setting, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.amh_jokes:
                Intent intent = new Intent(Setting.this, Funy_Amahric1.class);
                startActivity(intent);
                break;

            case R.id.eng_jokes:
                intent = new Intent(Setting.this, Funy_English2.class);
                startActivity(intent);
                break;

            case R.id.other_jokes:
                intent = new Intent(Setting.this, Funy_Other3.class);
                startActivity(intent);
                break;

            case R.id.about_us:
                intent = new Intent(Setting.this, About_Us.class);
                startActivity(intent);
                break;
            case R.id.action_Suggestion:
                intent = new Intent(Setting.this, Comment.class);
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