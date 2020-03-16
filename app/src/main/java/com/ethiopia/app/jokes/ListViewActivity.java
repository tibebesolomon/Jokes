package com.ethiopia.app.jokes;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.ethiopia.app.jokes.ListAdapter.SQLiteHelper;
import com.ethiopia.app.jokes.ListAdapter.SQLiteListAdapter;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    SQLiteHelper SQLITEHELPER;
    SQLiteDatabase SQLITEDATABASE;
    Cursor cursor;
    SQLiteListAdapter ListAdapter ;

    ArrayList<String> ID_ArrayList = new ArrayList<String>();
    ArrayList<String> NAME_ArrayList = new ArrayList<String>();
//    ArrayList<String> PHONE_NUMBER_ArrayList = new ArrayList<String>();
    ArrayList<String> SUBJECT_ArrayList = new ArrayList<String>();
    ListView LISTVIEW;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        LISTVIEW = (ListView) findViewById(R.id.listView1);

        SQLITEHELPER = new SQLiteHelper(this);

        LISTVIEW.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent sendIntent = new Intent();
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
//                sendIntent.putExtra(Intent.EXTRA_TEXT,MyOwnJokes.);

                intent.putExtra(Intent.EXTRA_TEXT,NAME_ArrayList.get(position).toString()+"\n\n"+SUBJECT_ArrayList.get(position).toString());
                Intent intent1=Intent.createChooser(intent,"Share");
                view.getContext().startActivity(intent1);
            }
        });

    }

    @Override
    protected void onResume() {

        ShowSQLiteDBdata() ;

        super.onResume();
    }

    private void ShowSQLiteDBdata() {

        SQLITEDATABASE = SQLITEHELPER.getWritableDatabase();

        cursor = SQLITEDATABASE.rawQuery("SELECT * FROM demoTableJokes", null);

        ID_ArrayList.clear();
        NAME_ArrayList.clear();
//        PHONE_NUMBER_ArrayList.clear();
        SUBJECT_ArrayList.clear();

        if (cursor.moveToFirst()) {
            do {
                ID_ArrayList.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.KEY_ID)));

                NAME_ArrayList.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.KEY_Name)));

//                PHONE_NUMBER_ArrayList.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.KEY_PhoneNumber)));

                SUBJECT_ArrayList.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.KEY_Subject)));

            } while (cursor.moveToNext());
        }

        ListAdapter = new SQLiteListAdapter(ListViewActivity.this,

                ID_ArrayList,
                NAME_ArrayList,
                SUBJECT_ArrayList

        );

        LISTVIEW.setAdapter(ListAdapter);

        cursor.close();
    }
}