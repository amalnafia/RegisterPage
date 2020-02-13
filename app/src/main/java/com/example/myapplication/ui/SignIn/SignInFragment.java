package com.example.myapplication.ui.SignIn;

import androidx.lifecycle.ViewModelProviders;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myapplication.Helpers.Validation;
import com.example.myapplication.R;
import com.google.android.material.textfield.TextInputLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SignInFragment extends Fragment {

    private SignInViewModel mViewModel;

    @BindView(R.id.not_member_textView)
    TextView notMember;
    @BindView(R.id.mobile_sign_in)
    TextInputLayout inputMobile;
    @BindView(R.id.password_sign_in)
    TextInputLayout inputPassword;
    Validation validation = new Validation();


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.sign_in_fragment, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(SignInViewModel.class);
        // TODO: Use the ViewModel

        String text = getString(R.string.not_member) + "\t" + getString(R.string.register);
        SpannableString spannableString = new SpannableString(text);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.RED);
        spannableString.setSpan(foregroundColorSpan, getString(R.string.already_member)
                .length() + 1, text.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        notMember.setText(spannableString);
    }


    @OnClick(R.id.sign_in_button)
    public void signInOnClick() {
        validation.loginDataValidation("1234", inputMobile, getString(R.string.invalid_phone));
        validation.loginDataValidation("1234", inputPassword, getString(R.string.incorrect_password));
    }

}
