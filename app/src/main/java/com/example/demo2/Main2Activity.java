package com.example.demo2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {
    private Button button_two;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent in = getIntent();
       // Bundle b = in.getExtras();
        //button_two.setText("Main 2");
        button_two = (Button) findViewById (R.id.button_two);
        button_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
