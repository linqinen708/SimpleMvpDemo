package com.linqinen.simple.mvp.demo.example;

/**
 * Created by Ian on 2018/8/22.
 */
public class SimplePresenter {

    public void httpRequeset(SimpleCallback simpleCallback){
        //这里触发了http的请求代码，得到了姓名：张三

        //******这部分代码可以封装到Model类中
        SimpleModel model = new SimpleModel();
        model.setName("张三");

        //然后将得到的结果回调给Activity
        simpleCallback.httpCallback(model);
    }
}
