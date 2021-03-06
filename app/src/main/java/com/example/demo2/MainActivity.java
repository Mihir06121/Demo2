package com.example.demo2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG="MainActivity";
    private EditText editText;
    private EditText editTextpassword;
    private final String TEXT_CONTENTS = "TextContent";
    String st;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        Button reset = (Button) findViewById(R.id.reset);
        editText = (EditText) findViewById(R.id.editText);
        editTextpassword = (EditText) findViewById(R.id.editTextpassword);

        //String username = editText.getText().toString();
        //String password = editTextpassword.getText().toString();

        final String name = "Mihir";
        final String pass = "1234";
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( (editText.getText().toString().equals(name)) &&
                        (editTextpassword.getText().toString().equals(pass)))
                {
                    Intent intent = new Intent (MainActivity.this, Main2Activity.class);
                    st=editText.getText().toString();
                    intent.putExtra("Value",st);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Welcome Mihir", Toast.LENGTH_SHORT).show();
                    Log.d(TAG, "Correct ");

                }
                else
                {
                    Toast.makeText(MainActivity.this, "Invalid Username or Password", Toast.LENGTH_SHORT).show();
                    //editText.append("Not same");
                    Log.d(TAG, "Incorrect ");
                }
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
                editTextpassword.setText("");
            }
        });

    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart: in");
        super.onStart();
        Log.d(TAG, "onStart: out");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        Log.d(TAG, "onRestoreInstanceState: in");
        super.onRestoreInstanceState(savedInstanceState);
        String saveString = savedInstanceState.getString(TEXT_CONTENTS);
        editText.setText(saveString);
        Log.d(TAG, "onRestoreInstanceState: out");
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "onRestart: in");
        super.onRestart();
        Log.d(TAG, "onRestart: out");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.d(TAG, "onSaveInstanceState: in");
        outState.putString(TEXT_CONTENTS, editText.getText().toString());
        super.onSaveInstanceState(outState);
        editText.setText("");
        editTextpassword.setText("");
        Log.d(TAG, "onSaveInstanceState: out");
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause: in");
        super.onPause();
        Log.d(TAG, "onPause: out");
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume: in");
        super.onResume();
        Log.d(TAG, "onResume: out");
    }

    @Override
    public void onStop() {
        Log.d(TAG, "onStop: in");
        super.onStop();
        Log.d(TAG, "onStop: out");
    }
}
