package com.example.chrisward.githubclient.presenter.viewContract;

import com.example.chrisward.githubclient.model.User;

public interface LoginViewContract extends BaseViewContract {
    void loginSuccess(final User user);
    void loginFailure(String message);
}
