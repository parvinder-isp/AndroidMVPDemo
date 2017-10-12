package com.example.intersoft_admin.mvpdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity implements LoginView {
    private LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        presenter = new LoginPresenterImp(this);
        presenter.login("admin", "admin");
    }

    @Override
    public void showValidationError() {
        Toast.makeText(this, "Please enter valid username and password!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginSuccess() {
        Toast.makeText(this, "You are succussfully logged in!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginError() {
        Toast.makeText(this, "Invalid login credintails!", Toast.LENGTH_SHORT).show();
    }
}