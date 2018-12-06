package com.example.chrisward.githubclient;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.chrisward.githubclient.model.User;
import com.example.chrisward.githubclient.presenter.BasePresenter;
import com.example.chrisward.githubclient.presenter.LoginPresenter;
import com.example.chrisward.githubclient.presenter.viewContract.LoginViewContract;

public class MainActivity extends BaseView implements LoginViewContract {
    private LoginPresenter presenter;

    private EditText usernameField;
    private EditText passwordField;

    @Override
    protected LoginPresenter getPresenter() {
        if (presenter == null) {
            presenter = new LoginPresenter();
        }
        return presenter;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameField = findViewById(R.id.usernameField);
        passwordField = findViewById(R.id.passwordField);
        Button loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(l -> {
            getPresenter().authenticate(
                    usernameField.getText().toString().trim(),
                    passwordField.getText().toString().trim()
            );
        });
    }




    @Override
    public void loginSuccess(User user) {
        Toast.makeText(this, "Welcome, " + user.properName, Toast.LENGTH_LONG).show();
    }

    @Override
    public void loginFailure(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public void onResume() {
        super.onResume();
        getPresenter().setViewContract(this);
    }
}
