package com.example.teacherspet.teacher_view.lessons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.teacherspet.R;

public class Edit_Lessons_Updated extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit__lessons__updated);

        String email = getIntent().getStringExtra("email");
        String position = getIntent().getStringExtra("position");
        String lesson = getIntent().getStringExtra("lesson");
        String title = getIntent().getStringExtra("title");
        String description = getIntent().getStringExtra("description");
        String link = getIntent().getStringExtra("link");


        Toast.makeText(getApplicationContext(), email, Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), position, Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), lesson, Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), description, Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), link, Toast.LENGTH_SHORT).show();
    }
}