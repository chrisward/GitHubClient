package com.example.chrisward.githubclient.presenter;

import com.example.chrisward.githubclient.presenter.presenterContract.BasePresenterContract;
import com.example.chrisward.githubclient.presenter.viewContract.BaseViewContract;

import java.lang.ref.WeakReference;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public abstract class BasePresenter implements BasePresenterContract {
    protected WeakReference<? extends BaseViewContract> view;
    private Retrofit retrofit;
    private final String GITHUB_API_URL = "https://api.github.com/";

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

    protected Retrofit getRetrofit() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(GITHUB_API_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        }

        return retrofit;

    }
}
