package com.linqinen.simple.mvp.demo.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.linqinen.simple.mvp.demo.R;

public class SimpleActivity extends AppCompatActivity implements SimpleCallback {

    private SimplePresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);

        //创建一个presenter
        presenter = new SimplePresenter();

    }

    @Override
    public void httpCallback(SimpleModel model) {
        //将得到的数据进行展示
        TextView textView = findViewById(R.id.tv_name);
        textView.setText( model.getName());

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn:
                //http请求数据
                presenter.httpRequeset(this);
                break;

            default:
                break;
        }
    }
}
