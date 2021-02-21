package com.example.teacherspet.student_view.lessons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.teacherspet.R;
import com.example.teacherspet.student_view.Attendance_Student_View;
import com.example.teacherspet.student_view.Lessons_Student_View;
import com.example.teacherspet.student_view.Progress_Student_View;
import com.example.teacherspet.student_view.Self_Study_Student_View;

public class L_Binary_Trees extends AppCompatActivity {

    /***********************************************************
     * This is the page for the lesson on binary trees
     * There are 10 icons with invisible buttons overlaid
     * The buttons are linked to external websites
     ***********************************************************/

    /******************************************************************
     * This method is called when the corresponding button is pressed.
     * The application opens the link to the external educational
     * source in a separate tab
     ******************************************************************/
    public void openLink1() {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.geeksforgeeks.org/binary-tree-set-1-introduction/"));
        startActivity(intent);
    }

    /******************************************************************
     * This method is called when the corresponding button is pressed.
     * The application opens the link to the external educational
     * source in a separate tab
     ******************************************************************/
    public void openLink2() {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/"));
        startActivity(intent);
    }

    /******************************************************************
     * This method is called when the corresponding button is pressed.
     * The application opens the link to the external educational
     * source in a separate tab
     ******************************************************************/
    public void openLink3() {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=BHB0B1jFKQc&ab_channel=BackToBackSWE"));
        startActivity(intent);
    }

    /******************************************************************
     * This method is called when the corresponding button is pressed.
     * The application opens the link to the external educational
     * source in a separate tab
     ******************************************************************/
    public void openLink4() {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=COZK7NATh4k&ab_channel=mycodeschool"));
        startActivity(intent);
    }

    /******************************************************************
     * This method is called when the corresponding button is pressed.
     * The application opens the link to the external educational
     * source in a separate tab
     ******************************************************************/
    public void openLink5() {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=oSWTXtMglKE&ab_channel=HackerRank"));
        startActivity(intent);
    }

    /******************************************************************
     * This method is called when the corresponding button is pressed.
     * The application opens the link to the external educational
     * source in a separate tab
     ******************************************************************/
    public void openLink6() {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.programiz.com/dsa/trees"));
        startActivity(intent);
    }

    /******************************************************************
     * This method is called when the corresponding button is pressed.
     * The application opens the link to the external educational
     * source in a separate tab
     ******************************************************************/
    public void openLink7() {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://people.ksp.sk/~kuko/gnarley-trees/Intro.html"));
        startActivity(intent);
    }

    /******************************************************************
     * This method is called when the corresponding button is pressed.
     * The application opens the link to the external educational
     * source in a separate tab
     ******************************************************************/
    public void openLink8() {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.khanacademy.org/computer-programming/depth-first-traversals-of-binary-trees/934024358"));
        startActivity(intent);
    }

    /******************************************************************
     * This method is called when the corresponding button is pressed.
     * The application opens the link to the external educational
     * source in a separate tab
     ******************************************************************/
    public void openLink9() {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.proprofs.com/quiz-school/story.php?title=sample_1502l5"));
        startActivity(intent);
    }

    /******************************************************************
     * This method is called when the corresponding button is pressed.
     * The application opens the link to the external educational
     * source in a separate tab
     ******************************************************************/
    public void openLink10() {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.geeksforgeeks.org/data-structure-gq/binary-search-trees-gq/"));
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
        setContentView(R.layout.activity_l__binary__trees);

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
                openLink1();
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
                openLink2();
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
                openLink3();
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
                openLink4();
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
                openLink5();
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
                openLink6();
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
                openLink7();
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
                openLink8();
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
                openLink9();
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
                openLink10();
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