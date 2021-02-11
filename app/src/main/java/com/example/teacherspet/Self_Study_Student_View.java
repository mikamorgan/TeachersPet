package com.example.teacherspet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Self_Study_Student_View extends AppCompatActivity {

    private QuestionBank questionBank = new QuestionBank();

    private TextView scoreView;
    private TextView questionView;
    private Button choice1;
    private Button choice2;
    private Button choice3;
    private Button choice4;

    private String answer;
    private int score = 0;
    private int questionIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self__study_student);

        scoreView = (TextView)findViewById(score);
    }
}