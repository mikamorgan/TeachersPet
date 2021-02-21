package com.example.teacherspet.student_view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.teacherspet.R;
import com.example.teacherspet.student_view.lessons.L_Algorithms;
import com.example.teacherspet.student_view.lessons.L_Binary_Trees;
import com.example.teacherspet.student_view.lessons.L_Lists;
import com.example.teacherspet.student_view.lessons.L_Pointers;
import com.example.teacherspet.student_view.lessons.L_Recursion;
import com.example.teacherspet.student_view.lessons.L_Review;
import com.example.teacherspet.student_view.lessons.L_Stacks;
import com.example.teacherspet.student_view.skills_check.SC_Algorithms;
import com.example.teacherspet.student_view.skills_check.SC_Binary_Trees;
import com.example.teacherspet.student_view.skills_check.SC_Lists;
import com.example.teacherspet.student_view.skills_check.SC_Pointers;
import com.example.teacherspet.student_view.skills_check.SC_Recursion;
import com.example.teacherspet.student_view.skills_check.SC_Review;
import com.example.teacherspet.student_view.skills_check.SC_Stacks;

public class Lessons_Student_View extends AppCompatActivity {
    /************************************************************************
     * TODO: add back button

     ************************************************************************/
    /**
     * This class is for student view. It links the individual
     * lesson plan buttons to their pages. There are 7 Topics that
     * are covered and each topic has their own page.
     */

    /******************************************************************
     * This method is called when the corresponding button is pressed.
     * The application opens the link to the internal Algorithm page
     * with learning resources for the student to view.
     ******************************************************************/
    public void openAlgorithms() {
        Intent intent = new Intent(this, L_Algorithms.class);
        startActivity(intent);
    }
    /******************************************************************
     * This method is called when the corresponding button is pressed.
     * The application opens the link to the internal Binary Tree page
     * with learning resources for the student to view.
     ******************************************************************/
    public void openBinary() {
        Intent intent = new Intent(this, L_Binary_Trees.class);
        startActivity(intent);
    }
    /******************************************************************
     * This method is called when the corresponding button is pressed.
     * The application opens the link to the internal Lists page
     * with learning resources for the student to view.
     ******************************************************************/
    public void openLists() {
        Intent intent = new Intent(this, L_Lists.class);
        startActivity(intent);
    }
    /******************************************************************
     * This method is called when the corresponding button is pressed.
     * The application opens the link to the internal Pointers page
     * with learning resources for the student to view.
     ******************************************************************/
    public void openPointers() {
        Intent intent = new Intent(this, L_Pointers.class);
        startActivity(intent);
    }
    /******************************************************************
     * This method is called when the corresponding button is pressed.
     * The application opens the link to the internal Recursion page
     * with learning resources for the student to view.
     ******************************************************************/
    public void openRecursion() {
        Intent intent = new Intent(this, L_Recursion.class);
        startActivity(intent);
    }
    /******************************************************************
     * This method is called when the corresponding button is pressed.
     * The application opens the link to the internal Review page
     * with learning resources for the student to view.
     ******************************************************************/
    public void openReview() {
        Intent intent = new Intent(this, L_Review.class);
        startActivity(intent);
    }
    /******************************************************************
     * This method is called when the corresponding button is pressed.
     * The application opens the link to the internal Stacks page
     * with learning resources for the student to view.
     ******************************************************************/
    public void openStacks() {
        Intent intent = new Intent(this, L_Stacks.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //When the activity is created, link to the scrollable XML layout file,lessons_student
        setContentView(R.layout.activity_lessons_student);

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
         *  If the button is pressed, open the lesson link in a new tab
         ***************************************************************************/
        algorithmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlgorithms();
            }
        });
        /****************************************************************************
         *  OnClickListener checks to see if the Binary button is pressed
         *
         *  If the button is pressed, open the lesson link in a new tab
         ***************************************************************************/
        binaryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBinary();
            }
        });
        /****************************************************************************
         *  OnClickListener checks to see if the List button is pressed
         *
         *  If the button is pressed, open the lesson link in a new tab
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
         *  If the button is pressed, open the lesson link in a new tab
         ***************************************************************************/
        pointersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPointers();
            }
        });
        /****************************************************************************
         *  OnClickListener checks to see if the recursion button is pressed
         *
         *  If the button is pressed, open the lesson link in a new tab
         ***************************************************************************/
        recursionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRecursion();
            }
        });
        /****************************************************************************
         *  OnClickListener checks to see if the review button is pressed
         *
         *  If the button is pressed, open the lesson link in a new tab
         ***************************************************************************/
        reviewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openReview();
            }
        });
        /****************************************************************************
         *  OnClickListener checks to see if the stack button is pressed
         *
         *  If the button is pressed, open the lesson link in a new tab
         ***************************************************************************/
        stacksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStacks();
            }
        });

    }
}