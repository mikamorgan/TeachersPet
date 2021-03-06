package com.example.teacherspet.student_view;
/************************************************************************
 * IMPORTS :
 *          imports the bundle packages for the buttons UI interaction
 *          of the app.
 *

 ************************************************************************/
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.teacherspet.R;

/************************************************************************
 * OPTIONAL EXTRAS:
 * TODO: Link the student's profile picture
 * (right now a default avatar displays in the top right)
 * TODO: Display the student's name
 * (right now there is a default name placeholder in the top right)
 * TODO: Add a back button with functionality
 ************************************************************************/

public class Main_Menu_Student_View extends AppCompatActivity {

    /******************************************************************
     * This method is called when the corresponding button is pressed.
     * The application opens the link to the attendance page in TP
     ******************************************************************/
    public void openAttendance() {
        Intent intent = new Intent(this, Attendance_Student_View.class);
        startActivity(intent);
    }

    /******************************************************************
     * This method is called when the corresponding button is pressed.
     * The application opens the link to the lessons page in TP
     ******************************************************************/
    public void openLessons() {
        Intent intent = new Intent(this, Lessons_Student_View.class);
        startActivity(intent);
    }

    /******************************************************************
     * This method is called when the corresponding button is pressed.
     * The application opens the link to the skills check page in TP
     ******************************************************************/
    public void openSelf_Study() {
        Intent intent = new Intent(this, Self_Study_Student_View.class);
        startActivity(intent);
    }

    /******************************************************************
     * This method is called when the corresponding button is pressed.
     * The application opens the link to the progress page in TP
     ******************************************************************/
    public void openProgress() {
        Intent intent = new Intent(this, Progress_Student_View.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //When the activity is created, link to the XML layout file main_student
        setContentView(R.layout.activity_main_student);

        //Create the 4 buttons to navigate to the other activity pages
        final Button attendanceButton = findViewById(R.id.attendance);
        final Button lessonsButton = findViewById(R.id.lessons);
        final Button self_studyButton = findViewById(R.id.self_study);
        final Button progressButton = findViewById(R.id.progress);

        /****************************************************************************
         *  OnClickListener checks to see if a button is pressed
         *
         *  If the button is pressed, navigate to the attendance page
         ***************************************************************************/
        attendanceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAttendance();
            }
        });

        /****************************************************************************
         *  OnClickListener checks to see if a button is pressed
         *
         *  If the button is pressed, navigate to the lessons page
         ***************************************************************************/
        lessonsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLessons();
            }
        });

        /****************************************************************************
         *  OnClickListener checks to see if a button is pressed
         *
         *  If the button is pressed, navigate to the skills check page
         ***************************************************************************/
        self_studyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSelf_Study();
            }
        });

        /****************************************************************************
         *  OnClickListener checks to see if a button is pressed
         *
         *  If the button is pressed, navigate to the progress page
         ***************************************************************************/
        progressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProgress();
            }
        });
    }
}