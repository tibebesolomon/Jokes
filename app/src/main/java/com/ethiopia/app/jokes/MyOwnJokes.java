package com.ethiopia.app.jokes;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MyOwnJokes extends Activity {

    EditText GetName,GetPhoneNumber,GetSubject ;
    Button Submit, EditData, DisplayData;
    SQLiteDatabase SQLITEDATABASE;
    String Name, PhoneNumber, Subject ;
    Boolean CheckEditTextEmpty ;
    String SQLiteQuery ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_own_jokes);


        GetName = (EditText)findViewById(R.id.editText1);

//        GetPhoneNumber = (EditText)findViewById(R.id.editText2);

        GetSubject = (EditText)findViewById(R.id.editText3);

        Submit = (Button)findViewById(R.id.button_j1);

        EditData = (Button)findViewById(R.id.button_j2);

        DisplayData = (Button)findViewById(R.id.button_j3);

        Submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                DBCreate();

                SubmitData2SQLiteDB();

            }
        });

        EditData.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent intent = new Intent(MyOwnJokes.this, EditDataActivity.class);
                startActivity(intent);

            }
        });

        DisplayData.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent intent = new Intent(MyOwnJokes.this, ListViewActivity.class);
                startActivity(intent);

            }
        });
    }

    public void DBCreate(){

        SQLITEDATABASE = openOrCreateDatabase("Jokes", Context.MODE_PRIVATE, null);

        SQLITEDATABASE.execSQL("CREATE TABLE IF NOT EXISTS demoTableJokes(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, name VARCHAR,subject VARCHAR);");
    }

    public void SubmitData2SQLiteDB(){

        Name = GetName.getText().toString();

//        PhoneNumber = GetPhoneNumber.getText().toString();

        Subject = GetSubject.getText().toString();

        CheckEditTextIsEmptyOrNot(Name,Subject);

        if(CheckEditTextEmpty == true)
        {

            SQLiteQuery = "INSERT INTO demoTableJokes (name,subject) VALUES('"+Name+"','"+Subject+"');";

            SQLITEDATABASE.execSQL(SQLiteQuery);

            Toast.makeText(MyOwnJokes.this,"ቀልዶትን በተሳካ ሁኔታ ተመዝግቧል", Toast.LENGTH_LONG).show();

            ClearEditTextAfterDoneTask();

        }
        else {

            Toast.makeText(MyOwnJokes.this,"እባኮትን ቀልዶትን መጀመርያ ያስገቡ", Toast.LENGTH_LONG).show();
        }
    }

    public void CheckEditTextIsEmptyOrNot(String Name, String Subject){

        if(TextUtils.isEmpty(Name) || TextUtils.isEmpty(Subject)){

            CheckEditTextEmpty = false ;

        }
        else {
            CheckEditTextEmpty = true ;
        }
    }

    public void ClearEditTextAfterDoneTask(){

        GetName.getText().clear();
//        GetPhoneNumber.getText().clear();
        GetSubject.getText().clear();

    }

}
