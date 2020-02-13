package com.example.myapplication.Helpers;

import android.content.Context;
import android.util.Log;
import android.view.View;

import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.example.myapplication.ResponseStatus;

public class ViewHelper {
    public boolean checkResponseState(ResponseStatus state,
                                      String TAG,Context context, String message) {
        switch (state) {
            case ERROR:
                Log.e(TAG, "errorResponse: " + message);
                return false;
            case FAILED:
//                showMessageDialog(fragmentManager, message, TAG);
                return false;
            case LOADING:
//                showOrHideProgressBar(true, progressBar);
                return false;
            case SUCCESS:
                Log.e(TAG, "NonSuccess: " + message);
                return true;
        }
        return false;
    }

}
