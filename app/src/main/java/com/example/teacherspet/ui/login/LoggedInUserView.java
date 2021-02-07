package com.example.teacherspet.ui.login;

/**
 * Class exposing authenticated user details to the UI.
 */
class LoggedInUserView {

    private String displayName;
    //... other data fields that may be accessible to the UI

    LoggedInUserView(String displayName) {
        this.displayName = displayName;
    }

    String getDisplayName() {
        return displayName;
    }
}

/*
class LoggedInUserView {
    public void openMain_Menu_Student_View() {
        Intent intent = new Intent(this, Main_Menu_Student_View.class);
        startActivity(intent);
    }

    openMain_Menu_Student_View();

 */