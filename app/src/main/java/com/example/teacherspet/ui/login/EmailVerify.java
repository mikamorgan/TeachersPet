package com.example.teacherspet.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.teacherspet.R;
import com.example.teacherspet.student_view.Main_Menu_Student_View;




/************************************************
 * TODO: add encryption
 *

 ************************************************/

/*************************************************
 *
 ************************************************/

/**************************************************************
 *

 ****************************************************************/
public class EmailVerify extends AppCompatActivity {
    void openMain(){
        Intent intent = new Intent(this, Main_Menu_Student_View.class);
        startActivity(intent);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_verify);
        final Button emailverifyButton = findViewById(R.id.emailverifybutton); // inside on create

        // if the emailverify button is clicked it calls the open sign up  method page
        emailverifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain();
            }
        });
    }

}