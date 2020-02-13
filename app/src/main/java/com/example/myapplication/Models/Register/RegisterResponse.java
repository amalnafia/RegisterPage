package com.example.myapplication.Models.Register;

import androidx.annotation.NonNull;

import com.example.myapplication.Models.HeaderResponse;
import com.example.myapplication.Models.ViewHeaderModel;
import com.example.myapplication.ResponseStatus;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RegisterResponse extends ViewHeaderModel {

    @Expose
    @SerializedName("responseHeader")
    private HeaderResponse responseHeader;
    @Expose
    @SerializedName("photo")
    private String photo;
    @Expose
    @SerializedName("activationCode")
    private String activationCode;
    @Expose
    @SerializedName("isActivation")
    private boolean isActivation;
    @Expose
    @SerializedName("email")
    private String email;
    @Expose
    @SerializedName("mobile")
    private String mobile;
    @Expose
    @SerializedName("fullName")
    private String fullName;
    @Expose
    @SerializedName("id")
    private int id;

    public RegisterResponse(@NonNull ResponseStatus responseStatus, @NonNull String message, @NonNull Object viewdata) {
        super(responseStatus, message, viewdata);
    }

    public RegisterResponse(@NonNull ResponseStatus responseStatus, @NonNull String message, @NonNull Object viewdata,
                            HeaderResponse responseHeader, String photo, String activationCode,
                            boolean isActivation, String email, String mobile, String fullName, int id) {
        super(responseStatus, message, viewdata);
        this.responseHeader = responseHeader;
        this.photo = photo;
        this.activationCode = activationCode;
        this.isActivation = isActivation;
        this.email = email;
        this.mobile = mobile;
        this.fullName = fullName;
        this.id = id;
    }

    public RegisterResponse(@NonNull ResponseStatus responseStatus, @NonNull String message, @NonNull Object viewdata, HeaderResponse responseHeader, int id) {
        super(responseStatus, message, viewdata);
        this.responseHeader = responseHeader;
        this.id = id;
    }

    public HeaderResponse getResponseHeader() {
        return responseHeader;
    }

    public String getPhoto() {
        return photo;
    }

    public String getActivationCode() {
        return activationCode;
    }

    public boolean getIsActivation() {
        return isActivation;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public String getFullName() {
        return fullName;
    }

    public int getId() {
        return id;
    }
}
