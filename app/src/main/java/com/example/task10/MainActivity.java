package com.example.task10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
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
    String [] contA;
    int row;
    String [][] countryA={{"Kenya","Ethiopia","Ghana","Nigeria","Morocco","Sudan","Egypt"},
            {"Japan","India","China","Thailand","South Korea","Vietnam","Nepal"},
            {"United states","Canada","Brazil","Mexico","Argentina","Cuba","Peru"},
            {"Germany","United Kingdom","Italy","France","Spain","Netherlands","Sweden"}};

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

        contA=getResources().getStringArray(R.array.cont);


        cont.setOnItemSelectedListener(this);
        countries.setOnItemClickListener(this);

        countries.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        ArrayAdapter<String> spAdp = new ArrayAdapter<String>(this,
                R.layout.support_simple_spinner_dropdown_item,contA);
        cont.setAdapter(spAdp);

        countries.setAdapter(null);
    }



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long rowid) {
        if(pos==0){
            countries.setAdapter(null);

        }
        else{
            ArrayAdapter<String> lvAdp= new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,countryA[pos-1]);
            countries.setAdapter(lvAdp);
            row=pos;
            countries.setOnItemClickListener(this);
        }

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long l) {


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {


    }
}