package com.example.myapplication.Models;

import com.google.gson.annotations.SerializedName;

public class HeaderResponse {
    @SerializedName("responseCode")
    private int responseCode;

    @SerializedName("responseMessage")
    private String responseMessage;

    @SerializedName("responseRemark")
    private String responseRemark;

    public int getResponseCode() {
        return responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public String getResponseRemark() {
        return responseRemark;
    }
}

