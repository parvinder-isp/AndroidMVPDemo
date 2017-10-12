package com.example.intersoft_admin.mvpdemo;

import android.app.Activity;
import android.text.TextUtils;

/**
 * Created by intersoft-admin on 11/10/17.
 */

public class LoginPresenterImp  implements LoginPresenter  {

    /** The login view. */
    private LoginView loginView;
    /**
     * Instantiates a new login presenter impl.
     * @param loginView the login view
     */
    public LoginPresenterImp(LoginView loginView) {
        this.loginView = loginView;
    }


    /**
     *
     */@Override
    public void login(String username, String password) {
        if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {
            loginView.showValidationError();
        } else {
            if (username.equals("admin") && password.equals("admin")) {
                loginView.loginSuccess();
            } else {
                loginView.loginError();
            }
        }
    }
}