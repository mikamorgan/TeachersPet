package com.example.teacherspet.ui.login;
/************************************************************************
 * IMPORTS :
 *          imports the Nullable library
 *

 ************************************************************************/
import androidx.annotation.Nullable;

class LoginFormState {

    /************************************************************************
     * Data validation state of the login form.
     *
     * This returns if the user logged in successfully, or
     * returns the type of login error if not.
     ************************************************************************/

    /******************************************************************************
     * TODO: Add username errors (not a valid MSU email, un does not exist, etc.)
     * TODO: Add password errors (under 5 characters, does not match un, etc.)
     ******************************************************************************/

    @Nullable
    private Integer usernameError;
    @Nullable
    private Integer passwordError;
    private boolean isDataValid;

    //Constructors for the LoginFormState
    LoginFormState(@Nullable Integer usernameError, @Nullable Integer passwordError) {
        this.usernameError = usernameError;
        this.passwordError = passwordError;
        this.isDataValid = false;
    }

    //Default constructor
    LoginFormState(boolean isDataValid) {
        this.usernameError = null;
        this.passwordError = null;
        this.isDataValid = isDataValid;
    }

    //Accessor method to get username errors
    @Nullable
    Integer getUsernameError() {
        return usernameError;
    }

    //Accessor method to get password errors
    @Nullable
    Integer getPasswordError() {
        return passwordError;
    }

    //Accessor method to check data validity (email must be D2L email, pw must be alphanumeric, etc.)
    boolean isDataValid() {
        return isDataValid;
    }
}