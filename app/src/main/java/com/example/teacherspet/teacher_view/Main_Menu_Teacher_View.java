package com.example.teacherspet.teacher_view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.teacherspet.R;
import com.example.teacherspet.student_view.Attendance_Student_View;
import com.example.teacherspet.student_view.Lessons_Student_View;
import com.example.teacherspet.student_view.Progress_Student_View;
import com.example.teacherspet.student_view.Self_Study_Student_View;

public class Main_Menu_Teacher_View extends AppCompatActivity {

    /************************************************************************
     * TODO: Create activity pages for all teacher view functions
     * TODO: Update button links to navigate to teacher view pages
     * TODO: Add option to select course (separate activity page?)
     * TODO: Create four buttons for each functionality
     *
     * OPTIONAL EXTRAS:
     * TODO: Link the teacher's profile picture
     * (right now a default avatar displays in the top right)
     * TODO: Display the teacher's name
     * (right now there is a default name placeholder in the top right)
     * TODO: Add a back button with functionality
     ************************************************************************/
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