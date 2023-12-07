package com.example.laba;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Secondactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);


        String surname = getIntent().getStringExtra("surname");
        TextView textView = findViewById(R.id.textView3);
        textView.setText("Переданный параметр: " + surname);
    }
}


