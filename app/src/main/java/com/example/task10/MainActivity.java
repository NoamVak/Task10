package com.example.task10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener , AdapterView.OnItemSelectedListener {

    Spinner cont;
    ListView countries;
    TextView cap,theme,lang,pop;
    String contA[]=new String[4];
    String countryA[]=new String[7];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cont=(Spinner)findViewById(R.id.cont);
        countries=(ListView)findViewById(R.id.countries);
        cap=(TextView)findViewById(R.id.cap);
        pop=(TextView)findViewById(R.id.pop);
        theme=(TextView)findViewById(R.id.theme);
        lang=(TextView)findViewById(R.id.lang);

        cont.setOnItemSelectedListener(this);
        countries.setOnItemClickListener(this);
        countries.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        ArrayAdapter<String> spAdp= new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,contA);
        cont.setAdapter(spAdp);

        ArrayAdapter<String> lvAdp= new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,countryA);
        countries.setAdapter(lvAdp);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}