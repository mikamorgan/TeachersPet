package com.example.teacherspet.ui.login;
/************************************************************************
 * IMPORTS :
 *          imports the classes for the Student View Main Menu pages
 *          and the bundle packages for the buttons UI interaction of
 *          the app.
 *

 ************************************************************************/
import android.app.Activity;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.teacherspet.student_view.Attendance_Student_View;
import com.example.teacherspet.student_view.Main_Menu_Student_View;
import com.example.teacherspet.R;
import com.example.teacherspet.teacher_view.Main_Menu_Teacher_View;
import com.vishnusivadas.advanced_httpurlconnection.PutData;

public class LoginActivity extends AppCompatActivity {

    /******************************************************************
     * This method is called when the corresponding button is pressed.
     * The application navigates to the sign up page
     ******************************************************************/
    public void openSignup() {
        Intent intent = new Intent(this, SignUpUserView.class);
        startActivity(intent);
    }

    void openMainStudent(){
        Intent intent = new Intent(this, Main_Menu_Student_View.class);
        startActivity(intent);
    }

    void openMainTeacher(){
        Intent intent = new Intent(this, Main_Menu_Teacher_View.class);
        startActivity(intent);
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        final EditText usernameEditText = findViewById(R.id.username);
        final EditText passwordEditText = findViewById(R.id.password);
        final Button loginButton = findViewById(R.id.login);
        //final ProgressBar loadingProgressBar = findViewById(R.id.loading);
        final Button signupButton = findViewById(R.id.signup);
        final Button forgetpasswordButton = findViewById(R.id.forgetpsw);


        /****************************************************************************
         *  OnClickListener checks to see if a button is pressed
         *
         *  If the button is pressed, check the login credentials
         ***************************************************************************/
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = usernameEditText.getText().toString();
                String finalPassword = passwordEditText.getText().toString();

                String classification = "";

                if(email.equals("catherine.stringfellow@msutexas.edu"))
                {
                    classification = "teacher";
                }
                else if(email.equals("nelson.passos@msutexas.edu"))
                {
                    classification = "teacher";
                }
                else if(email.equals("terry.griffin@msutexas.edu"))
                {
                    classification = "teacher";
                }
                else if(email.equals("tina.johnson@msutexas.edu"))
                {
                    classification = "teacher";
                }
                else if(email.equals("eduardo.colmenares-diaz@msutexas.edu"))
                {
                    classification = "teacher";
                }
                else if(email.equals("testTeacher@gmail.com"))
                {
                    classification = "teacher";
                }
                else
                {
                    classification = "student";
                }
                //if(enteredCode.equals("" + code))
                //{
                Handler handler = new Handler(Looper.getMainLooper());
                String finalClassification = classification;
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        //Starting Write and Read data with URL
                        //Creating array for parameters
                        String[] field = new String[2];
                        field[0] = "email";
                        field[1] = "password";
                        //Creating array for data
                        String[] data = new String[2];
                        data[0] = email;
                        data[1] = finalPassword;

                        PutData putData = new PutData("http://192.168.1.138/LoginRegister/login.php", "POST", field, data);
                        if (putData.startPut()) {
                            if (putData.onComplete()) {
                                String result = putData.getResult();
                                if(result.equals("Login Success"))
                                {
                                    Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();

                                    //Check to see if teacher
                                    if(finalClassification.equals("teacher"))
                                    {
                                        openMainTeacher();
                                    }
                                    else
                                    {
                                        openMainStudent();
                                    }
                                    finish();
                                }
                                else
                                {
                                    Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
                                }
                            }
                        }
                        //End Write and Read data with URL
                    }
                });
            }
        });

        /****************************************************************************
         *  OnClickListener checks to see if a button is pressed
         *
         *  If the button is pressed, open the sign up activity page
         ***************************************************************************/
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              openSignup();
            }
        });
    }
}