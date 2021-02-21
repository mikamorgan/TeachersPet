package com.example.teacherspet.ui.login;
/************************************************************************
 * IMPORTS :
 *          imports the classes for the Login Repository and Login Data
 *          Source and the bundle packages for the buttons UI interaction
 *          and Libraries for collecting live data and no data for the app.
 *

 ************************************************************************/
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.annotation.NonNull;

import com.example.teacherspet.data.LoginDataSource;
import com.example.teacherspet.data.LoginRepository;

/***************************************************************************
 * ViewModel provider factory to instantiate LoginViewModel.
 * Required given LoginViewModel has a non-empty constructor
 *
 * This is a default part of the login template provided by Android Studio
 **************************************************************************/
public class LoginViewModelFactory implements ViewModelProvider.Factory {

    @NonNull
    @Override
    @SuppressWarnings("unchecked")
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(LoginViewModel.class)) {
            return (T) new LoginViewModel(LoginRepository.getInstance(new LoginDataSource()));
        } else {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
    }
}