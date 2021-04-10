package com.example.teacherspet.teacher_view.skills_check;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.teacherspet.R;
import com.example.teacherspet.student_view.skills_check.QuestionBank;

public class Edit_Questions extends AppCompatActivity {

    private QuestionBank questionBank = new QuestionBank();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit__questions);

        final EditText new_question = findViewById(R.id.new_question);
        final EditText new_choice1 = findViewById(R.id.new_choice1);
        final EditText new_choice2 = findViewById(R.id.new_choice2);
        final EditText new_choice3 = findViewById(R.id.new_choice3);
        final EditText new_choice4 = findViewById(R.id.new_choice4);

        final Button save = findViewById(R.id.save);

        String index = getIntent().getStringExtra("index");
        int questionIndex = Integer.parseInt(index);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String question = new_question.getText().toString();
                String choice1 = new_choice1.getText().toString();
                String choice2 = new_choice2.getText().toString();
                String choice3 = new_choice3.getText().toString();
                String choice4 = new_choice4.getText().toString();

                questionBank.setQuestion(questionIndex, question);

                questionBank.setChoice1(questionIndex, choice1);
                questionBank.setChoice2(questionIndex, choice2);
                questionBank.setChoice3(questionIndex, choice3);
                questionBank.setChoice4(questionIndex, choice4);
            }
        });
    }
}