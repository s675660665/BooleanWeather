package com.min.balloonwweather.util;

/**
 * Created by Administrator on 2015/11/28.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
