package com.example.teacherspet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main_Menu_Student_View extends AppCompatActivity {

    public void openAttendance() {
        Intent intent = new Intent(this, Attendance_Student_View.class);
        startActivity(intent);
    }

    public void openLessons() {
        Intent intent = new Intent(this, Lessons_Student_View.class);
        startActivity(intent);
    }

    public void openSelf_Study() {
        Intent intent = new Intent(this, Self_Study_Student_View.class);
        startActivity(intent);
    }

    public void openProgress() {
        Intent intent = new Intent(this, Progress_Student_View.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_student);

        final Button attendanceButton = findViewById(R.id.attendance);
        final Button lessonsButton = findViewById(R.id.lessons);
        final Button self_studyButton = findViewById(R.id.self_study);
        final Button progressButton = findViewById(R.id.progress);

        attendanceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAttendance();
            }
        });

        lessonsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLessons();
            }
        });

        self_studyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSelf_Study();
            }
        });

        progressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProgress();
            }
        });
    }
}