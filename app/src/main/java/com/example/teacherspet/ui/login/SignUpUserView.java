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
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.teacherspet.R;

public class SignUpUserView extends AppCompatActivity {

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

        final EditText emailEditText = findViewById(R.id.editTextTextEmailAddress);
        final EditText nameEditText = findViewById(R.id.editTextTextPersonName);
        final EditText passwordEditText = findViewById(R.id.editTextTextPassword);
        final EditText passwordverifyEditText = findViewById(R.id.editTextTextPassword2);

        final Button loginButton = findViewById(R.id.login);
        final Button emailverifyButton = findViewById(R.id.signup); // inside on create

        String name = nameEditText.getText().toString();
        String email = emailEditText.getText().toString();
        String temp1 = passwordEditText.getText().toString();
        String temp2 = passwordverifyEditText.getText().toString();
        String password = "";

        if (temp1.equals(temp2))
        {
            password = temp1;
        }

        User user = new User(email, password, name);

        /****************************************************************************
         *  OnClickListener checks to see if a button is pressed
         *
         *  If the button is pressed, open the sign up  method page
         ***************************************************************************/
        emailverifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openemailVerify();
            }
        });
    }


}