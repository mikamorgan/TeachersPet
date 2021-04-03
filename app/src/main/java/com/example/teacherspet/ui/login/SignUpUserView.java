package com.example.teacherspet.ui.login;
/************************************************************************
 * IMPORTS :
 *          imports the bundle packages for the buttons UI interaction
 *          of the app.
 *

 ************************************************************************/
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.teacherspet.R;
import com.google.android.material.textfield.TextInputEditText;
import com.vishnusivadas.advanced_httpurlconnection.FetchData;
import com.vishnusivadas.advanced_httpurlconnection.PutData;

public class SignUpUserView extends AppCompatActivity {

    TextInputEditText TextInputEditTextName, TextInputEditTextEmail, TextInputEditTextPassword;

    /******************************************************************
     * This method is called when the corresponding button is pressed.
     * The application opens the email verification activity
     ******************************************************************/
    public void openemailVerify() {
        Intent intent = new Intent(this, EmailVerify.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_user_view);

        EditText emailEditText = findViewById(R.id.editTextTextEmailAddress);
        EditText nameEditText = findViewById(R.id.editTextTextPersonName);
        EditText passwordEditText = findViewById(R.id.editTextTextPassword);
        EditText passwordverifyEditText = findViewById(R.id.editTextTextPassword2);

        /*String name  = nameEditText.getText().toString();
        String email = emailEditText.getText().toString();
        String temp1 = passwordEditText.getText().toString();
        String temp2 = passwordverifyEditText.getText().toString();
        String password = "";

        if (temp1.equals(temp2))
        {
           password = temp1;
        }

        //TextWatcher checks for user input in text entry fields
        TextWatcher afterTextChangedListener = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // ignore
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // ignore
            }

            @Override
            public void afterTextChanged(Editable s) {
                String name  = nameEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String temp1 = passwordEditText.getText().toString();
                String temp2 = passwordverifyEditText.getText().toString();
                String password = "";

                if (temp1.equals(temp2))
                {
                    password = temp1;
                }

                Toast.makeText(getApplicationContext(), " ATC email" + email, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), "ATC pw" + password, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), "ATC name" + name, Toast.LENGTH_SHORT).show();
            }
        };

        //On creation, allow the user to enter text for un and pw
        //Hide pw text as it is entered. Only check for pw changes if login fails
        emailEditText.addTextChangedListener(afterTextChangedListener);
        passwordEditText.addTextChangedListener(afterTextChangedListener);
        nameEditText.addTextChangedListener(afterTextChangedListener);



        //System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Pw: " + password);
        Log.i("","Name " + name);
        Log.i("","PW " + password);
        Log.i("","Email " + email);

        User user = new User(email, password, name);

         */

        final Button loginButton = findViewById(R.id.login);
        final Button emailverifyButton = findViewById(R.id.signup); // inside on create

        /****************************************************************************
         *  OnClickListener checks to see if a button is pressed
         *
         *  If the button is pressed, open the sign up  method page
         ***************************************************************************/
        emailverifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name  = nameEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String temp1 = passwordEditText.getText().toString();
                String temp2 = passwordverifyEditText.getText().toString();
                String password = "";

                if (temp1.equals(temp2))
                {
                    password = temp1;
                }

                String finalPassword = password;

                //Start ProgressBar first (Set visibility VISIBLE)
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
                                    //openemailVerify();
                                    //finish();
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
    }


}