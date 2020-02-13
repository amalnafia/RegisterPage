package com.example.myapplication.ui.Register;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.Helpers.Validation;
import com.example.myapplication.Helpers.ViewHelper;
import com.example.myapplication.Models.HeaderRequest;
import com.example.myapplication.Models.Register.RegisterResponse;
import com.example.myapplication.R;
import com.google.android.material.textfield.TextInputLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegisterFragment extends Fragment {

    private RegisterViewModel registerViewModel;
    static final String TAG = RegisterFragment.class.getSimpleName();
    @BindView(R.id.email_textInputLayout)
    TextInputLayout email;

    @BindView(R.id.name_textInputLayout)
    TextInputLayout name;

    @BindView(R.id.mobile_textInputLayout)
    TextInputLayout phone;

    @BindView(R.id.password_textInputLayout)
    TextInputLayout password;

    @BindView(R.id.residency_textInputLayout)
    TextInputLayout residency;

    @BindView(R.id.confirm_password_textInputLayout)
    TextInputLayout confirmPassword;

    @BindView(R.id.member_textview)
    TextView textView;

    Validation validation = new Validation();
    HeaderRequest requestHeader = new HeaderRequest(1, 0, "Device model: SM-N950F ,Android version: 9 , Api level: 28",
            "drc-Scbc_ok:APA91bEA5_n4Jn7xQpUAyDI4xisaCUyzCx-66zoeG-m7Dh5Y8TsRPHxvJb6mTrtQp_g7qcpCV1ZcaF6ytqJ0t7XCCkfB7om_6dPxGtVBeGliI6rpCNZq-peDK7CvhL2RutuBr31_cBUo"
            , false, "", 2,
            "drc-Scbc_ok:APA91bEA5_n4Jn7xQpUAyDI4xisaCUyzCx-66zoeG-m7Dh5Y8TsRPHxvJb6mTrtQp_g7qcpCV1ZcaF6ytqJ0t7XCCkfB7om_6dPxGtVBeGliI6rpCNZq-peDK7CvhL2RutuBr31_cBUo"
            , 0, 1, "1.0", 1);

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.register_fragment, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        registerViewModel = ViewModelProviders.of(this).get(RegisterViewModel.class);
        // TODO: Use the ViewModel
        String text = getString(R.string.already_member) + "\t" + getString(R.string.sign_in);
        SpannableString spannableString = new SpannableString(text);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.RED);
        spannableString.setSpan(foregroundColorSpan, getString(R.string.already_member)
                .length() + 1, text.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(spannableString);

    }

    @OnClick(R.id.register_button)
    public void onViewClicked() {

        doRegistration();
    }

    @OnClick(R.id.member_textview)
    public void onSignInClicked() {
        Navigation.findNavController(getView()).navigate(R.id.action_registerFragment_to_signInFragment);

    }

    public void doRegistration() {
        if (isValid()) {
            registerViewModel.doRegister(requestHeader, "", "", 1,
                    phone.getEditText().getText().toString(), email.getEditText().getText().toString()
                    , password.getEditText().getText().toString(), name.getEditText().getText().toString());
            registerObserver();
        }
    }

    private void registerObserver() {
        registerViewModel.getMediatorLiveData().observe(this, new Observer<RegisterResponse>() {
            @Override
            public void onChanged(RegisterResponse registerResponse) {
                if (new ViewHelper().checkResponseState(registerResponse.getResponseStatus(),
                        TAG, getContext(), registerResponse.getMessage())) {
                    Toast.makeText(getContext(), "success", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public boolean isValid() {
        return validation.textInputLayoutIsEmpty(name, getString(R.string.empty_name)) &&
                validation.textInputLayoutIsEmpty(residency, getString(R.string.isEmpty)) &&
                validation.textInputLayoutIsInvalidEmail(email, getString(R.string.invalid_email)) &&
                validation.textInputLayoutPhoneNumber(phone, getString(R.string.invalid_phone)) &&
                validation.textInputLayoutPassword(password, getString(R.string.invalid_password)) &&
                validation.textInputLayoutConfirmPassword(password, confirmPassword, getString(R.string.does_not_match));
    }

}
