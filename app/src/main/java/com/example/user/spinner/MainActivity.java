package com.example.user.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner spins;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spins = (Spinner) findViewById(R.id.spinn);
        ArrayList<String> spn = new ArrayList<>();
        ArrayAdapter<String> spnr = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, spn);
        spn.add("");
        spn.add("Samsung");
        spn.add("HTC");
        spn.add("IPhone");
        spins.setAdapter(spnr);
    }
}


