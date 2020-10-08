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
        if (row==1){
            switch (i){
                case 0:
                    cap.setText(info[0][0]);
                    pop.setText(info[0][1]);
                    lang.setText(info[0][2]);
                    antheme.setText(info[0][3]);
                    break;
                case 1:
                    cap.setText(info[1][0]);
                    pop.setText(info[1][1]);
                    lang.setText(info[1][2]);
                    antheme.setText(info[1][3]);
                    break;
                case 2:
                    cap.setText(info[2][0]);
                    pop.setText(info[2][1]);
                    lang.setText(info[2][2]);
                    antheme.setText(info[2][3]);
                    break;
                case 3:
                    cap.setText(info[3][0]);
                    pop.setText(info[3][1]);
                    lang.setText(info[3][2]);
                    antheme.setText(info[3][3]);
                    break;
                case 4:
                    cap.setText(info[4][0]);
                    pop.setText(info[4][1]);
                    lang.setText(info[4][2]);
                    antheme.setText(info[4][3]);
                    break;
                case 5:
                    cap.setText(info[5][0]);
                    pop.setText(info[5][1]);
                    lang.setText(info[5][2]);
                    antheme.setText(info[5][3]);
                    break;
                case 6:
                    cap.setText(info[6][0]);
                    pop.setText(info[6][1]);
                    lang.setText(info[6][2]);
                    antheme.setText(info[6][3]);
                    break;
            }
        }
        else if(row==2){
            switch (i){
                case 0:
                    cap.setText(info[7][0]);
                    pop.setText(info[7][1]);
                    lang.setText(info[7][2]);
                    antheme.setText(info[7][3]);
                    break;
                case 1:
                    cap.setText(info[8][0]);
                    pop.setText(info[8][1]);
                    lang.setText(info[8][2]);
                    antheme.setText(info[8][3]);
                    break;
                case 2:
                    cap.setText(info[9][0]);
                    pop.setText(info[9][1]);
                    lang.setText(info[9][2]);
                    antheme.setText(info[9][3]);
                    break;
                case 3:
                    cap.setText(info[10][0]);
                    pop.setText(info[10][1]);
                    lang.setText(info[10][2]);
                    antheme.setText(info[10][3]);
                    break;
                case 4:
                    cap.setText(info[11][0]);
                    pop.setText(info[11][1]);
                    lang.setText(info[11][2]);
                    antheme.setText(info[11][3]);
                    break;
                case 5:
                    cap.setText(info[12][0]);
                    pop.setText(info[12][1]);
                    lang.setText(info[12][2]);
                    antheme.setText(info[12][3]);
                    break;
                case 6:
                    cap.setText(info[13][0]);
                    pop.setText(info[13][1]);
                    lang.setText(info[13][2]);
                    antheme.setText(info[13][3]);
                    break;
            }
        }
        else if(row==3){
            switch (i){
                case 0:
                    cap.setText(info[14][0]);
                    pop.setText(info[14][1]);
                    lang.setText(info[14][2]);
                    antheme.setText(info[14][3]);
                    break;
                case 1:
                    cap.setText(info[15][0]);
                    pop.setText(info[15][1]);
                    lang.setText(info[15][2]);
                    antheme.setText(info[15][3]);
                    break;
                case 2:
                    cap.setText(info[16][0]);
                    pop.setText(info[16][1]);
                    lang.setText(info[16][2]);
                    antheme.setText(info[16][3]);
                    break;
                case 3:
                    cap.setText(info[17][0]);
                    pop.setText(info[17][1]);
                    lang.setText(info[17][2]);
                    antheme.setText(info[17][3]);
                    break;
                case 4:
                    cap.setText(info[18][0]);
                    pop.setText(info[18][1]);
                    lang.setText(info[18][2]);
                    antheme.setText(info[18][3]);
                    break;
                case 5:
                    cap.setText(info[19][0]);
                    pop.setText(info[19][1]);
                    lang.setText(info[19][2]);
                    antheme.setText(info[19][3]);
                    break;
                case 6:
                    cap.setText(info[20][0]);
                    pop.setText(info[20][1]);
                    lang.setText(info[20][2]);
                    antheme.setText(info[20][3]);
                    break;
            }
        }
        else if(row==4){
            switch (i){
                case 0:
                    cap.setText(info[21][0]);
                    pop.setText(info[21][1]);
                    lang.setText(info[21][2]);
                    antheme.setText(info[21][3]);
                    break;
                case 1:
                    cap.setText(info[22][0]);
                    pop.setText(info[22][1]);
                    lang.setText(info[22][2]);
                    antheme.setText(info[22][3]);
                    break;
                case 2:
                    cap.setText(info[23][0]);
                    pop.setText(info[23][1]);
                    lang.setText(info[23][2]);
                    antheme.setText(info[23][3]);
                    break;
                case 3:
                    cap.setText(info[24][0]);
                    pop.setText(info[24][1]);
                    lang.setText(info[24][2]);
                    antheme.setText(info[24][3]);
                    break;
                case 4:
                    cap.setText(info[25][0]);
                    pop.setText(info[25][1]);
                    lang.setText(info[25][2]);
                    antheme.setText(info[25][3]);
                    break;
                case 5:
                    cap.setText(info[26][0]);
                    pop.setText(info[26][1]);
                    lang.setText(info[26][2]);
                    antheme.setText(info[26][3]);
                    break;
                case 6:
                    cap.setText(info[27][0]);
                    pop.setText(info[27][1]);
                    lang.setText(info[27][2]);
                    antheme.setText(info[27][3]);
                    break;
            }
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {


    }
}