package com.ethiopia.app.jokes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by tibsolg on 3/5/2017.
 */
public class ImageActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_image);

        Button btnImageAmh = (Button) findViewById(R.id.imageAmh_button1);
        Button btnImageEng=(Button)findViewById(R.id.imageEng_button2);
        Button btnImageOther=(Button)findViewById(R.id.imageOther_button3);

        btnImageAmh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ImageActivity.this, Amh_Image_Activity.class);
                startActivity(intent);
                //Start the feedback activity
//                Intent intent = new Intent(getApplicationContext(), About_Us.class);
            }
        });

        btnImageEng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ImageActivity.this, Eng_Image_Activity.class);
                startActivity(intent);
                //Start the feedback activity
//                Intent intent = new Intent(getApplicationContext(), About_Us.class);

            }
        });

        btnImageOther.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ImageActivity.this, Other_Image_Activity.class);
                startActivity(intent);
                //Start the feedback activity
//                Intent intent = new Intent(getApplicationContext(), About_Us.class);
            }
        });

    }
}
