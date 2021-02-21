package com.example.teacherspet.student_view;
/************************************************************************
 * IMPORTS :
 *          imports the classes for the Skills Checks pages and the
 *          bundle packages for the buttons UI interaction of the app.
 *

 ************************************************************************/
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.teacherspet.R;
import com.example.teacherspet.student_view.skills_check.SC_Algorithms;
import com.example.teacherspet.student_view.skills_check.SC_Binary_Trees;
import com.example.teacherspet.student_view.skills_check.SC_Lists;
import com.example.teacherspet.student_view.skills_check.SC_Pointers;
import com.example.teacherspet.student_view.skills_check.SC_Recursion;
import com.example.teacherspet.student_view.skills_check.SC_Review;
import com.example.teacherspet.student_view.skills_check.SC_Stacks;

public class Self_Study_Student_View extends AppCompatActivity {
    /************************************************************************
     * TODO: add back button

     ************************************************************************/
    /**
     * This class is for student view. It links the individual
     * to self study quizzes for 7 topics.
     */

    /******************************************************************
     * This method is called when the corresponding button is pressed.
     * The application opens the link to the internal Algorithms page
     * with quizzes for the student to view.
     ******************************************************************/
    public void openAlgorithms() {
        Intent intent = new Intent(this, SC_Algorithms.class);
        startActivity(intent);
    }
    /******************************************************************
     * This method is called when the corresponding button is pressed.
     * The application opens the link to the internal Binary Trees page
     * with quizzes for the student to view.
     ******************************************************************/
    public void openBinary() {
        Intent intent = new Intent(this, SC_Binary_Trees.class);
        startActivity(intent);
    }
    /******************************************************************
     * This method is called when the corresponding button is pressed.
     * The application opens the link to the internal Lists page
     * with quizzes for the student to view.
     ******************************************************************/
    public void openLists() {
        Intent intent = new Intent(this, SC_Lists.class);
        startActivity(intent);
    }
    /******************************************************************
     * This method is called when the corresponding button is pressed.
     * The application opens the link to the internal Pointers page
     * with quizzes for the student to view.
     ******************************************************************/
    public void openPointers() {
        Intent intent = new Intent(this, SC_Pointers.class);
        startActivity(intent);
    }
    /******************************************************************
     * This method is called when the corresponding button is pressed.
     * The application opens the link to the internal Recursion page
     * with quizzes for the student to view.
     ******************************************************************/
    public void openRecursion() {
        Intent intent = new Intent(this, SC_Recursion.class);
        startActivity(intent);
    }
    /******************************************************************
     * This method is called when the corresponding button is pressed.
     * The application opens the link to the internal 1044 Review page
     * with quizzes for the student to view.
     ******************************************************************/
    public void openReview() {
        Intent intent = new Intent(this, SC_Review.class);
        startActivity(intent);
    }
    /******************************************************************
     * This method is called when the corresponding button is pressed.
     * The application opens the link to the internal Stacks page
     * with quizzes for the student to view.
     ******************************************************************/
    public void openStacks() {
        Intent intent = new Intent(this, SC_Stacks.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //When the activity is created, link to the scrollable XML layout file,self_study_student
        setContentView(R.layout.activity_self__study_student);

        //Create the 7 lesson buttons
        final Button algorithmButton = findViewById(R.id.algo);
        final Button binaryButton = findViewById(R.id.binary);
        final Button listButton = findViewById(R.id.lists);
        final Button pointersButton = findViewById(R.id.pointers);
        final Button recursionButton = findViewById(R.id.recursion);
        final Button reviewButton = findViewById(R.id.review);
        final Button stacksButton = findViewById(R.id.stacks);

        /****************************************************************************
         *  OnClickListener checks to see if the Algorithm button is pressed
         *
         *  If the button is pressed, open the Student Skills check in a new tab
         ***************************************************************************/
        algorithmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlgorithms();
            }
        });
        /****************************************************************************
         *  OnClickListener checks to see if the Binary Tree button is pressed
         *
         *  If the button is pressed, open the Student Skills check in a new tab
         ***************************************************************************/
        binaryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBinary();
            }
        });
        /****************************************************************************
         *  OnClickListener checks to see if the Lists button is pressed
         *
         *  If the button is pressed, open the Student Skills check in a new tab
         ***************************************************************************/
        listButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLists();
            }
        });
        /****************************************************************************
         *  OnClickListener checks to see if the Pointers button is pressed
         *
         *  If the button is pressed, open the Student Skills check in a new tab
         ***************************************************************************/
        pointersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPointers();
            }
        });
        /****************************************************************************
         *  OnClickListener checks to see if the Recursion button is pressed
         *
         *  If the button is pressed, open the Student Skills check in a new tab
         ***************************************************************************/
        recursionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRecursion();
            }
        });
        /****************************************************************************
         *  OnClickListener checks to see if the 1044 Review button is pressed
         *
         *  If the button is pressed, open the Student Skills check in a new tab
         ***************************************************************************/
        reviewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openReview();
            }
        });
        /****************************************************************************
         *  OnClickListener checks to see if the Stacks button is pressed
         *
         *  If the button is pressed, open the Student Skills check in a new tab
         ***************************************************************************/
        stacksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStacks();
            }
        });

    }
}