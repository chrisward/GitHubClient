package com.example.chrisward.githubclient;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.chrisward.githubclient.presenter.viewContract.LoginViewContract;

public class MainActivity extends AppCompatActivity implements LoginViewContract {
    private EditText usernameField;
    private EditText passwordField;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameField = findViewById(R.id.usernameField);
        passwordField = findViewById(R.id.passwordField);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(l -> {

        });
    }


    @Override
    public void loginSuccess() {

    }

    @Override
    public void loginFailure(String message) {

    }

    @Override
    public Context getContext() {
        return null;
    }
}
