package com.example.chrisward.githubclient;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.chrisward.githubclient.presenter.BasePresenter;
import com.example.chrisward.githubclient.presenter.viewContract.BaseViewContract;

public abstract class BaseView extends AppCompatActivity implements BaseViewContract {
    protected abstract BasePresenter getPresenter();

    @Override
    public void onDestroy() {
        super.onDestroy();
        getPresenter().onDestroyed(this);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        getPresenter().onDestroyed(this);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getPresenter().onCreate(this);
    }
}
