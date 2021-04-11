package com.example.teacherspet.teacher_view.lessons;
/************************************************************************
 * IMPORTS :
 *          imports the bundle packages for the buttons UI interaction
 *          of the app.
 *

 ************************************************************************/
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.teacherspet.R;
import com.example.teacherspet.student_view.Lessons_Student_View;
import com.example.teacherspet.student_view.skills_check.SC_Algorithms;

/************************************************************************
 * IMPORTS :
 *          imports the classes for the student view lessons page and the
 *          bundle packages for the buttons UI interaction of the app.
 *
 ************************************************************************/


public class L_Poi extends AppCompatActivity {

    /******************************************************************
     * This is the page for the lesson on search & sort algorithms
     * There are 10 icons with invisible buttons overlaid
     * The buttons are linked to external websites
     *******************************************************************/

    /******************************************************************
     * This method is called when the corresponding button is pressed.
     * The application opens the link to the external educational
     * source in a separate tab
     ******************************************************************/
    public void openEditLessons(int position) {
        Intent intent = new Intent(this, Edit_Lessons.class);
        String email = getIntent().getStringExtra("email");
        intent.putExtra("email", email);
        intent.putExtra("position", position);
        intent.putExtra("lesson", "poi");
        startActivity(intent);
    }

    /******************************************************************
     * This method is called when the corresponding button is pressed.
     * The application returns to the lesson homepage.
     ******************************************************************/
    public void openBack() {
        Intent intent = new Intent(this, Lessons_Student_View.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //When the activity is created, link to the scrollable XML layout file, l_binary_trees
        setContentView(R.layout.activity_l__poi);

        //Create the 10 lesson buttons and 1 back button
        final Button link1Button = findViewById(R.id.button4);
        final Button link2Button = findViewById(R.id.button5);
        final Button link3Button = findViewById(R.id.button6);
        final Button link4Button = findViewById(R.id.button7);
        final Button link5Button = findViewById(R.id.button8);
        final Button link6Button = findViewById(R.id.button9);
        final Button link7Button = findViewById(R.id.button10);
        final Button link8Button = findViewById(R.id.button11);
        final Button link9Button = findViewById(R.id.button12);
        final Button link10Button = findViewById(R.id.button13);
        final Button backButton = findViewById(R.id.button14);

        /****************************************************************************
         *  OnClickListener checks to see if a button is pressed
         *
         *  If the button is pressed, open the lesson link in a new tab
         ***************************************************************************/
        link1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEditLessons(1);
            }
        });

        /****************************************************************************
         *  OnClickListener checks to see if a button is pressed
         *
         *  If the button is pressed, open the lesson link in a new tab
         ***************************************************************************/
        link2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEditLessons(2);
            }
        });

        /****************************************************************************
         *  OnClickListener checks to see if a button is pressed
         *
         *  If the button is pressed, open the lesson link in a new tab
         ***************************************************************************/
        link3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEditLessons(3);
            }
        });

        /****************************************************************************
         *  OnClickListener checks to see if a button is pressed
         *
         *  If the button is pressed, open the lesson link in a new tab
         ***************************************************************************/
        link4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEditLessons(4);
            }
        });

        /****************************************************************************
         *  OnClickListener checks to see if a button is pressed
         *
         *  If the button is pressed, open the lesson link in a new tab
         ***************************************************************************/
        link5Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEditLessons(5);
            }
        });

        /****************************************************************************
         *  OnClickListener checks to see if a button is pressed
         *
         *  If the button is pressed, open the lesson link in a new tab
         ***************************************************************************/
        link6Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEditLessons(6);
            }
        });

        /****************************************************************************
         *  OnClickListener checks to see if a button is pressed
         *
         *  If the button is pressed, open the lesson link in a new tab
         ***************************************************************************/
        link7Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEditLessons(7);
            }
        });

        /****************************************************************************
         *  OnClickListener checks to see if a button is pressed
         *
         *  If the button is pressed, open the lesson link in a new tab
         ***************************************************************************/
        link8Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEditLessons(8);
            }
        });

        /****************************************************************************
         *  OnClickListener checks to see if a button is pressed
         *
         *  If the button is pressed, open the lesson link in a new tab
         ***************************************************************************/
        link9Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEditLessons(9);
            }
        });

        /****************************************************************************
         *  OnClickListener checks to see if a button is pressed
         *
         *  If the button is pressed, open the lesson link in a new tab
         ***************************************************************************/
        link10Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEditLessons(10);
            }
        });

        /****************************************************************************
         *  OnClickListener checks to see if a button is pressed
         *
         *  If the button is pressed, go back to the lesson homepage
         ***************************************************************************/
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBack();
            }
        });

    }
}