package com.example.myapplication.ui.Register;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class RegisterActivity extends AppCompatActivity {
//    static final String TAG = RegisterActivity.class.getSimpleName();
//    @BindView(R.id.email_textInputLayout)
//    TextInputLayout email;
//
//    @BindView(R.id.name_textInputLayout)
//    TextInputLayout name;
//
//    @BindView(R.id.mobile_textInputLayout)
//    TextInputLayout phone;
//
//    @BindView(R.id.password_textInputLayout)
//    TextInputLayout password;
//
//    @BindView(R.id.residency_textInputLayout)
//    TextInputLayout residency;
//
//    @BindView(R.id.confirm_password_textInputLayout)
//    TextInputLayout confirmPassword;
//
//    @BindView(R.id.register_button)
//    Button register;
//
//    @BindView(R.id.member_textview)
//    TextView textView;
//
//    ViewHelper viewHelper;
//
//    RegisterViewModel registerViewModel;
//    Validation validation = new Validation();
//    HeaderRequest requestHeader = new HeaderRequest(1, 0, "Device model: SM-N950F ,Android version: 9 , Api level: 28",
//            "drc-Scbc_ok:APA91bEA5_n4Jn7xQpUAyDI4xisaCUyzCx-66zoeG-m7Dh5Y8TsRPHxvJb6mTrtQp_g7qcpCV1ZcaF6ytqJ0t7XCCkfB7om_6dPxGtVBeGliI6rpCNZq-peDK7CvhL2RutuBr31_cBUo"
//            , false, "", 2,
//            "drc-Scbc_ok:APA91bEA5_n4Jn7xQpUAyDI4xisaCUyzCx-66zoeG-m7Dh5Y8TsRPHxvJb6mTrtQp_g7qcpCV1ZcaF6ytqJ0t7XCCkfB7om_6dPxGtVBeGliI6rpCNZq-peDK7CvhL2RutuBr31_cBUo"
//            , 0, 1, "1.0", 1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_fragment);
//        ButterKnife.bind(this);
//
//        String text = getString(R.string.already_member) + "\t" + getString(R.string.sign_in);
//        SpannableString spannableString = new SpannableString(text);
//        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.RED);
//        spannableString.setSpan(foregroundColorSpan, getString(R.string.already_member)
//                .length() + 1, text.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//        textView.setText(spannableString);
//        registerViewModel = ViewModelProviders.of(this).get(RegisterViewModel.class);
//

    }


//    @OnClick(R.id.register_button)
//    public void onViewClicked() {
//
//        doRegistration();
//    }
//
//    public void doRegistration() {
//        if (isValid()) {
//            registerViewModel.doRegister(requestHeader, "", "", 1,
//                    phone.getEditText().getText().toString(), email.getEditText().getText().toString()
//                    , password.getEditText().getText().toString(), name.getEditText().getText().toString());
//            registerObserver();
//        }
//    }
//
//    private void registerObserver() {
//        registerViewModel.getMediatorLiveData().observe(this, new Observer<RegisterResponse>() {
//            @Override
//            public void onChanged(RegisterResponse registerResponse) {
//                if (new ViewHelper().checkResponseState(registerResponse.getResponseStatus(), TAG, getApplicationContext(), registerResponse.getMessage())) {
//                    Toast.makeText(getApplicationContext(), "success", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//    }
//
//
//    public boolean isValid() {
//        return validation.textInputLayoutIsEmpty(name, getString(R.string.empty_name)) &&
//                validation.textInputLayoutIsEmpty(residency, getString(R.string.isEmpty)) &&
//                validation.textInputLayoutIsInvalidEmail(email, getString(R.string.invalid_email)) &&
//                validation.textInputLayoutPhoneNumber(phone, getString(R.string.invalid_phone)) &&
//                validation.textInputLayoutPassword(password, getString(R.string.invalid_password)) &&
//                validation.textInputLayoutConfirmPassword(password, confirmPassword, "password doesnt match");
//    }
}
