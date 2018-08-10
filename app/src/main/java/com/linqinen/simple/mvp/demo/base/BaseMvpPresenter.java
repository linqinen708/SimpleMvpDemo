package com.linqinen.simple.mvp.demo.base;

/**
 * Created by Ian on 2018/8/8.
 */
public class BaseMvpPresenter<V extends BaseMvpCallback> {

    private V mViewCallback;

    protected V getViewCallback() {
        return mViewCallback;
    }

    public BaseMvpPresenter(V mViewCallback) {
        this.mViewCallback = mViewCallback;
    }

}
