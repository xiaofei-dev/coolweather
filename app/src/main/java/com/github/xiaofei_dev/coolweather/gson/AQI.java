package com.github.xiaofei_dev.coolweather.gson;

/**
 * Created by Administrator on 2017/3/3.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
