package com.zsgs.readify;

import com.zsgs.readify.features.auth.AuthView;

public class Readify {
    public static final String appVersion = "0.1.0";
    public static final String appName =  "Readify";

    public static void main(String[] args) {
        System.out.println("Welcome to " + appName + " - Version: " + appVersion);
        new AuthView().init();
    }
}
