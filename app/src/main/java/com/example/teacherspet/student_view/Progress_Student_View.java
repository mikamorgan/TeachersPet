package com.example.teacherspet.student_view;
/************************************************************************
 * IMPORTS :
 *          imports the bundle packages for the buttons UI interaction
 *          of the app.
 *

 ************************************************************************/
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.example.teacherspet.R;

public class Progress_Student_View extends AppCompatActivity {

    /************************************************************************
     * TODO: Link XML file with Figma layout
     * TODO: Pass in attendance data for student from database
     * TODO: Display attendance progress in graphical way
     ************************************************************************/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_student);

        final ProgressBar attendance_bar = (ProgressBar) findViewById(R.id.attendance_bar);
        final ProgressBar quiz_bar = (ProgressBar) findViewById(R.id.quiz_bar);

        attendance_bar.setVisibility(View.VISIBLE);
        quiz_bar.setVisibility(View.VISIBLE);

        int progress = 0;

        attendance_bar.setProgress(progress);
        quiz_bar.setProgress(5);
    }
}