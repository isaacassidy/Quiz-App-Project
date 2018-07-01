package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import com.example.android.quizapp.R;
import com.example.android.quizapp.questions;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  openQuestions (View view ){
        EditText userName = findViewById(R.id.userName);

        if( TextUtils.isEmpty(userName.getText())){
            userName.setError( "Please enter your name!" );

        }else{
            Intent i = new Intent(MainActivity.this, questions.class);
            startActivity(i);
        }
    }



}
