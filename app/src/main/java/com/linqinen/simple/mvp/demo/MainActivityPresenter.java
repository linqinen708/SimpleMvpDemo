package com.linqinen.simple.mvp.demo;

import com.linqinen.simple.mvp.demo.base.BaseMvpPresenter;

/**
 * Created by Ian on 2018/8/8.
 */
public class MainActivityPresenter extends BaseMvpPresenter<MainActivityViewCallback> {


    MainActivityPresenter(MainActivityViewCallback mvpCallback) {
        super(mvpCallback);
    }

    public void httpRequest() {
        //这里可以进行http的异步处理，处理完毕后，使用回调，将需要的结果返回到Activity中
        getViewCallback().httpResponseCallback();
    }
}
