package com.example.android.quakereport;

public class Earthquake {
    //Magnitude of the Earthquake
    private double nMagnitude;
    //Location of the Earthquake
    private String nLocation;
    /**
     * Time of the earthquake
     */
    private long mTimeInMilliseconds;
    /**
     * Website URL of the earthquake
     */
    private String nUrl;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude          is the magnitude (size) of the earthquake
     * @param location           is the location where the earthquake happened
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *                           earthquake happened
     * @param url                is the website URL to find more details about the earthquake
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        nMagnitude = magnitude;
        nLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        nUrl = url;
    }

    /*
     * Returns the magnitude of the earthquake
     * */
    public double getMagnitude() {
        return nMagnitude;
    }

    /*
     * Returns the location of the earthquake
     * */
    public String getLocation() {
        return nLocation;
    }

    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return nUrl;
    }
}
