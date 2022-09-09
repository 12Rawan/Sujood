package com.example.Sujood.data.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data{



    @SerializedName("EGYPT")
    @Expose
    public static EGYPT eGYPT;
    public static EGYPT geteGYPT() {
        return eGYPT;
    }

}

