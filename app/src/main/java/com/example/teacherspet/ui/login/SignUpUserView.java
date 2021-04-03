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
    public void openemailVerify(String email, String password, String name) {
        Intent intent = new Intent(this, EmailVerify.class);
        intent.putExtra("email", email);
        intent.putExtra("password", password);
        intent.putExtra("name", name);
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

                openemailVerify(email, finalPassword, name);
            }
        });
    }


}