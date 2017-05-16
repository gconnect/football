package com.example.gconnect.footballscorecounterapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import java.util.ArrayList;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<CustomSpinner> list=new ArrayList<>();

        list.add(new CustomSpinner("Select Club",R.drawable.uefa));

        list.add(new CustomSpinner("Chelsea",R.drawable.chelsea));

        list.add(new CustomSpinner("Barcelona",R.drawable.barcelona));

        list.add(new CustomSpinner("Ac_Millan",R.drawable.ac_milan));

        Spinner sp=(Spinner)findViewById(R.id.spinnerA);

        SpinnerAdapter adapter=new SpinnerAdapter(this,

                R.layout.custom_spinner,R.id.txt,list);
                sp.setAdapter(adapter);






    }
}

