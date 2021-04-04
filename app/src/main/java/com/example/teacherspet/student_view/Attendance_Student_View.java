package com.example.teacherspet.student_view;
/************************************************************************
 * IMPORTS :
 *          imports the bundle packages for the buttons UI interaction
 *          of the app.
 *

 ************************************************************************/
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.teacherspet.R;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;


public class Attendance_Student_View extends AppCompatActivity {
    /************************************************************************
     * TODO: Create scrollable Layout
     * TODO: Connect app to camera of users phone
     * TODO: Add buttons and link to QR code scan.
     * TODO: return data to API backend
     ************************************************************************/
    // Intitialize variasble
    Button btScan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //When the activity is created, link to the scrollable XML layout file,attendance_student
        setContentView(R.layout.activity_attendance_student);
        // Assign variable
        btScan = findViewById(R.id.bt_scan);
        btScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intitalize intent integrator
                IntentIntegrator intentIntegrator = new IntentIntegrator(
                        Attendance_Student_View.this
                );
                // set prompt
                intentIntegrator.setPrompt("For flash use volume up key");
                // Set beep
                intentIntegrator.setBeepEnabled(true);
                // Locked  orientation
                intentIntegrator.setOrientationLocked(true);
                //set Capture activity
                intentIntegrator.setCaptureActivity(Capture.class);
                // intiiate scan
                intentIntegrator.initiateScan();
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        // Initialize intent result
        IntentResult intentResult = IntentIntegrator.parseActivityResult(
                requestCode, resultCode, data
        );
        //check condition
        if (intentResult.getContents() != null) {
            //when result content is not null
            // Intialize alert dialog
            AlertDialog.Builder builder = new AlertDialog.Builder(
                    Attendance_Student_View.this
            );
            // set title
            builder.setTitle("Result");
            //set message
            builder.setMessage(intentResult.getContents());
            //Set positive button
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    // Dismiss dialog
                    dialogInterface.dismiss();
                }
            });
            //show alert dialog
            builder.show();
        } else {
            // when result content is null
            // Display toasty
            Toast.makeText(getApplicationContext(), "OOOPS... You did not scan anything", Toast.LENGTH_SHORT)
                    .show();

        }
    }
}