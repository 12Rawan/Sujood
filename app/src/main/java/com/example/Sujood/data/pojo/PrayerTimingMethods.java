package com.example.Sujood.data.pojo;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.Comparator;

public class PrayerTimingMethods {

    private ArrayList<PrayerTimingMethod> methods;

    @RequiresApi(api = Build.VERSION_CODES.N)
    public PrayerTimingMethods(Data data) {
        methods = new ArrayList<>();
        methods.add(data.geteGYPT().toMethod());
        methods.sort(Comparator.comparingInt(method -> method.id));
    }

    public PrayerTimingMethods(androidx.work.Data data) {

    }

    public ArrayList<PrayerTimingMethod> getMethods() {
        return methods;
    }

    @Override
    public String toString() {
        return "PrayerTimingMethods{" +
                "methods=" + methods +
                '}';
    }
}
