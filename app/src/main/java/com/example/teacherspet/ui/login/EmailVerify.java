package com.example.teacherspet.ui.login;
/************************************************************************
 * IMPORTS :
 *          imports the classes for the Student View Main Menu pages and
 *          the bundle packages for the buttons UI interaction of the app.
 *
 ************************************************************************/
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.teacherspet.R;
import com.example.teacherspet.student_view.Main_Menu_Student_View;
import com.example.teacherspet.teacher_view.Main_Menu_Teacher_View;
import com.vishnusivadas.advanced_httpurlconnection.PutData;


/*****************************************************************
 * TODO: Send email to MSU D2L account used in account creation
 ****************************************************************/



/***************************************************************
 * This class controls the email verification to check user
 * identity. It should generate a verification code, send in an
 * email to the MSU D2L email used to sign up, check that the
 * codes match, create an account if the codes match, and assign
 * student or teacher authorization to the user.
 ***************************************************************/
public class EmailVerify extends AppCompatActivity {

    /******************************************************************
     * This method is called when the corresponding button is pressed.
     * The application opens the student main menu.
     ******************************************************************/
    void openMainStudent(){
        Intent intent = new Intent(this, Main_Menu_Student_View.class);
        String email = getIntent().getStringExtra("email");
        intent.putExtra("email", email);
        startActivity(intent);
    }

    void openMainTeacher(){
        Intent intent = new Intent(this, Main_Menu_Teacher_View.class);
        String email = getIntent().getStringExtra("email");
        intent.putExtra("email", email);
        startActivity(intent);
    }

    protected void sendEmail(String code) {

        Log.i("Send email", "");

        /*final String username = "william.morgan0805@gmail.com";
        final String password = "mpjspocgzhlzeerz";
        String messageToSend = "Email verification code: " + code; */

       String[] TO = {"ladelle2016@gmail.com"};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto:")); // "mailto:ladelle2016@gmail.com"
       // emailIntent.addFlags(emailIntent.FLAG_ACTIVITY_NEW_TASK);
        //emailIntent.setType("text/plain");


        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Email Verification Code");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Email verification code: " + code);

        try {
            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
            finish();
            Log.i("Finished sending email.", "");
            Toast.makeText(EmailVerify.this,
                    "Email sent." , Toast.LENGTH_SHORT).show();
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(EmailVerify.this,
                    "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //When the activity is created, link to the XML layout file email_verify
        setContentView(R.layout.activity_email_verify);

        final EditText usernameEditText = findViewById(R.id.editTextTextPersonName2);
        final Button emailverifyButton = findViewById(R.id.emailverifybutton); // inside on create

        String email = getIntent().getStringExtra("email");
        String finalPassword = getIntent().getStringExtra("password");
        String name = getIntent().getStringExtra("name");
        String code = getIntent().getStringExtra("code");

        //int code2 = Integer.parseInt(code);
        //sendEmail(code);

        /****************************************************************************
         *  OnClickListener checks to see if a button is pressed
         *
         *  If the emailverify button is clicked, open student main menu page
         ***************************************************************************/
        emailverifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enteredCode = usernameEditText.getText().toString();
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
                        String[] field = new String[7];
                        field[0] = "email";
                        field[1] = "password";
                        field[2] = "name";
                        field[3] = "classification";
                        field[4] = "picture";
                        field[5] = "attendance";
                        field[6] = "quizzes";
                        //Creating array for data
                        String[] data = new String[7];
                        data[0] = email;
                        data[1] = finalPassword;
                        data[2] = name;
                        data[3] = finalClassification;
                        data[4] = "";
                        data[5] = "0";
                        data[6] = "0";
                        //"http://192.168.1.11/LoginRegister/signup.php" -- Ladelle
                        //"http://192.168.1.138/LoginRegister/signup.php" --Mika
                        PutData putData = new PutData("http://192.168.1.11/LoginRegister/signup.php", "POST", field, data);
                        if (putData.startPut()) {
                            if (putData.onComplete()) {
                                String result = putData.getResult();
                                if(result.equals("Sign Up Success"))
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
                //}
            }
        });
    }

}