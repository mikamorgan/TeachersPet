package com.example.teacherspet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SC_Binary_Trees extends AppCompatActivity {

    private QuestionBank questionBank = new QuestionBank();

    private TextView mscoreView;
    private TextView mquestionView;
    private Button mchoice1;
    private Button mchoice2;
    private Button mchoice3;
    private Button mchoice4;

    private String answer;
    private int score = 0;
    private int questionIndex = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_c__binary__trees);

        mscoreView = (TextView) findViewById(score);
        mquestionView = (TextView) findViewById(R.id.question);
        mchoice1 = (Button) findViewById(R.id.choice1);
        mchoice2 = (Button) findViewById(R.id.choice2);
        mchoice3 = (Button) findViewById(R.id.choice3);
        mchoice4 = (Button) findViewById(R.id.choice4);

        updateQuestions();

        mchoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mchoice1.getText() == answer) {
                    score++;
                    Toast.makeText(SC_Binary_Trees.this, "CORRECT!", Toast.LENGTH_SHORT);
                    updateQuestions();
                }
            }
        });

        mchoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mchoice2.getText() == answer) {
                    score++;
                    Toast.makeText(SC_Binary_Trees.this, "CORRECT!", Toast.LENGTH_SHORT);
                    updateQuestions();
                }
            }
        });

        mchoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mchoice3.getText() == answer) {
                    score++;
                    Toast.makeText(SC_Binary_Trees.this, "CORRECT!", Toast.LENGTH_SHORT);
                    updateQuestions();
                }
            }
        });

        mchoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mchoice4.getText() == answer) {
                    score++;
                    Toast.makeText(SC_Binary_Trees.this, "CORRECT!", Toast.LENGTH_SHORT);
                    updateQuestions();
                }
            }
        });

    }

    private void updateQuestions(){
        mquestionView.setText(questionBank.getQuestion(questionIndex));
        mchoice1.setText(questionBank.getChoice1(questionIndex));
        mchoice2.setText(questionBank.getChoice1(questionIndex));
        mchoice3.setText(questionBank.getChoice1(questionIndex));
        mchoice4.setText(questionBank.getChoice1(questionIndex));

        answer = questionBank.getCorrectAnswer(questionIndex);
        questionIndex++;
    }
}