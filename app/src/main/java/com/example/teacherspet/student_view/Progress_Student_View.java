package com.example.teacherspet.student_view;
/************************************************************************
 * IMPORTS :
 *          imports the bundle packages for the buttons UI interaction
 *          of the app.
 *

 ************************************************************************/
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

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
    }
}