package com.example.chrisward.githubclient.presenter;

import com.example.chrisward.githubclient.presenter.viewContract.BaseViewContract;
import com.example.chrisward.githubclient.presenter.viewContract.LoginViewContract;

public class LoginPresenter extends BasePresenter {
    @Override
    public LoginViewContract getView() {
        return (LoginViewContract) super.getView();
    }

    @Override
    public void onDestroyed(BaseViewContract view) {
        //TODO dispose of subscriptions here
    }
}
