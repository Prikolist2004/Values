package com.example.strani_dengi_stolici;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listView = (ListView) this.findViewById(R.id.listViews);

        ArrayList<DataFlags> list = new ArrayList<>();



        list.add(new DataFlags(R.drawable.ru, R.string.russian, R.string.russianRUB, R.string.capitalRU));
        list.add(new DataFlags(R.drawable.rs, R.string.rs, R.string.rsV, R.string.capitalrs));
        list.add(new DataFlags(R.drawable.tr, R.string.tr, R.string.trv, R.string.capitaltr));
       list.add(new DataFlags(R.drawable.jp, R.string.jp, R.string.jpV, R.string.capitalJP));
       list.add(new DataFlags(R.drawable.de, R.string.de, R.string.dev, R.string.capitalde));
       list.add(new DataFlags(R.drawable.ee, R.string.ee, R.string.eev, R.string.capitalee));


        MyListAdapter myListAdapter = new MyListAdapter(this, list);
        listView.setAdapter(myListAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}