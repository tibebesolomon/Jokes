package com.ethiopia.app.jokes;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;



public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    String[] SPINNERVALUES = {"አገርኛ ቀልዶች","የባህር ማዶ ቀልዶች","ከ 18+ ቀልዶች"};
    String SpinnerValue;
    Button GOTO;
    Intent intent;


    public static Context getContext() {
        return getContext();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button btn=(Button)findViewById(R.id.imageButton1);
//        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
//        btn.startAnimation(animation);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, ImageActivity.class);
//                startActivity(intent);
//                //Start the feedback activity
////                Intent intent = new Intent(getApplicationContext(), About_Us.class);
//
//            }
//        });


        Button btnSendOwnJokes = (Button) findViewById(R.id.ownJokes);
//        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
//        btnSendOwnJokes.startAnimation(animation);
        btnSendOwnJokes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MyOwnJokes.class);
                startActivity(intent);
                //Start the feedback activity
//                Intent intent = new Intent(getApplicationContext(), About_Us.class);
            }
        });


         spinner = (Spinner) findViewById(R.id.spinner1);

        GOTO = (Button) findViewById(R.id.button1);





        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, SPINNERVALUES);

        spinner.setAdapter(adapter);

        //Adding setOnItemSelectedListener method on spinner.
        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {


            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

                SpinnerValue = (String) spinner.getSelectedItem();
            }



            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }



        });


        GOTO.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                switch (SpinnerValue) {

                    case "አገርኛ ቀልዶች":
                        intent = new Intent(MainActivity.this, Funy_Amahric1.class);
                        startActivity(intent);
                        break;

                    case "የባህር ማዶ ቀልዶች":
                        intent = new Intent(MainActivity.this, Funy_English2.class);
                        startActivity(intent);
                        break;

                    case "ከ 18+ ቀልዶች":
                        intent = new Intent(MainActivity.this, Funy_Other3.class);
                        startActivity(intent);
                        break;



                }

            }

        });


    }
    public void onBackPressed(){

        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("ከዚ አፓልኬሽን መውጣት ይፈልጋሉ？");
        builder.setPositiveButton("እፈልጋለው", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();

            }
        });
        builder.setNegativeButton("አልፈልግም", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alert=builder.create();
        alert.show();
    }
//    public void onButtonClick(View v){
//
//        switch (v.getId()){
//
//            case R.id.button:
//                Intent intent = new Intent(MainActivity.this,);
//                startActivity(intent);
//                break;
//        }
//
//    }
//

//    public boolean onCreateOptionsMenu(Menu menu){
//        getMenuInflater().inflate(R.menu.menu_main_amh,menu);
//        return true;
//    }
//    public boolean onOptionsItemSelected(MenuItem item){
//        switch (item.getItemId()){
//            case R.id.android:
//                Toast.makeText(getApplicationContext(), "Android Clicked", Toast.LENGTH_LONG).show();
//                return true;
//
//            case R.id.php:
//                Toast.makeText(getApplicationContext(),"Php Clicked",Toast.LENGTH_LONG).show();
//                return true;
//
//            case R.id.blogger:
//                Toast.makeText(getApplicationContext(),"Blogger Clicked",Toast.LENGTH_LONG).show();
//                return true;
//
//            default:
//                super.onOptionsItemSelected(item);
//        }
//        return true;
//    }

    }
