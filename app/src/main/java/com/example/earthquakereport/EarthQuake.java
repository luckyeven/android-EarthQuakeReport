package com.example.earthquakereport;

import java.util.Date;

public class EarthQuake {
    private double mMagnitude;
    private String mLocation;
    private long mTime;
    private String mUrl;

    /**
     * constructs a new object
     *
     * @param magnitude is the magnitude of the earthquake
     * @param location is the location where earthquake happened
     * @param time is the time when earthquake happened
     * @param url is the website URL fo find detail about earthquake
     */
    public EarthQuake(double magnitude, String location, long time, String url){
        this.mMagnitude = magnitude;
        this.mLocation = location;
        this.mTime = time;
        this.mUrl = url;
    }

    public double getmMagnitude(){return mMagnitude;}
    public String getmLocation(){return mLocation;}
    public long getmTime(){return mTime;}
    public String getmUrl(){return mUrl;}
}
