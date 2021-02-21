package com.example.teacherspet.ui.login;
/************************************************************************
 * IMPORTS :
 *          imports the Nullable library
 *

 ************************************************************************/
import androidx.annotation.Nullable;


/***************************************************************
 * This class controls the Login Results to check if the user
 * entered the correct login information. It should check if the
 * Login results are correct or if the user entered in the wrong
 * Login information.
 ***************************************************************/
class LoginResult {
    @Nullable
    private LoggedInUserView success;
    @Nullable
    private Integer error;
    /**
    If results of login are not valid then this expresses to the app
     that there is an error and returns and error. If the results of
     the login are valid the it is expressed to the app that the login
     was successful and return successful.
   **/
    LoginResult(@Nullable Integer error) {
        this.error = error;
    }

    LoginResult(@Nullable LoggedInUserView success) {
        this.success = success;
    }

    @Nullable
    LoggedInUserView getSuccess() {
        return success;
    }

    @Nullable
    Integer getError() {
        return error;
    }
}