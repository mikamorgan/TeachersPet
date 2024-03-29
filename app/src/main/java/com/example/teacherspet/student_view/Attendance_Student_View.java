package com.example.teacherspet.student_view;
/************************************************************************
 * IMPORTS :
 *          imports the bundle packages for the buttons UI interaction
 *          of the app.
 *

 ************************************************************************/

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.teacherspet.R;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;
import com.vishnusivadas.advanced_httpurlconnection.PutData;


public class Attendance_Student_View extends AppCompatActivity {
    /************************************************************************
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
                // getIntent().putExtra("com.google.zxing.client.android.SCAN.SCAN_MODE", "QR_CODE_MODE");
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

                // intitiate scan
                intentIntegrator.initiateScan(IntentIntegrator.ALL_CODE_TYPES);


            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        // Initialize intent result
        IntentResult result = IntentIntegrator.parseActivityResult(
                requestCode, resultCode, data
        );
        //check condition
        if (result.getContents() != null) {
            //when result content is not null
            String resultContents = result.getContents();
            // Intialize alert dialog
            AlertDialog.Builder builder = new AlertDialog.Builder(
                    Attendance_Student_View.this
            );
            String results = result.getContents();
            if (Patterns.WEB_URL.matcher(results).matches()) {
                // Open URL
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(results));
                startActivity(browserIntent);
            }else{
                Toast.makeText(this, "Not Match", Toast.LENGTH_LONG).show();
            }
            // set title
            builder.setTitle("Result");
            //set message
            // builder.setMessage(result.getContents());
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

            fetchDB();
        } else
        {
            // when result content is null
            // Display toasty
            Toast.makeText(getApplicationContext(), "OOOPS... You did not scan anything", Toast.LENGTH_SHORT)
                    .show();

        }


    }

    private void fetchDB(){
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
                //"http://192.168.1.11/LoginRegister/signup.php" -- Ladelle
                //"http://192.168.1.138/LoginRegister/signup.php" --Mika
                PutData putData = new PutData("http://192.168.1.11/LoginRegister/fetchattendance.php", "POST", field, data);
                if (putData.startPut()) {
                    if (putData.onComplete()) {
                        String result = putData.getResult();
                        updateDB(result);
                    }
                }
            }
        });

    }

    private void updateDB(String attendanceCount){
        String email = getIntent().getStringExtra("email");
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new Runnable() {
            @Override
            public void run() {
                int attendance = Integer.parseInt(attendanceCount);
                attendance++;
                String updatedAttendanceCount = "" + attendance;

                //Starting Write and Read data with URL
                //Creating array for parameters
                String[] field = new String[2];
                field[0] = "email";
                field[1] = "attendance";
                //Creating array for data
                String[] data = new String[2];
                data[0] = email;
                data[1] = updatedAttendanceCount;
                                            //"http://192.168.1.11/LoginRegister/signup.php" -- Ladelle
                                            // "http://192.168.1.138/LoginRegister/signup.php" --Mika
                PutData putData = new PutData("http://http://192.168.1.11/LoginRegister/updateattendance.php", "POST", field, data);
                if (putData.startPut()) {
                    if (putData.onComplete()) {
                        String result = putData.getResult();
                    }
                }
            }
        });
    }

}