package com.example.teacherspet.student_view;
/************************************************************************
 * IMPORTS :
 *          imports the bundle packages for the buttons UI interaction
 *          of the app.
 *

 ************************************************************************/
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ProgressBar;

import com.example.teacherspet.R;
import com.vishnusivadas.advanced_httpurlconnection.PutData;

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

        fetchDBattendance();
        fetchDBquiz();

    }

    private void fetchDBattendance(){
        String email = getIntent().getStringExtra("email");
        String result = "";
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

                PutData putData = new PutData("http://192.168.1.138/LoginRegister/fetchattendance.php", "POST", field, data);
                if (putData.startPut()) {
                    if (putData.onComplete()) {
                        String result = putData.getResult();
                        int ap = Integer.parseInt(result);

                        final ProgressBar attendance_bar = (ProgressBar) findViewById(R.id.attendance_bar);
                        attendance_bar.setVisibility(View.VISIBLE);
                        attendance_bar.setProgress(ap);
                    }
                }
            }
        });
    }

    private void fetchDBquiz(){
        String email = getIntent().getStringExtra("email");
        String result = "";
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

                PutData putData = new PutData("http://192.168.1.138/LoginRegister/fetchquiz.php", "POST", field, data);
                if (putData.startPut()) {
                    if (putData.onComplete()) {
                        String result = putData.getResult();
                        int qp = Integer.parseInt(result);

                        final ProgressBar quiz_bar = (ProgressBar) findViewById(R.id.quiz_bar);
                        quiz_bar.setVisibility(View.VISIBLE);
                        quiz_bar.setProgress(qp);
                    }
                }
            }
        });

    }
}