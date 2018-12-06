package com.example.chrisward.githubclient.presenter;

import android.widget.Toast;

import com.example.chrisward.githubclient.api.GithubApi;
import com.example.chrisward.githubclient.helper.AuthHelper;
import com.example.chrisward.githubclient.presenter.viewContract.BaseViewContract;
import com.example.chrisward.githubclient.presenter.viewContract.LoginViewContract;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class LoginPresenter extends BasePresenter {
    private GithubApi githubApi;

    @Override
    public LoginViewContract getView() {
        return (LoginViewContract) super.getView();
    }

    @Override
    public void onDestroyed(BaseViewContract view) {
        //TODO dispose of subscriptions here
    }

    private GithubApi getGithubApi() {
        if (githubApi == null) {
            githubApi = getRetrofit().create(GithubApi.class);
        }

        return githubApi;
    }

    public void authenticate(String username, String password) {
        getGithubApi().getUser(AuthHelper.getAuthHeader(username, password))
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(user -> {
                System.out.println(user);
                getView().loginSuccess(user);
            }, throwable -> {
                getView().loginFailure("Ooops, looks like you used the wrong credentials");
            });;
    }
}
