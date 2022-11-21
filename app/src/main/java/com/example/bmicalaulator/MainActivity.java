package com.example.bmicalaulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText weight , height ;
    Button enter;
    TextView bni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
        enter  = findViewById(R.id.enert);
        bni = findViewById(R.id.txt);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Float w = Float.parseFloat(weight.getText().toString());
                Float h = Float.parseFloat(height.getText().toString());

                Float ans = (w/((h)*(h))) * 10000;
                bni.setText(""+ans);
            }
        });

        
    }
}