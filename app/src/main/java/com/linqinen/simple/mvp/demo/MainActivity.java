package com.linqinen.simple.mvp.demo;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.linqinen.simple.mvp.demo.base.BaseMvpActivity;

public class MainActivity extends BaseMvpActivity<MainActivityPresenter> implements MainActivityViewCallback {

    @Override
    protected MainActivityPresenter createPresenter() {
        return new MainActivityPresenter(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    @Override
    public void httpResponseCallback() {
        //网络请求后的处理
        Toast.makeText(getBaseContext(),"收到Response",Toast.LENGTH_SHORT).show();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn:
                getPresenter().httpRequest();
                break;


            default:
                break;
        }
    }
}
