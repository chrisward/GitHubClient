package com.example.chrisward.githubclient.helper;

import android.util.Base64;

public class AuthHelper {
    public static String getAuthHeader(String username, String password) {
        String base = username + ":" + password;
        return "Basic " + Base64.encodeToString(base.getBytes(), Base64.NO_WRAP);
    }
}
