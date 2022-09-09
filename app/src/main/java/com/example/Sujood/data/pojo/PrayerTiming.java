package com.example.Sujood.data.pojo;

import com.example.Sujood.data.pojo.PrayerTiming;

public class PrayerTiming  {
    private String prayerName,prayerTime;

    public PrayerTiming(String prayerName, String prayerTime) {
        this.prayerName = prayerName;
        this.prayerTime = prayerTime;
    }

    public String getPrayerName() {
        return prayerName;
    }

    public String getPrayerTime() {
        return prayerTime;
    }
}
