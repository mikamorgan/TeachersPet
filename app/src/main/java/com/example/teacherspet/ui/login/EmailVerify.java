package com.example.teacherspet.ui.login;
/************************************************************************
 * IMPORTS :
 *          imports the classes for the Student View Main Menu pages and
 *          the bundle packages for the buttons UI interaction of the app.
 *

 ************************************************************************/
import androidx.appcompat.app.AppCompatActivity;

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

import com.example.teacherspet.R;
import com.example.teacherspet.student_view.Main_Menu_Student_View;
import com.vishnusivadas.advanced_httpurlconnection.PutData;

import java.util.Random;


/*****************************************************************
 * TODO: Generate verification code
 * TODO: Send email to MSU D2L account used in account creation
 * TODO: Check verification code entered with code sent
 * TODO: IF the code's match, check if user already exists in DB
 * TODO: IF user does not already exist, create new user account
 * TODO: Check user email against 5 verified professor accounts
 * TODO: Assign authorization as student or teacher based on
 * email. Save this information in DB with user account.
 * TODO: Navigate to student OR teacher main menu screen, based on
 * student or teacher account designation
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
    void openMain(){
        Intent intent = new Intent(this, Main_Menu_Student_View.class);
        startActivity(intent);
    }

    protected void sendEmail(int code) {

        Log.i("Send email", "");

        /*final String username = "william.morgan0805@gmail.com";
        final String password = "mpjspocgzhlzeerz";

        String messageToSend = "Email verification code: " + code; */


        String[] TO = {"mmorgan@archercityisd.net"};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");


        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Email Verification Code");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Email verification code: " + code);

        try {
            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
            finish();
            Log.i("Finished sending email.", "");
            Toast.makeText(EmailVerify.this,
                    "Email sent.", Toast.LENGTH_SHORT).show();
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(EmailVerify.this,
                    "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }

        //Intent intent = new Intent(this, EmailVerify.class);
        //intent.putExtra("email", email);
        //intent.putExtra("password", password);
        //intent.putExtra("name", name);
        //startActivity(intent);
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

        Toast.makeText(getApplicationContext(), "email" + email, Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "pw" + finalPassword, Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "name" + name, Toast.LENGTH_SHORT).show();
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
                //if(enteredCode.equals("" + code))
                //{
                    Handler handler = new Handler(Looper.getMainLooper());
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            //Starting Write and Read data with URL
                            //Creating array for parameters
                            String[] field = new String[5];
                            field[0] = "email";
                            field[1] = "password";
                            field[2] = "name";
                            field[3] = "classification";
                            field[4] = "picture";
                            //Creating array for data
                            String[] data = new String[5];
                            data[0] = email;
                            data[1] = finalPassword;
                            data[2] = name;
                            data[3] = "";
                            data[4] = "";
                            Toast.makeText(getApplicationContext(), "email" + email, Toast.LENGTH_SHORT).show();
                            Toast.makeText(getApplicationContext(), "pw" + finalPassword, Toast.LENGTH_SHORT).show();
                            Toast.makeText(getApplicationContext(), "name" + name, Toast.LENGTH_SHORT).show();

                            PutData putData = new PutData("http://192.168.1.138/LoginRegister/signup.php", "POST", field, data);
                            if (putData.startPut()) {
                                if (putData.onComplete()) {
                                    String result = putData.getResult();
                                    if(result.equals("Sign Up Success"))
                                    {
                                        Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
                                        openMain();
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