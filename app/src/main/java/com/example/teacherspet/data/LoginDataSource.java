package com.example.teacherspet.data;

import com.example.teacherspet.data.model.LoggedInUser;

import java.io.IOException;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {

    public Result<LoggedInUser> login(String username, String password) {

        try {
            // TODO: handle loggedInUser authentication
            LoggedInUser testUser =
                    new LoggedInUser(
                            java.util.UUID.randomUUID().toString(),
                            "Mika Morgan");
            return new Result.Success<>(testUser);
        } catch (Exception e) {
            return new Result.Error(new IOException("Error logging in", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}