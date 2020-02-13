package com.example.myapplication.Repo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;

import com.example.myapplication.Models.Register.RegisterRequest;
import com.example.myapplication.Models.Register.RegisterResponse;
import com.example.myapplication.ResponseStatus;
import com.example.myapplication.Rest.ApiClient;
import com.example.myapplication.Rest.ApiInterface;

import io.reactivex.schedulers.Schedulers;

// identify mediatorLiveData
//call ApiInterface
//add source and Observer to mediator in method to use it in viewModel
public class RegisterRepo {
    private MediatorLiveData<RegisterResponse> registerMediatorLiveData = new MediatorLiveData<>();

    public MediatorLiveData<RegisterResponse> getRegistration(RegisterRequest registerRequest) {
        registerMediatorLiveData.setValue(new RegisterResponse(ResponseStatus.LOADING, null, null));

        final LiveData<RegisterResponse> source = LiveDataReactiveStreams.fromPublisher(ApiClient.getClient()
                .create(ApiInterface.class).getJobEmployerRegister(registerRequest).map(this::MapResponse)
                .onErrorReturn(this::HandleError)
                .subscribeOn(Schedulers.io()));

        registerMediatorLiveData.addSource(source, new Observer<RegisterResponse>() {
            @Override
            public void onChanged(RegisterResponse registerResponse) {
                registerMediatorLiveData.setValue(registerResponse);
                registerMediatorLiveData.removeSource(source);
            }
        });
        return registerMediatorLiveData;
    }

    private RegisterResponse HandleError(Throwable throwable) {
        return new RegisterResponse(ResponseStatus.ERROR, throwable.getMessage(), null);
    }

    private RegisterResponse MapResponse(RegisterResponse registerResponse) {
        if (registerResponse.getResponseHeader() == null) {
            return new RegisterResponse(ResponseStatus.ERROR, registerResponse.getMessage(), null);
        } else if (registerResponse.getResponseHeader().getResponseCode() == 1) {
            return new RegisterResponse(ResponseStatus.SUCCESS, registerResponse.getMessage(), null, registerResponse.getResponseHeader()
                    ,registerResponse.getId());
        } else
            return new RegisterResponse(ResponseStatus.FAILED, registerResponse.getResponseHeader().getResponseMessage(), null);
    }
}
