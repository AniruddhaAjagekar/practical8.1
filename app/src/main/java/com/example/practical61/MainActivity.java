package com.example.practical61;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] languages={"C","C++","Java","Android","Python","PHP",".Net","Javascript","HTML","CSS","DBMS",""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,languages);
        AutoCompleteTextView actv =(AutoCompleteTextView) findViewById(R.id.auto);
        actv.setThreshold(1);
        actv.setAdapter(adapter);
        actv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                {
                    Toast.makeText(getApplicationContext(), "selected item" + parent.getSelectedItem(), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}