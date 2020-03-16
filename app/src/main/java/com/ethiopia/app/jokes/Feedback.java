package com.ethiopia.app.jokes;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by tibsolg on 2/28/2017.
 */

public class Feedback extends Activity{

    EditText txtMessage;
    EditText txtEmail;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        txtMessage=(EditText)findViewById(R.id.txtComments);
        txtEmail=(EditText)findViewById(R.id.txtEmailAddress);

        Button startBtn = (Button) findViewById(R.id.sendEmail);
        startBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                sendEmail();


            }
        });
    }

    protected void sendEmail() {
        Log.i("Send email", "");
        String[] TO = {"itsc.tibebe.solomon@gmail.com"};
        String[] CC = {"Funny Jokes"};
        String message=txtMessage.getText().toString();
        String from=txtEmail.getText().toString();
        Intent emailIntent = new Intent(Intent.ACTION_SEND);

        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("message/rfc822");
        emailIntent.putExtra(Intent.EXTRA_TEXT, message);
        emailIntent.putExtra(Intent.EXTRA_EMAIL, from);
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Your subject");


        try {
            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
            finish();
            Log.i("Finished sending email...", "");
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(Feedback.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }
    }
}

