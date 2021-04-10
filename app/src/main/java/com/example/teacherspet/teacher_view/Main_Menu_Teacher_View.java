package com.example.teacherspet.teacher_view;
/************************************************************************
 * IMPORTS :
 *          imports the classes for the main menu pages and the
 *          bundle packages for the buttons UI interaction of the app.
 *

 ************************************************************************/
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.teacherspet.R;
import com.example.teacherspet.student_view.Attendance_Student_View;
import com.example.teacherspet.student_view.Lessons_Student_View;
import com.example.teacherspet.student_view.Progress_Student_View;
import com.example.teacherspet.student_view.Self_Study_Student_View;
import com.vishnusivadas.advanced_httpurlconnection.PutData;

public class Main_Menu_Teacher_View extends AppCompatActivity {

    /************************************************************************
     * TODO: Add option to select course (separate activity page?)
     *
     * OPTIONAL EXTRAS:
     * TODO: Link the teacher's profile picture
     * (right now a default avatar displays in the top right)
     * TODO: Display the teacher's name
     * (right now there is a default name placeholder in the top right)
     * TODO: Add a back button with functionality
     ************************************************************************/
    public void openAttendance() {
        Intent intent = new Intent(this, Attendance_Teacher_View.class);
        startActivity(intent);
    }

    public void openLessons() {
        Intent intent = new Intent(this, Lessons_Teacher_View.class);
        startActivity(intent);
    }

    public void openSelf_Study() {
        Intent intent = new Intent(this, Self_Study_Teacher_View.class);
        startActivity(intent);
    }

    public void openProgress() {
        Intent intent = new Intent(this, Progress_Teacher_View.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__menu__teacher__view);

        //Create the 4 buttons to navigate to the other activity pages
        final Button attendanceButton = findViewById(R.id.attendance);
        final Button lessonsButton = findViewById(R.id.lessons);
        final Button self_studyButton = findViewById(R.id.self_study);
        final Button progressButton = findViewById(R.id.progress);

        //Create text view box to hold teacher name
        TextView name = (TextView) findViewById(R.id.name);
        fetchDB();

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

    private void fetchDB(){
        String email = getIntent().getStringExtra("email");
        String result = "";
        //Create text view box to hold student name
        TextView name = (TextView) findViewById(R.id.name);
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new Runnable() {
            @Override
            public void run() {
                //Starting Write and Read data with URL
                //Creating array for parameters
                String[] field = new String[1];
                field[0] = "email";
                //Creating array for data
                String[] data = new String[1];
                data[0] = email;

                PutData putData = new PutData("http://192.168.1.138/LoginRegister/fetchname.php", "POST", field, data);
                if (putData.startPut()) {
                    if (putData.onComplete()) {
                        String result = putData.getResult();
                        name.setText(result);
                    }
                }
            }
        });

    }
}