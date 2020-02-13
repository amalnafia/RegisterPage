package com.example.myapplication.Helpers;

import android.util.Patterns;

import com.google.android.material.textfield.TextInputLayout;

public class Validation {

    public boolean textInputLayoutConfirmPassword(TextInputLayout password, TextInputLayout confirmPassweord, String validationMsg) {
        if (!password.getEditText().getText().toString().equals(confirmPassweord.getEditText().getText().toString())) {
            confirmPassweord.setError(validationMsg);
            return false;
        } else {
            confirmPassweord.setError("");
            return true;
        }
    }

    public boolean textInputLayoutIsEmpty(TextInputLayout textInputLayout, String validationMsg) {
        if (textInputLayout.getEditText().getText().toString().isEmpty()) {
            textInputLayout.setError(validationMsg);
            return false;
        } else {
            textInputLayout.setError("");
            return true;
        }
    }

    public boolean textInputLayoutIsInvalidEmail(TextInputLayout textInputLayout, String validationMsg) {
        String email = textInputLayout.getEditText().getText().toString();
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            textInputLayout.setError(validationMsg);
            return false;
        } else {
            textInputLayout.setError("");
            return true;
        }
    }

    public boolean textInputLayoutPhoneNumber(TextInputLayout textInputLayout, String validationMsg) {
        if (!textInputLayout.getEditText().getText().toString().matches("^(5|6|9)([0-9]{7})$")) {
            textInputLayout.setError(validationMsg);
            return false;
        } else {
            textInputLayout.setError("");
            return true;
        }
    }

    public boolean textInputLayoutPassword(TextInputLayout textInputLayout, String validationMsg) {
        if (!textInputLayout.getEditText().getText().toString().matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$")) {
            textInputLayout.setError(validationMsg);
            return false;
        } else {
            textInputLayout.setError("");
            return true;
        }
    }
}
