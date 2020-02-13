package com.example.myapplication.Models;

import com.example.myapplication.Helpers.Constants;
import com.google.gson.annotations.SerializedName;

public class HeaderRequest <T> {
    @SerializedName("ip")
    private String ip = "";

    @SerializedName("deviceSerial")
    private String deviceSerial;

    @SerializedName("notificationToken")
    private String notificationToken;

    @SerializedName("osversion")
    private String osVersion;

    @SerializedName("appversion")
    private String appVersion;

    @SerializedName("appLanguage")
    private int appLanguage;

    @SerializedName("currencyId")
    private int currencyId;

    @SerializedName("countryId")
    private int countryId;

    @SerializedName("deviceType")
    private int deviceType;

    @SerializedName("userId")
    private int userId;

    @SerializedName("isWeb")
    private boolean isWeb;

    @SerializedName("userType")
    private int userType;

    public HeaderRequest(int userType, int userId, String osversion, String notificationToken, boolean isWeb, String ip, int deviceType,
                         String deviceSerial, int currencyId, int countryId, String appversion, int appLanguage) {
        this.userType = userType;
        this.userId = userId;
        this.osVersion = osversion;
        this.notificationToken = notificationToken;
        this.isWeb = isWeb;
        this.ip = ip;
        this.deviceType = deviceType;
        this.deviceSerial = deviceSerial;
        this.currencyId = currencyId;
        this.countryId = countryId;
        this.appVersion = appversion;
        this.appLanguage = appLanguage;
    }
}
