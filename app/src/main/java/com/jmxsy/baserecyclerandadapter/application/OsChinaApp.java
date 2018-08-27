package com.jmxsy.baserecyclerandadapter.application;

import android.app.Application;

import com.itheima.retrofitutils.ItheimaHttp;

/**
 * Created by Administrator on 2018/8/27 0027.
 */

public class OsChinaApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ItheimaHttp.init(this," http://www.oschina.net/");

    }
}
