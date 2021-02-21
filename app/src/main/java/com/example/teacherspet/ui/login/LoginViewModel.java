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
import androidx.lifecycle.ViewModel;

import android.util.Patterns;

import com.example.teacherspet.data.LoginRepository;
import com.example.teacherspet.data.Result;
import com.example.teacherspet.data.model.LoggedInUser;
import com.example.teacherspet.R;

/***************************************************************
 * This class uses the imported classes from LoginRepository,
 * LoginFormState, LoginResult and LiveData library to create
 * login boundaries and identify when the boundaries have been
 * crossed.
 ***************************************************************/
public class LoginViewModel extends ViewModel {

    /***************************************************************
     * These are private classes connected to the error check, database,
     * and returned results from error check, that then creates new Data
     * based on the login information entered.
     ***************************************************************/
    private MutableLiveData<LoginFormState> loginFormState = new MutableLiveData<>();
    private MutableLiveData<LoginResult> loginResult = new MutableLiveData<>();
    private LoginRepository loginRepository;

    /***************************************************************
     * The login information created results is returned here.
     ***************************************************************/
    LoginViewModel(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    LiveData<LoginFormState> getLoginFormState() {
        return loginFormState;
    }

    LiveData<LoginResult> getLoginResult() {
        return loginResult;
    }

    /***************************************************************
     * This is a method that uses the username and password entered
     * to place them in the database if there is no instance of the
     * login information. If the user is a returning user and the
     * login is successful then the users username is displayed. However,
     * if the user is a returing user and the login has an error, then
     * Log in failed will be displayed.
     ***************************************************************/
    public void login(String username, String password) {
        // can be launched in a separate asynchronous job
        Result<LoggedInUser> result = loginRepository.login(username, password);

        if (result instanceof Result.Success) {
            LoggedInUser data = ((Result.Success<LoggedInUser>) result).getData();
            loginResult.setValue(new LoginResult(new LoggedInUserView(data.getDisplayName())));
        } else {
            loginResult.setValue(new LoginResult(R.string.login_failed));
        }
    }
    /***************************************************************
     * This is a method that uses the username and password entered
     * to check that the credentials are met. The users information
     * has to be a valid username and has at least 5 characters in
     * the password in order for the sign up information to be saved
     * into the database(repository); returns true if valid.
     ***************************************************************/
    public void loginDataChanged(String username, String password) {
        if (!isUserNameValid(username)) {
            loginFormState.setValue(new LoginFormState(R.string.invalid_username, null));
        } else if (!isPasswordValid(password)) {
            loginFormState.setValue(new LoginFormState(null, R.string.invalid_password));
        } else {
            loginFormState.setValue(new LoginFormState(true));
        }
    }
    /***************************************************************
     * This is a boolean method that uses the username to check if
     * the users username is a valid email address.
     ***************************************************************/
    // A placeholder username validation check
    private boolean isUserNameValid(String username) {
        if (username == null) {
            return false;
        }
        if (username.contains("@")) {
            return Patterns.EMAIL_ADDRESS.matcher(username).matches();
        } else {
            return !username.trim().isEmpty();
        }
    }
    /***************************************************************
     * This is a boolean method that uses the password to check if
     * the users password is at least 5 characters long.
     ***************************************************************/
    // A placeholder password validation check
    private boolean isPasswordValid(String password) {
        return password != null && password.trim().length() > 5;
    }
}