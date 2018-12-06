package com.example.chrisward.githubclient.presenter.presenterContract;

import com.example.chrisward.githubclient.presenter.viewContract.BaseViewContract;

public interface BasePresenterContract {
    void onDestroyed(BaseViewContract view);
    void onCreate(BaseViewContract view);
}
