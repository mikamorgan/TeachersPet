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

    private MutableLiveData<LoginFormState> loginFormState = new MutableLiveData<>();
    private MutableLiveData<LoginResult> loginResult = new MutableLiveData<>();
    private LoginRepository loginRepository;

    User(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    LiveData<LoginFormState> getLoginFormState() {
        return loginFormState;
    }

    LiveData<LoginResult> getLoginResult() {
        return loginResult;
    }

    //Default user constructor
    public User(){
        String username;
        String password;
        String email;
        String name;
        String profile_picture_address;
    }

    //Funtion to check login result against credentials stored in login repository
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

}
