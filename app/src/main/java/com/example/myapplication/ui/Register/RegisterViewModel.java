package com.example.myapplication.ui.Register;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.ViewModel;

import com.example.myapplication.Models.HeaderRequest;
import com.example.myapplication.Models.Register.RegisterRequest;
import com.example.myapplication.Models.Register.RegisterResponse;
import com.example.myapplication.Repo.RegisterRepo;

public class RegisterViewModel extends ViewModel {
// call repo Method with request data , will be called in view to set data

    private static final String TAG = "RegisterViewModel";
    MediatorLiveData<RegisterResponse> mediatorLiveData = new MediatorLiveData<>();

    RegisterRepo registerRepo = new RegisterRepo();

    public void doRegister(HeaderRequest requestHeader, String photo, String socialId, int registerType,
                           String mobile, String email, String password, String fullName) {
        mediatorLiveData = registerRepo.getRegistration(new RegisterRequest(requestHeader, photo, socialId, registerType, mobile, email, password, fullName));

    }

    public MediatorLiveData<RegisterResponse> getMediatorLiveData() {
        return mediatorLiveData;
    }
}
