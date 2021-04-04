package com.example.teacherspet.ui.login;
/************************************************************************
 * IMPORTS :
 *          imports the classes for the Login Repository, Result and
 *          LoggedInUser pages and the bundle packages for the buttons
 *          UI interaction and Libraries for collecting live data for
 *          the app.
 *

 ************************************************************************/
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.teacherspet.R;
import com.example.teacherspet.data.LoginRepository;
import com.example.teacherspet.data.Result;
import com.example.teacherspet.data.model.LoggedInUser;

//User is superclass that gets extended to student and teacher subclasses

/********************************************************
 * TODO: Add user credentials to LoginRepository
 *******************************************************/

public class User {


    String email, password, name, classification, picture, attendance, quizzes;

    //Default user constructor
    public User(String email, String password, String name){
        //String username;
        this.password = password;
        this.email = email;
        this.name = name;
        this.classification = classification;
        this.picture = picture;
        this.attendance = attendance;
        this.quizzes = quizzes;

        //String profile_picture_address;
    }

}
