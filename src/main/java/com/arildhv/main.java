package com.arildhv;

import org.json.JSONObject;

public class main {
    public static void main(String[] args) {
        String key = "b8663d389735608463f9334969f3f89d";
        String keanuId = "6384";

        apicaller caller = new apicaller(key, keanuId);

        String birthdate = caller.getBirthdate();

        System.out.println(caller.getBirthdate());
    }
}