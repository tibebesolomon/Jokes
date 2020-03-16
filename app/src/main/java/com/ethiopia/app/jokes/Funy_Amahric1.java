package com.ethiopia.app.jokes;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.ethiopia.app.jokes.Fragments.Amh_Life_Jokes;
import com.ethiopia.app.jokes.Fragments.Amh_School_jokes;
import com.ethiopia.app.jokes.Fragments.Amh_Working_Jokes;

import java.io.File;

public class Funy_Amahric1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amahric1);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_amh1);
        toolbar.setNavigationIcon(R.drawable.ic_action_back);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
        ViewPager vp = (ViewPager) findViewById(R.id.pager_amh1);
        this.addPages(vp);


        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_amh1);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setupWithViewPager(vp);
        tabLayout.setOnTabSelectedListener(listener(vp));
    }

    private void addPages(ViewPager pager)
    {
        MyFragPagerAdapter adapter=new MyFragPagerAdapter(getSupportFragmentManager());
        adapter.addPage(new Amh_Life_Jokes());
        adapter.addPage(new Amh_School_jokes());
        adapter.addPage(new Amh_Working_Jokes());
        pager.setAdapter(adapter);
    }
    private TabLayout.OnTabSelectedListener listener(final ViewPager pager)
    {
        return new TabLayout.OnTabSelectedListener(){

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        };

    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main_amh, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.eng_jokes:
                Intent intent = new Intent(Funy_Amahric1.this, Funy_English2.class);
                startActivity(intent);
                break;

            case R.id.other_jokes:
                intent = new Intent(Funy_Amahric1.this, Funy_Other3.class);
                startActivity(intent);
                break;

            case R.id.action_settings:
                intent = new Intent(Funy_Amahric1.this, Setting.class);
                startActivity(intent);
                break;

            case R.id.about_us:
                intent = new Intent(Funy_Amahric1.this, About_Us.class);
                startActivity(intent);
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

                break;

            case R.id.action_Suggestion:
                openComment();
                break;

            case R.id.rateApp:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.ethiopia.app.jokes")));

                break;



            default:
                super.onOptionsItemSelected(item);
        }
        return true;
    }

    private void openComment() {
        Intent intent = new Intent(Funy_Amahric1.this, FbCommentsActivity.class);

        // passing the article url
//        intent.putExtra("url", "http://www.androidhive.info/2016/06/android-firebase-integrate-analytics/");
        startActivity(intent);
    }


}

//GOTO.setOnClickListener(new View.OnClickListener() {
//
//@Override
//public void onClick(View v) {
//        // TODO Auto-generated method stub
//
//        switch (SpinnerValue) {
//
//        case "አገርኛ ቀልዶች":
//        intent = new Intent(MainActivity.this, Funy_Amahric1.class);
//        startActivity(intent);
//        break;
//
//        case "የባህር ማዶ ቀልዶች":
//        intent = new Intent(MainActivity.this, Funy_English2.class);
//        startActivity(intent);
//        break;
//
//        case "ከ 18 አመት ለሚሆኑ ቀልዶች":
//        intent = new Intent(MainActivity.this, Funy_Other3.class);
//        startActivity(intent);
//        break;