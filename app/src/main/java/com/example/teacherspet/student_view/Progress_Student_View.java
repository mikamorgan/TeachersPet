package com.example.teacherspet.student_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.teacherspet.R;

public class Progress_Student_View extends AppCompatActivity {

    /************************************************************************
     * TODO: Link XML file with Figma layout
     * TODO: Pass in attendance data for student from database
     * TODO: Display attendance progress in graphical way
     *
     * OPTIONAL EXTRAS:
     * TODO: Add calendar style view of attendance
     * TODO: Add conditional formatting (red for absent, green for present,
     * yellow for tardy, etc.)
     ************************************************************************/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_student);
    }
}