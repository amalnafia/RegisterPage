package com.example.myapplication.Models;

import androidx.annotation.NonNull;

import com.example.myapplication.ResponseStatus;


public class ViewHeaderModel <T>{

    //class to identify the status of response which is responseStatus,message
    //get data to set value null

    @NonNull
    private ResponseStatus responseStatus ;

    @NonNull
    private String message;

    @NonNull
    private final T viewdata;


    public ViewHeaderModel(@NonNull ResponseStatus responseStatus, @NonNull String message, @NonNull T viewdata) {
        this.responseStatus = responseStatus;
        this.message = message;
        this.viewdata = viewdata;
    }

    @NonNull
    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(@NonNull ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    @NonNull
    public String getMessage() {
        return message;
    }

    public void setMessage(@NonNull String message) {
        this.message = message;
    }

    @NonNull
    public T getViewdata() {
        return viewdata;
    }
}
