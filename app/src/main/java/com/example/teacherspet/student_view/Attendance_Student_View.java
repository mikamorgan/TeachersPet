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


public class Attendance_Student_View extends AppCompatActivity {
    /************************************************************************
     * TODO: Create scrollable Layout
     * TODO: Connect app to camera of users phone
     * TODO: Add buttons and link to QR code scan.
     * TODO: return data to API backend
     ************************************************************************/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //When the activity is created, link to the scrollable XML layout file,attendance_student
        setContentView(R.layout.activity_attendance_student);
    }
}