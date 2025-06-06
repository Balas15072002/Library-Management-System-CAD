package com.zsgs.readify.repository.db;

import com.zsgs.readify.repository.dto.Library;
import com.zsgs.readify.repository.dto.RegistrationInfo;

public class ReadifyDB {
    private static ReadifyDB sReadifyDB;

    private ReadifyDB() {

    }

    public static ReadifyDB getInstance() {
        if (sReadifyDB == null) {
            sReadifyDB = new ReadifyDB();
        }
        return sReadifyDB;
    }

    private RegistrationInfo registrationInfo;
    private Library library;

    public RegistrationInfo getRegistrationInfo() {
        return registrationInfo;
    }

    public void setRegistrationInfo(RegistrationInfo registrationInfo) {
        this.registrationInfo = registrationInfo;
    }

    public boolean validateLoginInfo(String userName, String password) {
        return registrationInfo.getUserName().equals(userName) && registrationInfo.getPassword().equals(password);
    }

    public Library getLibrary() {
        return library;
    }
}
