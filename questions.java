package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class questions extends AppCompatActivity {
    int correct = 0;
    RadioButton  answer_2, answer_3, answer_4;
    CheckBox answer_1;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        answer_1 = (CheckBox) findViewById(R.id.answer_1);
        answer_2 = (RadioButton) findViewById(R.id.answer_2);
        answer_3 = (RadioButton) findViewById(R.id.answer_3);
        answer_4 = (RadioButton) findViewById(R.id.answer_4);


    }


    /**
     * Increase the score by 20 point .
     */
    public void correctAns1(View v) {
        correct +=20;

    }

    /**
     * Increase the score by 20 point .
     */
    public void correctAns2(View v) {
        correct +=20;

    }
    /**
     * Increase the score by 20 point .
     */
    public void correctAns3(View v) {
        correct +=20;

    }
    /**
     * Increase the score by 20 point .
     */
    public void correctAns4(View v) {
        correct +=20;

    }




    /**
     * This method is called when the submit button is clicked
     */

   public void onClick(View v) {
       if (correct > 80) {
           correct = 80;
       }



       Toast.makeText(getApplicationContext(),  "You have scored " + correct +
                           " out of 80\n" + "thanks for finishing",
                   Toast.LENGTH_LONG).show();
       }


   }

