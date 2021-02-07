package com.example.teacherspet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Main_Menu_Teacher_View extends AppCompatActivity {

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
        setContentView(R.layout.activity_main__menu__teacher__view);
    }
}