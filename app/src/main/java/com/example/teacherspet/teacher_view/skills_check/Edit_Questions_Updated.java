package com.example.teacherspet.teacher_view.skills_check;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.teacherspet.R;
import com.example.teacherspet.student_view.skills_check.SC_Recursion;
import com.example.teacherspet.teacher_view.Main_Menu_Teacher_View;

public class Edit_Questions_Updated extends AppCompatActivity {

    private TextView mquestionView;

    //Create 4 buttons to hold each answer choice
    private Button mchoice1;
    private Button mchoice2;
    private Button mchoice3;
    private Button mchoice4;

    private Button back;

    public void openBack(){
        Intent intent = new Intent(this, Main_Menu_Teacher_View.class);
        String email = getIntent().getStringExtra("email");
        intent.putExtra("email", email);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit__questions__updated);

        String question = getIntent().getStringExtra("question");
        String choice1 = getIntent().getStringExtra("choice1");
        String choice2 = getIntent().getStringExtra("choice2");
        String choice3 = getIntent().getStringExtra("choice3");
        String choice4 = getIntent().getStringExtra("choice4");


        mquestionView = (TextView) findViewById(R.id.question);
        mchoice1 = (Button) findViewById(R.id.choice1);
        mchoice2 = (Button) findViewById(R.id.choice2);
        mchoice3 = (Button) findViewById(R.id.choice3);
        mchoice4 = (Button) findViewById(R.id.choice4);

        back = (Button) findViewById(R.id.back);

        mquestionView.setText(question);
        mchoice1.setText(choice1);
        mchoice2.setText(choice2);
        mchoice3.setText(choice3);
        mchoice4.setText(choice4);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    openBack();
                }
        });

    }
}