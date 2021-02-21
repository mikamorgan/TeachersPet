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

        final Button emailverifyButton = findViewById(R.id.signup); // inside on create

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