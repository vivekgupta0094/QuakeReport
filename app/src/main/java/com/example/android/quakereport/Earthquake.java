package com.example.android.quakereport;

/**
 * Created by vivek on 12-11-2016.
 */
public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    /** Time of the earthquake */
    private long mTimeInMilliseconds;
    private String mUrl;

    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getUrl() {
        return mUrl;
    }
}
