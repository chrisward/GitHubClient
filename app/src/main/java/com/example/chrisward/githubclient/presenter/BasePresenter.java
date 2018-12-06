package com.example.chrisward.githubclient.presenter;

import com.example.chrisward.githubclient.presenter.presenterContract.BasePresenterContract;
import com.example.chrisward.githubclient.presenter.viewContract.BaseViewContract;

import java.lang.ref.WeakReference;

public abstract class BasePresenter implements BasePresenterContract {
    protected WeakReference<? extends BaseViewContract> view;

    public BaseViewContract getView() {
        if (view == null || view.get() == null) {
            return null;
        }

        return view.get();
    }

    @Override
    public void onCreate(BaseViewContract view) {
        setViewContract(view);
    }

    public void setViewContract(BaseViewContract view) {
        this.view = new WeakReference<>(view);
    }
}
