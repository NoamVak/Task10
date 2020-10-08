package com.example.task10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener , AdapterView.OnItemSelectedListener {

    Spinner cont;
    ListView countries;
    TextView cap,antheme,lang,pop;
    String [] contA;
    int row;
    String [][] countryA={{"Kenya","Ethiopia","Ghana","Nigeria","Morocco","Sudan","Egypt"},
            {"Japan","India","China","Thailand","South Korea","Vietnam","Nepal"},
            {"United states","Canada","Brazil","Mexico","Argentina","Cuba","Peru"},
            {"Germany","United Kingdom","Italy","France","Spain","Netherlands","Sweden"}};
    String [][] info={{"Nairobi","47,564,296","English/Swahili","O God of all creation"},
            {"Addis Ababa","109,224,414","Amharic","March Forward, Dear Mother Ethiopia"},
            {"Accra","31,072,940","English","God Bless Our Homeland Ghana"},
            {"Abuja","206,630,269","English","Arise, O Compatriots"},
            {"Rabat","36,472,000","Arabic/Berber","Cherifian Anthem"},
            {"Khartoum","41,592,539","Arabic/English","We are the Soldiers of God, the Soldiers of the Nation"},
            {"Cairo","100,075,480","Arabic","Bilady, Bilady, Bilady"},
            {"Tokyo","125,960,000","Japanese","Kimigayo"},
            {"New Delhi","1,352,642,280","Hindi/English","Thou Art the Ruler of the Minds of All People"},
            {"Beijing","1,400,050,000","Mandarin","March of the Volunteers"},
            {"Bangkok","66,558,935","Thai","Thai National Anthem"},
            {"Seoul","51,709,098","Korean","Aegukga"},
            {"Hanoi","96,208,984","Vietnamese","Army March"},
            {"Kathmandu","28,095,714","Nepali","Made of Hundreds of Flowers"},
            {"Washington D.C","328,239,523","English","The Star-Spangled Banner"},
            {"Ottawa","38,005,238","English/French","O Canada"},
            {"Brasília","210,147,125","Portuguese","Brazilian National Anthem"},
            {"Mexico City","128,649,565","Spanish","Mexican National Anthem"},
            {"Buenos Aires","44,938,712","Spanish","Argentine National Anthem"},
            {"Havana","11,193,470","Spanish","The Bayamo Song"},
            {"Lima","32,824,358","Spanish","National Anthem of Peru"},
            {"Berlin","83,166,711","German","Song of Germany"},
            {"London","67,886,004","English","God Save the Queen"},
            {"Rome","60,317,116","Italian","The Song of the Italians"},
            {"Paris","67,081,000","French","La Marseillaise"},
            {"Madrid","47,431,256","Spanish","Royal March"},
            {"Amsterdam","17,418,808 ","Dutch","William of Nassau"},
            {"Stockholm","10,343,403","Swedish","Thou ancient, thou free"}};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cont=(Spinner)findViewById(R.id.cont);
        countries=(ListView)findViewById(R.id.countries);
        cap=(TextView)findViewById(R.id.cap);
        pop=(TextView)findViewById(R.id.pop);
        antheme=(TextView)findViewById(R.id.antheme);
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

         if(row==2){
            switch (i){
                case 0:
                    cap.setText("Tokyo");
                    pop.setText("125,960,000");
                    lang.setText("Japanese");
                    antheme.setText( "Kimigayo");
                    break;
                case 1:
                    cap.setText("New Delhi");
                    pop.setText("1,352,642,280");
                    lang.setText("Hindi/English");
                    antheme.setText("Thou Art the Ruler of the Minds of All People");
                    break;
                case 2:
                    cap.setText("Accra");
                    pop.setText("31,072,940");
                    lang.setText("English");
                    antheme.setText("God Bless Our Homeland Ghana");
                    break;
                case 3:
                    cap.setText("Abuja");
                    pop.setText("206,630,269");
                    lang.setText("English");
                    antheme.setText("Arise, O Compatriots");
                    break;
                case 4:
                    cap.setText("Rabat");
                    pop.setText("36,472,000");
                    lang.setText("Arabic/Berber");
                    antheme.setText("Cherifian Anthem");
                    break;
                case 5:
                    cap.setText("Khartoum");
                    pop.setText("41,592,539");
                    lang.setText("Arabic/English");
                    antheme.setText("We are the Soldiers of God, the Soldiers of the Nation");
                    break;
                case 6:
                    cap.setText("Cairo");
                    pop.setText("100,075,480");
                    lang.setText("Arabic");
                    antheme.setText("Bilady, Bilady, Bilady");
                    break;
            }
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {


    }
}