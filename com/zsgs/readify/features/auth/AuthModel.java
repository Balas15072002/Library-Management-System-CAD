package com.zsgs.readify.features.auth;

import com.zsgs.readify.repository.db.ReadifyDB;
import com.zsgs.readify.repository.dto.RegistrationInfo;

class AuthModel {
    private final AuthView view;

    public AuthModel(AuthView authView) {
        view = authView;
    }

    void init() {
        if (ReadifyDB.getInstance().getRegistrationInfo() != null) {
            view.proceedLogin();
        } else {
            view.proceedRegistration();
        }
    }

    void registerUser(RegistrationInfo info) {
        if (isAlreadyExist(info.getUserName())) {
            view.showErrorMessage("Username already Exist");
        } else if (isWeakPassword()) {
            view.showErrorMessage("Please enter strong password");
        } else {
            ReadifyDB.getInstance().setRegistrationInfo(info);
            view.onRegistrationSuccess(info);
        }
    }

    private boolean isWeakPassword() {
        return false; // Write your logics here
    }

    private boolean isAlreadyExist(String userName) {
        return false;
    }

    public void validateCredentials(String userName, String password) {
        if (ReadifyDB.getInstance().validateLoginInfo(userName, password)) {
            view.onSuccessLogin(userName);
        } else {
            view.onInvalidCredentials();
        }
    }
}
