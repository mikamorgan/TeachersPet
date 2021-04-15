package com.example.teacherspet.teacher_view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import com.example.teacherspet.R;
import com.vishnusivadas.advanced_httpurlconnection.PutData;

import java.util.Calendar;

public class Attendance_Teacher_View extends AppCompatActivity {

    /******************************************************************
     * This method is called when the corresponding button is pressed.
     * The application opens the link to the classview page in TP
     ******************************************************************/
    public void openClassview() {
        Intent intent = new Intent(this, ClassView_Teacher_View .class);
        startActivity(intent);
    }
    /******************************************************************
     * This method is called when the corresponding button is pressed.
     * The application opens the link to the studentlist page in TP
     ******************************************************************/
    public void openStudentList() {
        Intent intent = new Intent(this, StudentList_Teacher_View .class);
        startActivity(intent);
    }
    /******************************************************************
     * This method is called when the corresponding button is pressed.
     * The application opens the link to the openTime page in TP
     ******************************************************************/
    public void openTime() {
        Intent intent = new Intent(this, Time_Teacher_view .class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance__teacher__view);
        // variables
            String sCou = "CMPS 1044-Sec-101";
            String sRoom =" BO 320 ";
            String sCouDays = " M W F ";
        //buttons
        Button classviewBtn = findViewById(R.id.courseview_bt);
        Button studentlistviewBtn = findViewById(R.id.studentlist_bt);
        Button timeBtn = findViewById(R.id.time_bt);

        //Create text view box to hold TEACHER name
        TextView name = (TextView) findViewById(R.id.name);
        name.setText("Mika Morgan");

        TextView course = (TextView) findViewById(R.id.coursename);
        course.setText(sCou);

        TextView room = (TextView) findViewById(R.id.courseroom);
        room.setText(sRoom);

        TextView date = (TextView) findViewById(R.id.coursedate);
        date.setText(sCouDays);

        TextView coursetime = (TextView) findViewById(R.id.coursetimea);
        coursetime .setText("10:00 AM - 10:50 AM ");

        TextView coursemaxocc = (TextView) findViewById(R.id.maxoccupy);
        coursemaxocc.setText("20");

        // USED WHEN LOOKING FOR INFROMATION
        // fetchDB();


        /****************************************************************************
         *  OnClickListener checks to see if a button is pressed
         *
         *  If the button is pressed, navigate to the classview page
         ***************************************************************************/
        classviewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassview();
            }
        });
        /****************************************************************************
         *  OnClickListener checks to see if a button is pressed
         *
         *  If the button is pressed, navigate to the studentlistview page
         ***************************************************************************/
        studentlistviewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStudentList();
            }
        });
        /****************************************************************************
         *  OnClickListener checks to see if a button is pressed
         *
         *  If the button is pressed, navigate to the time page
         ***************************************************************************/
        timeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openTime();
            }
        });
    }
   /* private void fetchDB(){
        String email = getIntent().getStringExtra("email");
        String names = getIntent().getStringExtra("name");
        String attendances = getIntent().getStringExtra("attendances");
        String result = "";
        //Create text view box to hold student name
        TextView name = (TextView) findViewById(R.id.name);
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new Runnable() {
            @Override
            public void run() {
                //Starting Write and Read data with URL
                //Creating array for parameters
                String[] field = new String[4];
                field[0] = "name";
                field[1] = "attendance";
                field[2] = "classification";
                //Creating array for data
                String[] data = new String[1];
                data[0] = email;
                data[1] = names;
                data[2] = attendances ;
                //"http://172.27.176.1/LoginRegister/signup.php" -- Ladelle
                //"http://192.168.1.138/LoginRegister/signup.php" --Mika
                PutData putData = new PutData("http://192.168.1.11/LoginRegister/fetchname.php", "POST", field, data);
                if (putData.startPut()) {
                    if (putData.onComplete()) {
                        String result = putData.getResult();
                        name.setText(result);
                    }
                }
            }
        });

    }*/

}