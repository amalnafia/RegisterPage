package com.example.myapplication.Models.Register;

import com.example.myapplication.Models.HeaderRequest;
import com.google.gson.annotations.SerializedName;

public class RegisterRequest {
    @SerializedName("requestHeader")
    private HeaderRequest requestHeader;
    @SerializedName("photo")
    private String photo;
    @SerializedName("socialId")
    private String socialId;
    @SerializedName("registerType")
    private int registerType;
    @SerializedName("mobile")
    private String mobile;
    @SerializedName("email")
    private String email;
    @SerializedName("password")
    private String password;
    @SerializedName("fullName")
    private String fullName;

    public RegisterRequest(HeaderRequest requestHeader, String photo, String socialId, int registerType,
                           String mobile, String email, String password, String fullName) {
        this.requestHeader = requestHeader;
        this.photo = photo;
        this.socialId = socialId;
        this.registerType = registerType;
        this.mobile = mobile;
        this.email = email;
        this.password = password;
        this.fullName = fullName;
    }
}
