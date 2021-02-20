package com.example.teacherspet.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.teacherspet.R;

public class SignUpUserView extends AppCompatActivity {
    // This opens the email verification activity
    public void openemailVerify() {
        Intent intent = new Intent(this, EmailVerify.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_user_view);
        final Button emailverifyButton = findViewById(R.id.signup); // inside on create
        // if the sign up button is clicked it calls the open sign up  method page
        emailverifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openemailVerify();
            }
        });
    }


}