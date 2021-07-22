package sg.edu.rp.c346.id20014009.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView lv;
ArrayList<AndroidVersion> al;
//ArrayAdapter<AndroidVersion>aa;

CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lv=findViewById(R.id.lv);
        al=new ArrayList<AndroidVersion>();

        al.add(new AndroidVersion("Pie","9.0"));
/*
        al.add("Pie - 9.0");
        al.add("Oreo - 8.0 - 8.1");
        al.add("Nougat - 7.0 - 7.1.2");
        al.add("Marshmallow - 6.0 - 6.0.1");
        al.add("Lollipop - 5.0 - 5.1.1");
        al.add("KitKat - 4.4 - 4.4.4");
        al.add("JellyBean - 4.1 - 4.3.1");



*/       // aa=new ArrayAdapter(this, android.R.layout.simple_list_item_1,al);

        adapter=new CustomAdapter(this,R.layout.row,al);
        //lv.setAdapter(aa);

        lv.setAdapter(adapter);










    }
}