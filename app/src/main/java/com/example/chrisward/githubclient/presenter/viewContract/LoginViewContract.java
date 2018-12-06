package com.example.chrisward.githubclient.presenter.viewContract;

public interface LoginViewContract extends BaseViewContract {
    void loginSuccess();
    void loginFailure(String message);
}
