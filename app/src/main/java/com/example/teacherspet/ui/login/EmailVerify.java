package com.example.teacherspet.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.teacherspet.R;
import com.example.teacherspet.student_view.Main_Menu_Student_View;




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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //When the activity is created, link to the XML layout file email_verify
        setContentView(R.layout.activity_email_verify);

        final Button emailverifyButton = findViewById(R.id.emailverifybutton); // inside on create

        /****************************************************************************
         *  OnClickListener checks to see if a button is pressed
         *
         *  If the emailverify button is clicked, open student main menu page
         ***************************************************************************/
        emailverifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain();
            }
        });
    }

}